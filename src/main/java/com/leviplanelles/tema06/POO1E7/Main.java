package com.leviplanelles.tema06.POO1E7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static CentroSalud centroSalud = new CentroSalud();
    public static void main(String[] args) {

        int choice;
        do {
            choice = menu();
            switch (choice) {
                case 1 -> {
                    int sip;
                    do {
                        System.out.print("SIP: ");
                        sip = Integer.parseInt(scanner.nextLine());
                    } while (sip < 10000000);

                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    char gender;
                    Paciente.Gender genero = Paciente.Gender.FEMALE;
                    do {
                        System.out.print("Sexo(h/m): ");
                        gender = scanner.nextLine().charAt(0);
                        if (gender == 'h' || gender == 'H' || gender == 'M' || gender == 'm') {
                            genero = gender == 'h' || gender == 'H' ? Paciente.Gender.MALE : Paciente.Gender.FEMALE;
                        }
                    }while (!(gender == 'h' || gender == 'H' || gender == 'M' || gender == 'm'));

                    int edad;
                    do {
                        System.out.print("Edad: ");
                        edad = Integer.parseInt(scanner.nextLine());
                    } while (edad < 0 || edad > 100);

                    System.out.print("Sintomatología: ");
                    String sintomatologia = scanner.nextLine();

                    int indice = centroSalud.getCantidadPacientes();
                    centroSalud.getPacientes()[indice] = CentroSalud.newPaciente(sip, nombre, genero, edad, sintomatologia);
                }
                case 2 -> {
                    System.out.print("SIP: ");
                    int sip = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < centroSalud.getCantidadPacientes(); i++) {
                        if (sip == centroSalud.getPacientes()[i].getSIP()) {
                            System.out.println(centroSalud.getPacientes()[i]);

                            System.out.println();
                            float[] preRev = new float[4];
                            System.out.print("Temp: ");
                            preRev[0] = Float.parseFloat(scanner.nextLine());
                            System.out.print("Ppm: ");
                            preRev[1] = Integer.parseInt(scanner.nextLine());
                            System.out.print("TenSis: ");
                            preRev[2] = Integer.parseInt(scanner.nextLine());
                            System.out.print("TemDias: ");
                            preRev[3] = Integer.parseInt(scanner.nextLine());

                            CentroSalud.atenderPaciente(sip,centroSalud,preRev);
                        }else {
                            System.out.println("El paciente no existe");
                        }
                    }
                }
                case 3 -> subMenu();
                case 4 -> {
                    System.out.print("SIP: ");
                    int sip = Integer.parseInt(scanner.nextLine());

                    if (CentroSalud.altaMedica(sip,centroSalud)) {
                        System.out.print("Motivo del alta: ");
                        String motivoAlta = scanner.nextLine();
                        LocalDateTime ahora = LocalDateTime.now();
                        for (int i = 0; i < centroSalud.getCantidadPacientes(); i++) {
                            if (sip == centroSalud.getPacientes()[i].getSIP()) {
                                centroSalud.getPacientes()[i].setMotivoAlta(motivoAlta);
                                centroSalud.getPacientes()[i].setFecha_hora_alta(ahora);
                            }
                        }
                    }else {
                        System.out.println("El paciente no está atendido por lo que no se le puede dar alta");
                    }
                }
                case 0 -> {}
            }
        }while (choice != 0);
    }
    public static int menu() {
        System.out.println("********************\n" +
                "**  " +
                " URGENCIAS" +
                "   **\n" +
                "********************\n\n" +
                "1. Nuevo paciente\n" +
                "2. Atender paciente\n" +
                "3. Consultas\n" +
                "4. Alta médica\n" +
                "--------------------------\n" +
                "0. Salir");
        System.out.print("Elige: ");
        return Integer.parseInt(scanner.nextLine());
    }
    public static void subMenu() {
        System.out.println("***************\n" +
                "** CONSULTAS **\n" +
                "***************\n" +
                "1. Por Sip\n" +
                "2. Por fechas\n" +
                "3. Estadísticas\n" +
                "4. Mostrar histórico mensual\n" +
                "--------------------------------\n" +
                "0. Volver al menú principal");
        System.out.print("Elige: ");

        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1 -> {
                System.out.print("SIP: ");
                int sip = Integer.parseInt(scanner.nextLine());
                System.out.println(CentroSalud.porSip(sip,centroSalud));
            }
            case 2 -> {
                LocalDate inicio;
                LocalDate fin;
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                /*char res;
                boolean response = false;
                do {
                    System.out.print("Fecha fin automática? (s/n) ");
                    res = scanner.nextLine().charAt(0);
                    if (res == 's' || res == 'S' || res == 'n' || res == 'N') {
                        if (res == 's' || res == 'S') {
                            response = true;
                        }
                    }
                }while (!(res == 's' || res == 'S' || res == 'n' || res == 'N'));*/

                System.out.print("Fecha inicio (dd-MM-yyyy): ");
                String ini = scanner.nextLine();
                inicio = LocalDate.parse(ini,formatter);

                System.out.print("Fecha final (dd-MM-yyyy): ");
                String fi = scanner.nextLine();
                fin = LocalDate.parse(fi,formatter);
                Paciente[] pacientes;
                pacientes = CentroSalud.porFechas(centroSalud, inicio, fin);

                if (pacientes != null){
                    for (Paciente paciente : pacientes) {
                        System.out.println(paciente);
                    }
                }
            }
            case 3 -> {}
            case 4 -> {
                System.out.println(centroSalud);
            }
            case 0 -> {}
        }
    }

}

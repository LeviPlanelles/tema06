package com.leviplanelles.tema06.POO1E3;

import com.leviplanelles.tema06.lib.IO;

import java.util.Scanner;

public class Principal {
    public static Alumno[] alumnos = new Alumno[100];
    public static int subMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***************");
        System.out.println("** CONSULTAS **");
        System.out.println("***************");
        System.out.println("1. Por grupo ...");
        System.out.println("2. Por edad ...");
        System.out.println("3. Por nia ...");
        System.out.println("4. Por apellidos ...");
        System.out.println("---------------------");
        System.out.println("0. Volver al menú principal");
        int choice = IO.solicitarInt("",0,4);
        switch (choice) {
            case 0 -> {}
            case 1 -> {
                String grupo = IO.solicitarString("Indique el grupo:");
                for (int i = 0; i < alumnos.length; i++) {
                    if (alumnos[i] != null && alumnos[i].getGrupo().equals(grupo)) {
                        System.out.println(alumnos[i].toString());
                    }
                }
            }
            case 2 -> {
                int fechaNacimiento = IO.solicitarInt("Indique la edad:",0,100);
                for (int i = 0; i < alumnos.length; i++) {
                    if (alumnos[i] != null && alumnos[i].getEdad() == fechaNacimiento) {
                        System.out.println(alumnos[i].toString());
                    }
                }
            }
            case 3 -> {
                String NIA = IO.solicitarString("NIA del alumno:", 0, 10000000);
                for (int i = 0; i < alumnos.length; i++) {
                    if (alumnos[i] != null && alumnos[i].getNia().equals(NIA)) {
                        System.out.println("No se puede añadir un alumnos porque ya existe uno igual");
                        break;
                    }
                }
            }
            case 4 -> {

                String apellido = IO.solicitarString("Pon parte de un apellido:");

                for (int i = 0; i < alumnos.length; i++) {
                    if (alumnos[i] != null && alumnos[i].getApellidos().contains(apellido)) {
                        System.out.println(alumnos[i].toString());

                    }
                }
            }
        }
        return choice;

    }

    public static int menuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*********************");
        System.out.println("** GESTIÓN ALUMNOS **");
        System.out.println("*********************");
        System.out.println("1. Nuevo alumno ...");
        System.out.println("2. Baja de alumno ...");
        System.out.println("3. Consultas ...");
        System.out.println("----------------------");
        System.out.println("0. Salir");

        return IO.solicitarInt("",0,3);
    }

    public static void main(String[] args) {
        int posicion = 0;
        int choice;
        do {
            choice = menuPrincipal();
            switch (choice) {
                case 0 -> {
                }
                case 1 -> {
                    String NIA = IO.solicitarString("NIA del alumno:", 0, 10000000);
                    for (int i = 0; i < alumnos.length; i++) {
                        if (alumnos[i] != null && alumnos[i].getNia().equals(NIA)) {
                            System.out.println("No se puede añadir un alumnos porque ya existe uno igual");
                            break;
                        } else {
                            String nombre = IO.solicitarString("Nombre del alumno:");
                            String apellido = IO.solicitarString("Apellido del alumno:");
                            String fecha = IO.solicitarString("Fecha de nacimiento:");
                            String grupo = IO.solicitarString("Grupo:");
                            int telefono = IO.solicitarInt("Teléfono contacto:", 0, 1000000000);

                            if (alumnos[posicion] == null) {
                                alumnos[posicion] = new Alumno(NIA, nombre, apellido, fecha, grupo, telefono);
                                posicion++;
                                break;

                            }
                        }
                    }

                }
                case 2 -> {
                    String NIA = IO.solicitarString("NIA del alumno:", 0, 10000000);
                    for (int i = 0; i < alumnos.length; i++) {
                        if (alumnos[i].getNia().equals(NIA)) {
                            System.out.println("Se ha encontrado a "+ alumnos[i].getNombre() +" con el NIA: " + NIA);
                            System.out.println("Eliminando...");
                            alumnos[i] = null;
                            break;
                        } else {
                            System.out.println("El alumno que has ingresado no consta en la lista de alumnos.");
                            break;
                        }
                    }
                }
                case 3 -> subMenu();
            }
        }while (choice != 0);

    }
}

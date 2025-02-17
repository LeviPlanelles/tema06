package com.leviplanelles.tema06.gestionHospital;

import com.leviplanelles.tema06.lib.IO;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static DataGenerator dataGenerator = new DataGenerator();
    public static Hospital hospital = dataGenerator.generarHospital(5,5);
    public static void main(String[] args) {
        //System.out.println(hospital.toString());
        int eleccion;
        do {
            eleccion = menuPrincipal();
            switch (eleccion) {
                case 1 -> aniadirPaciente();
                case 2 -> atenderCliente();
                case 3 -> mostrarEstado();
                case 4 -> {
                    return;
                }
            }
        }while (eleccion != 4);

    }
    public static int menuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== HOSPITAL ===");
        System.out.println("1. Añadir paciente");
        System.out.println("2. Atender siguiente paciente");
        System.out.println("3. Mostrar el estado de las colas");
        System.out.println("4. Salir");
        return Integer.parseInt(scanner.nextLine());
    }

    public static void aniadirPaciente() {
        System.out.println(hospital);
        int cola = IO.solicitarInt("Selecciona la cola (1-5): ",1,5);
        String nombre = IO.solicitarString("Nombre: ");
        String SIP = IO.solicitarString("SIP: ");
        Paciente paciente = new Paciente(nombre,SIP);
        hospital.getArrConsultas()[cola-1].getPacienteCola().add(paciente);
        System.out.println(hospital.getArrConsultas()[cola-1]);
    }

    public static void mostrarEstado(){
        System.out.println(hospital);
    }

    public static void atenderCliente(){
        System.out.println(hospital);
        int cola = IO.solicitarInt("Selecciona la cola (1-5): ",1,5);
        String paciente = String.valueOf(hospital.getArrConsultas()[cola-1].getPacienteCola().peek());
        hospital.getArrConsultas()[cola-1].getPacienteCola().remove();
        System.out.println(paciente + " ha sido atendido");


    }
}

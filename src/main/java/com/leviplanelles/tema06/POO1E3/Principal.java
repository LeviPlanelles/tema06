package com.leviplanelles.tema06.POO1E3;

import com.leviplanelles.tema06.lib.IO;

import java.util.Scanner;

public class Principal {

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
        int choice = Integer.parseInt(scanner.nextLine());
        System.out.println();
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
        int choice = Integer.parseInt(scanner.nextLine());
        System.out.println();
        return choice;

    }

    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[20];
        int posicion = 0;
        int choice = menuPrincipal();
        switch (choice) {
            case 0 -> {}
            case 1 -> {
                String NIA = IO.solicitarString("NIA del alumno:",0,10000000);
                for (int i = 0; i < alumnos.length; i++) {
                    if (alumnos[i].getNia().equals(NIA)) {
                        System.out.println("No se puede añadir un alumnos porque ya existe uno igual");
                    }
                }
                String nombre = IO.solicitarString("Nombre del alumno:");
                String apellido = IO.solicitarString("Apellido del alumno:");
                String fecha = IO.solicitarString("Fecha de nacimiento:");
                String grupo = IO.solicitarString("Grupo:");
                int telefono = IO.solicitarInt("Teléfono contacto:",0,100000000);
                for (int i = 0; i < alumnos.length; i++) {
                    alumnos[posicion] = new Alumno(NIA,nombre,apellido,fecha,grupo,telefono);
                }
            }
            case 2 -> {}
            case 3 -> subMenu();
        }
    }
}

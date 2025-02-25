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
                CentroEducativo.porGrupo();
            }
            case 2 -> {
                CentroEducativo.porEdad();
            }
            case 3 -> {
                CentroEducativo.porNia();
            }
            case 4 -> {
                CentroEducativo.porApellidos();
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
        int choice;
        do {
            choice = menuPrincipal();
            switch (choice) {
                case 0 -> {
                }
                case 1 -> {
                    nuevoAlumno();
                }
                case 2 -> {
                    bajaAlumno();
                }
                case 3 -> subMenu();
            }
        }while (choice != 0);
    }
    public static void nuevoAlumno() {
        CentroEducativo.nuevoAlumno();
    }
    public static void bajaAlumno() {
        CentroEducativo.bajaAlumnno();
    }

}

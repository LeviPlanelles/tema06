package com.leviplanelles.tema06.gestionHospital;

import com.leviplanelles.tema06.lib.IO;

public class Main {
    //public static Hospital hospital = new Hospital();

    public static void main(String[] args) {

        int eleccion;
        do {
            eleccion = menuPrincipal();
        }while (eleccion != 4);
        switch (eleccion) {
            case 1 -> {}
            case 2 -> {}
            case 3 -> {}
            case 4 -> {
                return;
            }
        }
    }
    public static int menuPrincipal() {
        System.out.println("=== HOSPITAL ===");
        System.out.println("1. Añadir paciente");
        System.out.println("2. Atender siguiente paciente");
        System.out.println("3. Mostrar el estado de las colas");
        System.out.println("4. Salir");
        return IO.solicitarInt("",0,4);
    }

    /*public static boolean aniadirPaciente() {

    }*/
}

package com.leviplanelles.tema06.POO1E7;

public class Main {
    public static void main(String[] args) {
        CentroSalud centroSalud = new CentroSalud();
        System.out.println(centroSalud);
    }
    public static void menu() {
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
    }
    public static void subMenu() {
        System.out.println("***************\n" +
                "** CONSULTAS **\n" +
                "***************\n" +
                "1. Por Sip\n" +
                "2. Por fechas\n" +
                "3. Estadísticas\n" +
                "3. Mostrar histórico mensual\n" +
                "--------------------------------\n" +
                "0. Volver al menú principal");
    }

}

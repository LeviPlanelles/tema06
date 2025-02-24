package com.leviplanelles.tema06.POO1E1;

public class Coche {
    enum TipoCoche {
        MINI, UTILITARIO, FAMILIAR, DEPORTIVO
    }
    enum ModalidadSeguro {
        TERCERO, TODO_RIESGO
    }
    private static char letra1 = 'A';
    private static char letra2 = 'A';
    private static char letra3 = 'A';
    private String modelo;
    private String color;
    private boolean metalizado;
    private String matricula;
    private TipoCoche tipoCoche;
    private int anio;
    private ModalidadSeguro modalidadSeguro;
    private static int numerosMatricula = 0;

    public Coche(String modelo, String color, boolean metalizado, TipoCoche tipoCoche, int anio, ModalidadSeguro modalidadSeguro) {
        this.modelo = modelo;
        this.color = color;
        this.metalizado = metalizado;
        this.matricula = generarMatricula();
        this.tipoCoche = tipoCoche;
        this.anio = anio;
        this.modalidadSeguro = modalidadSeguro;
    }

    private static String generarMatricula() {
        /*StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l < 10; l++) {
                        sb.append(i).append(j).append(k).append(l);
                        System.out.println(sb);
                        sb.setLength(0);

                    }
                }
            }
        }
        for (int i = 'A'; i <= 'Z'; i++) {
            for (int j = 'A'; j <= 'Z'; j++) {
                for (int k = 'A'; k <= 'Z'; k++) {
                    sb1.append((char)i).append((char)j).append((char)k);
                    System.out.println(sb1);
                    sb1.setLength(0);
                }
            }
        }
        System.out.println();
        return null;*/
        if (numerosMatricula > 9999) {
            numerosMatricula = 0;
            incrementarLetras();
        }
        String matricula = String.format("%04d %c%c%c",numerosMatricula,letra1,letra2,letra3);
        numerosMatricula++;
        return matricula;
    }
    public static void incrementarLetras() {
        if (letra3 < 'Z') {
            letra3++;
        } else {
            letra3 = 'A';
            if (letra2 < 'Z') {
                letra2++;
            } else {
                letra2 = 'A';
                if (letra1 < 'Z') {
                    letra1++;
                } else {
                    letra1 = 'N';
                    letra2 = 'M';
                    letra3 = 'L';
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Coche{" +
                "modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", metalizado=" + metalizado +
                ", matricula='" + matricula + '\'' +
                ", tipoCoche=" + tipoCoche +
                ", anio=" + anio +
                ", modalidadSeguro=" + modalidadSeguro +
                '}';
    }
}

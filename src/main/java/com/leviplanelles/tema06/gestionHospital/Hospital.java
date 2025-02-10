package com.leviplanelles.tema06.gestionHospital;

import java.util.Arrays;

public class Hospital {
    private static String nombreHospital;
    ColaConsulta[] consultas = new ColaConsulta[5];

    public Hospital(ColaConsulta[] consultas) {
        this.consultas = consultas;
    }

    public static String getNombreHospital() {
        return nombreHospital;
    }

    public ColaConsulta[] getConsultas() {
        return consultas;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "consultas=" + Arrays.toString(consultas) +
                '}';
    }
}

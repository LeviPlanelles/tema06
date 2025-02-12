package com.leviplanelles.tema06.gestionHospital;

import java.util.Arrays;

public class Hospital {
    private int numConsultas;
    private ColaConsulta[] arrConsultas;

    public Hospital(int numConsultas) {
        this.arrConsultas = new ColaConsulta[numConsultas];
    }

    public ColaConsulta[] getArrConsultas() {
        return arrConsultas;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "consultas=\n" + Arrays.toString(arrConsultas) +
                '}'+"\n";
    }
}

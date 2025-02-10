package com.leviplanelles.tema06.gestionHospital;

import java.util.Random;

public class Medico {
    Random random = new Random();
    private static String nombre;
    private int NUM_COLEGIADO = random.nextInt(100000,999999);

    public Medico(String nombre, int NUM_COLEGIADO) {
        this.nombre = nombre;
        this.NUM_COLEGIADO = NUM_COLEGIADO;
    }

    public Medico() {
        this("Sin Nombre", 000000);
    }
}

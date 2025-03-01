package com.leviplanelles.tema06.POO1E7;

import java.util.Random;

public class DataGenerator {
    Random random = new Random();
    private final String[] NOMBRES = {
            "Juan", "María", "Carlos", "Laura", "Pedro", "Ana", "Luis", "Sofía", "David", "Elena"
    };

    private final String[] SINTOMAS = {
            "Dolor de cabeza", "Fiebre", "Tos", "Dolor de estómago", "Fatiga", "Mareos", "Náuseas"
    };

    public Paciente generarPaciente() {
        int SIP = random.nextInt(90000000) + 10000000; // Número de 8 dígitos
        String NAME = NOMBRES[random.nextInt(NOMBRES.length)];
        Paciente.Gender GENDER = random.nextBoolean() ? Paciente.Gender.MALE : Paciente.Gender.FEMALE;
        int AGE = random.nextInt(90) + 1; // Edad entre 1 y 90 años
        String SINTOMATOLOGIA = SINTOMAS[random.nextInt(SINTOMAS.length)];

        return new Paciente(SIP, NAME, GENDER, AGE, SINTOMATOLOGIA);
    }
}

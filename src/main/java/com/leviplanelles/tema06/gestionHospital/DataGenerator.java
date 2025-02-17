package com.leviplanelles.tema06.gestionHospital;

import java.util.Random;

public class DataGenerator {
    Random random = new Random();

    public Medico generarMedico() {
        String[] nombres = {
                "Carlos", "Lucía", "Miguel", "Andrea", "Sergio",
                "Paula", "Javier", "Elena", "Diego", "Laura"
        };
        int numColegiado = random.nextInt(100000,1000000);

        return new Medico(nombres[random.nextInt(0, nombres.length)], numColegiado);
    }

    public Paciente generarPaciente() {
        String[] nombres = {
                "Alejandro", "Beatriz", "David", "Eva", "Fernando",
                "Gloria", "Hugo", "Irene", "Jorge", "Karen",
                "Luis", "Marta", "Nicolás", "Olga", "Pablo",
                "Raquel", "Samuel", "Tamara", "Ulises", "Vanesa"
        };
        String sip = random.nextInt(10000000,20000000) + (char) random.nextInt(60,91) + "";
        return new Paciente(nombres[random.nextInt(0, nombres.length)], sip);
    }

    public Hospital generarHospital(int numColas, int pacientesPorCola) {
        Hospital hospital = new Hospital(numColas);

        for (int i = 0; i < numColas; i++) {
            Medico medico = generarMedico();
            hospital.getArrConsultas()[i] = new ColaConsulta(medico);
            for (int j = 0; j < pacientesPorCola; j++) {
                hospital.getArrConsultas()[i].getPacienteCola().add(generarPaciente());
            }
        }
        return hospital;
    }
}

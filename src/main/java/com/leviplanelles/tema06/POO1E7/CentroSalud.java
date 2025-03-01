package com.leviplanelles.tema06.POO1E7;

import java.time.LocalDate;

public class CentroSalud {
    private final int LIMITE_DIARIO = 40;
    private Paciente[] pacientes;
    private static int cantidadPacientes;

    public CentroSalud() {
        this.pacientes = new Paciente[LIMITE_DIARIO];
        cantidadPacientes = 0;
    }

    public Paciente[] getPacientes() {
        return pacientes;
    }

    public int getCantidadPacientes() {
        return cantidadPacientes;
    }

    public static Paciente newPaciente(int SIP, String NAME, Paciente.Gender GENDER, int AGE, String SINTOMATOLOGIA) {
        cantidadPacientes++;
        return new Paciente(SIP,NAME,GENDER,AGE,SINTOMATOLOGIA);
    }

    public static void atenderPaciente(int sip, CentroSalud centroSalud,float[] preRev) {
        for (int i = 0; i < centroSalud.getCantidadPacientes(); i++) {
            if (centroSalud.getPacientes()[i].getSIP() == sip && centroSalud.getPacientes()[i].isAtendido()) {
                System.out.println("Ese paciente ya esta atendido");
            }
            if (centroSalud.getPacientes()[i].getSIP() == sip && !centroSalud.getPacientes()[i].isAtendido()) {
                for (int j = 0; j < preRev.length; j++) {
                    centroSalud.getPacientes()[i].getPreRev()[j] = preRev[j];
                }
                centroSalud.getPacientes()[i].setAtendido(true);
            }

        }
    }

    public static boolean altaMedica(int sip, CentroSalud centroSalud) {
        for (int i = 0; i < centroSalud.getCantidadPacientes(); i++) {
            if (centroSalud.getPacientes()[i].getSIP() == sip && centroSalud.getPacientes()[i].isAtendido()) {
                return true;
            }
        }
        return false;
    }

    public static Paciente porSip(int sip, CentroSalud centroSalud) {
        for (int i = 0; i < centroSalud.getCantidadPacientes(); i++) {
            if (centroSalud.getPacientes()[i].getSIP() == sip) {
                return centroSalud.getPacientes()[i];
            }
        }
        return null;
    }

    public static Paciente[] porFechas(CentroSalud centroSalud , LocalDate inicio, LocalDate fin) {
        int cantidad = 0;
        int contador = 0;
        for (int i = 0; i < centroSalud.getCantidadPacientes(); i++) {
            if (centroSalud.getPacientes()[i].getFECHA_HORA_ENTRADA().isAfter(inicio.atStartOfDay()) && centroSalud.getPacientes()[i].getFECHA_HORA_ENTRADA().isBefore(fin.atStartOfDay())) {
                cantidad++;
            }
        }
        Paciente[] pacientes = new Paciente[cantidad];
        for (int i = 0; i < centroSalud.getCantidadPacientes(); i++) {
            if (centroSalud.getPacientes()[i].getFECHA_HORA_ENTRADA().isAfter(inicio.atStartOfDay()) && centroSalud.getPacientes()[i].getFECHA_HORA_ENTRADA().isBefore(fin.atStartOfDay())) {
                pacientes[contador++] = centroSalud.getPacientes()[i];
            }
        }
        if (pacientes.length == 0) return null;
        return pacientes;
    }

    @Override
    public String toString() {
        if (cantidadPacientes == 0) return "No hay pacientes en cola en este centro!";

        StringBuilder sb = new StringBuilder();
        sb.append("Centro de salud: \n");
        for (int i = 0; i < cantidadPacientes; i++) {
            sb.append(pacientes[i]).append(",\n");
        }
        if (!sb.isEmpty()) {
            sb.deleteCharAt(sb.length() - 2);
        }
        sb.append("nPacientes: ").append(cantidadPacientes).append("\n");
        return sb.toString();
    }
}

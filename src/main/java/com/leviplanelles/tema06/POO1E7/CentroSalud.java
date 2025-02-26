package com.leviplanelles.tema06.POO1E7;

public class CentroSalud {
    private final int LIMITE_DIARIO = 40;
    private Paciente[] pacientes;
    private int cantidadPacientes;

    public CentroSalud() {
        this.pacientes = new Paciente[LIMITE_DIARIO];
        this.cantidadPacientes = 0;
    }

    public Paciente[] getPacientes() {
        return pacientes;
    }

    public int getCantidadPacientes() {
        return cantidadPacientes;
    }

    public void setCantidadPacientes(int cantidadPacientes) {
        this.cantidadPacientes = cantidadPacientes;
    }

    public Paciente newPaciente(int SIP, String NAME, Paciente.Gender GENDER, int AGE, String SINTOMATOLOGIA) {
        cantidadPacientes++;
        return new Paciente(SIP,NAME,GENDER,AGE,SINTOMATOLOGIA);
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

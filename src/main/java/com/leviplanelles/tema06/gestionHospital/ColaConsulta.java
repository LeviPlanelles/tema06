package com.leviplanelles.tema06.gestionHospital;

public class ColaConsulta {
    private Cola<Paciente> pacienteCola = new Cola<>(5);
    private Medico medico = new Medico();

    public ColaConsulta(Cola<Paciente> pacienteCola, Medico medico) {
        this.pacienteCola = pacienteCola;
        this.medico = medico;
    }

    public Cola<Paciente> getPacienteCola() {
        return pacienteCola;
    }

    public Medico getMedico() {
        return medico;
    }

    @Override
    public String toString() {
        return "ColaConsulta{" +
                "pacienteCola=" + pacienteCola +
                ", medico=" + medico +
                '}';
    }
}

package com.leviplanelles.tema06.gestionHospital;

public class ColaConsulta {
    private Cola<Paciente> pacienteCola;
    private Medico medico;

    public ColaConsulta(Medico medico) {
        this.pacienteCola = new Cola<>();
        this.medico = medico;
    }

    public Cola<Paciente> getPacienteCola() {
        return pacienteCola;
    }

    public void setPacienteCola(Cola<Paciente> pacienteCola) {
        this.pacienteCola = pacienteCola;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @Override
    public String toString() {
        return "ColaConsulta{" +
                ", medico=" + medico +
                "pacienteCola=" + pacienteCola.toString() +
                '}'+"\n";
    }
}

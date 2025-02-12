package com.leviplanelles.tema06.gestionHospital;

import java.time.LocalDateTime;
public class Paciente {
    private String nombre;
    private String SIP;
    private LocalDateTime fechaIngreso;

    public Paciente(String nombre, String SIP) {
        this.nombre = nombre;
        this.SIP = SIP;
        this.fechaIngreso = LocalDateTime.now();
    }

    public String getNombre() {
        return nombre;
    }

    public String getSIP() {
        return SIP;
    }

    public LocalDateTime getFechaIngreso() {
        return fechaIngreso;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", SIP='" + SIP + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                '}';
    }
}

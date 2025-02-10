package com.leviplanelles.tema06.gestionHospital;

import java.time.LocalDateTime;
//String.format("%d%s",random.nextInt(10000000,99999999),(char)random.nextInt(65,91))

public class Paciente {
    private String nombre;
    private String SIP;
    private LocalDateTime fechaIngreso;

    public Paciente(String nombre, String SIP) {
        this.nombre = nombre;
        this.SIP = SIP;
        this.fechaIngreso = LocalDateTime.now();
    }

    public Paciente() {
        this("Sin Nombre", "Sin SIP");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSIP() {
        return SIP;
    }

    public void setSIP(String SIP) {
        this.SIP = SIP;
    }

    public LocalDateTime getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDateTime fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}

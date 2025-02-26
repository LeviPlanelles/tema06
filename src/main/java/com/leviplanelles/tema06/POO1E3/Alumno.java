package com.leviplanelles.tema06.POO1E3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Alumno {
    private final String nia;
    private final String nombre;
    private final String apellidos;
    private final LocalDate fechaNacimiento;
    private final String grupo;
    private final int telefonoContacto;

    public Alumno(String nia, String nombre, String apellidos, String fechaNacimiento, String grupo, int telefonoContacto) {
        this.nia = nia;
        this.nombre = nombre;
        this.apellidos = apellidos;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, formatter);
        this.grupo = grupo;
        this.telefonoContacto = telefonoContacto;
    }

    public String getNia() {
        return nia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public int getEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public String getGrupo() {
        return grupo;
    }

    public int getTelefonoContacto() {
        return telefonoContacto;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nia='" + nia + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", grupo='" + grupo + '\'' +
                ", telefonoContacto=" + telefonoContacto +
                '}';
    }
}

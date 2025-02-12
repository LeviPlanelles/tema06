package com.leviplanelles.tema06.gestionHospital;

public class Medico {
    private String nombre;
    private int numColegiado;

    public Medico(String nombre, int numColegiado) {
        this.nombre = nombre;
        this.numColegiado = numColegiado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumColegiado() {
        return numColegiado;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nombre='" + nombre + '\'' +
                ", numColegiado=" + numColegiado +
                '}'+" ";
    }
}

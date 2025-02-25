package com.leviplanelles.tema06.POO1E2;

public class Asignatura {
    private final String nombre;
    private final int cod;
    private final String curso;

    public Asignatura(String nombre, int cod, String curso) {
        this.nombre = nombre;
        this.cod = cod;
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCod() {
        return cod;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return "Asignatura:" + "\n" +
                "nombre= " + nombre + "\n" +
                "cod= " + cod + "\n" +
                "curso= " + curso + "\n";
    }
}

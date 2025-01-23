package com.leviplanelles.tema06.POO1E1;

public class Coche {
    private enum TipoCoche {
        MINI, UTILITARIO, FAMILIAR, DEPORTIVO
    }
    private enum ModalidadSeguro {
        TERCERO, TODO_RIESGO
    }

    private String modelo;
    private String color;
    private boolean metalizado;
    private String matricula;
    private TipoCoche tipoCoche;
    private int anio;
    private ModalidadSeguro modalidadSeguro;

    public Coche(String modelo, String color, boolean metalizado, String matricula, TipoCoche tipoCoche, int anio, ModalidadSeguro modalidadSeguro) {
        this.modelo = modelo;
        this.color = color;
        this.metalizado = metalizado;
        this.matricula = matricula;
        this.tipoCoche = tipoCoche;
        this.anio = anio;
        this.modalidadSeguro = modalidadSeguro;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", metalizado=" + metalizado +
                ", matricula='" + matricula + '\'' +
                ", tipoCoche=" + tipoCoche +
                ", anio=" + anio +
                ", modalidadSeguro=" + modalidadSeguro +
                '}';
    }
}

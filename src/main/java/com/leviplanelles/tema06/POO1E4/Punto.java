package com.leviplanelles.tema06.POO1E4;

public class Punto {
    private double puntoX;
    private double puntoY;

    public Punto(double puntoX, double puntoY) {
        this.puntoX = puntoX;
        this.puntoY = puntoY;
    }
    public Punto() {
        this.puntoX = 0;
        this.puntoY = 0;
    }

    public double getPuntoX() {
        return puntoX;
    }

    public void setPuntoX(double puntoX) {
        this.puntoX = puntoX;
    }

    public double getPuntoY() {
        return puntoY;
    }

    public void setPuntoY(double puntoY) {
        this.puntoY = puntoY;
    }

    @Override
    public String toString() {
        return "(" + puntoX + ", " + puntoY + ")";
    }

    public double distancia(Punto punto) {
        return Math.sqrt(Math.pow(punto.getPuntoX() - this.puntoX, 2) + Math.pow(punto.getPuntoY() - this.puntoY, 2));
    }
}

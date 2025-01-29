package com.leviplanelles.tema06.POO1E5;

import com.leviplanelles.tema06.POO1E4.Punto;

public class Circunferencia {
    private Punto centro;
    private double r;

    public Circunferencia(Punto centro, double r) {
        this.centro = centro;
        this.r = r;
    }
    public Circunferencia(double x, double y, double r) {
        this.centro = new Punto(x,y);
        this.r = r;
    }
    public Circunferencia() {
        this(new Punto(),1);
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    public double distancia(Punto centro) {
        return centro.distancia(centro);
    }
    public double area() {
        return Math.PI * Math.pow(r, 2);
    }
    public double perimetro() {
        return 2 * Math.PI * r;
    }
    @Override
    public String toString() {
        if (centro.getPuntoX() == 0 && centro.getPuntoY() == 0) {
            return "Círcunferencia de radio " + r + " cm situada en el origen de coordenadas.";
        } else {
            return "Círcunferencia de radio " + r + " cm situada en el punto " + centro;
        }
    }


}

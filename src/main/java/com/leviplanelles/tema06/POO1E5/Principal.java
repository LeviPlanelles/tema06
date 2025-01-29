package com.leviplanelles.tema06.POO1E5;

import com.leviplanelles.tema06.POO1E4.Punto;

public class Principal {
    public static void main(String[] args) {
        Circunferencia c1 = new Circunferencia(new Punto(3.2,2.2),2);
        Circunferencia c2 = new Circunferencia(0.1,2.4,2);
        Circunferencia c3 = new Circunferencia();

        System.out.println(c1);
        System.out.println("Área: " + c1.area() + " cm²");
        System.out.println("Perímetro: " + c1.perimetro() + " cm");
        System.out.println();

        System.out.println(c2);
        System.out.println("Área: " + c2.area() + " cm²");
        System.out.println("Perímetro: " + c2.perimetro() + " cm");
        System.out.println();

        System.out.println(c3);
        System.out.println("Área: " + c3.area() + " cm²");
        System.out.println("Perímetro: " + c3.perimetro() + " cm");
        System.out.println();

        System.out.println("Distancia entre c1 y c2: " + c1.getCentro().distancia(c2.getCentro()) + " cm");
    }



}

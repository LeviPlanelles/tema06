package com.leviplanelles.tema06.POO1E4;

public class Principal {
    public static void main(String[] args) {
        Punto punto1 = new Punto();
        Punto punto2 = new Punto(2.2,3.3);

        System.out.println(punto1.toString());
        System.out.println(punto2.toString());

    }
}

package com.leviplanelles.tema06.POO1E1;

public class Principal {
    public static void main(String[] args) {
        Coche coche = new Coche("Porsche 911","rojo",true, Coche.TipoCoche.DEPORTIVO,2000, Coche.ModalidadSeguro.TODO_RIESGO);
        Coche coche1 = new Coche("Porsche 911","azul",true, Coche.TipoCoche.DEPORTIVO,2000, Coche.ModalidadSeguro.TODO_RIESGO);
        System.out.println(coche);
        System.out.println(coche1);
    }
}

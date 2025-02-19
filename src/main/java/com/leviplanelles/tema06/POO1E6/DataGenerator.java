package com.leviplanelles.tema06.POO1E6;

import java.util.Random;
import java.util.Scanner;

import static com.leviplanelles.tema06.POO1E6.Bicicleta.pedirBooleano;

public class DataGenerator {
    public static Bicicleta generarBicicletas(Tienda tienda) {
        Random random = new Random();
        String[] marcas = {
                "Trek", "Specialized", "Giant", "Cannondale", "Scott",
                "BMC", "Merida", "Orbea", "Canyon", "BH"
        };
        int i = random.nextInt(0, marcas.length);
        String[] modelos = {
                "X-Caliber", "Tarmac SL7", "Reign Advanced", "SuperSix EVO", "Spark RC",
                "Roadmachine", "Big Nine", "Oiz", "Aeroad", "Ultimate"
        };
        int j = random.nextInt(0, modelos.length);
        String[] fechas = {
                "2023-01-15", "2022-06-20", "2021-11-10", "2020-03-05", "2019-08-25",
                "2018-12-30", "2017-07-14", "2016-09-01", "2015-04-22", "2014-10-18"
        };
        int k = random.nextInt(0, fechas.length);
        float[] tamaniosRuedas = {
                12.0f, 14.0f, 16.0f, 18.0f, 20.0f,
                24.0f, 26.0f, 27.5f, 29.0f, 32.0f
        };
        int l = random.nextInt(0,tamaniosRuedas.length);
        int indiceBici = tienda.getContadorBicis();
        tienda.setContadorBicis(indiceBici + 1);
        return new Bicicleta(random.nextInt(1000,10000),marcas[i], modelos[j], random.nextInt(10,20), tamaniosRuedas[l], random.nextBoolean(),fechas[k], random.nextInt(200,5001));

    }

    public static Bicicleta genararBicicletas(Tienda tienda ,int referencia, String marca, String modelo, int peso, float tamanio, boolean tieneMotor, String fecha, int precio) {
        return new Bicicleta(referencia,marca,modelo,peso,tamanio,tieneMotor,fecha,precio);
    }
}

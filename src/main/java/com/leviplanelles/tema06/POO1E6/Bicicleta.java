package com.leviplanelles.tema06.POO1E6;

import java.util.Objects;
import java.util.Scanner;

public class Bicicleta {
    private final int referencia;
    private final String marca;
    private final String modelo;
    private final int peso;
    private final float tamanioRuedas;
    private final boolean tieneMotor;
    private final String fecha;
    private int precio;
    private int stock = 0;
    public Bicicleta(int referencia, String marca, String modelo, int peso, float tamanioRuedas, boolean tieneMotor, String fecha, int precio) {
        this.referencia = referencia;
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.tamanioRuedas = tamanioRuedas;
        this.tieneMotor = tieneMotor;
        this.fecha = fecha;
        this.precio = precio;
        stock++;
    }

    public int getReferencia() {
        return referencia;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPeso() {
        return peso;
    }

    public float getTamanioRuedas() {
        return tamanioRuedas;
    }

    public boolean isTieneMotor() {
        return tieneMotor;
    }

    public String getFecha() {
        return fecha;
    }

    public int getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public static boolean pedirBooleano(Scanner scanner, String mensaje) {
        String entrada;
        do {
            System.out.print(mensaje);
            entrada = scanner.nextLine().trim().toLowerCase();
            if (entrada.equals("s")) {
                return true;
            } else if (entrada.equals("n")) {
                return false;
            } else {
                System.out.println("Entrada no válida. Introduce 's' para Sí o 'n' para No.");
            }
        } while (true);
    }
    @Override
    public String toString() {
        return "Bicicleta {\n" +
                "  Referencia: " + referencia + ",\n" +
                "  Marca: " + marca + ",\n" +
                "  Modelo: " + modelo + ",\n" +
                "  Peso: " + peso + " kg,\n" +
                "  Tamaño de ruedas: " + tamanioRuedas + " pulgadas,\n" +
                "  Tiene motor: " + (tieneMotor ? "Sí" : "No") + ",\n" +
                "  Fecha de fabricación: " + fecha + ",\n" +
                "  Precio: " + precio + " €,\n" +
                "  Stock disponible: " + stock + "\n" +
                "}";
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bicicleta bicicleta = (Bicicleta) o;
        return referencia == bicicleta.referencia && peso == bicicleta.peso && tamanioRuedas == bicicleta.tamanioRuedas && tieneMotor == bicicleta.tieneMotor && precio == bicicleta.precio && stock == bicicleta.stock && Objects.equals(marca, bicicleta.marca) && Objects.equals(modelo, bicicleta.modelo) && Objects.equals(fecha, bicicleta.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(referencia, marca, modelo, peso, tamanioRuedas, tieneMotor, fecha, precio, stock);
    }
}


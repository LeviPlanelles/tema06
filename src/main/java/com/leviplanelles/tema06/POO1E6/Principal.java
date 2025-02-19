package com.leviplanelles.tema06.POO1E6;

import java.util.Arrays;
import java.util.Scanner;

import static com.leviplanelles.tema06.POO1E6.Bicicleta.pedirBooleano;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tienda tienda = new Tienda();
        int choice;
        do {
            choice = menu();
            switch (choice) {
                case 1 -> aniadirBici(tienda);
                case 2 -> venderBici(tienda);
                case 3 -> submenu(tienda);
                case 4 -> mostrarStock(tienda);
                case 5 -> {
                    System.out.print("Cantidad de bicicletas a generar: ");
                    int cantidad = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < cantidad; i++) {
                        if (tienda.getBicicletas()[i] == null) {
                            tienda.getBicicletas()[tienda.getContadorBicis()] = DataGenerator.generarBicicletas(tienda);
                        }
                    }
                }
                case 0 -> {}
            }
        }while (choice != 0);
    }
    public static int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***************************");
        System.out.println("** GESTIÓN DE BICICLETAS **");
        System.out.println("***************************");
        System.out.println();
        System.out.println("1.- Añadir bicicleta");
        System.out.println("2.- Vender bicicleta");
        System.out.println("3.- Consultar bicicleta");
        System.out.println("4.- Mostrar stock");
        System.out.println("5.- Generar bicicletas");
        System.out.println("---------------------------");
        System.out.println("0.- Salir");
        System.out.println();
        int eleccion;
        do {
            System.out.print("Elige: ");
            eleccion = Integer.parseInt(scanner.nextLine());
        }while (eleccion < 0 || eleccion > 5);
        return eleccion;
    }

    public static void submenu(Tienda tienda) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("****************************");
        System.out.println("** CONSULTA DE BICICLETAS **");
        System.out.println("****************************");
        System.out.println();
        System.out.println("1.- Consultar por referencia");
        System.out.println("2.- Consultar por marca");
        System.out.println("3.- Consultar por modelo");
        System.out.println("----------------------------");
        System.out.println("0.- Volver al menu principal");
        int eleccion;
        do {
            System.out.print("Elige: ");
            eleccion = Integer.parseInt(scanner.nextLine());
        }while (eleccion < 0 || eleccion > 3);
        switch (eleccion) {
            case 1 -> porReferencia(tienda);
            case 2 -> porMarca(tienda);
            case 3 -> porModelo(tienda);
            case 0 -> {
                return;
            }
        }
    }

    public static void aniadirBici(Tienda tienda) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Referencia: ");
        int referencia = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < tienda.getBicicletas().length; i++) {
            if (tienda.getBicicletas()[i] != null && tienda.getBicicletas()[i].getReferencia() == referencia) {
                int stock = tienda.getBicicletas()[i].getStock();
                tienda.getBicicletas()[i].setStock(++stock);
                System.out.println("Aumentanto stock de la bicicleta " + tienda.getBicicletas()[i].getReferencia());
                return;
            }
        }
        System.out.print("Marca: ");
        String marca = scanner.nextLine();

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Peso: ");
        int peso = Integer.parseInt(scanner.nextLine());

        System.out.print("Tamaño ruedas: ");
        float tamanio = Float.parseFloat(scanner.nextLine());

        boolean tieneMotor = pedirBooleano(scanner,"Motor? (s/n)");

        System.out.print("Fecha fabricación: ");
        String fecha = scanner.nextLine();

        System.out.print("Precio: ");
        int precio = Integer.parseInt(scanner.nextLine());
        tienda.getBicicletas()[tienda.getContadorBicis()] = DataGenerator.genararBicicletas(tienda,referencia,marca,modelo,peso,tamanio,tieneMotor,fecha,precio);
    }
    public static void venderBici(Tienda tienda) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el número de referencia: ");
        int ref = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < tienda.getBicicletas().length; i++) {
            if (tienda.getBicicletas()[i] != null && tienda.getBicicletas()[i].getReferencia() == ref && tienda.getBicicletas()[i].getStock() > 0) {
                System.out.println("Bicicleta " + tienda.getBicicletas()[i].getReferencia() + " vendida correctamente");
                int existencias = tienda.getBicicletas()[i].getStock();
                tienda.getBicicletas()[i].setStock(existencias - 1);
            } else if (tienda.getBicicletas()[i] != null && tienda.getBicicletas()[i].getReferencia() == ref && tienda.getBicicletas()[i].getStock() == 0) {
                System.out.println("No existen más existencias de la bicicleta " + tienda.getBicicletas()[i].getReferencia());
            }
        }
    }
    public static void mostrarStock(Tienda tienda) {
        System.out.println(tienda);
    }
    public static void porReferencia(Tienda tienda) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Referencia: ");
        int ref = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < tienda.getBicicletas().length; i++) {
            if (tienda.getBicicletas()[i] != null && tienda.getBicicletas()[i].getReferencia() == ref) {
                System.out.println(tienda.getBicicletas()[i].toString());
                return;
            }
        }
        System.out.println("No existe esa bicicleta!");
    }
    public static void porMarca(Tienda tienda) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        for (int i = 0; i < tienda.getBicicletas().length; i++) {
            if (tienda.getBicicletas()[i] != null && tienda.getBicicletas()[i].getMarca().equals(marca)) {
                System.out.println(tienda.getBicicletas()[i].toString());
            }
        }
    }
    public static void porModelo(Tienda tienda) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        for (int i = 0; i < tienda.getBicicletas().length; i++) {
            if (tienda.getBicicletas()[i] != null && tienda.getBicicletas()[i].getModelo().equals(modelo)) {
                System.out.println(tienda.getBicicletas()[i].toString());
            }
        }
    }
}

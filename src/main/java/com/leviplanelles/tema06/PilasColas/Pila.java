package com.leviplanelles.tema06.PilasColas;

import java.util.Scanner;

public class Pila {
    static int posicion = 0;
    public static void main(String[] args) {
        final int TAMANYO_ARRAY = 50;
        int[] pila = constructor(TAMANYO_ARRAY);
        menu(pila);
    }

    public static int[] constructor (int tamanio) {
        int[] a = new int[tamanio];
        return a;
    }

    public static void push (int[] a ) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserte un numero entero");
        int numero = scanner.nextInt();

        posicion++;
        a[posicion-1] = numero;
    }

    public static void pop (int[] a ) {
        if(posicion == 0){
            System.out.println("La pila esta vacia");
        }else{
            System.out.println(a[posicion-1]);
            posicion--;
        }

    }

    public static int size () {
        return posicion;
    }

    public static void top (int[] a ) {
        if(posicion == 0){
            System.out.println("La pila esta vacia");
        }else{
            System.out.println(a[posicion-1]);
        }
    }

    public static boolean empty () {
        if(posicion == 0){
            return true;
        }else{
            return false;
        }
    }

    public static void menu(int[] array) {
        Scanner scanner = new Scanner(System.in);
        int menu;

        do{
            System.out.println("-------");
            System.out.println("MENU");
            System.out.println("-------");
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.size");
            System.out.println("4.top");
            System.out.println("5.empty");
            System.out.println("6.exit");

            do{
                menu = scanner.nextInt();
                if(menu < 1 & menu > 6){
                    System.err.println("numero no valido");
                }
            }while(menu < 1 & menu > 6);

            switch (menu){
                case 1 -> push (array);
                case 2 -> pop (array);
                case 3 -> size ();
                case 4 -> top(array);
                case 5 -> empty();
                case 6 -> System.err.println();
            }
        }while(menu != 6);
    }

}

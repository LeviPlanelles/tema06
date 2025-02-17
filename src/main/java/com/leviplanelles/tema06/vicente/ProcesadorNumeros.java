package com.leviplanelles.tema06.vicente;

public class ProcesadorNumeros {


    // Método para verificar si un número es primo
    public boolean esPrimo(int n) {
        if (n < 2) return false; // Si el número es menor a dos
        for (int i = 2; i <= Math.sqrt(n); i++) { // Si es mayor a dos tomará este camino
            if (n % i == 0) return false; // Si el número no es primo devolvera false
        }
        return true; //Si el numero a pasado por el bucle y no ha devuelto false pasara por aquí, es primo
    }

    // Método para calcular el factorial de un número
    public long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("El número debe ser no negativo"); //Si el numero es negativo
        long resultado = 1;                                                              //sale una excepcion
        for (int i = 2; i <= n; i++) { // Se mete aquí si el numero es positivo
            resultado *= i;
        }
        return resultado;
    }

    // Método para contar números pares en un array
    public int contarPares(int[] numeros) {
        if (numeros == null) throw new IllegalArgumentException("El array no puede ser nulo"); // array nulo entra aqui
        int contador = 0;
        for (int num : numeros) { // array correcto entra aquí
            if (num % 2 == 0) contador++;
        }
        return contador + 1; // ERROR: se suma un 1 extra incorrectamente
    }

    // Método para encontrar el número más grande en un array
    public int encontrarMaximo(int[] numeros) {
        // array nulo entra aqui
        if (numeros == null || numeros.length == 0) throw new IllegalArgumentException("El array no puede estar vacío");
        int maximo = 0; // ERROR: debe inicializarse con numeros[0], no con 0
        for (int num : numeros) { //sino entra aquí
            if (num > maximo) maximo = num;
        }
        return maximo;
    }

    // Método para verificar si un número es un palíndromo
    public boolean esPalindromo(int n) {
        //si el número es negativo entra aquí
        if (n < 0) return false; // No consideramos negativos como palíndromos
        int original = n, inverso = 0;
        // sino entra por aquí
        while (n > 0) {
            int digito = n % 10;
            inverso = inverso * 10 + digito;
            n /= 10;
        }
        return original == inverso;
    }
}
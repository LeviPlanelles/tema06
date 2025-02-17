package com.leviplanelles.tema06.generics;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Pila<T> {

   public static void main(String[] args) {
        Pila <Object> pila = new Pila<>();
       for (int i = 0; i < INITIAL_SIZE; i++) {
           pila.push(i);
       }
       System.out.println(pila);
       int busqueda = pila.search(8);
       System.out.println(busqueda);
       pila.reverse();
       System.out.println(pila);
       System.out.println(Arrays.toString(pila.peek(2)));
       System.out.println(Arrays.toString(pila.clonar()));

    }

    private static final int INITIAL_SIZE = 10;
    private static final float GROW_FACTOR = 2f;
    private Object[] data;
    private int size;

    public Pila() {
        this(INITIAL_SIZE);
    }

    public Pila(int size) {
        data = new Object[size];
        this.size = 0;
    }

    public void clear() {
        size = 0;
    }
    public T[] clonar() {
        Object[] aux = new Object[size];
        for (int i = 0; i < size; i++) {
            aux[i] = data[i];
        }
        return (T[]) aux;
    }

    public T[] peek(int n) {
        if (n > size) {
            return null;
        }
        return (T[]) Arrays.copyOfRange(data,size - n, size);
    }

    public int search(T element) {
        int contador = 0;
        if (isEmpty())
            return -1;
        for (int i = size - 1; i >= 0; i--) {
            contador++;
            if (data[i].equals(element)) {
                return contador;
            }
        }
        return -1;
    }

    public void reverse() {
        Object[] aux = new Object[size];
        int contador = 0;
        for (int i = size - 1; i >= 0; i--) {
            aux[contador++] = data[i];
        }
        data = aux;
    }

    public void push(T e) {
        if (isFull()) {
            expand();
        }
        data[size] = e;
        size++;
    }

    private void expand() {
        Object[] aux = new Object[Math.round(data.length * GROW_FACTOR)];
        for (int i = 0; i < data.length; i++) {
            aux[i] = data[i];
        }
        data = aux;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T e = (T) data[size - 1];
        size--;
        return e;
    }

    public T top() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T e = (T) data[size - 1];
        return e;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]).append(" ");
        }
        sb.append("]");
        return sb.toString();
    }
}

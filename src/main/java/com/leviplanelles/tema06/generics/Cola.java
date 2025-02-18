package com.leviplanelles.tema06.generics;

import java.util.Arrays;

public class Cola<T> {

    public static void main(String[] args) {
        Cola <String> cola = new Cola<>();
        for (int i = 0; i < DEFAULT_CAPACITY; i++) {
            cola.add(String.valueOf(i));
        }
        System.out.println(cola);
        int busqueda = cola.search("2");
        System.out.println(busqueda);
        cola.reverse();
        System.out.println(cola);
        System.out.println(cola.peekLast());
        System.out.println(Arrays.toString(cola.clonar()));
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

    public T peekLast() {
        if (isEmpty())
            return null;
        return data[size-1];
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
        @SuppressWarnings("unchecked")
        T[] aux = (T[]) new Object[size];
        int contador = 0;
        for (int i = size - 1; i >= 0; i--) {
            aux[contador++] = data[i];
        }
        data = aux;
    }


    private final static int DEFAULT_CAPACITY = 5;
    private final static float GROW_FACTOR = 2f;
    private T[] data;
    private int size;


    public Cola() {
        this(DEFAULT_CAPACITY);
    }
    public Cola(int initialCapacity) {
        @SuppressWarnings("unchecked")
        T[] temp = (T[]) new Object[initialCapacity];
        data = temp;
        size = 0;
    }


    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean add(T value) {
        if (isFull())
            expand();
        data[size] = value;
        size++;
        return true;
    }

    public boolean add(int index, T value) {
        if (index >= size || index < 0)
            return false;
        if (isFull())
            expand();
        moveToRight(index);
        data[index] = value;
        return true;
    }

    private void expand() {
        @SuppressWarnings("unchecked")
        T[] copy = (T[]) new Object[Math.round(data.length * GROW_FACTOR)];
        for (int i = 0; i < size; i++) {
            copy[i] = data[i];
        }
        data = copy;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        if (isEmpty())
            return null;
        T valor = data[0];
        size--;
        moveToLeft();
        return valor;
    }

    private void moveToLeft() {
        for (int i = 0; i < size -1; i++) {
            data[i] = data[i + 1];
        }

    }

    private void moveToRight(int index) {
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        size++;
    }

    public T peek() {
        if (isEmpty())
            return null;
        return data[0];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cola cola = (Cola) o;

        return data.equals(cola.data);
    }

    @Override
    public int hashCode() {
        return data.hashCode();
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(data,size));
    }
}

package com.leviplanelles.tema06.gestionHospital;

public class Cola<T> {


    private final static int DEFAULT_CAPACITY = 10;
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
        moveToLeft();
        return valor;
    }

    private void moveToLeft() {
        for (int i = 0; i < size; i++) {
            data[i] = data[i + 1];
        }
        size--;
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
        return "Cola " + data;
    }
}

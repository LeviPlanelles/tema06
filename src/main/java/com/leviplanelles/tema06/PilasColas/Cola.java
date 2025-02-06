package com.leviplanelles.tema06.PilasColas;


public class Cola {

    private static final int INITIAL_CAPACITY = 10;
    private final DynamicArray data;
    public Cola() {
        this(INITIAL_CAPACITY);
    }
    public Cola(int initialCapacity) {
        data = new DynamicArray(initialCapacity);
    }


    public int size() {
        return data.size();
    }

    public boolean isEmpty() {
        return data.size() == 0;
    }

    public boolean add(double value) {
        return data.add(value);
    }

    public double remove() {
        if (isEmpty())
            return Double.POSITIVE_INFINITY;
        return data.remove(0);
    }

    public double peek() {
        if (isEmpty())
            return Double.POSITIVE_INFINITY;
        return data.get(0);
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

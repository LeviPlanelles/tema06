package com.leviplanelles.tema06.POO1E6;

import java.util.Arrays;

public class Tienda {
    private Bicicleta[] bicicletas;
    private int nReferencias;
    private int contadorBicis = 0;

    public Tienda() {
        nReferencias = 0;
        bicicletas = new Bicicleta[100];
    }

    public Bicicleta[] getBicicletas() {
        return bicicletas;
    }

    public int getnReferencias() {
        return nReferencias;
    }
    public int getContadorBicis() {return contadorBicis; }
    public void setContadorBicis(int contadorBicis) {
        this.contadorBicis = contadorBicis;
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "bicicletas=" + Arrays.toString(bicicletas) +
                ", nReferencias=" + nReferencias +
                '}';
    }
}



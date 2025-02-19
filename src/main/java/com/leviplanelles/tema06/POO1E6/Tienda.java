package com.leviplanelles.tema06.POO1E6;

public class Tienda {
    private Bicicleta[] bicicletas;
    private int contadorBicis;

    public Tienda() {
        contadorBicis = 0;
        bicicletas = new Bicicleta[100];
    }

    public Bicicleta[] getBicicletas() {
        return bicicletas;
    }

    public int getContadorBicis() {return contadorBicis; }
    public void setContadorBicis(int contadorBicis) {
        this.contadorBicis = contadorBicis;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tienda: \n");
        for (int i = 0; i < contadorBicis; i++) {
            sb.append(bicicletas[i]).append(",\n");
        }
        if (!sb.isEmpty()) {
            sb.deleteCharAt(sb.length() - 2);
        }
        sb.append("nReferencias: ").append(contadorBicis).append("\n");
        return sb.toString();
    }
}



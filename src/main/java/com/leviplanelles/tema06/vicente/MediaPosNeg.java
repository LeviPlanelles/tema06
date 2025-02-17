package com.leviplanelles.tema06.vicente;

import java.util.Scanner;

public class MediaPosNeg {
    public static void main(String[] args) {
	
        int num = 0, contPos = 0, contNeg = 0, sumaPos = 0, sumaNeg = 0;
        float mediaPos = 0, mediaNeg = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        num = entrada.nextInt();

        while (num != 0) {
            if (num > 0) {
                contPos++;
                sumaPos += num;
            } else {
                contNeg++;
                sumaNeg += num;
            }
            System.out.print("Introduce número: ");
            num = entrada.nextInt();
        }

        if (contPos != 0) {
            mediaPos = (float) sumaPos / contPos;
            System.out.println("Media de los positivos: " + mediaPos);
        }
        if (contNeg != 0) {
            mediaNeg = (float) sumaNeg / contNeg;
            System.out.println("Media de los negativos: " + mediaNeg);
        }

        entrada.close();
    }
}

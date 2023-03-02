package ejercicio2;

import Ejercicio1.Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Ejercicio2 ejercicio2 = new Ejercicio2();
        Scanner sc = new Scanner(System.in);

        System.out.println("Indique el tamaño de su array");
        int tamaño = sc.nextInt();

        int[][] matriz = ejercicio2.crearMatriz(tamaño);

        for(int i = 0; i < matriz.length; i++){
            System.out.println();
            for (int j = 0; j < matriz.length; j++){
                System.out.print(" " + matriz[i][j]);
            }
        }
    }
}

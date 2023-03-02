package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ejercicio1 ejercicio1 = new Ejercicio1();
        Scanner sc = new Scanner(System.in);

        System.out.println("Indique la fila");
        int fila = sc.nextInt();
        System.out.println("Ingrese la columna");
        int columna = sc.nextInt();
        System.out.println("Ingrese el tamaño");
        int tamaño = sc.nextInt();

        int[][] matriz = ejercicio1.crearMatriz(fila,columna,tamaño);

        for(int i = 0; i < matriz.length; i++){
            System.out.println();
            for (int j = 0; j < matriz.length; j++){
                System.out.print(" " + matriz[i][j]);
            }
        }

    }
}

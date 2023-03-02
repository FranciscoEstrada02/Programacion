package ejercicio5;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        Ejercicio5 ejercicio5 = new Ejercicio5();

        System.out.println("Ingrese el tamaño de su array");
        int tamaño = sc.nextInt();
        int[][] matrizBase = new int[tamaño][tamaño];

        for(int i = 0; i < matrizBase.length; i++){
            System.out.println();
            for(int j = 0; j < matrizBase.length; j++){
                matrizBase[i][j] = rd.nextInt(2);
                System.out.print("" + matrizBase[i][j]);
            }
        }
        System.out.println();
        //Presento la matriz invertida
        int[][] matrizInvertida = ejercicio5.invertirMatriz(matrizBase,tamaño);

        for(int i = 0; i < matrizInvertida.length; i++){
            System.out.println();
            for(int j = 0; j < matrizInvertida.length; j++){
                System.out.print("" + matrizInvertida[i][j]);
            }
        }



    }
}

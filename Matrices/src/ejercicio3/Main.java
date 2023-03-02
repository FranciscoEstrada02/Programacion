package ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ejercicio3 ejercicio3 = new Ejercicio3();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño");
        int tamaño = sc.nextInt();

        int[][] matriz = ejercicio3.crearArray(tamaño);

        for(int i = 0; i < matriz.length; i++){
            System.out.println();
            for (int j = 0; j < matriz.length; j++){
                System.out.print(" " + matriz[i][j]);
            }
        }


    }

}

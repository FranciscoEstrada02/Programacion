package ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio4 ejercicio4 = new Ejercicio4();
        System.out.println("Ingrese el tamaño");
        int tamaño = sc.nextInt();

        int[][] matriz = ejercicio4.crearArray(tamaño);

        for(int i = 0; i < matriz.length; i++){
            System.out.println();
            for (int j = 0; j < matriz.length; j++){
                System.out.print(" " + matriz[i][j]);
            }
        }

    }
}

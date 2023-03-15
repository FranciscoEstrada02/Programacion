package e1;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {
    public static void main(String[] args) {

        int[][] miArray = new int[3][4];
        Random rd = new Random();

        //Relleno el array
        for (int i = 0; i < miArray.length; i++) {
            System.out.println();
            for (int j = 0; j < miArray.length; j++) {
                miArray[i][j] = rd.nextInt(11);
                System.out.printf(" " + miArray[i][j]);
            }
        }

        //Mayor de todo el array
        int mayor = miArray[0][0];
        for (int i = 0; i < miArray.length; i++) {
            for (int j = 0; j < miArray.length; j++) {
                if (miArray[i][j] > mayor) {
                    mayor = miArray[i][j];
                }
            }
        }
        System.out.println("\n El numero mayor del array es: " + mayor);

        //Menor de cada fila
        int[] menorFila = new int[miArray.length];
        for (int i = 0; i < miArray.length; i++) {
            System.out.println();
            for (int j = 0; j < miArray.length; j++) {
                if (miArray[i][j] > menorFila[i]) {
                    menorFila[i] = miArray[i][j];
                }
            }
        }
        System.out.println("Los numeros menores de cada fila son: " + Arrays.toString(menorFila));

    }
}

import java.util.Random;
import java.util.Scanner;

public class Ejercicio9 {


    public void rellenarArrays(int tamaño) {
        int[] arrayUno = new int[tamaño];
        int[] arrayMultiplicado = new int[tamaño];
        int[] arrayCopia = arrayUno;

        Random rd = new Random();

        for (int i = 0; i < arrayUno.length; i++) {
            arrayUno[i] = rd.nextInt(100);
            arrayMultiplicado[i] = arrayUno[i] * arrayCopia[i];
            System.out.printf("Posicion " + i + " del primer array " + arrayUno[i] + "\n");
            System.out.printf("Posicion " + i + " del segundo array " + arrayCopia[i] + "\n");
            System.out.printf("Posicion " + i + " del array  multiplicado " + arrayMultiplicado[i] + "\n\n");
        }

    }

}

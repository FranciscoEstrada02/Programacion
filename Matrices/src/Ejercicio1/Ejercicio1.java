package Ejercicio1;

public class Ejercicio1 {



    public int[][] crearMatriz(int fila, int columna, int tamano) {
        int[][] matriz = new int[tamano][tamano];

        for (int i = 0; i < tamano; i++) {
            matriz[fila][i] = 1;
            matriz[i][columna] = 1;
        }

        return matriz;
    }
}

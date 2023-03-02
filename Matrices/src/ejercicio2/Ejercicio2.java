package ejercicio2;

public class Ejercicio2 {


    public int[][] crearMatriz(int tamaño) {
        int[][] array = new int[tamaño][tamaño];

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if ((i % 2 == 0 || j % 2 == 0 || i == 0 || j == 0)){
                    array[i][j] = 1;
                }
            }
        }

        return array;
    }
}

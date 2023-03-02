package ejercicio3;

public class Ejercicio3 {

    public int[][] crearArray(int tamaño) {
        int[][] array = new int[tamaño][tamaño];

        for (int i = 0; i < tamaño; i++) {
            array[i][i] = 1;
            array[i][tamaño - i - 1] = 1;
        }
        return array;
    }

}

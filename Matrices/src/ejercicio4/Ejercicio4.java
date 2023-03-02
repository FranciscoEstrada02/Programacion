package ejercicio4;

public class Ejercicio4 {
    public  int[][] crearArray(int tamaño) {
        int[][] array = new int[tamaño][tamaño];

        int central = (tamaño / 2);
        for (int i = 0; i < array.length; i++) {
            array[central][i] = 1;
            array[i][central] = 1;
        }

        return array;
    }
}

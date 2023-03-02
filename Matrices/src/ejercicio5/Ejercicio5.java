package ejercicio5;

public class Ejercicio5 {


    public int[][] invertirMatriz(int[][] matriz, int tamaño) {

        int[][] matrizInvertida = new int[tamaño][tamaño];

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if(matriz[i][j] == 0){
                    matrizInvertida[i][j] = 1;
                }else {
                    matrizInvertida[i][j] = 0;
                }
            }
        }

        return matrizInvertida;
    }
}

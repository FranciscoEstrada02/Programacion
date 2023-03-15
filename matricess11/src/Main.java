import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[][] miArray = new int [3][3];

        Random rd = new Random();
        int[] mayoresPares = new int[miArray.length];
        for(int i = 0; i < miArray.length; i++){
            for(int j = 0; j < miArray[i].length;j++){
                mayoresPares[i] = -1;
            }
        }
        System.out.println(Arrays.toString(mayoresPares));
        for(int i = 0; i < miArray.length; i++){
            System.out.println();
            for(int j = 0; j < miArray[i].length;j++){
                miArray[i][j] = rd.nextInt(11);
                System.out.print(miArray[i][j] + " ");
            }
        }

        //Valor par mayor de cada fila
        for(int i = 0; i < miArray.length; i++){
            System.out.println();
            for(int j = 0; j < miArray[i].length;j++){
                if(miArray[i][j] % 2 == 0 && miArray[i][j] > mayoresPares[i] ){
                 mayoresPares[i] = miArray[i][j];
                }
            }
        }
        System.out.println(Arrays.toString(mayoresPares));
    }
}
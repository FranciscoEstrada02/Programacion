import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        double[] notas = new double[10];
        Random numAleatorio = new Random();

        for(int i = 0; i < notas.length; i++){
            notas[i] = i + 1 ;

        }
        System.out.println(Arrays.toString(notas));
        for(int i = 0;i <notas.length;i++){
            notas[i] = notas[i] * 1.21;
        }

        System.out.println(Arrays.toString(notas));



    }
}
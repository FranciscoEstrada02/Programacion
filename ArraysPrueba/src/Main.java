import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[] notas = new int[29];
        Random numAleatorio = new Random();

        for(int i = 0; i < notas.length; i++){
            notas[i] = numAleatorio.nextInt(10+1);

        }
        int suspensos = 0;
        System.out.println(Arrays.toString(notas));

        for(int nota: notas){
            if(nota < 5){
                suspensos++;
            }
        }
        System.out.println("Hay "suspensos);
    }
}
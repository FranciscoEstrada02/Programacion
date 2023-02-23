import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio2 ejercicio2 = new Ejercicio2();
        int[] array = new int[10];
        for(int i = 0; i < 10; i++){
            System.out.println("Ingrese valores para su array");
            int numeros = sc.nextInt();
            array[i]= numeros;
        }

        ejercicio2.presentarArray(array);
    }
}
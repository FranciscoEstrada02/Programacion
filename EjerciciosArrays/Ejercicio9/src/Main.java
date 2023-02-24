import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio9 ejercicio9 = new Ejercicio9();

        System.out.println("Ingrese el tamaño del array");
        int tamaño = sc.nextInt();

        ejercicio9.rellenarArrays(tamaño);
    }
}
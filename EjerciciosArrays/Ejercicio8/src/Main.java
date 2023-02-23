import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio8 ejercicio8 = new Ejercicio8();
        System.out.println("Ingrese su DNI");
        int numero = sc.nextInt();

        ejercicio8.recorrer();
        ejercicio8.asignar(numero);
    }
}
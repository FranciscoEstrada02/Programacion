import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ejercicio4 ejercicio4 = new Ejercicio4();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero en los que quiere que acaben los numeros");
        int numero = sc.nextInt();
        ejercicio4.rellenarArray();
        ejercicio4.comprobarArray(numero);
        ejercicio4.presentarArrayNuevo(numero);
    }
}
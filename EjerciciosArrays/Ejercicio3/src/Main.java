import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio3 ejercicio3 = new Ejercicio3();
        Boolean condicion = true;
        String cadena = "";

        while (condicion) {
            System.out.println("Ingrese un valor");
            int valor = sc.nextInt();
            if (valor == -1) {
                System.out.println("PROCESO TERMINADO");
                condicion = false;
            }  else {
                cadena = cadena + ejercicio3.hacerCadena(valor);
                System.out.println(cadena);
            }

        }
    }
}
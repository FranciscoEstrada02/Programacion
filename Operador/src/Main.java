import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        double x = sc.nextDouble();
        System.out.println("Ingrese el segundo numero");
        double y = sc.nextDouble();
        Operador operador = new Operador(x,y);
        Operador operador2 = new Operador(3,5);




        System.out.println("La suma es: " + operador.sumar());
        System.out.println("La resta es: " + operador.restar());
        System.out.println("La multiplicacion es: " + operador.multiplicar());
        System.out.println("La division es: " + operador.dividir());
        System.out.println("Los numeros desde el primero al segundo son");
        operador.mostrarNumeros();
        System.out.println(operador.primeroDivisible());
        System.out.println(operador.segundoDivisible());
        operador.sumaVariasVeces();


        System.out.println("La suma del primero numero del primeor objeto " +
                "+ el segundo numero del segundo objeto es " + (operador.getX() + operador2.getY()));
    }
}
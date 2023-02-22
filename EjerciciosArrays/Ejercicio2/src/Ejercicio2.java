import java.util.Scanner;

public class Ejercicio2 {
    private double[] notas = new double[10];

    public Ejercicio2() {
        this.notas = notas;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void rellenarArray(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            System.out.println("Ingrese valores para el array");
            int numero = sc.nextInt();
            notas[i] = numero;
        }
    }

    public void presentarArray(){
        for(int i = 0; i < 10; i++){
            System.out.println("Posicion " + i + " con valor: " + notas[i]);
        }
    }

    public void ejecutar(){
        rellenarArray();
        presentarArray();
    }
}

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Notas notas1 = new Notas();
        double [] notas = new double[10];
        String [] nombres = {"Juan","Pepe","Mario","Luis","Fran","Manuel","Ruben","Adrian","Daniel","Miguel"};
        Random numAleatorio = new Random();
        for(int i = 0; i < notas.length; i++){
            notas[i] = Math.round(numAleatorio.nextDouble(10));
            System.out.println("Estudiante: " + nombres[i] + " Y su calificacion es: " + notas[i] + " por lo tanto esta "  + notas1.calificaciones(notas[i]));
        }
    }
}

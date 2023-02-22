import java.util.Random;

public class Notas {

    private double[] notas = new double[10];
    private String[] nombres = {"Juan", "Pepe", "Mario", "Luis", "Fran", "Manuel", "Ruben", "Adrian", "Daniel", "Miguel"};
    private Nota[] notasEnPalabras = new Nota[10];
    Random numAleatorio = new Random();

    public Notas() {
        this.notas = notas;
        this.nombres = nombres;
    }

    public void ponerNotas() {
        Random rd = new Random();
        for (int i = 0; i < notas.length; i++) {
            notas[i] = Math.round(rd.nextDouble(10));
        }
    }
    public void asignarCalificaciones() {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 0 && notas[i] <= 4.99) {
                notasEnPalabras[i] = Nota.SUSPENSO;
            } else if (notas[i] >= 5 && notas[i] <= 6.99) {
                notasEnPalabras[i] = Nota.BIEN;
            } else if (notas[i] >= 7 && notas[i] <= 8.99) {
                notasEnPalabras[i] = Nota.NOTABLE;
            } else
                notasEnPalabras[i] = Nota.SOBRESALIENTE;
        }
    }

    public void presentarMensaje(){
        for(int i = 0; i < notas.length; i++){
            System.out.println("Estudiante: " + nombres[i] + " Y su calificacion es: " + notas[i] + " por lo tanto esta "  + notasEnPalabras[i]);
        }
    }

    public void ejecutar(){
        ponerNotas();
        asignarCalificaciones();
        presentarMensaje();
    }
}

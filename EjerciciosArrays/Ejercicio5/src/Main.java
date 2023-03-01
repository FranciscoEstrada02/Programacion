import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] bancoPalabras = {"CASA", "PERRO", "GATO", "AVIÓN", "MONTAÑA", "LAGO", "COCHE", "BICICLETA", "COMPUTADORA", "CELULAR", "CÁMARA", "SILLA", "MESA", "LIBRO", "LÁPIZ", "CUADERNO", "RELOJ", "PANTALLA", "TELEVISIÓN", "MICRÓFONO"};
        int indicePalabra = (int) (Math.random() * bancoPalabras.length);
        Ahorcado ahorcado = new Ahorcado(bancoPalabras[indicePalabra]);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al juego del ahorcado!");
        while (!ahorcado.finJuego()) {
            System.out.println(ahorcado.estado());
            System.out.println("Ingresa una letra:");
            char letra = scanner.next().charAt(0);
            if (!ahorcado.intentar(letra)) {
                System.out.println("Letra incorrecta.");
                System.out.println(ahorcado.getPista());
            }
        }
        if (ahorcado.adivinado()) {
            System.out.println("¡Felicitaciones, ganaste!");
        } else {
            System.out.println("Lo siento, perdiste");
        }
    }
}
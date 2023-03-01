import java.util.Scanner;

public class Ahorcado {
    private String palabraAdivinar;
    private boolean[] letrasAdivinadas;
    private int numFallos;

    public Ahorcado(String palabra) {
        palabraAdivinar = palabra.toUpperCase();
        letrasAdivinadas = new boolean[palabraAdivinar.length()];
        numFallos = 0;
    }

    public boolean intentar(char letra) {
        letra = Character.toUpperCase(letra);
        boolean adivinada = false;
        for (int i = 0; i < palabraAdivinar.length(); i++) {
            if (palabraAdivinar.charAt(i) == letra) {
                letrasAdivinadas[i] = true;
                adivinada = true;
            }
        }
        if (!adivinada) {
            numFallos++;
        }
        return adivinada;
    }

    public boolean adivinado() {
        for (boolean b : letrasAdivinadas) {
            if (!b) {
                return false;
            }
        }
        return true;
    }

    public boolean finJuego() {
        return numFallos >= 6 || adivinado();
    }

    public String estado() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < palabraAdivinar.length(); i++) {
            if (letrasAdivinadas[i]) {
                sb.append(palabraAdivinar.charAt(i));
            } else {
                sb.append('_');
            }
            sb.append(' ');
        }
        return sb.toString();
    }

    public String getPista() {
        int indicePista = (int) (Math.random() * palabraAdivinar.length());
        while (letrasAdivinadas[indicePista]) {
            indicePista = (int) (Math.random() * palabraAdivinar.length());
        }
        return "La letra en la posición " + (indicePista + 1) + " es " + palabraAdivinar.charAt(indicePista);
    }
}
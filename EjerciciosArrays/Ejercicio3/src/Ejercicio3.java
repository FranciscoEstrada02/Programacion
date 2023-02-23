public class Ejercicio3 {
    private char[] abecedario = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'W', 'X', 'Y', 'Z'};

    public Ejercicio3() {
        this.abecedario = abecedario;
    }

    public char[] getAbecedario() {
        return abecedario;
    }

    public void setAbecedario(char[] abecedario) {
        this.abecedario = abecedario;
    }

    public String hacerCadena(int valor) {
        String cadena = "";
        if (valor > 24 || valor < 0) {
            System.out.println("VALOR NO VALIDO, INGRESE OTRO");
        } else {
            cadena = cadena + String.format(String.valueOf(abecedario[valor]));
        }
        return cadena;
    }
}

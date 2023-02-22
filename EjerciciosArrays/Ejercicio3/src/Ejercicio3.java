import java.util.Scanner;

public class Ejercicio3 {
    private char[] abecedario = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','W','X','Y','Z'};

    public Ejercicio3() {
        this.abecedario = abecedario;
    }

    public char[] getAbecedario() {
        return abecedario;
    }

    public void setAbecedario(char[] abecedario) {
        this.abecedario = abecedario;
    }

    public void hacerCadena(){
        Boolean condicion = true;
        String cadena = "";
        Scanner sc = new Scanner(System.in);
        while(condicion){
            System.out.println("Ingrese un valor");
            int valor = sc.nextInt();
            if(valor == -1){
                System.out.println("PROCESO TERMINADO");
                condicion = false;

            }else if(valor > 24 || valor < 0){
                System.out.println("VALOR NO VALIDO, INGRESE OTRO");
            }else {
                cadena = cadena + String.format(String.valueOf(abecedario[valor]));
                System.out.println(cadena);
            }

        }
    }
}

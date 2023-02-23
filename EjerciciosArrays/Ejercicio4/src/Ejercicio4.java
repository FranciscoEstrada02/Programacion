import java.util.Random;

public class Ejercicio4 {
    private int[] valores = new int[10];
    private int[] valoresNuevos = new int[valores.length];
    Random rd = new Random();



    public void rellenarArray(){
        for(int i = 0; i < valores.length; i++){
            valores[i] = rd.nextInt(300);
            System.out.println(valores[i]);
        }
    }
    public void comprobarArray(int numero){
        for(int i = 0; i < valores.length; i++){
            if(valores[i] % 10 == numero){
                valoresNuevos[i] = valores[i];
            }
        }
    }

    public void presentarArrayNuevo(int numero){
        System.out.println("Los valores terminados en " + numero + " son:");
        for(int i = 0; i < valoresNuevos.length; i++){
            if(valoresNuevos[i] != 0){
                System.out.println( valoresNuevos[i]);
            }
        }
    }
}

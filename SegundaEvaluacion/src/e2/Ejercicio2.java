package e2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        ArrayList<Integer> miLista = new ArrayList<>();
        System.out.println("Los valores de la lista son: ");
        for(int i = 0; i < 3; i ++){
            miLista.add(rd.nextInt(4));
            System.out.print(" " + miLista.get(i));
        }
        Boolean condicion = true;
        while(condicion){
            System.out.println("\nIngrese valores para eliminar de la lista");
            int numero = sc.nextInt();

            for(int i = 0; i < miLista.size(); i++){
               if(miLista.get(i) == numero){
                   miLista.remove(miLista.get(i));
               }
            }
            if(miLista.isEmpty()){
                System.out.println("La lista está vacia: PROCESO TERMINADO");
                condicion = false;
            }

        }



    }

}

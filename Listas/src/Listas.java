import java.util.*;

public class Listas {
    protected List<Integer> lista1 = new ArrayList<>();
    protected List<Integer> lista2 = new ArrayList<>();
    protected List<Integer> lista3 = new ArrayList<>();
    int[] arreglo4 = new int[20];

    protected List<Integer> lista10 = new ArrayList<>();


    public List<Integer> getLista() {
        return lista1;
    }

    public void setLista(List<Integer> lista) {
        lista1 = lista;
    }

    public List<Integer> getLista2() {
        return lista2;
    }

    public void setLista2(List<Integer> lista2) {
        this.lista2 = lista2;
    }

    public List<Integer> getLista1() {
        return lista1;
    }

    public void setLista1(List<Integer> lista1) {
        this.lista1 = lista1;
    }

    public List<Integer> getLista3() {
        return lista3;
    }

    public void setLista3(List<Integer> lista3) {
        this.lista3 = lista3;
    }

    public int[] getArreglo4() {
        return arreglo4;
    }

    public List<Integer> getLista10() {
        return lista10;
    }

    public void setLista10(List<Integer> lista10) {
        this.lista10 = lista10;
    }

    public void setArreglo4(int[] arreglo4) {
        this.arreglo4 = arreglo4;
    }
    //Metodo 1

    public void ejercicioUno(int numero) {

        for (int i = 0; i <= numero; i++) {
            if (i % 2 == 0) {
                lista1.add(i);
            }
        }
    }

    //Metodo 2
    public void ejercicioDos(int numero[]) {
        for (int i = 0; i < numero.length; i++) {
            lista2.add(numero[i] + 3);
        }
    }
    //Metodo 3

    public void ejercicioTres(int numero[]) {
        for (int i = 0; i < numero.length; i++) {
            if (i % 2 != 0) {
                lista3.add(numero[i]);
            }
        }
    }

    //Metodo 4
    public int[] ejercicioCuatro(List<Integer> lista, int tamaño) {
        int[] arreglo4 = new int[lista.size()];


        for (int i = 0; i < lista.size(); i++) {
            arreglo4[i] = lista.get(i);
        }
        return arreglo4;

    }

    //Metodo 5

    public boolean ejercicioCinco(int[] arreglo5, int numero) {

        for (int i = 0; i < arreglo5.length; i++) {
            if (arreglo5[i] == numero) {
                return true;
            }
        }
        return false;
    }

    //Metodo 6

    public boolean ejercicioSeis(List<String> lista6, String palabra) {

        if (lista6.contains(palabra)) {
            return true;
        }else
            return false;
    }

    //Ejercicio 7
    public int ejercicioSiete(List<Integer> lista7) {
        return Collections.max(lista7);
    }
    //Ejercicio 8

    public int ejercicioOcho(int[] array8){
        int posicion = 0;
        for(int i = 0; i< array8.length; i++){
            if(array8[i] > array8[0]){
                posicion = i;
            }
        }
        return posicion;
    }

    //Ejercicio 9

    public int ejercicioNueve(int tamaño){
        List<Integer> lista9 = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < tamaño; i++){

            lista9.add(random.nextInt(10));
            System.out.println(lista9.get(i));

        }
        return Collections.max(lista9);
    }

    // Ejercicio 10

    public void ejercicioDiez(int limite){
        for (int i = 2; i <= limite; i++) {
            if (esPrimo(i)) {
                lista10.add(i);
            }
        }
    }

    public boolean esPrimo(int n){
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

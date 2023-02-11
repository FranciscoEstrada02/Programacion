import java.sql.SQLOutput;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        Listas lista = new Listas();
        //Ejercicio 1
        System.out.println("Ingrese un numero");
        int numero = sc.nextInt();
        lista.ejercicioUno(numero);
        System.out.println(lista.getLista());

        //Ejercicio2

        System.out.println("Ingrese el tamaño de su array");
        int tamaño = sc.nextInt();
        int[] arrayDos = new int[tamaño];
        for(int i = 0; i < arrayDos.length;i++){
            arrayDos[i] = random.nextInt(11)+1;
        }
        lista.ejercicioDos(arrayDos);
        System.out.println(lista.getLista2());

        //Ejercicio 3

        System.out.println("Ingrese el tamaña de su array");
        int tamaño3 = sc.nextInt();
        int[] arrayTres = new int[tamaño3];
        for(int i = 0; i < arrayTres.length; i++){
            arrayTres[i] = random.nextInt(11)+1;
        }
        lista.ejercicioTres(arrayTres);
        System.out.println(lista.getLista3());

        //Ejercicio 4 --------------------------------------------------
        System.out.println("Ingrese el tamaño de su lista");
        int tamaño4 = sc.nextInt();
        List<Integer> lista4 = new ArrayList<>();
        for(int i = 0; i <= tamaño4; i++){
            lista4.add(random.nextInt(10));

        }
        System.out.println(lista.ejercicioCuatro(lista4,tamaño4));

        //Ejercicio5

        System.out.println("Ingrese el tamaño de su array");
        int tamaño5 = sc.nextInt();
        System.out.println("Ingrese el numero que quiere encontrar");
        int numero5 = sc.nextInt();

        int[] arrayCinco = new int[tamaño5];
        for(int i = 0; i < arrayTres.length; i++){
            arrayCinco[i] = random.nextInt(11)+1;
            System.out.println(arrayCinco[i]);
        }
        System.out.println("Su valor esta en la lista: " + lista.ejercicioCinco(arrayCinco,numero5));

        //Ejercicio6

        sc.nextLine();
        System.out.println("Ingrese la palabra que quiere encontrar en la lista");
        String palabraSeis = sc.nextLine();
        List<String> lista6 = new ArrayList<>(Arrays.asList("Hola","Paco","Cesur","Programacion","Java"));

        System.out.println("Su palabra esta en la lista: " + lista.ejercicioSeis(lista6,palabraSeis));

        //Ejercicio7
        System.out.println("Ingrese el tamaño de su lista");
        int tamaño7 = sc.nextInt();
        List<Integer> lista7 = new ArrayList<>();
        for(int i = 0; i <= tamaño7; i++){
            lista7.add(random.nextInt(10));
            System.out.println(lista7.get(i));

        }
        System.out.println("El numero mayor es: " + lista.ejercicioSiete(lista7));

        //Ejercicio 8
        System.out.println("Ingrese el tamaño de su array");
        int tamaño8 = sc.nextInt();
        int[] arrayOcho = new int[tamaño8];
        for(int i = 0; i < arrayOcho.length; i++){
            arrayOcho[i] = random.nextInt(11)+1;
            System.out.println(arrayOcho[i]);
        }

        System.out.println("La posicion del numero mayor es: " + lista.ejercicioOcho(arrayOcho));

        //Ejercicio 9

        System.out.println("Ingrese el tamaño de su lista");
        int tamaño9 = sc.nextInt();
        System.out.println("El numero mayor es: " + lista.ejercicioNueve(tamaño9));

        //Ejercicio 10

        System.out.println("Ingrese hasta que numero desea saber los numeros primos");
        int limite10 = sc.nextInt();

        lista.ejercicioDiez(limite10);

        System.out.println(lista.getLista10());

    }
}
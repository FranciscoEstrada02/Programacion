import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        boolean condicion = true;

        while (condicion) {
            System.out.println("Opciones:" +
                    "\n1. Insercion de libros" +
                    "\n2. Mostrar libros" +
                    "\n3. Realizar préstamo" +
                    "\n4. Realizar devolución" +
                    "\n5. Salir");
            int opcion = sc.nextInt();
            if (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 5) {
                System.out.println("Opcion no valida, intente de nuevo");
            } else {
                if (opcion == 1) {
                    sc.nextLine();
                    System.out.println("Introduce el titulo");
                    String titulo = sc.nextLine();

                    System.out.println("Introduce el autor");
                    String autor = sc.nextLine();
                    System.out.println("Introduce el numero de ejemplares");
                    int numEjemplares = sc.nextInt();
                    biblioteca.agregarLibro(new Libro(titulo, autor, numEjemplares));
                } else if (opcion == 2) {
                    for (Libro libro : biblioteca.getBiblioteca()
                    ) {
                        System.out.println(libro.toString());
                    }
                } else if (opcion == 3) {
                    sc.nextLine();
                    System.out.println("Ingrese el libro que desea llevarse");
                    String libroPrestado = sc.nextLine();

                    for (Libro libro : biblioteca.getBiblioteca()
                    ) {
                        if (libro.getTitulo().equals(libroPrestado))
                            System.out.println(libro.realizarPrestamo());
                    }
                } else if (opcion == 4) {
                    sc.nextLine();
                    System.out.println("Ingrese el libro que desea devolver");
                    String libroDevuelto = sc.nextLine();

                    for (Libro libro : biblioteca.getBiblioteca()
                    ) {
                        if (libro.getTitulo().equals(libroDevuelto))
                            System.out.println(libro.realizarDevolucion());
                    }
                } else if (opcion == 5) {
                    condicion = false;
                }


            }
        }
    }
}
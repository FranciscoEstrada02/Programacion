import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pelicula pelicula1 = new Pelicula("Toy Story", "2002", "90 min", 9);
        Pelicula pelicula2 = new Pelicula("Pinocho", "2022", "90 min", 8);


        System.out.println(pelicula1.getTitulo());
        System.out.println(pelicula1.getDuracion());
        System.out.println(pelicula1.getAño());

        pelicula1.criticar("Andy es el mejor personaje");
        pelicula1.criticar("Lo mejor de lo mejorrrr");

        System.out.println(pelicula1.getCritica());


        pelicula2.setMediaVotos(6.2);
        pelicula2.setCantVotos(23693);
        pelicula2.setMiVoto(5);
        System.out.println(pelicula2.getMiVoto());
        System.out.println(pelicula1.getCantVotos());


        System.out.println("La pelicula con mejor puntucion es: " + pelicula1.votarPelicula(pelicula2));

    }

}
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> Biblioteca = new ArrayList<>();

    public Biblioteca() {
        Biblioteca = Biblioteca;
    }

    public List<Libro> getBiblioteca() {
        return Biblioteca;
    }

    public void setBiblioteca(List<Libro> biblioteca) {
        Biblioteca = biblioteca;
    }

    public void agregarLibro(Libro libro){
        Biblioteca.add(libro);
    }
}

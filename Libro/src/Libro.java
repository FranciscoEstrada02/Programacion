public class Libro {
    private String titulo;
    private String autor;
    private  int ejemplaresLibros = 0;
    private int ejemplaresPrestados;
    private int totalEjemplares;



    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.ejemplaresPrestados = 0;
    }

    public Libro(String titulo, String autor, int libros) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalEjemplares = libros ;
        this.ejemplaresPrestados = 0;
        this.ejemplaresLibros = libros;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplaresLibro() {
        return ejemplaresLibros;
    }


    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(int ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public String realizarPrestamo() {


        if(totalEjemplares > 0){

            this.ejemplaresPrestados++;
            this.totalEjemplares--;


            return "Prestamo realizado con exito";
        }else{
            return "No se ah podido realizar el prestamo";
        }
    }
    public String realizarDevolucion(){

        if(this.ejemplaresPrestados != 0){
            this.ejemplaresPrestados--;
            totalEjemplares += 1;
            return "Devolucion realizada con exito";
        }else {
            return "No se ah hecho la devolucion";
        }
    }

    @Override
    public String toString() {
        return "Libro: " + titulo + "\n" +
                "Autor: " + autor + "\n" +
                "Numero de ejemplares: " + ejemplaresLibros + "\n" +
                "Ejemplares prestados: " + ejemplaresPrestados + "\n" +
                "Ejemplaares en stock: " + totalEjemplares;
    }
}

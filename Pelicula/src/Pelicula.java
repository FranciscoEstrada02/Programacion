public class Pelicula {
    private String titulo;
    private String año;
    private String duracion;
    private String pais;
    private String director;

    private String critica;
    private int votar;
    private double puntuacion;

    private double numVotos;
    private int miVoto;

    public Pelicula(String titulo, String año, String duracion, double puntuacion) {

        this.titulo = titulo;
        this.año = año;
        this.duracion = duracion;
        this.critica = "";
        this.puntuacion = puntuacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


    public void setVotar(int votar) {
        this.votar = votar;
    }

    public String votarPelicula(Pelicula pelicula) {

        if (this.puntuacion >= pelicula.puntuacion) {
            return this.titulo;
        } else {
            return pelicula.titulo;
        }
    }

    public String getMediaVotos() {
        return "Votos: " + this.numVotos + " estrellas";
    }

    public void setMediaVotos(double votos) {
        this.numVotos = votos;
    }

    public String getCantVotos() {
        return "Puntuación: " + this.puntuacion;
    }

    public void setCantVotos(double punt) {
        this.puntuacion = ((punt + 1) * this.numVotos) / punt;
    }

    public void setMiVoto(int voto) {
        this.miVoto = voto;
    }

    public String getMiVoto() {
        return "Mi voto: " + this.miVoto + " estrellas";
    }


    public String getCritica() {
        return critica;
    }

    public void criticar(String texto) {
        this.critica += texto + "\n---------------------------------\n";
    }
}

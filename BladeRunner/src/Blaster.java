public class Blaster {
    public int disparos = 5;
    private int alcance = 10;
    private int tiempo = 1;

    public Blaster() {
        this.disparos = disparos;
        this.alcance = alcance;
        this.tiempo = tiempo;
    }

    public int getDisparos() {
        return disparos;
    }

    public void setDisparos(int disparos) {
        this.disparos = disparos;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
}

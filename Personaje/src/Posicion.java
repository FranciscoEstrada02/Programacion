public class Posicion {
    private int posX = 0 ;
    private int posY = 0;

    private Personaje personaje;

    public Posicion() {

    }

    public int getPosX() {
        return this.posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return this.posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public String mostrarPosicion(){
        return "[" + this.posX + ", " + this.posY + "]";
    }
}


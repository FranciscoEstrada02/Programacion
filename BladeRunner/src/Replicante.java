import java.util.Random;

public class Replicante {
    public static int numRepplicante;
    private String nombre;
    private int vitaldad;
    private int escudo;
    private int potencia;
    Estado estado;
    public Blaster blaster;

    public Replicante(String nombre) {
        this.nombre = nombre;
        this.vitaldad = vitaldad;
        this.escudo = escudo;
        this.potencia = potencia;
        this.estado = Estado.VIVO;
        numRepplicante++;
        this.blaster = new Blaster();


    }

    public static int getNumRepplicante() {
        return numRepplicante;
    }

    public static void setNumRepplicante(int numRepplicante) {
        Replicante.numRepplicante = numRepplicante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVitaldad() {
        return vitaldad;
    }

    public void setVitaldad(int vitaldad) {
        this.vitaldad = vitaldad;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public static int contadorReplicante(){
        return numRepplicante;
    }
    public void dispararABlade(BladeRunner blade){
        blaster.disparos -= 1;
        if(blaster.disparos < 0){
            System.out.println("Recarga el blaster para seguir disparando");
        }
        if(blaster.disparos == 0 ){
            blaster.disparos += 1;
        }

        Random numAleatorio = new Random();
        int numero = numAleatorio.nextInt(3+1);

        blade.escudo -= numero;


        if(blade.escudo <= 0){
            blade.estado = Estado.HERIDO;
        }
        if(blade.estado == Estado.HERIDO){
            blade.estado = Estado.MUERTO;
        }else {
            blade.estado = Estado.VIVO;
        }




    }

}

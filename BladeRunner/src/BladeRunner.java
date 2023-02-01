import java.util.Random;

public class BladeRunner {
    private String nombre;
    private int escudo = 10;
    Estado estado;
    private String mascosta;

    public Blaster blaster;

    public BladeRunner(String nombre) {
        this.nombre = nombre;
        this.blaster = new Blaster();
    }

    public void dispararAReplicante(Replicante replicante){
        blaster.disparos -= 1;
        if(blaster.disparos <= 0){
            System.out.println("Recarga el blaster para seguir disparando");
        }

        int numero = (int)(Math.random()*2+1);
        if(blaster.disparos < 5){
            blaster.disparos += 1;
        }

        if(numero == 1){
            replicante.estado = Estado.HERIDO;
        }else{
            replicante.estado = Estado.MUERTO;
            Replicante.numRepplicante -= 1;
        }


    }
    public void recargarBlaster(){
        if(blaster.disparos < 5){
            blaster.disparos += 1;
        }
    }
}

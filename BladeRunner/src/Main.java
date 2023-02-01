import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        BladeRunner blade = new BladeRunner("Fran");


        Replicante replicante1 = new Replicante("replicante1");
        Replicante replicante2 = new Replicante("replicante2");
        Replicante replicante3 = new Replicante("replicante3");


        //BLADERUNNER DISPARA AL PRIMER REPLICANTE

        while ((replicante1.estado == Estado.HERIDO || replicante1.estado == Estado.VIVO) && blade.blaster.disparos > 0) {
            System.out.println("Municion del blade Runnner: " + blade.blaster.disparos);
            blade.dispararAReplicante(replicante1);
            System.out.println("Estado del replicante 1: " + replicante1.estado);
            System.out.println("Municion del blade Runnner: " + blade.blaster.disparos);

        }

        System.out.println("NUMERO DE REPLICANTES VIVOS: " + Replicante.contadorReplicante() + "\n");

        //SEGUNDO REPLICANTE DISPARA AL BLADERUNNER

        replicante2.dispararABlade(blade);
        System.out.println("ESCUDO DEL BLADE: " + blade.escudo);
        replicante2.dispararABlade(blade);

        System.out.println("ESCUDO DEL BLADE: " + blade.escudo);
        System.out.println("ESTADO DEL BLADE: " + blade.estado + "\n");

        //LE DISPARO AL REPLICANTE HASTA MATARLO

        while ((replicante2.estado == Estado.HERIDO || replicante2.estado == Estado.VIVO) && blade.blaster.disparos > 0) {
            System.out.println("Municion del blade Runnner: " + blade.blaster.disparos);
            blade.dispararAReplicante(replicante2);
            System.out.println("Estado del replicante 2: " + replicante2.estado);
            System.out.println("Municion del blade Runnner: " + blade.blaster.disparos);

        }

        System.out.println("NUMERO DE REPLICANTES VIVOS: " + Replicante.contadorReplicante() + "\n");

        // EL TERCER REPLICANTE ME DISPARA HASTA QUE MUERO
        while ((blade.estado == Estado.HERIDO || blade.estado == Estado.VIVO) && replicante3.blaster.disparos > 0) {
            System.out.println("Municion del replicante3: " + replicante3.blaster.disparos);
            replicante3.dispararABlade(blade);
            System.out.println("Estado del blade: " + blade.estado);
            System.out.println("Municion del replicante3: " + replicante3.blaster.disparos);

        }

        System.out.println("NUMERO DE REPLICANTES VIVOS: " + Replicante.contadorReplicante() + "\n");
    }
}
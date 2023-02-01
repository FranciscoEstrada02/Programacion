public class Main {
    public static void main(String[] args) {
        BladeRunner blade = new BladeRunner("Fran");


        Replicante replicante1 = new Replicante("replicante1");
        Replicante replicante2 = new Replicante("replicante2");
        Replicante replicante3 = new Replicante("replicante3");



        //BLADERUNNER DISPARA

        while((replicante1.estado == Estado.HERIDO || replicante1.estado == Estado.VIVO) && blade.blaster.disparos > 0){
            System.out.println("Municion del blade Runnner: " + blade.blaster.disparos);
            blade.dispararAReplicante(replicante1);
            System.out.println("Municion del blade Runnner: " + blade.blaster.disparos);
            System.out.println("Estado del replicante 1: " + replicante1.estado);
        }

        System.out.println("NUMERO DE REPLICANTES VIVOS: " + Replicante.contadorReplicante() + "\n");

        while((replicante2.estado == Estado.HERIDO || replicante2.estado == Estado.VIVO) && blade.blaster.disparos > 0){
            System.out.println("Municion del blade Runnner: " + blade.blaster.disparos);
            blade.dispararAReplicante(replicante2);
            System.out.println("Municion del blade Runnner: " + blade.blaster.disparos);
            System.out.println("Estado del replicante 1: " + replicante2.estado);
        }

        System.out.println("NUMERO DE REPLICANTES VIVOS: " + Replicante.contadorReplicante()+ "\n");

        while((replicante3.estado == Estado.HERIDO || replicante3.estado == Estado.VIVO) && blade.blaster.disparos > 0){
            System.out.println("Municion del blade Runnner: " + blade.blaster.disparos);
            blade.dispararAReplicante(replicante3);
            System.out.println("Municion del blade Runnner: " + blade.blaster.disparos);
            System.out.println("Estado del replicante 1: " + replicante3.estado);
        }

        System.out.println("NUMERO DE REPLICANTES VIVOS: " + Replicante.contadorReplicante()+ "\n");
    }
}
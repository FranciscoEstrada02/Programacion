public class Main {
    public static void main(String[] args) {
        BladeRunner blade = new BladeRunner("Fran");


        Replicante replicante1 = new Replicante("replicante1");
        Replicante replicante2 = new Replicante("replicante2");
        Replicante replicante3 = new Replicante("replicante3");



        //BLADERUNNER DISPARA

        blade.dispararAReplicante(replicante1);
        System.out.println(blade.blaster.disparos);
        System.out.println(replicante1.estado);

        blade.dispararAReplicante(replicante1);
        System.out.println(blade.blaster.disparos);
        System.out.println(replicante1.estado);


        System.out.println(Replicante.contadorReplicante());
    }
}
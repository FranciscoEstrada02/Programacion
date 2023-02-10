public class Main {
    public static void main(String[] args) {

        Comercial comercial1 = new Comercial("Fran",33,200,203);
        Repartidor repartidor1 = new Repartidor("Pepe",22,200,"zona 1");
        Comercial comercial2 = new Comercial("Manolo",50,200,200);
        Repartidor repartidor2 = new Repartidor("Adri",22,200,"zona 3");

        comercial1.plus();
        System.out.println(comercial1.toString()+"\n");

        comercial2.plus();
        System.out.println(comercial2.toString()+"\n");

        repartidor1.plus();
        System.out.println(repartidor1.toString()+"\n");

        repartidor2.plus();
        System.out.println(repartidor2.toString()+"\n");





    }
}
public class Main {
    public static void main(String[] args) {

        Personaje personaje1 = new Personaje("Estralag");
        System.out.println(personaje1.getNombre());
        System.out.println(personaje1.posicion.mostrarPosicion());
        System.out.println(personaje1.getEstado());

        //MUEVO PERSONAJE

        personaje1.cambioPosicion(20,9);
        personaje1.cambioEstado();

        //PRESENTO EL ESTADO
        System.out.println("\n" + personaje1.getNombre());
        System.out.println(personaje1.posicion.mostrarPosicion());
        System.out.println(personaje1.getVitalidad());
        System.out.println(personaje1.getMagia());
        System.out.println(personaje1.getEstado());

        //RECUPERO LA MAGIA POR EL DOBLE DE LA VIDA

        personaje1.recuperarMagia(5);
        System.out.println("\n" + personaje1.getVitalidad());
        System.out.println(personaje1.getMagia() );
        personaje1.cambioEstado();

        //MUEVO EL PERSONAJE
        personaje1.cambioPosicion(30,10);
        personaje1.cambioEstado();
        //PRESENTO DATOS
        System.out.println("\n" + personaje1.getNombre());
        System.out.println(personaje1.posicion.mostrarPosicion());
        System.out.println(personaje1.getVitalidad());
        System.out.println(personaje1.getMagia());
        System.out.println(personaje1.getEstado());

        //RECUPERO MAGIA HASTA LLEGAR AL LIMITE

        personaje1.recuperarMagia(2.5);
        System.out.println("\n" + personaje1.getVitalidad());
        System.out.println(personaje1.getMagia() );
        personaje1.cambioEstado();
        System.out.println(personaje1.getEstado());

        //CURO MI PERSONAJE
        personaje1.curar();
        System.out.println("\n" + personaje1.getVitalidad());
        System.out.println(personaje1.getMagia() );
        personaje1.cambioEstado();
        System.out.println(personaje1.getEstado() + "\n ");

        //PERSONAJE
        System.out.println(personaje1.getNombre());
        personaje1.cambioPosicion(32,110);
        System.out.println(personaje1.posicion.mostrarPosicion());
        System.out.println(personaje1.getVitalidad());
        System.out.println(personaje1.getMagia());
        System.out.println(personaje1.getEstado());

    }
}
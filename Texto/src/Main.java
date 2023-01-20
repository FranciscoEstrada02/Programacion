public class Main {
    public static void main(String[] args) {
        Texto texto1 = new Texto("Francisco Estrada",Colores.ROJO,"5");
        Texto texto2 = new Texto("230563072Y",Colores.AZUL,"10");
        Texto texto3 = new Texto("Vamos a crear una nuevaclase   Texto   que   represente   la   letra   usada   en   una   aplicación   comoLibreOffice Writer u Office Word",
                Colores.AMARILLO,"5");

        System.out.println(texto1.getContenido());
        System.out.println(texto1.getColores());


        System.out.println(texto2.getContenido());
        System.out.println(texto2.getColores());


        System.out.println(texto3.getContenido());
        System.out.println(texto3.getColores());

        //CAMBIO COLORES

        texto1.setColores(Colores.ROJO);
        System.out.println("\nTEXTO 1 COLOR CAMBIADO A: " + texto1.getColores());

        texto2.setColores(Colores.AZUL);
        System.out.println("TEXTO 2 COLOR CAMBIADO A: " + texto2.getColores());


        System.out.println("\n" + texto3.getNegrita());
        System.out.println(texto3.getSubrayada());
        System.out.println(texto3.getTachada());
        System.out.println(texto3.getItalica());

        texto3.setTamaño("10");
        System.out.println(texto3.getTamaño());




    }
}
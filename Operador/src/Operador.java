public class Operador {
    private double x;
    private double y;

    public Operador(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double sumar() {
        return x + y;
    }

    public double restar() {
        return x - y;
    }

    public double multiplicar() {
        return x * y;
    }

    public String dividir() {
        double division;
        String cadena = "";
        if (y == 0) {
            return "No se puedee dividir por 0";
        } else {
            division = x / y;
            return cadena = String.format(String.valueOf(division));
        }
    }

    public String mostrarNumeros() {
        double mayor;
        double menor;
        if (x > y) {
            mayor = x;
            menor = y;
        } else {
            mayor = y;
            menor = x;
        }

        for (double i = menor; i <= mayor; i++) {
            System.out.println(i);
        }
        return null;


    }

    public String primeroDivisible() {
        if(x % y == 0){
            return "El primero si es divisible por el segundo";
        }else
            return "El segundo no es divisble por el primero";
    }

    public String segundoDivisible() {
        if(y % x == 0){
            return "El segundo es divisible por el primero";
        }else
            return "El segundo no es divisible por el primero";
    }

    public String sumaVariasVeces(){
       double suma = 0;

       for(int i = 0; i < y; i++){
           suma = (suma + x);
           System.out.println(suma);
        }
       return null;
    }

}

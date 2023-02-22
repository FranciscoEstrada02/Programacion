import java.util.Random;

public class Notas {

    public String calificaciones(double notas) {

            if (notas >= 0 && notas <= 4.99) {
                return  "SUSPENSO";
            } else if (notas >= 5 && notas <= 6.99) {
                return  "BIEN";
            } else if (notas >= 7 && notas <= 8.99) {
                return  "NOTABLE";
            } else
                return "SOBRESALIENTE";


    }
}

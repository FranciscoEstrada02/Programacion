public class Repartidor extends Empleado {
    private String zona;

    private double salarioFinal;
    private boolean cobraPlus;
    public Repartidor(String nombre, int edad, int salario, String zona) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public void plus(){
        if(edad > 30 && zona.equals("zona 3")){
            cobraPlus = true;
            salarioFinal = (salario + super.plus);
        }else{
            salarioFinal = salario;
            cobraPlus = false;

        }
    }

    @Override
    public String toString() {
        return "Nombre:" + nombre +
                "\nEdad: " + edad +
                "\nSalario: " + salario +
                "\nZona: " + zona +
                "\nCobra plus: " + cobraPlus +
                "\nSalario a percibir: " +  salarioFinal;
    }
}

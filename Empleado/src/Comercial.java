public class Comercial extends Empleado{

    private double comision;

    private double salarioFinal;
    private boolean cobraPlus;

    public Comercial(String nombre, int edad, int salario, double comision) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public void plus(){
        if(this.edad > 30 && comision > 200){
            cobraPlus = true;
            salarioFinal = (salario + comision + super.plus);
        }else{
            cobraPlus = false;
            salarioFinal = (salario + comision);
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nComision: " + comision +
                "\nCobra plus: " + cobraPlus +
                "\nSalario a percibir: " + salarioFinal;
    }
}

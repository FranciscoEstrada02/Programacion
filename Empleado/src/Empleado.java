public abstract class Empleado {
    public String nombre;
    public int edad;
    public int salario;

    public final int plus = 300;

    public Empleado(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;

    }
    @Override
    public String toString() {
        return "Nombre:" + nombre +
                "\nEdad: " + edad +
                "\nSalario: " + salario;
    }

}

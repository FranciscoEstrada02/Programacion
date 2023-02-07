public class Cuenta {
    private String cliente;
    private String numCuenta;
    private double interes;
    private double saldo;

    public Cuenta() {
        this.cliente = cliente;
        this.numCuenta = numCuenta;
        this.interes = interes;
        this.saldo = saldo;
    }

    public Cuenta(String cliente, String numCuenta, double interes, double saldo) {
        this.cliente = cliente;
        this.numCuenta = numCuenta;
        this.interes = interes;
        this.saldo = saldo;
    }
    public Cuenta(String cliente, String numCuenta, double interes, double saldo,Cuenta cuenta) {
        this.cliente = cliente;
        this.numCuenta = numCuenta;
        this.interes = interes;
        this.saldo = saldo;

    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

public class Cuenta {
    private String cliente;
    private String numCuenta;
    private double interes;
    public double saldo;

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
    public Cuenta(Cuenta cuentaCopia) {
        this.cliente = cuentaCopia.cliente;
        this.numCuenta = cuentaCopia.numCuenta;
        this.interes = cuentaCopia.interes;
        this.saldo = cuentaCopia.saldo;


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

    public boolean ingreso(double cantidad ){
        if(cantidad < 0){
            return false;
        }else{
            saldo += cantidad;
            return true;
        }

    }

    public boolean reintegro(int cantidad){
        if((cantidad > saldo) && (cantidad <= 0 )){
            saldo = saldo;
            return false;
        }else{
            saldo -= cantidad;
            return true;
        }
    }

    public boolean transferencia(Cuenta cuenta, double importe){
        if(importe > saldo){
            return false;
        }else{
            saldo -= importe;
            cuenta.saldo += importe;
            return true;
        }
    }

    @Override
    public String toString() {
        return "Titular: " + this.cliente +
                "\nNumero de Cuenta: " + this.numCuenta +
                "\nIntereses: " + this.interes +
                "\nSaldo: " + this.saldo;
    }
}

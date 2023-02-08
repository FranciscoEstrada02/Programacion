import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean opcion1 = true;
        Cuenta cuenta1 = null;
        Cuenta cuentaDestinoo = new Cuenta("Antonio", "23123", 2, 100);

        while (opcion1) {
            System.out.println("Que desea hacer:" +
                    "\n1. Crear Cuenta" +
                    "\n2. Mostrar saldo cuenta" +
                    "\n3. Hacer ingreso cuenta" +
                    "\n4. Hacer transferencia" +
                    "\n5. Mostrar datos de la cuenta" +
                    "\n6. Salir");

            int opcion = sc.nextInt();

            sc.nextLine();


            if (opcion == 1) {
                System.out.println("Ingrese su usuario");
                String usuario = sc.nextLine();
                System.out.println("Ingrese su numero de cuenta");
                String numCuenta = sc.nextLine();
                System.out.println("Ingrese su saldo");
                int saldo = sc.nextInt();
                cuenta1 = new Cuenta(usuario, numCuenta, 2, saldo);

            }
            if (cuenta1 != null) {
                if (opcion == 2) {
                    System.out.println("El saldo de la cuenta es: " + cuenta1.getSaldo());
                } else if (opcion == 3) {
                    System.out.println("Cuanto quiere ingresar");
                    double cantidadIngresar = sc.nextInt();
                    if (cuenta1.ingreso(cantidadIngresar)) {
                        System.out.println("Ingreso realizado con exito");
                    } else {
                        System.out.println("La cantidad a ingresar no puede ser negativa");
                    }
                } else if (opcion == 4) {
                    double cantidad = 0;
                    System.out.print("Introduce la cuenta destino: ");
                    String cuentaDestino = sc.nextLine();
                    System.out.print("Introduce la cantidad a transferir: ");
                    cantidad = sc.nextDouble();
                    if (cuenta1.transferencia(cuentaDestinoo, cantidad)) {
                        System.out.println("Tranferencia realizada con exito");
                    } else {
                        System.out.println("No se puedo realizar la tranferecia");
                    }
                } else if (opcion == 5) {
                    System.out.println(cuenta1.toString());
                } else if (opcion == 6) {
                    opcion1 = false;
                }
            }else{
                System.out.println("No hay ninguna cuenta creada");
            }
        }
    }
}
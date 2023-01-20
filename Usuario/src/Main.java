import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario para registrarse");
        String user = sc.nextLine();
        System.out.println("Ingrese su contraseña para registrarse");
        String constraseña = sc.nextLine();

        Usuario usuario = new Usuario(user, constraseña);

        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese si desea logearse o no");
            String login = sc.nextLine();
            if (login.equals("si")) {
                System.out.println("Ingrese su usuario");
                String usuario1 = sc.nextLine();
                System.out.println("Ingrese su contraseña");
                String contraseña1 = sc.nextLine();
                System.out.println(usuario.covertirContraseña());
                System.out.println(usuario.login(usuario1, contraseña1, usuario));
            } else if (login.equals("no")) {
                if (usuario.isEstadoUsuario() == false) {
                    System.out.println("Ya esta desconectado");
                } else {
                    System.out.println("DESCONECTADO");
                }
            }
        }
    }
}
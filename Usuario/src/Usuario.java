public class Usuario {
    private String user;
    private String password;

    public boolean estadoUsuario;
    private Usuario usuario;

    public Usuario(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(boolean estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    public String covertirContraseña() {
        String cadenaNueva = "";
        for (int i = 0; i < this.password.length(); i++) {
            cadenaNueva = cadenaNueva + "*";
        }
        return cadenaNueva;
    }

    public String login(String usuario1, String contraseña1, Usuario usuario) {

        if ((usuario1.equals(usuario.getUser())) && (contraseña1.equals(usuario.getPassword())) && this.estadoUsuario == true) {
            this.estadoUsuario = true;
            return "CONECTADO";
        } else {
            this.estadoUsuario = false;
            return "NO SE PUDO CONECTAR";
        }

    }


}

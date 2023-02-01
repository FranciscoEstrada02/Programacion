public class Personaje {
    private String nombre;
    private Estado estado = Estado.SANO;
    private int nivel = 1;
    private int vitalidad = 100;
    private int magia = 20;

    Posicion posicion = new Posicion();

    public Personaje(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }


    public int getVitalidad() {
        return vitalidad;
    }

    public void setVitalidad(int vitalidad) {
        this.vitalidad = vitalidad;
    }

    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    public String mostrarPosicion() {
        int xIncial = posicion.getPosX();
        int yInicial = posicion.getPosY();

        return "[" + xIncial + ", " + yInicial + "]";
    }

    public void cambioPosicion(int posXNueva, int posYNueva) {
        if (magia < 5) {
            System.out.println("Te falta magia para moverte");
        } else {
            posicion.setPosX(posXNueva);
            posicion.setPosY(posYNueva);
            magia -= 5;
        }


    }

    public void recuperarMagia(double cantidadARecuperar) {
        double costeDeRecuperarMagia;
        costeDeRecuperarMagia = cantidadARecuperar;
        costeDeRecuperarMagia = costeDeRecuperarMagia * 10;

        if (costeDeRecuperarMagia >= vitalidad) {
            System.out.println("Te falta vida para recuperar magia");
        }else {
            if (magia < 20) {
                vitalidad -= costeDeRecuperarMagia;
                magia += cantidadARecuperar;
            }
        }
    }

    public void cambioEstado() {
        if (vitalidad >= 10 && vitalidad <= 24) {
            setEstado(Estado.CRITICO);
        } else if (vitalidad >= 25 && vitalidad <= 49) {
            setEstado((Estado.MALHERIDO));
        } else if (vitalidad >= 50 && vitalidad <= 79) {
            setEstado(Estado.HERIDO);
        } else if (vitalidad >= 80 && vitalidad <= 100) {
            setEstado(Estado.SANO);
        }
    }

    public void curar() {
        if (getMagia() >= 15 && getMagia() <= 20) {
            vitalidad = 100;
            magia = magia - 15;
        } else {
            System.out.println("No se puede curar te falta magia");
        }
    }
}



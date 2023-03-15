package e3;

import java.util.ArrayList;
import java.util.LinkedList;

public abstract class Comun {

    public String nombre;
    public int coste;
    public int ataque;
    public int defensa;

    public int velocidad;

    public Comun(String nombre, int coste, int ataque, int defensa, int velocidad) {
        this.nombre = nombre;
        this.coste = coste;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCoste() {
        return coste;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public Bug atacar(Developer developer, Bug bug){
        if(developer.velocidad > bug.velocidad){
            return bug;
        }
        return bug;
    }

    @Override
    public String toString() {
        return "{" +
                "nombre='" + nombre + '\'' +
                ", coste=" + coste +
                ", ataque=" + ataque +
                ", defensa=" + defensa +
                ", velocidad=" + velocidad +
                '}';
    }
}

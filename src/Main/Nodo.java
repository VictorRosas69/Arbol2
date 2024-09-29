package Main;

import java.util.ArrayList;
import java.util.List;

public class Nodo {
    int valor;
    List<Nodo> hijos;

    public Nodo(int valor) {
        this.valor = valor;
        this.hijos = new ArrayList<>();
    }

    public void agregarHijo(Nodo hijo) {
        this.hijos.add(hijo);
    }

    public List<Nodo> getHijos() {
        return this.hijos;
    }

    public int getValor() {
        return this.valor;
    }
}

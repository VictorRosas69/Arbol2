package Main;

public class ArbolNAry {
    Nodo raiz;

    public ArbolNAry() {
        this.raiz = null;
    }

    public void asignarRaiz(int valor) {
        this.raiz = new Nodo(valor);
    }

    
    public void recorridoPreorden() {
        preorden(this.raiz);
        System.out.println(); 
    }

    private void preorden(Nodo nodo) {
        if (nodo == null) return;
        System.out.print(nodo.getValor() + " ");
        for (Nodo hijo : nodo.getHijos()) {
            preorden(hijo);
        }
    }

    
    public void imprimirArbol() {
        imprimirNodo(this.raiz, 0);
    }

    private void imprimirNodo(Nodo nodo, int nivel) {
        if (nodo == null) return;
        
        
        for (int i = 0; i < nivel; i++) {
            System.out.print("    "); 
        }
        System.out.println(nodo.getValor());
        
        
        for (Nodo hijo : nodo.getHijos()) {
            imprimirNodo(hijo, nivel + 1);
        }
    }
}

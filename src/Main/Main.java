package Main;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        ArbolNAry arbol = new ArbolNAry();  

        
        System.out.print("Ingresa el valor de la raíz: ");
        int valorRaiz = scanner.nextInt();
        arbol.asignarRaiz(valorRaiz);  

        
        System.out.print("Ingresa el valor del primer hijo de la raíz: ");
        int valorNodo2 = scanner.nextInt();
        Nodo nodo2 = new Nodo(valorNodo2);

        System.out.print("Ingresa el valor del segundo hijo de la raíz: ");
        int valorNodo3 = scanner.nextInt();
        Nodo nodo3 = new Nodo(valorNodo3);

        System.out.print("Ingresa el valor del tercer hijo de la raíz: ");
        int valorNodo4 = scanner.nextInt();
        Nodo nodo4 = new Nodo(valorNodo4);

        
        arbol.raiz.agregarHijo(nodo2);
        arbol.raiz.agregarHijo(nodo3);
        arbol.raiz.agregarHijo(nodo4);

        
        System.out.print("Ingresa el valor del primer hijo del nodo " + valorNodo2 + ": ");
        int valorNodo5 = scanner.nextInt();
        nodo2.agregarHijo(new Nodo(valorNodo5));

        System.out.print("Ingresa el valor del segundo hijo del nodo " + valorNodo2 + ": ");
        int valorNodo6 = scanner.nextInt();
        nodo2.agregarHijo(new Nodo(valorNodo6));

        
        System.out.print("Ingresa el valor del primer hijo del nodo " + valorNodo3 + ": ");
        int valorNodo7 = scanner.nextInt();
        nodo3.agregarHijo(new Nodo(valorNodo7));

        
        System.out.print("Ingresa el valor del primer hijo del nodo " + valorNodo4 + ": ");
        int valorNodo8 = scanner.nextInt();
        nodo4.agregarHijo(new Nodo(valorNodo8));

        System.out.print("Ingresa el valor del segundo hijo del nodo " + valorNodo4 + ": ");
        int valorNodo9 = scanner.nextInt();
        nodo4.agregarHijo(new Nodo(valorNodo9));

        System.out.print("Ingresa el valor del tercer hijo del nodo " + valorNodo4 + ": ");
        int valorNodo10 = scanner.nextInt();
        nodo4.agregarHijo(new Nodo(valorNodo10));

        
        System.out.println("Recorrido en preorden del Árbol N-ario:");
        arbol.recorridoPreorden();

        
        System.out.println("\nRepresentación visual del Árbol N-ario:");
        arbol.imprimirArbol();
        
        scanner.close();
    }
}

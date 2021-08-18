package colaLse;

import LseCola.Cola;

public class Main {
    public static void main(String[] args) {
        Cola cola = new Cola();

        /*cola.insertar(1);
        cola.insertar(2);
        cola.insertar(3);
        cola.insertar(4);
        cola.mostrar();

        cola.eliminar();
        cola.mostrar();*/
        Colas colas = new Colas();
        System.out.println(colas.estaVacia());

        for (int i = 1; i <= 5; i++) {
            colas.insertar(i);
        }
        colas.mostrar();
        colas.eliminar();
        colas.eliminar();
        colas.mostrar();
    }

}

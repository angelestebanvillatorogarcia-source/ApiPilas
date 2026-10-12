package ito.ed.interfaces.pila;

/** Nodo: una seccion de datos y una referencia al siguiente nodo. */
public class Nodo<E> {
    private E item;
    private Nodo<E> next;

    public Nodo(E item) {
        this.item = item;
        this.next = next;
    }

    // Coleccion de metodos
    public void setItem(E item) {
        this.item = item;
    }

    public E getItem() {
        return item;
    }

    public void setNext(Nodo<E> next) {
        this.next = next;
    }

    public Nodo<E> getNext() {
        return next;
    }
}

package ito.ed.interfaces.pila;

import ito.ed.excepciones.ExcepcionDeDesbordamientoDePila;
import ito.ed.excepciones.ExcepcionDePilaVacia;
import ito.ed.interfaces.Pila;

public class PilaDinamica<E> implements Pila<E> {
    private Nodo<E> sp;
    private int length;

    public PilaDinamica() {
        this.sp = null;
        this.length = 0;
    }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }

    @Override
    public void push(E item) throws ExcepcionDeDesbordamientoDePila {
        try {
            Nodo<E> nuevo = new Nodo<E>(item);
            nuevo.setNext(sp);
            sp = nuevo;
            length++;
        } catch (OutOfMemoryError e) {
            throw new ExcepcionDeDesbordamientoDePila("No hay memoria para mas elementos");
        }
    }

    @Override
    public E pop() throws ExcepcionDePilaVacia {
        if (isEmpty()) {
            throw new ExcepcionDePilaVacia();
        }
        E item = sp.getItem();
        sp = sp.getNext();
        length--;
        return item;
    }

    @Override
    public E peek() throws ExcepcionDePilaVacia {
        if (isEmpty()) {
            throw new ExcepcionDePilaVacia();
        }
        return sp.getItem();
    }

    @Override
    public int length() {
        return length;
    }

    @Override
    public int search(E item) throws ExcepcionDePilaVacia {
    	int i=0;
        if (isEmpty())
            throw new ExcepcionDePilaVacia();
        Nodo<E> aux = sp;
        while (aux != null) {
            if (aux.getItem().equals(item))
                break;
            aux = aux.getNext();
        }
        return aux == null ? -1 : i;
    }
}
package ito.ed.interfaces.pila;

import ito.ed.excepciones.ExcepcionDeDesbordamientoDePila;
import ito.ed.excepciones.ExcepcionDePilaVacia;
import ito.ed.interfaces.Pila;

public class PilaEstatica<E> implements Pila<E> {
    private E[] pila;
    private int sp;
    public PilaEstatica(int n) {
        pila = (E[]) new Object[n];
        sp = n;
    }
    @Override
    public boolean isEmpty() {
        return sp == pila.length;
    }

    @Override
    public void push(E item) throws ExcepcionDeDesbordamientoDePila {
        if (sp == 0)
            throw new ExcepcionDeDesbordamientoDePila();
        pila[--sp] = item;
    }
    @Override
    public E pop() throws ExcepcionDePilaVacia {
        if (isEmpty())
            throw new ExcepcionDePilaVacia();
        sp++;
        return pila[sp - 1];
    }

    @Override
    public E peek() throws ExcepcionDePilaVacia {
        if (isEmpty())
            throw new ExcepcionDePilaVacia();
        return pila[sp];
    }

    @Override
    public int length() {
        return pila.length - sp;
    }

    @Override
    public int search(E item) throws ExcepcionDePilaVacia {
        if (isEmpty())
            throw new ExcepcionDePilaVacia();
        int i;
        for (i = sp; i < pila.length; i++) 
            if (pila[i].equals(item)) 
                break;
        if (i == pila.length) {
            return -1;
        }
        return i - sp + 1;
    }
}
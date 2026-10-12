package ito.ed.interfaces;

import ito.ed.excepciones.ExcepcionDeDesbordamientoDePila;
import ito.ed.excepciones.ExcepcionDePilaVacia;

/**
 * Interfaz que cumple cualquier implementacion de pila.
 * @param <E> tipo de los elementos
 */
public interface Pila<E> {
    void push(E item) throws ExcepcionDeDesbordamientoDePila;
    E pop() throws ExcepcionDePilaVacia;
    boolean isEmpty();
    E peek() throws ExcepcionDePilaVacia;
    /** Devuelve la posicion contada desde el tope (el tope es 1) o -1 si no existe. */
    int search(E item) throws ExcepcionDePilaVacia;
    int length();
}

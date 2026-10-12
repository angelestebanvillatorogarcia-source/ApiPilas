package ito.ed.excepciones;

/** Se lanza al sacar, ver o buscar en una pila que no tiene elementos. */
public class ExcepcionDePilaVacia extends Exception {
    private static final long serialVersionUID = 1L;

    public ExcepcionDePilaVacia() {
        super("La pila esta vacia");
    }
}

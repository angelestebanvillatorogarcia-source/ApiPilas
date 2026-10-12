package ito.ed.excepciones;

/** Se lanza al insertar en una pila que ya no tiene espacio. */
public class ExcepcionDeDesbordamientoDePila extends Exception {
    private static final long serialVersionUID = 1L;

    public ExcepcionDeDesbordamientoDePila() {
        super("La pila se ha desbordado");
    }

    public ExcepcionDeDesbordamientoDePila(String mensaje) {
        super(mensaje);
    }
}

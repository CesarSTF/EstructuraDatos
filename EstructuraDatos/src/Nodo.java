public class Nodo {

    // Atributos
    private int valor; // Cambiado a int para evitar errores de tipo cíclico
    private Nodo izquierdo;
    private Nodo derecho;

    // Constructor
    public Nodo(int valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }

    // Métodos

    public void insertar(int nuevoValor) {
        if (nuevoValor < this.valor) {
            if (this.izquierdo == null) {
                this.izquierdo = new Nodo(nuevoValor);
            } else {
                this.izquierdo.insertar(nuevoValor);
            }
        } else if (nuevoValor > this.valor) {
            if (this.derecho == null) {
                this.derecho = new Nodo(nuevoValor);
            } else {
                this.derecho.insertar(nuevoValor);
            }
        }
    }

    public void eliminar(int valor) {
        // Implementación de eliminación
        // Este método puede ser complejo dependiendo de cómo quieras manejar la eliminación
    }

    public Nodo buscar(int valor) {
        if (valor == this.valor) {
            return this;
        } else if (valor < this.valor) {
            return (izquierdo != null) ? izquierdo.buscar(valor) : null;
        } else {
            return (derecho != null) ? derecho.buscar(valor) : null;
        }
    }

    // Getters and setters

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }
}

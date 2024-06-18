public class Simple extends Arbol {
    // Constructor
    public Simple(String nombre, int nodoNumero) {
        super(nombre, nodoNumero);
    }

    @Override
    public void agregarNodo(int valor) {
        if (getRaiz() == null) {
            setRaiz(new Nodo(valor));
        } else {
            getRaiz().insertar(valor);
        }
    }


    @Override
    public int altura() {
        return calcularAltura(getRaiz());
    }

    private int calcularAltura(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }
        int alturaIzquierda = calcularAltura(nodo.getIzquierdo());
        int alturaDerecha = calcularAltura(nodo.getDerecho());
        return Math.max(alturaIzquierda, alturaDerecha) + 1;
    }


    @Override
    public void eliminarNodo() {
    }

    @Override
    public Nodo buscarNodo(int valor) {
        return (getRaiz() != null) ? getRaiz().buscar(valor) : null;
    }

    @Override
    public void recorrerInorden() {
        recorrerInorden(getRaiz());
    }

    private void recorrerInorden(Nodo nodo) {
        if (nodo != null) {
            recorrerInorden(nodo.getIzquierdo());
            System.out.print(nodo.getValor() + " ");
            recorrerInorden(nodo.getDerecho());
        }
    }

    @Override
    public void recorrerPreorden() {
        recorrerPreorden(getRaiz());
    }

    private void recorrerPreorden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.getValor() + " ");
            recorrerPreorden(nodo.getIzquierdo());
            recorrerPreorden(nodo.getDerecho());
        }
    }

    @Override
    public void recorrerPostorden() {
        recorrerPostorden(getRaiz());
    }

    private void recorrerPostorden(Nodo nodo) {
        if (nodo != null) {
            recorrerPostorden(nodo.getIzquierdo());
            recorrerPostorden(nodo.getDerecho());
            System.out.print(nodo.getValor() + " ");
        }
    }
}

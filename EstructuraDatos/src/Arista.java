import java.util.List;

public class Arista extends GrafoSimpleNoDirigido{
    private Nodo nodo1;
    private Nodo nodo2;

    public Arista(Nodo nodo1, Nodo nodo2) {
        super("Arista", 0);
        this.nodo1 = nodo1;
        this.nodo2 = nodo2;
    }

    public Nodo getNodo1() {
        return nodo1;
    }

    public Nodo getNodo2() {
        return nodo2;
    }

    public Arista(String nombre, int nodoNumero, List<Arista> aristas, List<Nodo> nodos) {
        super(nombre, nodoNumero, aristas, nodos);
    }

    @Override
    public Nodo agregarNodo(int valor) {
        return super.agregarNodo(valor);
    }

    @Override
    public void agregarArista(Nodo nodo1, Nodo nodo2) {
        super.agregarArista(nodo1, nodo2);
    }

    @Override
    public void eliminarNodo(Nodo nodo) {
        super.eliminarNodo(nodo);
    }

    @Override
    public void eliminarArista(Arista arista) {
        super.eliminarArista(arista);
    }

    @Override
    public Nodo buscar(int valor) {
        return super.buscar(valor);
    }

    public Arista(String nombre, int nodoNumero) {
        super(nombre, nodoNumero);
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public int getNodoNumero() {
        return super.getNodoNumero();
    }

    @Override
    public void setNodoNumero(int nodoNumero) {
        super.setNodoNumero(nodoNumero);
    }
}

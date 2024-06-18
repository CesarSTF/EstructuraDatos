import java.util.ArrayList;
import java.util.List;

public class GrafoSimpleNoDirigido extends EstructuraDato{
    protected List<Nodo> nodos;
    private List<Arista> aristas;

    public GrafoSimpleNoDirigido(String nombre, int nodoNumero, List<Arista> aristas, List<Nodo> nodos) {
        super(nombre, nodoNumero);
        this.nodos = new ArrayList<>();
        this.aristas = new ArrayList<>();
    }

    //Metodos
    public Nodo agregarNodo(int valor){
        Nodo nuevoNodo = new Nodo(valor);
        nodos.add(nuevoNodo);
        return nuevoNodo;
    };

    public void agregarArista(Nodo nodo1, Nodo nodo2){
        Arista nuevaArista = new Arista(nodo1, nodo2);
        aristas.add(nuevaArista);
    };

    public void eliminarNodo(Nodo nodo){
        nodos.remove(nodo);
    };

    public void eliminarArista(Arista arista){
        aristas.remove(arista);
    };

    public Nodo buscar(int valor){
        for (Nodo nodo : nodos) {
            if(nodo.getValor() == valor){
                return nodo;
            }
        }
        return null;
    };


    public GrafoSimpleNoDirigido(String nombre, int nodoNumero) {
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

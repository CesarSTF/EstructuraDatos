public abstract class Arbol extends EstructuraDato{
    //Atributos
    private Nodo raiz;

    //getters and setters
    public Arbol(String nombre, int nodoNumero){
        super(nombre, nodoNumero);
        this.raiz = null;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    //Metodos abstractos
    public abstract void agregarNodo(int i);
    public abstract int altura();
    public abstract void eliminarNodo();
    public abstract Nodo buscarNodo(int i);
    public abstract void recorrerInorden();
    public abstract void recorrerPreorden();
    public abstract void recorrerPostorden();
}

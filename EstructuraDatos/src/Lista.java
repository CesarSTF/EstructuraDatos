public abstract class Lista extends EstructuraDato{

    //Metodos abstractos
    public abstract void avanzarNodo();
    public abstract void retrocederNodo();
    public abstract void insertarNodo(int valor);
    public abstract void eliminarNodo(int valor);
    public abstract Nodo buscar(int valor);

    //Constructor
    public Lista(String nombre, int nodoNumero){
        super(nombre, nodoNumero);
    }
}

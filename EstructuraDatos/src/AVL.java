public class AVL extends Arbol{
    private int alturaMaxima = 1;

    //Constructor
    public AVL(String nombre, int nodoNumero){
        super(nombre, nodoNumero);
    }

    //Metodos abstractos
    @Override
    public void agregarNodo(int i) {

    }

    @Override
    public int altura() {
        return 0;
    }

    @Override
    public void eliminarNodo() {

    }

    @Override
    public Nodo buscarNodo(int i) {

        return null;
    }

    @Override
    public void recorrerInorden() {

    }

    @Override
    public void recorrerPreorden() {

    }

    @Override
    public void recorrerPostorden() {

    }

}

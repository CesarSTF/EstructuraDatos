public class RojoNegro extends Arbol{

    //Enumeracion
    public enum Color{
        ROJO, NEGRO
    }

    //Constructor
    public RojoNegro(String nombre, int nodoNumero){
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

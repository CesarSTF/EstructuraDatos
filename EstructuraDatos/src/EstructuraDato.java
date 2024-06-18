public abstract class EstructuraDato {
    //Atributos
    protected String nombre;
    protected int nodoNumero;
    //Constructor
public EstructuraDato(String nombre, int nodoNumero){
        this.nombre = nombre;
        this.nodoNumero = nodoNumero;
    }
    //getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNodoNumero() {
        return nodoNumero;
    }

    public void setNodoNumero(int nodoNumero) {
        this.nodoNumero = nodoNumero;
    }

}

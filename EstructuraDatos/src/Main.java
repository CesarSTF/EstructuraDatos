public class Main {
    public static void main(String[] args) {
        //Arbol binario simple
        Simple arbol = new Simple("Árbol Binario Simple", 0);

        //nodos del árbol
        arbol.agregarNodo(10);
        arbol.agregarNodo(5);
        arbol.agregarNodo(15);
        arbol.agregarNodo(3);
        arbol.agregarNodo(7);
        arbol.agregarNodo(12);
        arbol.agregarNodo(18);

        //recorridos del arbol
        System.out.println("Recorrido Inorden:");
        arbol.recorrerInorden();
        System.out.println();

        System.out.println("Recorrido Preorden:");
        arbol.recorrerPreorden();
        System.out.println();

        System.out.println("Recorrido Postorden:");
        arbol.recorrerPostorden();
        System.out.println();

        //Buscar un nodo del arbol
        int valorBuscado = 7;
        Nodo nodoEncontrado = arbol.buscarNodo(valorBuscado);
        if (nodoEncontrado != null) {
            System.out.println("Nodo con valor " + valorBuscado + " encontrado.");
        } else {
            System.out.println("Nodo con valor " + valorBuscado + " no encontrado.");
        }

        //altura del árbol
        int altura = arbol.altura();
        System.out.println("Altura del árbol: " + altura);
    }
}

package Excepciones;

public class Excepciones {

    private static final long serialVersionUID = 1L;

    public Excepciones() {
    }

    public static void FueraDeRango() {
        System.out.println("Fuera de Rango. Verifique la posición.");
    }

    public static void ListaVacia() {
        System.out.println("Error. La lista está vacía.");
    }

    public static void NombreNulo() {
        System.out.println("Cadena vacía. Verifica el nombre.");
    }

}

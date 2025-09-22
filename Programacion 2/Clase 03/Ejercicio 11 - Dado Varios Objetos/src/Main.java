/**
 * Ejercicio 11 - Clase Dado con varios objetos
 * Plantear una clase Dado que tenga como atributo el valor del mismo. 
 * En el constructor inicializar el valor con 1. Plantear otros dos métodos, 
 * el primero que almacene un valor aleatorio comprendido entre 1 y 6, y el segundo método que muestre el valor del dado.
 * En el método main() definir 3 objetos de la clase Dado, generar el valor de cada uno e imprimir dicho valor.
 */
public class Dado {
    private int valor;

    /**
     * Constructor que inicializa el valor del dado en 1
     */
    public Dado() {
        valor = 1;
    }

    /**
     * Método para generar un valor aleatorio entre 1 y 6
     */
    public void tirar() {
        valor = 1 + (int) (Math.random() * 6);
    }

    /**
     * Método para imprimir el valor del dado
     */
    public void imprimir() {
        System.out.println("Valor del dado:" + valor);
    }

    /**
     * Método principal
     */
    public static void main(String[] ar) {
        Dado dado1, dado2, dado3;
        dado1 = new Dado();
        dado2 = new Dado();
        dado3 = new Dado();
        dado1.tirar();
        dado2.tirar();
        dado3.tirar();
        dado1.imprimir();
        dado2.imprimir();
        dado3.imprimir();
    }
}

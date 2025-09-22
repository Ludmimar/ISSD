/**
 * Ejercicio 13 - Clase Dado con sobrecarga de constructores
 * Plantear una clase Dado que tenga como atributo el valor del mismo. Definir dos constructores.
 * - El primer CONSTRUCTOR que no tenga parámetros (inicializar el valor del dado con 1) 
 * - El segundo CONSTRUCTOR que tenga un parámetro con el valor inicial del dado.
 * Crear dos objetos de la clase Dado y llamar para cada objeto a un constructor distinto.
 */
public class Dado {
    private int valor;

    /**
     * Constructor sin parámetros - inicializa el valor en 1
     */
    public Dado() {
        valor = 1;
    }

    /**
     * Constructor con parámetro - inicializa con el valor recibido
     * @param valor valor inicial del dado
     */
    public Dado(int valor) {
        this.valor = valor;
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
        Dado dado1 = new Dado(); // constructor sin parámetro
        dado1.imprimir();
        Dado dado2 = new Dado(4); // constructor con parámetro
        dado2.imprimir();
    }
}

import java.util.Scanner;

/**
 * Ejercicio 6 - Clase Operaciones (Problema Propuesto 2)
 * Implementar la clase Operaciones. Se deben cargar dos valores enteros, 
 * calcular su suma, resta, multiplicación y división, cada una en un método, imprimir dichos resultados.
 */
public class Operaciones {
    private int valor1, valor2;
    private Scanner teclado;

    /**
     * Método para inicializar los dos valores
     */
    public void inicializar() {
        teclado = new Scanner(System.in);
        System.out.print("Ingrese primer valor :");
        valor1 = teclado.nextInt();
        System.out.print("Ingrese segundo valor :");
        valor2 = teclado.nextInt();
    }

    /**
     * Método para calcular y mostrar la suma
     */
    public void sumar() {
        int suma = valor1 + valor2;
        System.out.println("La suma de los dos valores es:" + suma);
    }

    /**
     * Método para calcular y mostrar la resta
     */
    public void restar() {
        int resta = valor1 - valor2;
        System.out.println("La resta del primer valor respecto al segundo es:" + resta);
    }

    /**
     * Método para calcular y mostrar la multiplicación
     */
    public void multiplicar() {
        int multi = valor1 * valor2;
        System.out.println("La multiplicacion:" + multi);
    }

    /**
     * Método para calcular y mostrar la división
     */
    public void division() {
        int divi = valor1 / valor2;
        System.out.println("La division de los dos valores es:" + divi);
    }

    /**
     * Método principal
     */
    public static void main(String[] ar) {
        Operaciones operaciones = new Operaciones();
        operaciones.inicializar();
        operaciones.sumar();
        operaciones.restar();
        operaciones.multiplicar();
        operaciones.division();
    }
}

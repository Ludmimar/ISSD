import java.util.Scanner;

/**
 * Ejercicio 1 - Clase Persona
 * Confeccionar una clase que permita:
 * - Cargar el nombre y la edad de una persona
 * - Mostrar los datos cargados
 * - Imprimir un mensaje si es mayor de edad (edad>=18)
 */
public class Persona {
    private Scanner teclado;
    private String nombre;
    private int edad;

    /**
     * Método para inicializar los datos de la persona
     */
    public void inicializar() {
        teclado = new Scanner(System.in);
        System.out.print("Ingrese nombre:");
        nombre = teclado.next();
        System.out.print("Ingrese edad:");
        edad = teclado.nextInt();
    }

    /**
     * Método para imprimir los datos de la persona
     */
    public void imprimir() {
        System.out.println("Nombre:" + nombre);
        System.out.println("Edad:" + edad);
    }

    /**
     * Método para verificar si es mayor de edad
     */
    public void esMayorEdad() {
        if (edad >= 18) {
            System.out.print(nombre + " es mayor de edad.");
        } else {
            System.out.print(nombre + " no es mayor de edad.");
        }
    }

    /**
     * Método principal
     */
    public static void main(String[] ar) {
        Persona persona1;
        persona1 = new Persona();
        persona1.inicializar();
        persona1.imprimir();
        persona1.esMayorEdad();
    }
}

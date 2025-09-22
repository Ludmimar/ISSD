import java.util.Scanner;

/**
 * Ejercicio 5 - Clase Empleado (Problema Propuesto 1)
 * Confeccionar una clase que represente un empleado. Definir como atributos su nombre y sueldo. 
 * Confeccionar los métodos para la carga, otro para imprimir sus datos y 
 * por último uno que imprima un mensaje si debe pagar impuestos (si el sueldo supera a 3000)
 */
public class Empleado {
    private String nombre;
    private float sueldo;
    private Scanner teclado;

    /**
     * Método para inicializar los datos del empleado
     */
    public void inicializar() {
        teclado = new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado :");
        nombre = teclado.next();
        System.out.print("Ingrese el sueldo :");
        sueldo = teclado.nextFloat();
    }

    /**
     * Método para imprimir los datos del empleado
     */
    public void imprimir() {
        System.out.println("Nombre:" + nombre);
        System.out.println("Sueldo:" + sueldo);
    }

    /**
     * Método para verificar si debe pagar impuestos
     */
    public void pagaImpuestos() {
        if (sueldo > 3000) {
            System.out.println("Debe pagar impuestos");
        } else {
            System.out.println("No debe pagar impuestos");
        }
    }

    /**
     * Método principal
     */
    public static void main(String[] ar) {
        Empleado empleado1 = new Empleado();
        empleado1.inicializar();
        empleado1.imprimir();
        empleado1.pagaImpuestos();
    }
}

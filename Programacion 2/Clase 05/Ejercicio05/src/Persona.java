/*
 * EJERCICIO 05 - HERENCIA - CLASE PADRE PERSONA
 * 
 * ENUNCIADO:
 * Confeccionar una clase Persona que tenga como atributos el nombre y la edad. 
 * Definir como responsabilidades un método que cargue los datos personales y otro que los imprima.
 * Plantear una segunda clase Empleado que herede de la clase Persona. 
 * Añadir un atributo sueldo y los métodos de cargar el sueldo e imprimir su sueldo.
 * Definir un objeto de la clase Persona y llamar a sus métodos. 
 * También crear un objeto de la clase Empleado y llamar a sus métodos.
 * 
 * CONCEPTO CLAVE: HERENCIA
 * - La clase Persona es la clase padre (superclase)
 * - La clase Empleado hereda de Persona
 * - Un Empleado "es una" Persona (relación de herencia)
 * - Los atributos y métodos comunes se definen en Persona
 * 
 * ATRIBUTOS PROTEGIDOS (accesibles por las subclases):
 * - nombre: String (nombre de la persona)
 * - edad: int (edad de la persona)
 * - teclado: Scanner para entrada de datos
 * 
 * MÉTODOS:
 * - constructor: inicializa el Scanner
 * - cargar: solicita y carga nombre y edad
 * - imprimir: muestra los datos de la persona
 */

import java.util.Scanner;

public class Persona {
    // Atributos protegidos para que las subclases puedan acceder
    protected String nombre;
    protected int edad;
    protected Scanner teclado;
    
    /**
     * CONSTRUCTOR - Inicializa el Scanner para entrada de datos
     * 
     * FUNCIONALIDAD:
     * - Crea el objeto Scanner para leer datos del teclado
     * - Los atributos nombre y edad se inicializan automáticamente en null y 0
     */
    public Persona() {
        teclado = new Scanner(System.in);
    }
    
    /**
     * MÉTODO CARGAR - Solicita y carga los datos personales
     * 
     * FUNCIONALIDAD:
     * - Solicita al usuario que ingrese el nombre
     * - Solicita al usuario que ingrese la edad
     * - Almacena los datos en los atributos correspondientes
     */
    public void cargar() {
        System.out.print("Ingrese nombre: ");
        nombre = teclado.nextLine();
        System.out.print("Ingrese edad: ");
        edad = teclado.nextInt();
    }
    
    /**
     * MÉTODO IMPRIMIR - Muestra los datos de la persona
     * 
     * FUNCIONALIDAD:
     * - Imprime el nombre y la edad de la persona
     * - Este método puede ser sobrescrito por las subclases
     */
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}


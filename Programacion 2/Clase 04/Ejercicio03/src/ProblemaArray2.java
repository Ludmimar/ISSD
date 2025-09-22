/*
 * EJERCICIO 03 - ARRAYS DE TAMAÑO DINÁMICO
 * 
 * ENUNCIADO:
 * Crear un Array con la cantidad de elementos que ingresa el operador por teclado. 
 * Luego cargar valores aleatorios comprendidos entre 1 y 10. Imprimir el Array.
 * 
 * OBJETIVO:
 * - Demostrar arrays de tamaño variable (dinámico)
 * - Mostrar cómo el usuario puede determinar el tamaño del array
 * - Comparar con arrays de tamaño fijo del ejercicio anterior
 * - Introducir entrada de datos para determinar tamaño
 * 
 * CONCEPTOS CLAVE:
 * - Arrays de tamaño variable: array = new int[cantidad]
 * - Entrada de datos para determinar tamaño
 * - Ventajas de arrays dinámicos vs arrays fijos
 * - Separación entre creación y carga de datos
 */

import java.util.Scanner;

public class ProblemaArray2 {
    // Scanner para entrada de datos por teclado
    private Scanner teclado;
    
    // Declaración del array unidimensional
    // El tamaño se determinará dinámicamente en el constructor
    private int[] array;

    /**
     * CONSTRUCTOR - Crea array de tamaño dinámico
     * 
     * FUNCIONALIDAD:
     * 1. Solicita al usuario la cantidad de elementos
     * 2. Crea el array con el tamaño especificado
     * 3. NO carga valores (eso se hace en otro método)
     * 
     * VENTAJA DEL TAMAÑO DINÁMICO:
     * - Cada ejecución puede tener un array de diferente tamaño
     * - El usuario decide cuántos elementos necesita
     * - Más flexible que arrays de tamaño fijo
     */
    public ProblemaArray2() {
        teclado = new Scanner(System.in);
        
        // Solicitar al usuario la cantidad de elementos
        System.out.print("Cuantos elementos tendra el arreglo:");
        int cant = teclado.nextInt();
        
        // Crear array con el tamaño especificado por el usuario
        // IMPORTANTE: El tamaño puede ser diferente en cada ejecución
        array = new int[cant];
    }

    /**
     * MÉTODO CARGAR - Llena el array con valores aleatorios
     * 
     * FUNCIONALIDAD:
     * - Genera valores aleatorios entre 1 y 10
     * - Usa array.length para adaptarse al tamaño real del array
     * - Demuestra que el método funciona independientemente del tamaño
     * 
     * SEPARACIÓN DE RESPONSABILIDADES:
     * - Constructor: crea el array
     * - Método cargar: llena el array con datos
     * - Método imprimir: muestra el contenido
     */
    public void cargar() {
        // Bucle que se adapta automáticamente al tamaño del array
        // array.length contiene el tamaño real (ingresado por el usuario)
        for (int f = 0; f < array.length; f++) {
            // Genera valor aleatorio entre 1 y 10
            // Misma fórmula del ejercicio anterior
            array[f] = 1 + (int) (Math.random() * 10);
        }
    }

    /**
     * MÉTODO IMPRIMIR - Muestra todos los elementos del array
     * 
     * FUNCIONALIDAD:
     * - Recorre el array usando array.length
     * - Imprime cada elemento separado por guión
     * - Se adapta automáticamente al tamaño del array
     * 
     * FLEXIBILIDAD:
     * - Funciona con arrays de cualquier tamaño
     * - No necesita modificación si cambia el tamaño
     */
    public void imprimir() {
        // Bucle que usa array.length para recorrer todos los elementos
        // Se adapta automáticamente al tamaño real del array
        for (int f = 0; f < array.length; f++) {
            // Imprime elemento seguido de guión
            System.out.print(array[f] + "-");
        }
        // Nota: No hay System.out.println() al final como en el ejercicio anterior
        // Esto es intencional para mostrar la diferencia
    }

    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FLUJO DE EJECUCIÓN:
     * 1. Crear objeto (solicita tamaño y crea array)
     * 2. Cargar valores aleatorios
     * 3. Imprimir array completo
     * 
     * COMPARACIÓN CON EJERCICIO ANTERIOR:
     * - Ejercicio 02: tamaño fijo (100 elementos)
     * - Ejercicio 03: tamaño variable (determinado por usuario)
     */
    public static void main(String[] args) {
        // Crear objeto: ejecuta constructor y solicita tamaño
        ProblemaArray2 pa2 = new ProblemaArray2();
        
        // Cargar valores aleatorios en el array
        pa2.cargar();
        
        // Mostrar todos los elementos del array
        pa2.imprimir();
    }
}

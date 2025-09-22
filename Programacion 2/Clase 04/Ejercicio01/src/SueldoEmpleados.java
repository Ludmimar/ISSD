/*
 * EJERCICIO 01 - ARRAYS UNIDIMENSIONALES
 * 
 * ENUNCIADO:
 * Se desea guardar los sueldos de 5 operarios.
 * Según lo conocido deberíamos definir 5 variables de tipo float, si queremos tener en un cierto momento 
 * los 5 sueldos almacenados en memoria.
 * Empleando un Array solo se requiere definir un único nombre y accedemos a cada elemento por medio del subíndice.
 * 
 * OBJETIVO:
 * - Introducir el concepto de arrays unidimensionales
 * - Mostrar declaración, creación y acceso a elementos
 * - Comparar con el uso de variables individuales
 * 
 * CONCEPTOS CLAVE:
 * - Declaración: int[] sueldos;
 * - Creación: sueldos = new int[5];
 * - Acceso: sueldos[0], sueldos[1], etc.
 * - Los arrays son objetos en Java
 */

import java.util.Scanner;

public class SueldoEmpleados {
    // Scanner para entrada de datos por teclado
    private Scanner teclado;
    
    // Declaración del array unidimensional para almacenar sueldos
    // Sintaxis: tipo[] nombreArray;
    private int[] sueldos;

    /**
     * CONSTRUCTOR - Inicializa el array y carga los datos
     * 
     * FUNCIONALIDAD:
     * 1. Crea el objeto Scanner para entrada de datos
     * 2. Crea el array de 5 elementos (sueldos = new int[5])
     * 3. Recorre el array cargando valores ingresados por el usuario
     * 
     * IMPORTANTE: Los arrays en Java son objetos, por eso usamos 'new'
     */
    public SueldoEmpleados() {
        teclado = new Scanner(System.in);
        
        // Creación del array: reserva memoria para 5 enteros
        // Los elementos se inicializan automáticamente en 0
        sueldos = new int[5];
        
        // Bucle for para cargar cada elemento del array
        // f representa el índice (posición) en el array
        for (int f = 0; f < 5; f++) {
            System.out.print("Ingrese valor de la componente:");
            // Acceso al elemento f-ésimo del array: sueldos[f]
            sueldos[f] = teclado.nextInt();
        }
    }

    /**
     * MÉTODO IMPRIMIR - Muestra todos los elementos del array
     * 
     * FUNCIONALIDAD:
     * - Recorre el array desde el índice 0 hasta el 4
     * - Imprime cada elemento en una línea separada
     * 
     * ESTRUCTURA DE CONTROL:
     * - for: ideal para recorrer arrays cuando conocemos el tamaño
     */
    public void imprimir() {
        // Bucle para recorrer todos los elementos del array
        for (int f = 0; f < 5; f++) {
            // Imprime el elemento en la posición f
            System.out.println(sueldos[f]);
        }
    }

    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FLUJO DE EJECUCIÓN:
     * 1. Crea objeto SueldoEmpleados (ejecuta constructor)
     * 2. Llama al método imprimir() para mostrar los datos
     */
    public static void main(String[] args) {
        // Creación del objeto: ejecuta constructor y carga datos
        SueldoEmpleados se = new SueldoEmpleados();
        
        // Llamada al método para mostrar los sueldos cargados
        se.imprimir();
    }
}

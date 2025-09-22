/*
 * PROBLEMA 04 - VALORES ALEATORIOS CON ANÁLISIS DE MÁXIMO Y MÍNIMO
 * 
 * ENUNCIADO:
 * Crear un Array de n elementos de tipo entero. Cargar valores aleatorios 
 * comprendidos entre 1 y 100. Implementar dos métodos, uno que imprima el 
 * mayor valor y otro el menor valor del vector.
 * 
 * OBJETIVO:
 * - Trabajar con arrays de tamaño dinámico
 * - Generar valores aleatorios en rango específico (1-100)
 * - Implementar búsqueda de máximo y mínimo
 * - Separar funcionalidades en métodos independientes
 * 
 * CONCEPTOS CLAVE:
 * - Arrays de tamaño variable (n elementos)
 * - Valores aleatorios con rango específico
 * - Algoritmos de búsqueda de máximo y mínimo
 * - Separación de responsabilidades en métodos
 */

import java.util.Scanner;

public class ArrayValoresAleatorios {
    // Scanner para entrada de datos por teclado
    private Scanner teclado;
    
    // Array de tamaño dinámico (determinado por el usuario)
    private int[] array;

    /**
     * CONSTRUCTOR - Crea array de tamaño dinámico
     * 
     * FUNCIONALIDAD:
     * - Solicita al usuario la cantidad de elementos
     * - Crea el array con el tamaño especificado
     * - NO carga valores (eso se hace en método separado)
     * 
     * VENTAJA DEL TAMAÑO DINÁMICO:
     * - Cada ejecución puede tener diferente tamaño
     * - El usuario decide cuántos elementos necesita
     * - Más flexible que arrays de tamaño fijo
     */
    public ArrayValoresAleatorios() {
        teclado = new Scanner(System.in);
        
        // Solicitar al usuario la cantidad de elementos
        System.out.print("Cuantos elementos tendra el arreglo:");
        int cant = teclado.nextInt();
        
        // Crear array con el tamaño especificado por el usuario
        array = new int[cant];
    }

    /**
     * MÉTODO CARGAR VALORES ALEATORIOS - Llena el array con valores aleatorios
     * 
     * FUNCIONALIDAD:
     * - Genera valores aleatorios entre 1 y 100
     * - Llena el array completo con datos aleatorios
     * - Usa array.length para adaptarse al tamaño real
     * 
     * FÓRMULA ALEATORIA:
     * - Math.random() genera valores entre 0.0 y 1.0
     * - Math.random() * 100 genera valores entre 0.0 y 100.0
     * - (int)(Math.random() * 100) genera valores entre 0 y 99
     * - 1 + (int)(Math.random() * 100) genera valores entre 1 y 100
     */
    public void cargarValoresAleatorios() {
        // Bucle que se adapta automáticamente al tamaño del array
        for (int f = 0; f < array.length; f++) {
            // Genera valor aleatorio entre 1 y 100
            array[f] = 1 + (int) (Math.random() * 100);
        }
    }

    /**
     * MÉTODO IMPRIMIR MAYOR VALOR - Encuentra y muestra el valor máximo
     * 
     * FUNCIONALIDAD:
     * - Recorre el array completo
     * - Encuentra el elemento con mayor valor
     * - Muestra el resultado por pantalla
     * 
     * ALGORITMO DE BÚSQUEDA DE MÁXIMO:
     * 1. Asumir que el primer elemento es el máximo
     * 2. Recorrer desde el segundo elemento
     * 3. Si encuentra un valor mayor, actualizar el máximo
     * 4. Al final, mostrar el valor máximo encontrado
     */
    public void imprimirMayorValor() {
        // Variable para almacenar el valor máximo
        // Inicializada con el primer elemento del array
        int mayor = array[0];
        
        // Bucle que recorre desde el segundo elemento (índice 1)
        for (int f = 1; f < array.length; f++) {
            // Si el elemento actual es mayor que el máximo encontrado
            if (array[f] > mayor) {
                // Actualizar el valor máximo
                mayor = array[f];
            }
        }
        
        // Mostrar el valor máximo encontrado
        System.out.println("El mayor valor del array es: " + mayor);
    }

    /**
     * MÉTODO IMPRIMIR MENOR VALOR - Encuentra y muestra el valor mínimo
     * 
     * FUNCIONALIDAD:
     * - Recorre el array completo
     * - Encuentra el elemento con menor valor
     * - Muestra el resultado por pantalla
     * 
     * ALGORITMO DE BÚSQUEDA DE MÍNIMO:
     * 1. Asumir que el primer elemento es el mínimo
     * 2. Recorrer desde el segundo elemento
     * 3. Si encuentra un valor menor, actualizar el mínimo
     * 4. Al final, mostrar el valor mínimo encontrado
     */
    public void imprimirMenorValor() {
        // Variable para almacenar el valor mínimo
        // Inicializada con el primer elemento del array
        int menor = array[0];
        
        // Bucle que recorre desde el segundo elemento (índice 1)
        for (int f = 1; f < array.length; f++) {
            // Si el elemento actual es menor que el mínimo encontrado
            if (array[f] < menor) {
                // Actualizar el valor mínimo
                menor = array[f];
            }
        }
        
        // Mostrar el valor mínimo encontrado
        System.out.println("El menor valor del array es: " + menor);
    }

    /**
     * MÉTODO IMPRIMIR - Muestra todos los elementos del array
     * 
     * FUNCIONALIDAD:
     * - Recorre el array completo
     * - Muestra cada elemento separado por espacio
     * - Útil para verificar los datos generados
     */
    public void imprimir() {
        System.out.println("Array con valores aleatorios:");
        
        // Bucle para mostrar todos los elementos
        for (int f = 0; f < array.length; f++) {
            // Imprimir elemento seguido de espacio
            System.out.print(array[f] + " ");
        }
        
        // Nueva línea al final
        System.out.println();
    }

    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FLUJO DE EJECUCIÓN:
     * 1. Crear objeto (solicita tamaño y crea array)
     * 2. Cargar valores aleatorios
     * 3. Mostrar array completo
     * 4. Encontrar y mostrar valor máximo
     * 5. Encontrar y mostrar valor mínimo
     */
    public static void main(String[] args) {
        // Crear objeto: ejecuta constructor y solicita tamaño
        ArrayValoresAleatorios ava = new ArrayValoresAleatorios();
        
        // Cargar valores aleatorios en el array
        ava.cargarValoresAleatorios();
        
        // Mostrar array completo
        ava.imprimir();
        
        // Encontrar y mostrar el valor máximo
        ava.imprimirMayorValor();
        
        // Encontrar y mostrar el valor mínimo
        ava.imprimirMenorValor();
    }
}

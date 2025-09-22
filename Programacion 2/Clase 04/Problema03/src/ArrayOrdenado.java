/*
 * PROBLEMA 03 - VERIFICACIÓN DE ORDENAMIENTO
 * 
 * ENUNCIADO:
 * Crear un Array de 5 elementos de tipo entero por teclado. Implementar un método 
 * que imprima si está ordenado de menor a mayor.
 * 
 * OBJETIVO:
 * - Verificar si un array está ordenado ascendentemente
 * - Implementar algoritmo de verificación de ordenamiento
 * - Usar banderas (flags) booleanas para control de flujo
 * - Demostrar uso de break para optimización
 * 
 * CONCEPTOS CLAVE:
 * - Verificación de ordenamiento ascendente
 * - Variables booleanas como banderas
 * - Uso de break para salir anticipadamente
 * - Comparación de elementos adyacentes
 */

import java.util.Scanner;

public class ArrayOrdenado {
    // Scanner para entrada de datos por teclado
    private Scanner teclado;
    
    // Array de 5 elementos enteros
    private int[] array;

    /**
     * CONSTRUCTOR - Crea el array de 5 elementos
     * 
     * FUNCIONALIDAD:
     * - Inicializa el Scanner para entrada de datos
     * - Crea el array de 5 elementos (inicializados en 0)
     * - NO carga datos (eso se hace en método separado)
     */
    public ArrayOrdenado() {
        teclado = new Scanner(System.in);
        
        // Crear array de 5 elementos
        array = new int[5];
    }

    /**
     * MÉTODO CARGAR - Llena el array con datos ingresados por el usuario
     * 
     * FUNCIONALIDAD:
     * - Solicita al usuario que ingrese 5 valores
     * - Almacena cada valor en la posición correspondiente del array
     * - Muestra mensaje descriptivo para cada elemento
     */
    public void cargar() {
        // Bucle para cargar los 5 elementos del array
        for (int f = 0; f < array.length; f++) {
            // Solicitar valor para el elemento f+1 (numeración desde 1)
            System.out.print("Ingrese elemento " + (f + 1) + ":");
            // Leer y almacenar el valor ingresado
            array[f] = teclado.nextInt();
        }
    }

    /**
     * MÉTODO VERIFICAR ORDENADO - Verifica si el array está ordenado ascendentemente
     * 
     * FUNCIONALIDAD:
     * - Recorre el array comparando elementos adyacentes
     * - Si encuentra un elemento mayor que el siguiente, no está ordenado
     * - Usa bandera booleana para controlar el resultado
     * - Optimización: usa break para salir cuando encuentra desorden
     * 
     * ALGORITMO DE VERIFICACIÓN:
     * 1. Asumir que está ordenado (ordenado = true)
     * 2. Recorrer elementos adyacentes
     * 3. Si elemento[i] > elemento[i+1], marcar como no ordenado
     * 4. Salir inmediatamente con break
     * 5. Mostrar resultado final
     */
    public void verificarOrdenado() {
        // Bandera booleana: asumir que está ordenado
        boolean ordenado = true;
        
        // Bucle para comparar elementos adyacentes
        // array.length - 1: para no acceder fuera del array
        for (int f = 0; f < array.length - 1; f++) {
            // Si elemento actual es mayor que el siguiente
            if (array[f] > array[f + 1]) {
                // El array NO está ordenado
                ordenado = false;
                // Salir inmediatamente del bucle (optimización)
                break;
            }
        }
        
        // Mostrar resultado basado en la bandera
        if (ordenado) {
            System.out.println("El array está ordenado de menor a mayor");
        } else {
            System.out.println("El array NO está ordenado de menor a mayor");
        }
    }

    /**
     * MÉTODO IMPRIMIR - Muestra todos los elementos del array
     * 
     * FUNCIONALIDAD:
     * - Recorre el array completo
     * - Muestra cada elemento separado por espacio
     * - Útil para verificar los datos cargados
     */
    public void imprimir() {
        System.out.println("Array ingresado:");
        
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
     * 1. Crear objeto (ejecuta constructor)
     * 2. Cargar datos del usuario
     * 3. Mostrar array completo
     * 4. Verificar si está ordenado
     */
    public static void main(String[] args) {
        // Crear objeto: ejecuta constructor
        ArrayOrdenado ao = new ArrayOrdenado();
        
        // Cargar datos ingresados por el usuario
        ao.cargar();
        
        // Mostrar array completo para verificación
        ao.imprimir();
        
        // Verificar si el array está ordenado
        ao.verificarOrdenado();
    }
}

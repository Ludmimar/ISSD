/*
 * EJERCICIO 08 - ARRAYS BIDIMENSIONALES DINÁMICOS CON ATRIBUTO LENGTH
 * 
 * ENUNCIADO:
 * Crear una matriz de n * m filas (cargar n y m por teclado) Imprimir la matriz 
 * completa y la última fila. Utilizar el atributo length.
 * 
 * OBJETIVO:
 * - Demostrar arrays bidimensionales de tamaño dinámico
 * - Usar el atributo length para arrays 2D
 * - Mostrar cómo acceder a filas específicas
 * - Comparar con arrays de tamaño fijo
 * 
 * CONCEPTOS CLAVE:
 * - Arrays bidimensionales dinámicos
 * - Atributo length en 2D: array.length (filas) y array[f].length (columnas)
 * - Entrada de datos para determinar tamaño
 * - Acceso a filas específicas
 */

import java.util.Scanner;

public class Ejercicio1 {
    // Scanner para entrada de datos por teclado
    private Scanner teclado;
    
    // Array bidimensional de tamaño dinámico
    private int[][] array;

    /**
     * MÉTODO CARGAR - Crea matriz de tamaño dinámico y carga datos
     * 
     * FUNCIONALIDAD:
     * 1. Solicita al usuario las dimensiones de la matriz
     * 2. Crea la matriz con las dimensiones especificadas
     * 3. Carga valores ingresados por el usuario
     * 
     * ATRIBUTO LENGTH EN ARRAYS 2D:
     * - array.length: cantidad de filas
     * - array[f].length: cantidad de columnas de la fila f
     * - Útil para matrices de tamaño variable
     */
    public void cargar() {
        teclado = new Scanner(System.in);
        
        // Solicitar cantidad de filas
        System.out.print("Cuantas fila tiene el Array:");
        int filas = teclado.nextInt();
        
        // Solicitar cantidad de columnas
        System.out.print("Cuantas columnas tiene el Array:");
        int columnas = teclado.nextInt();
        
        // Crear matriz con las dimensiones especificadas
        array = new int[filas][columnas];
        
        // BUCLE EXTERNO: recorre las filas usando array.length
        for (int f = 0; f < array.length; f++) {
            // BUCLE INTERNO: recorre las columnas usando array[f].length
            for (int c = 0; c < array[f].length; c++) {
                System.out.print("Ingrese componente:");
                array[f][c] = teclado.nextInt();
            }
        }
    }

    /**
     * MÉTODO IMPRIMIR - Muestra la matriz completa
     * 
     * FUNCIONALIDAD:
     * - Recorre la matriz completa usando array.length
     * - Muestra cada elemento seguido de espacio
     * - Al final de cada fila, imprime nueva línea
     * 
     * VENTAJA DEL ATRIBUTO LENGTH:
     * - Se adapta automáticamente al tamaño real de la matriz
     * - No necesita valores fijos en los bucles
     * - Funciona con cualquier tamaño de matriz
     */
    public void imprimir() {
        // BUCLE EXTERNO: usa array.length para cantidad de filas
        for (int f = 0; f < array.length; f++) {
            // BUCLE INTERNO: usa array[f].length para cantidad de columnas
            for (int c = 0; c < array[f].length; c++) {
                System.out.print(array[f][c] + " ");
            }
            System.out.println();
        }
    }

    /**
     * MÉTODO IMPRIMIR ÚLTIMA FILA - Muestra solo la última fila
     * 
     * FUNCIONALIDAD:
     * - Accede directamente a la última fila
     * - Recorre solo las columnas de esa fila
     * - Muestra elementos separados por espacio
     * 
     * ACCESO A ÚLTIMA FILA:
     * - array.length - 1: índice de la última fila
     * - array[array.length - 1].length: cantidad de columnas de la última fila
     */
    public void imprimirUltimaFila() {
        System.out.println("Ultima fila");
        
        // Recorrer solo las columnas de la última fila
        // array.length - 1 es el índice de la última fila
        for (int c = 0; c < array[array.length - 1].length; c++) {
            System.out.print(array[array.length - 1][c] + " ");
        }
    }

    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FLUJO DE EJECUCIÓN:
     * 1. Crear objeto
     * 2. Cargar matriz (solicita dimensiones y datos)
     * 3. Imprimir matriz completa
     * 4. Imprimir última fila
     */
    public static void main(String[] ar) {
        // Crear objeto
        Ejercicio1 ma = new Ejercicio1();
        
        // Cargar matriz con dimensiones y datos del usuario
        ma.cargar();
        
        // Mostrar matriz completa
        ma.imprimir();
        
        // Mostrar solo la última fila
        ma.imprimirUltimaFila();
    }
}

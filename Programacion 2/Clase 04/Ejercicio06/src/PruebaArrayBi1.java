/*
 * EJERCICIO 06 - INTRODUCCIÓN A ARRAYS BIDIMENSIONALES
 * 
 * ENUNCIADO:
 * Crear una Array de 3 filas por 5 columnas con elementos de tipo int, cargar 
 * sus componentes por teclado y luego imprimirlas.
 * 
 * OBJETIVO:
 * - Introducir el concepto de arrays bidimensionales (matrices)
 * - Mostrar declaración, creación y acceso a elementos 2D
 * - Implementar carga e impresión de matrices
 * - Demostrar bucles anidados para matrices
 * 
 * CONCEPTOS CLAVE:
 * - Arrays bidimensionales: int[][] array
 * - Creación: array = new int[filas][columnas]
 * - Acceso: array[fila][columna]
 * - Bucles anidados: for dentro de for
 * - Matrices: estructura fila-columna
 */

import java.util.Scanner;

public class PruebaArrayBi1 {
    // Scanner para entrada de datos por teclado
    private Scanner teclado;
    
    // Declaración del array bidimensional (matriz)
    // Sintaxis: tipo[][] nombreArray
    private int[][] array;

    /**
     * CONSTRUCTOR - Crea la matriz y carga los datos
     * 
     * FUNCIONALIDAD:
     * 1. Crea el objeto Scanner para entrada de datos
     * 2. Crea la matriz de 3 filas por 5 columnas
     * 3. Recorre la matriz cargando valores ingresados por el usuario
     * 
     * ESTRUCTURA DE LA MATRIZ:
     * - 3 filas (índices 0, 1, 2)
     * - 5 columnas (índices 0, 1, 2, 3, 4)
     * - Total: 15 elementos
     * 
     * BUCLES ANIDADOS:
     * - Bucle externo: recorre filas (f)
     * - Bucle interno: recorre columnas (c)
     * - Acceso: array[f][c]
     */
    public PruebaArrayBi1() {
        teclado = new Scanner(System.in);
        
        // Creación de la matriz: 3 filas x 5 columnas
        // Todos los elementos se inicializan automáticamente en 0
        array = new int[3][5];
        
        // BUCLE EXTERNO: recorre las filas (0, 1, 2)
        for (int f = 0; f < 3; f++) {
            // BUCLE INTERNO: recorre las columnas (0, 1, 2, 3, 4)
            for (int c = 0; c < 5; c++) {
                // Solicitar valor para la posición [f][c]
                System.out.print("Ingrese componente:");
                // Leer y almacenar el valor en la posición [f][c]
                array[f][c] = teclado.nextInt();
            }
        }
    }

    /**
     * MÉTODO IMPRIMIR - Muestra la matriz completa
     * 
     * FUNCIONALIDAD:
     * - Recorre la matriz completa usando bucles anidados
     * - Muestra cada elemento seguido de espacio
     * - Al final de cada fila, imprime nueva línea
     * 
     * FORMATO DE SALIDA:
     * - Cada fila en una línea separada
     * - Elementos separados por espacios
     * - Ejemplo:
     *   1 2 3 4 5
     *   6 7 8 9 10
     *   11 12 13 14 15
     */
    public void imprimir() {
        // BUCLE EXTERNO: recorre las filas
        for (int f = 0; f < 3; f++) {
            // BUCLE INTERNO: recorre las columnas
            for (int c = 0; c < 5; c++) {
                // Imprimir elemento seguido de espacio
                System.out.print(array[f][c] + " ");
            }
            // Nueva línea al final de cada fila
            System.out.println();
        }
    }

    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FLUJO DE EJECUCIÓN:
     * 1. Crear objeto (ejecuta constructor y carga datos)
     * 2. Imprimir la matriz completa
     * 
     * CARGA DE DATOS:
     * - Se realiza en el constructor
     * - El usuario ingresa 15 valores (3x5)
     * - Los valores se almacenan en orden fila por fila
     */
    public static void main(String[] ar) {
        // Crear objeto: ejecuta constructor y carga datos
        PruebaArrayBi1 pa = new PruebaArrayBi1();
        
        // Mostrar la matriz completa
        pa.imprimir();
    }
}

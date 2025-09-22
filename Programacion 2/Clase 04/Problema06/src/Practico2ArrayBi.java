/*
 * PROBLEMA 06 - CARGA DE MATRIZ POR COLUMNAS
 * 
 * ENUNCIADO:
 * Crear un Array bidimensional de 2 filas y 5 columnas. Realizar la carga de 
 * componentes por columna (es decir primero ingresar toda la primer columna, 
 * luego la segunda columna y así sucesivamente, por teclado)
 * Imprimir luego el Array bidimensional.
 * 
 * OBJETIVO:
 * - Demostrar diferentes formas de cargar matrices
 * - Comparar carga por filas vs carga por columnas
 * - Mostrar cómo cambiar el orden de los bucles anidados
 * - Implementar entrada de datos por columnas
 * 
 * CONCEPTOS CLAVE:
 * - Carga por columnas: bucle externo para columnas, interno para filas
 * - Orden de bucles: c (columnas) externo, f (filas) interno
 * - Diferencia con carga tradicional por filas
 */

import java.util.Scanner;

public class Practico2ArrayBi {
    // Array bidimensional de 2 filas x 5 columnas
    private int[][] array;
    
    // Scanner para entrada de datos
    private Scanner teclado;

    /**
     * CONSTRUCTOR - Crea la matriz de 2x5
     * 
     * FUNCIONALIDAD:
     * - Inicializa el Scanner
     * - Crea matriz de 2 filas x 5 columnas
     * - NO carga datos (eso se hace en método separado)
     */
    public Practico2ArrayBi() {
        teclado = new Scanner(System.in);
        
        // Crear matriz de 2 filas x 5 columnas
        array = new int[2][5];
    }

    /**
     * MÉTODO CARGAR - Carga la matriz por columnas
     * 
     * FUNCIONALIDAD:
     * - Carga datos columna por columna
     * - Primero completa la columna 0, luego la 1, etc.
     * - Orden de bucles: columnas (externo), filas (interno)
     * 
     * DIFERENCIA CON CARGA POR FILAS:
     * - Carga por filas: for(f) { for(c) { ... } }
     * - Carga por columnas: for(c) { for(f) { ... } }
     * 
     * ORDEN DE CARGA:
     * - Columna 0: array[0][0], array[1][0]
     * - Columna 1: array[0][1], array[1][1]
     * - Columna 2: array[0][2], array[1][2]
     * - Columna 3: array[0][3], array[1][3]
     * - Columna 4: array[0][4], array[1][4]
     */
    public void cargar() {
        // BUCLE EXTERNO: recorre las columnas (0 a 4)
        for (int c = 0; c < 5; c++) {
            // BUCLE INTERNO: recorre las filas (0 a 1)
            for (int f = 0; f < 2; f++) {
                System.out.print("Ingrese componente:");
                // Cargar elemento en posición [f][c]
                array[f][c] = teclado.nextInt();
            }
        }
    }

    /**
     * MÉTODO IMPRIMIR - Muestra la matriz completa
     * 
     * FUNCIONALIDAD:
     * - Muestra la matriz en formato tradicional (filas)
     * - Cada fila en una línea separada
     * - Elementos separados por espacio
     * 
     * FORMATO DE SALIDA:
     * - Fila 0: elemento[0][0] elemento[0][1] elemento[0][2] elemento[0][3] elemento[0][4]
     * - Fila 1: elemento[1][0] elemento[1][1] elemento[1][2] elemento[1][3] elemento[1][4]
     */
    public void imprimir() {
        // BUCLE EXTERNO: recorre las filas (0 a 1)
        for (int f = 0; f < 2; f++) {
            // BUCLE INTERNO: recorre las columnas (0 a 4)
            for (int c = 0; c < 5; c++) {
                System.out.print(array[f][c] + " ");
            }
            System.out.println();
        }
    }

    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FLUJO DE EJECUCIÓN:
     * 1. Crear objeto (ejecuta constructor)
     * 2. Cargar matriz por columnas
     * 3. Imprimir matriz completa
     */
    public static void main(String[] args) {
        // Crear objeto: ejecuta constructor
        Practico2ArrayBi p = new Practico2ArrayBi();
        
        // Cargar matriz por columnas
        p.cargar();
        
        // Mostrar matriz completa
        p.imprimir();
    }
}

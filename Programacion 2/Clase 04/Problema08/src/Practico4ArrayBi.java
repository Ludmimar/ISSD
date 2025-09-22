/*
 * PROBLEMA 08 - IMPRESIÓN DE FILAS Y COLUMNAS ESPECÍFICAS
 * 
 * ENUNCIADO:
 * Crear y cargar una matriz de 3 filas por 4 columnas. 
 * Imprimir la primer fila. 
 * Imprimir la última fila e imprimir la primer columna.
 * 
 * OBJETIVO:
 * - Trabajar con matrices de tamaño fijo (3x4)
 * - Implementar impresión de filas específicas
 * - Implementar impresión de columnas específicas
 * - Demostrar acceso a elementos por fila y por columna
 * 
 * CONCEPTOS CLAVE:
 * - Matrices de tamaño fijo (3 filas x 4 columnas)
 * - Impresión de filas completas
 * - Impresión de columnas completas
 * - Acceso a primera y última fila
 * - Acceso a primera columna
 */

import java.util.Scanner;

public class Practico4ArrayBi {
    // Scanner para entrada de datos por teclado
    private Scanner teclado;
    
    // Matriz de 3 filas x 4 columnas
    private int[][] mat;

    /**
     * CONSTRUCTOR - Crea matriz 3x4 y carga datos
     * 
     * FUNCIONALIDAD:
     * - Inicializa el Scanner
     * - Crea matriz de 3 filas x 4 columnas
     * - Carga valores ingresados por el usuario
     * 
     * MATRIZ 3X4:
     * - 3 filas (índices 0, 1, 2)
     * - 4 columnas (índices 0, 1, 2, 3)
     * - Total: 12 elementos
     */
    public Practico4ArrayBi() {
        teclado = new Scanner(System.in);
        
        // Crear matriz de 3 filas x 4 columnas
        mat = new int[3][4];
        
        // Cargar datos en la matriz
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 4; c++) {
                System.out.print("Ingrese componente:");
                mat[f][c] = teclado.nextInt();
            }
        }
    }

    /**
     * MÉTODO PRIMER FILA - Imprime la primera fila de la matriz
     * 
     * FUNCIONALIDAD:
     * - Muestra todos los elementos de la fila 0
     * - Cada elemento en una línea separada
     * - Útil para verificar datos de la primera fila
     * 
     * ELEMENTOS DE LA PRIMERA FILA:
     * - mat[0][0], mat[0][1], mat[0][2], mat[0][3]
     */
    public void primerFila() {
        System.out.println("Primer fila de la matriz:");
        
        // Recorrer todas las columnas de la fila 0
        for (int c = 0; c < 4; c++) {
            System.out.println(mat[0][c]);
        }
    }

    /**
     * MÉTODO ÚLTIMA FILA - Imprime la última fila de la matriz
     * 
     * FUNCIONALIDAD:
     * - Muestra todos los elementos de la fila 2 (última fila)
     * - Cada elemento en una línea separada
     * - Útil para verificar datos de la última fila
     * 
     * ELEMENTOS DE LA ÚLTIMA FILA:
     * - mat[2][0], mat[2][1], mat[2][2], mat[2][3]
     */
    public void ultimaFila() {
        System.out.println("Ultima fila de la matriz:");
        
        // Recorrer todas las columnas de la fila 2 (última fila)
        for (int c = 0; c < 4; c++) {
            System.out.println(mat[2][c]);
        }
    }

    /**
     * MÉTODO PRIMER COLUMNA - Imprime la primera columna de la matriz
     * 
     * FUNCIONALIDAD:
     * - Muestra todos los elementos de la columna 0
     * - Cada elemento en una línea separada
     * - Útil para verificar datos de la primera columna
     * 
     * ELEMENTOS DE LA PRIMERA COLUMNA:
     * - mat[0][0], mat[1][0], mat[2][0]
     */
    public void primerColumna() {
        System.out.println("Primer columna:");
        
        // Recorrer todas las filas de la columna 0
        for (int f = 0; f < 3; f++) {
            System.out.println(mat[f][0]);
        }
    }

    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FLUJO DE EJECUCIÓN:
     * 1. Crear objeto (ejecuta constructor y carga datos)
     * 2. Imprimir primera fila
     * 3. Imprimir última fila
     * 4. Imprimir primera columna
     */
    public static void main(String[] ar) {
        // Crear objeto: ejecuta constructor y carga datos
        Practico4ArrayBi ma = new Practico4ArrayBi();
        
        // Mostrar primera fila
        ma.primerFila();
        
        // Mostrar última fila
        ma.ultimaFila();
        
        // Mostrar primera columna
        ma.primerColumna();
    }
}

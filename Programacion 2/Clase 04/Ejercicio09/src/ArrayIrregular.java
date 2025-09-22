/*
 * EJERCICIO 09 - ARRAYS BIDIMENSIONALES IRREGULARES DINÁMICOS
 * 
 * ENUNCIADO:
 * Confeccionaremos un programa que permita crear una Array irregular y luego 
 * imprimir el Array en forma completo.
 * 
 * OBJETIVO:
 * - Introducir arrays bidimensionales irregulares
 * - Demostrar creación dinámica de filas con diferentes tamaños
 * - Mostrar cómo cada fila puede tener diferente cantidad de elementos
 * - Implementar carga e impresión de arrays irregulares
 * 
 * CONCEPTOS CLAVE:
 * - Arrays irregulares: cada fila tiene diferente tamaño
 * - Creación en dos pasos: primero filas, luego elementos por fila
 * - array[f] = new int[elementos]: crear fila específica
 * - array[f].length: tamaño de cada fila individual
 */

import java.util.Scanner;

public class ArrayIrregular {
    // Scanner para entrada de datos por teclado
    private Scanner teclado;
    
    // Array bidimensional irregular
    // Cada fila puede tener diferente cantidad de elementos
    private int[][] mat;

    /**
     * MÉTODO CARGAR - Crea array irregular y carga datos
     * 
     * FUNCIONALIDAD:
     * 1. Solicita cantidad de filas
     * 2. Para cada fila, solicita cantidad de elementos
     * 3. Crea cada fila con su tamaño específico
     * 4. Carga datos en cada fila
     * 
     * CREACIÓN DE ARRAY IRREGULAR:
     * - Paso 1: mat = new int[filas][]; (solo filas)
     * - Paso 2: mat[f] = new int[elementos]; (elementos por fila)
     * - Cada fila puede tener diferente tamaño
     */
    public void cargar() {
        teclado = new Scanner(System.in);
        
        // Solicitar cantidad de filas
        System.out.print("Cuantas fila tiene el Array:");
        int filas = teclado.nextInt();
        
        // PASO 1: Crear array con cantidad de filas (sin columnas)
        // Sintaxis: new int[filas][];
        mat = new int[filas][];
        
        // PASO 2: Crear cada fila con su tamaño específico
        for (int f = 0; f < mat.length; f++) {
            // Solicitar cantidad de elementos para esta fila
            System.out.print("Cuantas elementos tiene la fila " + f + ":");
            int elementos = teclado.nextInt();
            
            // Crear la fila f con la cantidad de elementos especificada
            mat[f] = new int[elementos];
            
            // Cargar datos en esta fila
            for (int c = 0; c < mat[f].length; c++) {
                System.out.print("Ingrese componente:");
                mat[f][c] = teclado.nextInt();
            }
        }
    }

    /**
     * MÉTODO IMPRIMIR - Muestra el array irregular completo
     * 
     * FUNCIONALIDAD:
     * - Recorre todas las filas usando mat.length
     * - Para cada fila, recorre sus elementos usando mat[f].length
     * - Muestra elementos separados por espacio
     * - Nueva línea al final de cada fila
     * 
     * VENTAJA DE ARRAYS IRREGULARES:
     * - Cada fila puede tener diferente tamaño
     * - Útil para estructuras como árboles, listas de listas
     * - Ahorra memoria cuando no todas las filas necesitan el mismo tamaño
     */
    public void imprimir() {
        // BUCLE EXTERNO: recorre las filas
        for (int f = 0; f < mat.length; f++) {
            // BUCLE INTERNO: recorre los elementos de la fila f
            // mat[f].length es el tamaño específico de esta fila
            for (int c = 0; c < mat[f].length; c++) {
                System.out.print(mat[f][c] + " ");
            }
            // Nueva línea al final de cada fila
            System.out.println();
        }
    }

    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FLUJO DE EJECUCIÓN:
     * 1. Crear objeto
     * 2. Cargar array irregular (solicita dimensiones y datos)
     * 3. Imprimir array irregular completo
     */
    public static void main(String[] ar) {
        // Crear objeto
        ArrayIrregular e = new ArrayIrregular();
        
        // Cargar array irregular con dimensiones y datos del usuario
        e.cargar();
        
        // Mostrar array irregular completo
        e.imprimir();
    }
}

/*
 * PROBLEMA 07 - INTERCAMBIO DE FILAS Y VÉRTICES DE MATRIZ
 * 
 * ENUNCIADO:
 * Crear un Array bidimensional de n * m filas (cargar n y m por teclado) 
 * Intercambiar la primer fila con la segundo. Imprimir luego el Array bidimensional. 
 * Imprimir los cuatro valores que se encuentran en los vértices de la misma 
 * (array[0][0] etc.)
 * 
 * OBJETIVO:
 * - Trabajar con matrices de tamaño dinámico
 * - Implementar intercambio de filas completas
 * - Mostrar elementos específicos (vértices)
 * - Demostrar manipulación de filas en matrices
 * 
 * CONCEPTOS CLAVE:
 * - Matrices de tamaño dinámico (n x m)
 * - Intercambio de filas usando variable auxiliar
 * - Acceso a vértices: esquinas de la matriz
 * - Manipulación de elementos específicos
 */

import java.util.Scanner;

public class Practico3ArrayBi {
    // Array bidimensional de tamaño dinámico
    private int[][] array;
    
    // Dimensiones de la matriz
    private int filas, columnas;
    
    // Scanner para entrada de datos
    private Scanner teclado;

    /**
     * CONSTRUCTOR - Crea matriz de tamaño dinámico y carga datos
     * 
     * FUNCIONALIDAD:
     * 1. Solicita dimensiones de la matriz (n x m)
     * 2. Crea la matriz con las dimensiones especificadas
     * 3. Carga valores ingresados por el usuario
     * 
     * MATRIZ DINÁMICA:
     * - Dimensiones determinadas por el usuario
     * - Cada ejecución puede tener diferente tamaño
     * - Más flexible que matrices de tamaño fijo
     */
    public Practico3ArrayBi() {
        teclado = new Scanner(System.in);
        
        // Solicitar cantidad de filas
        System.out.print("Cuantas Filas:");
        filas = teclado.nextInt();
        
        // Solicitar cantidad de columnas
        System.out.print("Cuantas Columnas:");
        columnas = teclado.nextInt();
        
        // Crear matriz con las dimensiones especificadas
        array = new int[filas][columnas];
        
        // Cargar datos en la matriz
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                System.out.print("Ingrese elemento:");
                array[f][c] = teclado.nextInt();
            }
        }
    }

    /**
     * MÉTODO IMPRIMIR - Muestra la matriz completa
     * 
     * FUNCIONALIDAD:
     * - Recorre la matriz completa
     * - Muestra cada elemento seguido de espacio
     * - Nueva línea al final de cada fila
     * - Línea separadora al final
     */
    public void imprimir() {
        // BUCLE EXTERNO: recorre las filas
        for (int f = 0; f < filas; f++) {
            // BUCLE INTERNO: recorre las columnas
            for (int c = 0; c < columnas; c++) {
                System.out.print(array[f][c] + " ");
            }
            System.out.println();
        }
        System.out.println("**************************");
    }

    /**
     * MÉTODO INTERCAMBIAR FILA 1 FILA 2 - Intercambia primera y segunda fila
     * 
     * FUNCIONALIDAD:
     * - Intercambia todos los elementos de la fila 0 con la fila 1
     * - Usa variable auxiliar para el intercambio
     * - Recorre todas las columnas de ambas filas
     * 
     * ALGORITMO DE INTERCAMBIO:
     * 1. Para cada columna c:
     * 2.   aux = array[0][c]
     * 3.   array[0][c] = array[1][c]
     * 4.   array[1][c] = aux
     * 
     * NOTA: Solo funciona si hay al menos 2 filas
     */
    public void intercambiarFila1Fila2() {
        // Intercambiar elementos columna por columna
        for (int c = 0; c < columnas; c++) {
            // Variable auxiliar para el intercambio
            int aux = array[0][c];
            
            // Intercambiar elementos
            array[0][c] = array[1][c];
            array[1][c] = aux;
        }
    }

    /**
     * MÉTODO IMPRIMIR VÉRTICES - Muestra los cuatro vértices de la matriz
     * 
     * FUNCIONALIDAD:
     * - Muestra los elementos en las cuatro esquinas
     * - Vértices: (0,0), (0,última_col), (última_fil,0), (última_fil,última_col)
     * - Útil para verificar cambios en las esquinas
     * 
     * VÉRTICES DE LA MATRIZ:
     * - Superior izquierdo: array[0][0]
     * - Superior derecho: array[0][columnas-1]
     * - Inferior izquierdo: array[filas-1][0]
     * - Inferior derecho: array[filas-1][columnas-1]
     */
    public void imprimirVertices() {
        System.out.println("Vertice superior izquierdo:" + array[0][0]);
        System.out.println("Vertice superior derecho:" + array[0][columnas - 1]);
        System.out.println("Vertice inferior izquierdo:" + array[filas - 1][0]);
        System.out.println("Vertice inferior derecho:" + array[filas - 1][columnas - 1]);
    }

    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FLUJO DE EJECUCIÓN:
     * 1. Crear objeto (solicita dimensiones y carga datos)
     * 2. Mostrar matriz original
     * 3. Intercambiar primera y segunda fila
     * 4. Mostrar matriz después del intercambio
     * 5. Mostrar vértices de la matriz
     */
    public static void main(String[] args) {
        // Crear objeto: solicita dimensiones y carga datos
        Practico3ArrayBi p = new Practico3ArrayBi();
        
        // Mostrar matriz original
        p.imprimir();
        
        // Intercambiar primera y segunda fila
        p.intercambiarFila1Fila2();
        
        // Mostrar matriz después del intercambio
        p.imprimir();
        
        // Mostrar vértices de la matriz
        p.imprimirVertices();
    }
}

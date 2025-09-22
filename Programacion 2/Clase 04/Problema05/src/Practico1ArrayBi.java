/*
 * PROBLEMA 05 - OPERACIONES CON MATRICES CUADRADAS
 * 
 * ENUNCIADO:
 * Se pide crear una Array bidimensional de 4×4 de números enteros.
 * a) Rellenar el Array bidimensional con valores aleatorios comprendidos entre 1 y 9.
 * b) Sumar la diagonal principal.
 * c) Sumar la diagonal secundaria.
 * d) Suma de una fila que debe llegar como parámetro al método.
 * e) Calcular el promedio de todos sus elementos del Array bidimensional
 * 
 * OBJETIVO:
 * - Trabajar con matrices cuadradas (mismo número de filas y columnas)
 * - Implementar operaciones matriciales básicas
 * - Calcular diagonales principal y secundaria
 * - Implementar suma de filas específicas
 * - Calcular promedios de matrices
 * 
 * CONCEPTOS CLAVE:
 * - Matrices cuadradas (4x4)
 * - Diagonal principal: elementos donde fila == columna
 * - Diagonal secundaria: elementos donde fila + columna == tamaño-1
 * - Suma de filas específicas
 * - Promedio de todos los elementos
 */

public class Practico1ArrayBi {
    // Array bidimensional de 4x4 (matriz cuadrada)
    private int[][] array;

    /**
     * CONSTRUCTOR - Crea matriz 4x4 y la llena con valores aleatorios
     * 
     * FUNCIONALIDAD:
     * - Crea matriz cuadrada de 4x4
     * - Llena automáticamente con valores aleatorios entre 1 y 9
     * - No requiere entrada del usuario
     * 
     * VALORES ALEATORIOS:
     * - Math.random() genera valores entre 0.0 y 1.0
     * - * 9 genera valores entre 0.0 y 9.0
     * - (int) convierte a entero (0 a 8)
     * - +1 desplaza el rango a 1-9
     */
    public Practico1ArrayBi() {
        // Crear matriz cuadrada de 4x4
        array = new int[4][4];
        
        // Llenar matriz con valores aleatorios
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                // Generar valor aleatorio entre 1 y 9
                array[f][c] = 1 + (int) (Math.random() * 9);
            }
        }
    }

    /**
     * MÉTODO IMPRESIÓN - Muestra la matriz completa
     * 
     * FUNCIONALIDAD:
     * - Recorre la matriz completa
     * - Muestra cada elemento seguido de espacio
     * - Nueva línea al final de cada fila
     */
    public void impresion() {
        // BUCLE EXTERNO: recorre las filas
        for (int f = 0; f < 4; f++) {
            // BUCLE INTERNO: recorre las columnas
            for (int c = 0; c < 4; c++) {
                System.out.print(array[f][c] + " ");
            }
            System.out.println();
        }
    }

    /**
     * MÉTODO DIAGONAL PRINCIPAL - Suma elementos de la diagonal principal
     * 
     * FUNCIONALIDAD:
     * - Suma elementos donde fila == columna
     * - Diagonal principal: (0,0), (1,1), (2,2), (3,3)
     * - Muestra el resultado de la suma
     * 
     * DIAGONAL PRINCIPAL:
     * - Elementos donde f == c
     * - Forma una línea diagonal de arriba-izquierda a abajo-derecha
     */
    public void diagonalPrincipal() {
        int suma = 0;
        
        // Recorrer diagonal principal (f == c)
        for (int k = 0; k < 4; k++) {
            suma += array[k][k];
        }
        
        System.out.println("La suma de la diagonal principal:" + suma);
    }

    /**
     * MÉTODO DIAGONAL SECUNDARIA - Suma elementos de la diagonal secundaria
     * 
     * FUNCIONALIDAD:
     * - Suma elementos donde fila + columna == tamaño-1
     * - Diagonal secundaria: (0,3), (1,2), (2,1), (3,0)
     * - Muestra el resultado de la suma
     * 
     * DIAGONAL SECUNDARIA:
     * - Elementos donde f + c == 3 (para matriz 4x4)
     * - Forma una línea diagonal de arriba-derecha a abajo-izquierda
     */
    public void diagonalSecundaria() {
        int suma = 0;
        
        // Recorrer diagonal secundaria (f + c == 3)
        for (int k = 0; k < 4; k++) {
            suma += array[3 - k][k];
        }
        
        System.out.println("La suma de la diagonal secundaria:" + suma);
    }

    /**
     * MÉTODO SUMAR FILA - Suma elementos de una fila específica
     * 
     * FUNCIONALIDAD:
     * - Suma todos los elementos de la fila especificada
     * - Parámetro: número de fila (0 a 3)
     * - Muestra el resultado de la suma
     * 
     * @param fila - Número de fila a sumar (0-3)
     */
    public void sumarFila(int fila) {
        int suma = 0;
        
        // Recorrer todas las columnas de la fila especificada
        for (int c = 0; c < 4; c++) {
            suma += array[fila][c];
        }
        
        System.out.println("La suma de la fila:" + fila + " es " + suma);
    }

    /**
     * MÉTODO CALCULAR PROMEDIO - Calcula promedio de todos los elementos
     * 
     * FUNCIONALIDAD:
     * - Suma todos los elementos de la matriz
     * - Divide entre el total de elementos (16 para matriz 4x4)
     * - Muestra el promedio calculado
     * 
     * CÁLCULO DE PROMEDIO:
     * - Suma total / cantidad de elementos
     * - Para matriz 4x4: suma / 16
     */
    public void calcularPromedio() {
        int suma = 0;
        
        // Sumar todos los elementos de la matriz
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                suma += array[f][c];
            }
        }
        
        // Calcular promedio (suma / 16 elementos)
        int promedio = suma / 16;
        System.out.println("El promedio de sus elementos es:" + promedio);
    }

    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FLUJO DE EJECUCIÓN:
     * 1. Crear objeto (genera matriz con valores aleatorios)
     * 2. Mostrar matriz completa
     * 3. Calcular suma diagonal principal
     * 4. Calcular suma diagonal secundaria
     * 5. Calcular suma de fila 0
     * 6. Calcular promedio general
     */
    public static void main(String[] args) {
        // Crear objeto: genera matriz 4x4 con valores aleatorios
        Practico1ArrayBi p = new Practico1ArrayBi();
        
        // Mostrar matriz completa
        p.impresion();
        
        // Calcular suma de diagonal principal
        p.diagonalPrincipal();
        
        // Calcular suma de diagonal secundaria
        p.diagonalSecundaria();
        
        // Calcular suma de fila 0
        p.sumarFila(0);
        
        // Calcular promedio de todos los elementos
        p.calcularPromedio();
    }
}

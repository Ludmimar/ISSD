/*
 * EJERCICIO 10 - ARRAYS BIDIMENSIONALES IRREGULARES CON ESTRUCTURA FIJA
 * 
 * ENUNCIADO:
 * Confeccionar una clase para administrar una Array irregular de 5 filas y 1 columna 
 * la primer fila, 2 columnas la segunda fila y así sucesivamente hasta 5 columnas 
 * la última fila (crearla sin la intervención del operador)
 * Realizar la carga por teclado e imprimir posteriormente.
 * 
 * OBJETIVO:
 * - Demostrar arrays irregulares con estructura predefinida
 * - Mostrar patrón específico de crecimiento (1, 2, 3, 4, 5 elementos)
 * - Comparar con arrays irregulares dinámicos
 * - Implementar carga automática de estructura
 * 
 * CONCEPTOS CLAVE:
 * - Arrays irregulares con estructura fija
 * - Patrón de crecimiento: fila i tiene i+1 elementos
 * - Creación automática sin intervención del usuario
 * - Arrays irregulares vs arrays regulares
 */

public class ArrayIrregularFijo {
    // Array bidimensional irregular con estructura fija
    // Fila 0: 1 elemento, Fila 1: 2 elementos, ..., Fila 4: 5 elementos
    private int[][] mat;

    /**
     * CONSTRUCTOR - Crea array irregular con estructura fija
     * 
     * FUNCIONALIDAD:
     * - Crea array de 5 filas
     * - Cada fila i tiene i+1 elementos (1, 2, 3, 4, 5)
     * - Estructura predefinida sin intervención del usuario
     * 
     * ESTRUCTURA DEL ARRAY:
     * - Fila 0: 1 elemento (índices 0)
     * - Fila 1: 2 elementos (índices 0, 1)
     * - Fila 2: 3 elementos (índices 0, 1, 2)
     * - Fila 3: 4 elementos (índices 0, 1, 2, 3)
     * - Fila 4: 5 elementos (índices 0, 1, 2, 3, 4)
     * 
     * PATRÓN: fila i tiene i+1 elementos
     */
    public ArrayIrregularFijo() {
        // Crear array de 5 filas (sin columnas aún)
        mat = new int[5][];
        
        // Crear cada fila con su tamaño específico
        // Fila i tiene i+1 elementos
        mat[0] = new int[1];  // Fila 0: 1 elemento
        mat[1] = new int[2];  // Fila 1: 2 elementos
        mat[2] = new int[3];   // Fila 2: 3 elementos
        mat[3] = new int[4];   // Fila 3: 4 elementos
        mat[4] = new int[5];   // Fila 4: 5 elementos
    }

    /**
     * MÉTODO CARGAR - Llena el array irregular con valores aleatorios
     * 
     * FUNCIONALIDAD:
     * - Recorre todas las filas del array irregular
     * - Para cada fila, llena sus elementos con valores aleatorios
     * - Genera valores entre 1 y 10
     * 
     * CARGA AUTOMÁTICA:
     * - No requiere entrada del usuario
     * - Usa valores aleatorios para demostrar la estructura
     * - Cada elemento se llena independientemente
     */
    public void cargar() {
        // BUCLE EXTERNO: recorre las filas
        for (int f = 0; f < mat.length; f++) {
            // BUCLE INTERNO: recorre los elementos de la fila f
            for (int c = 0; c < mat[f].length; c++) {
                // Generar valor aleatorio entre 1 y 10
                // Math.random() genera valores entre 0.0 y 1.0
                // * 10 genera valores entre 0.0 y 10.0
                // (int) convierte a entero (0 a 9)
                // +1 desplaza el rango a 1-10
                mat[f][c] = (int) (Math.random() * 10) + 1;
            }
        }
    }

    /**
     * MÉTODO IMPRIMIR - Muestra el array irregular completo
     * 
     * FUNCIONALIDAD:
     * - Recorre todas las filas del array irregular
     * - Para cada fila, muestra sus elementos separados por espacio
     * - Nueva línea al final de cada fila
     * - Demuestra la estructura irregular del array
     * 
     * VISUALIZACIÓN:
     * - Cada fila se muestra en una línea separada
     * - Se puede ver claramente que cada fila tiene diferente tamaño
     * - Ejemplo de salida:
     *   7
     *   3 9
     *   1 5 8
     *   2 6 4 1
     *   9 3 7 2 5
     */
    public void imprimir() {
        // BUCLE EXTERNO: recorre las filas
        for (int f = 0; f < mat.length; f++) {
            // BUCLE INTERNO: recorre los elementos de la fila f
            for (int c = 0; c < mat[f].length; c++) {
                // Imprimir elemento seguido de espacio
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
     * 1. Crear objeto (ejecuta constructor y crea estructura)
     * 2. Cargar valores aleatorios
     * 3. Imprimir array irregular completo
     * 
     * VENTAJAS DE ESTRUCTURA FIJA:
     * - No requiere entrada del usuario para dimensiones
     * - Estructura predecible y conocida
     * - Útil para patrones específicos
     */
    public static void main(String[] ar) {
        // Crear objeto: ejecuta constructor y crea estructura irregular
        ArrayIrregularFijo e = new ArrayIrregularFijo();
        
        // Cargar valores aleatorios en el array irregular
        e.cargar();
        
        // Mostrar array irregular completo
        e.imprimir();
    }
}

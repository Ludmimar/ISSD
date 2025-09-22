/*
 * EJERCICIO 07 - ARRAYS BIDIMENSIONALES INICIALIZADOS - TABLERO DE AJEDREZ
 * 
 * ENUNCIADO:
 * Crear un Array bidimensional de 8 filas por 8 columnas que represente un tablero 
 * de ajedrez. Proceder a definir y crear inmediatamente el Arreglo bidimensional 
 * indicando donde se encuentran cada pieza. Imprimir el tablero.
 * Definir un método público que permita mover una pieza de una celda cualquiera 
 * a otra celda.
 * 
 * OBJETIVO:
 * - Demostrar arrays bidimensionales inicializados
 * - Trabajar con arrays de tipo String
 * - Implementar manipulación de elementos de matriz
 * - Simular movimiento de piezas en tablero
 * 
 * CONCEPTOS CLAVE:
 * - Arrays bidimensionales inicializados
 * - Arrays de tipo String
 * - Manipulación de elementos específicos
 * - Simulación de juegos de mesa
 * - Métodos con múltiples parámetros
 */

public class TableroAjedrez {
    // Array bidimensional inicializado que representa el tablero de ajedrez
    // Sintaxis: tipo[][] nombre = {{fila1}, {fila2}, ...}
    // Cada fila contiene 8 elementos (columnas)
    private String[][] tablero = { 
        // Fila 0: Piezas negras principales
        { "TN", "CN", "AN", "DN", "RN", "AN", "CN", "TN" },
        // Fila 1: Peones negros
        { "PN", "PN", "PN", "PN", "PN", "PN", "PN", "PN" },
        // Filas 2-5: Casillas vacías
        { "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  " },
        { "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  " },
        { "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  " },
        { "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  " },
        // Fila 6: Peones blancos
        { "PB", "PB", "PB", "PB", "PB", "PB", "PB", "PB" },
        // Fila 7: Piezas blancas principales
        { "TB", "CB", "AB", "DB", "RB", "AB", "CB", "TB" }
    };

    /**
     * MÉTODO IMPRIMIR - Muestra el tablero de ajedrez
     * 
     * FUNCIONALIDAD:
     * - Recorre la matriz completa usando bucles anidados
     * - Muestra cada pieza seguida de espacio
     * - Al final de cada fila, imprime nueva línea
     * - Agrega línea separadora al final
     * 
     * CODIFICACIÓN DE PIEZAS:
     * - TN, CN, AN, DN, RN: Torre, Caballo, Alfil, Dama, Rey (Negros)
     * - PN: Peón Negro
     * - TB, CB, AB, DB, RB: Torre, Caballo, Alfil, Dama, Rey (Blancos)
     * - PB: Peón Blanco
     * - "  ": Casilla vacía
     */
    public void imprimir() {
        // BUCLE EXTERNO: recorre las filas (0 a 7)
        for (int f = 0; f < tablero.length; f++) {
            // BUCLE INTERNO: recorre las columnas (0 a 7)
            for (int c = 0; c < tablero[f].length; c++) {
                // Imprimir pieza seguida de espacio
                System.out.print(tablero[f][c] + " ");
            }
            // Nueva línea al final de cada fila
            System.out.println();
        }
        // Línea separadora para mejor presentación
        System.out.println("*******************************************************");
    }
    
    /**
     * MÉTODO MOVER - Mueve una pieza de una posición a otra
     * 
     * FUNCIONALIDAD:
     * - Copia la pieza de la posición origen a la posición destino
     * - Deja vacía la posición origen
     * - Imprime el tablero actualizado
     * 
     * PARÁMETROS:
     * @param fila - Fila de la posición origen
     * @param columna - Columna de la posición origen
     * @param filanueva - Fila de la posición destino
     * @param columnanueva - Columna de la posición destino
     * 
     * ALGORITMO DE MOVIMIENTO:
     * 1. Copiar pieza de origen a destino
     * 2. Vaciar posición origen
     * 3. Mostrar tablero actualizado
     * 
     * NOTA: No valida reglas del ajedrez, solo mueve piezas
     */
    public void mover(int fila, int columna, int filanueva, int columnanueva) {
        // Copiar pieza de posición origen a posición destino
        tablero[filanueva][columnanueva] = tablero[fila][columna];
        
        // Vaciar la posición origen
        tablero[fila][columna] = "  ";
        
        // Mostrar el tablero actualizado
        imprimir();
    }
    
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FLUJO DE EJECUCIÓN:
     * 1. Crear objeto (tablero ya está inicializado)
     * 2. Mostrar tablero inicial
     * 3. Realizar movimientos de ejemplo
     * 4. Mostrar tablero después de cada movimiento
     * 
     * MOVIMIENTOS DE EJEMPLO:
     * - Mover peón negro de (1,0) a (3,0)
     * - Mover peón blanco de (6,7) a (4,7)
     */
    public static void main(String[] args) {
        // Crear objeto: el tablero ya está inicializado con las piezas
        TableroAjedrez tablero = new TableroAjedrez();
        
        // Mostrar tablero inicial
        tablero.imprimir();
        
        // MOVIMIENTO 1: Peón negro avanza 2 casillas
        // De posición (1,0) a posición (3,0)
        tablero.mover(1, 0, 3, 0);
        
        // MOVIMIENTO 2: Peón blanco avanza 2 casillas
        // De posición (6,7) a posición (4,7)
        tablero.mover(6, 7, 4, 7);
    }
}

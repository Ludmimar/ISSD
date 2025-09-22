/*
 * EJERCICIO 05 - ALGORITMO DE ORDENAMIENTO Y MEDICIÓN DE RENDIMIENTO
 * 
 * ENUNCIADO:
 * Hacer una prueba de rendimiento o comparativa (benchmark) que permita ordenar una lista 
 * en Python y un vector en Java de 10_000 elementos enteros. Calcular el tiempo en 
 * milisegundos que requiere su ejecución.
 * 
 * OBJETIVO:
 * - Implementar algoritmo de ordenamiento burbuja
 * - Medir tiempo de ejecución usando System.currentTimeMillis()
 * - Comparar rendimiento entre Java y Python
 * - Demostrar eficiencia de Java vs Python
 * 
 * CONCEPTOS CLAVE:
 * - Algoritmo de ordenamiento burbuja
 * - Medición de tiempo: System.currentTimeMillis()
 * - Arrays grandes (10,000 elementos)
 * - Comparación de rendimiento entre lenguajes
 * - Optimización del algoritmo burbuja
 */

public class ProblemaOrdenamiento {
    // Array de 10,000 elementos para la prueba de rendimiento
    // Los guiones bajos mejoran la legibilidad del número
    private int[] array;

    /**
     * CONSTRUCTOR - Crea el array de 10,000 elementos
     * 
     * FUNCIONALIDAD:
     * - Crea array de tamaño grande para prueba de rendimiento
     * - No carga valores (se hace en método separado)
     * - Prepara el escenario para medir tiempo de ordenamiento
     */
    public ProblemaOrdenamiento() {
        // Crear array de 10,000 elementos
        // Tamaño grande para poder medir diferencias de rendimiento
        array = new int[10_000];
    }

    /**
     * MÉTODO CARGAR - Llena el array con valores aleatorios
     * 
     * FUNCIONALIDAD:
     * - Genera valores aleatorios entre 1 y 5000
     * - Llena el array completo con datos desordenados
     * - Prepara datos para el algoritmo de ordenamiento
     * 
     * RANGO DE VALORES:
     * - Math.random() * 5000 genera valores entre 0.0 y 5000.0
     * - (int) convierte a entero (0 a 4999)
     * - +1 desplaza el rango a 1-5000
     */
    public void cargar() {
        // Bucle para llenar el array con valores aleatorios
        for (int x = 0; x < array.length; x++) {
            // Genera valor aleatorio entre 1 y 5000
            array[x] = 1 + (int) (Math.random() * 5000);
        }
    }

    /**
     * MÉTODO ORDENAR - Implementa algoritmo de ordenamiento burbuja optimizado
     * 
     * FUNCIONALIDAD:
     * - Ordena el array de menor a mayor
     * - Usa algoritmo burbuja con optimización
     * - Intercambia elementos adyacentes cuando están desordenados
     * 
     * ALGORITMO BURBUJA OPTIMIZADO:
     * - Bucle externo: número de pasadas (k)
     * - Bucle interno: compara elementos adyacentes
     * - Optimización: array.length - 1 - k reduce comparaciones innecesarias
     * - Intercambio: usa variable auxiliar para swap
     * 
     * COMPLEJIDAD:
     * - Tiempo: O(n²) en el peor caso
     * - Espacio: O(1) adicional
     */
    public void ordenar() {
        // Bucle externo: número de pasadas
        for (int k = 0; k < array.length; k++) {
            // Bucle interno: compara elementos adyacentes
            // array.length - 1 - k: optimización que reduce comparaciones
            for (int f = 0; f < array.length - 1 - k; f++) {
                // Si elemento actual es mayor que el siguiente
                if (array[f] > array[f + 1]) {
                    // Intercambiar elementos usando variable auxiliar
                    int aux;
                    aux = array[f];           // Guardar valor actual
                    array[f] = array[f + 1];  // Mover siguiente a actual
                    array[f + 1] = aux;       // Mover actual a siguiente
                }
            }
        }
    }

    /**
     * MÉTODO IMPRIMIR PRIMEROS 10 - Muestra los primeros 10 elementos
     * 
     * FUNCIONALIDAD:
     * - Muestra solo los primeros 10 elementos del array
     * - Útil para verificar que el ordenamiento funcionó
     * - Evita imprimir 10,000 elementos (sería muy largo)
     * 
     * PROPÓSITO:
     * - Verificación visual del ordenamiento
     * - Muestra antes y después del ordenamiento
     */
    public void imprimirPrimeros10() {
        // Bucle para mostrar solo los primeros 10 elementos
        for (int f = 0; f < 10; f++) {
            // Imprime elemento seguido de guión y espacio
            System.out.print(array[f] + " - ");
        }
        // Nueva línea al final
        System.out.println();
    }

    /**
     * MÉTODO MAIN - Punto de entrada con medición de rendimiento
     * 
     * FLUJO DE EJECUCIÓN:
     * 1. Crear objeto y cargar datos
     * 2. Mostrar primeros 10 elementos (desordenados)
     * 3. Medir tiempo de inicio
     * 4. Ordenar el array
     * 5. Medir tiempo de fin
     * 6. Calcular y mostrar tiempo total
     * 7. Mostrar primeros 10 elementos (ordenados)
     * 
     * MEDICIÓN DE TIEMPO:
     * - System.currentTimeMillis(): tiempo actual en milisegundos
     * - Diferencia entre fin e inicio = tiempo de ejecución
     * - Resultado típico: ~96ms para 10,000 elementos en Java
     */
    public static void main(String[] args) {
        // Crear objeto y cargar datos aleatorios
        ProblemaOrdenamiento po = new ProblemaOrdenamiento();
        po.cargar();
        
        // Mostrar primeros 10 elementos antes del ordenamiento
        po.imprimirPrimeros10();
        
        // MEDICIÓN DE TIEMPO DE INICIO
        // System.currentTimeMillis() devuelve tiempo actual en milisegundos
        long milesimaInicio = System.currentTimeMillis();
        
        // EJECUTAR ALGORITMO DE ORDENAMIENTO
        po.ordenar();
        
        // MEDICIÓN DE TIEMPO DE FIN
        long milesimaFin = System.currentTimeMillis();
        
        // CALCULAR TIEMPO TOTAL DE EJECUCIÓN
        long milisegundos = (milesimaFin - milesimaInicio);
        
        // Mostrar tiempo de ejecución
        System.out.println("Tiempo de ejecucion: " + milisegundos + " ms");
        
        // Mostrar primeros 10 elementos después del ordenamiento
        po.imprimirPrimeros10();
        
        /*
         * COMPARACIÓN CON PYTHON:
         * - Python: ~7669 ms para el mismo algoritmo
         * - Java: ~96 ms para el mismo algoritmo
         * - Java es aproximadamente 80 veces más rápido
         * 
         * RAZONES DE LA DIFERENCIA:
         * - Java es compilado, Python es interpretado
         * - Java tiene optimizaciones del compilador
         * - Python tiene overhead de interpretación
         */
    }
}

/*
 * EJERCICIO 04 - ARRAYS INICIALIZADOS Y ARRAYS PARALELOS
 * 
 * ENUNCIADO:
 * Confeccionar una clase que permita definir dos vectores paralelos, en uno se almacenan 
 * los nombres de distintos paises de América del Sur y en otro la cantidad de habitantes.
 * Mostrar por pantalla los dos vectores y el nombre del país con mayor población.
 * 
 * OBJETIVO:
 * - Introducir arrays inicializados (con valores predefinidos)
 * - Demostrar arrays paralelos (relación entre elementos de mismo índice)
 * - Implementar búsqueda del elemento máximo
 * - Mostrar inicialización directa de arrays
 * 
 * CONCEPTOS CLAVE:
 * - Arrays inicializados: int[] array = {valor1, valor2, ...}
 * - Arrays paralelos: relación entre elementos de mismo índice
 * - Búsqueda de máximo: algoritmo para encontrar el mayor valor
 * - Guiones bajos en números: 45_000_000 para mejor legibilidad
 */

public class AmericaSur {
    // Array de nombres de países - INICIALIZADO DIRECTAMENTE
    // Sintaxis: tipo[] nombre = {valor1, valor2, valor3, ...}
    private String[] paises = { "Argentina", "Chile", "Uruguay", "Brasil", "Colombia" };
    
    // Array de habitantes - INICIALIZADO DIRECTAMENTE
    // Los guiones bajos (_) son ignorados por el compilador pero mejoran la legibilidad
    private int[] habitantes = { 45_000_000, 19_000_000, 3_500_000, 212_000_000, 50_000_000 };

    /**
     * MÉTODO IMPRIMIR - Muestra ambos arrays en forma paralela
     * 
     * FUNCIONALIDAD:
     * - Recorre ambos arrays simultáneamente
     * - Muestra país y su cantidad de habitantes
     * - Demuestra la relación entre arrays paralelos
     * 
     * ARRAYS PARALELOS:
     * - paises[0] corresponde a habitantes[0]
     * - paises[1] corresponde a habitantes[1]
     * - etc.
     * - Mismo índice = información relacionada
     */
    public void imprimir() {
        // Bucle que recorre ambos arrays usando el mismo índice
        // paises.length y habitantes.length deben ser iguales para arrays paralelos
        for (int x = 0; x < paises.length; x++) {
            // Imprime país y habitantes correspondientes
            // x es el índice que relaciona ambos arrays
            System.out.println(paises[x] + " - " + habitantes[x]);
        }
        
        // Línea separadora para mejor presentación
        System.out.println("-------------------------------");
    }

    /**
     * MÉTODO PAIS MAS HABITANTES - Encuentra el país con mayor población
     * 
     * FUNCIONALIDAD:
     * - Recorre el array de habitantes
     * - Encuentra la posición del valor máximo
     * - Muestra el país correspondiente a esa posición
     * 
     * ALGORITMO DE BÚSQUEDA DE MÁXIMO:
     * 1. Asumir que el primer elemento es el máximo (pos = 0)
     * 2. Recorrer desde el segundo elemento
     * 3. Si encuentra un valor mayor, actualizar la posición
     * 4. Al final, la posición contiene el índice del máximo
     */
    public void paisMasHabitantes() {
        // Variable para almacenar la posición del país con más habitantes
        // Inicializada en 0 (primer país)
        int pos = 0;
        
        // Bucle que recorre desde el segundo elemento (índice 1)
        for (int x = 1; x < habitantes.length; x++) {
            // Comparar habitantes actuales con el máximo encontrado hasta ahora
            if (habitantes[x] > habitantes[pos]) {
                // Si el actual es mayor, actualizar la posición del máximo
                pos = x;
            }
        }
        
        // Mostrar el país con mayor cantidad de habitantes
        // pos contiene el índice del país con más habitantes
        System.out.println("El pais con mayor cantidad de habitantes es:" + paises[pos]);
    }

    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FLUJO DE EJECUCIÓN:
     * 1. Crear objeto (arrays ya están inicializados)
     * 2. Imprimir países y habitantes
     * 3. Encontrar y mostrar país con mayor población
     * 
     * VENTAJAS DE ARRAYS INICIALIZADOS:
     * - No necesitan entrada de datos del usuario
     * - Valores predefinidos y conocidos
     * - Útiles para datos constantes o de referencia
     */
    public static void main(String[] args) {
        // Crear objeto: los arrays ya están inicializados con valores
        AmericaSur america = new AmericaSur();
        
        // Mostrar todos los países y sus habitantes
        america.imprimir();
        
        // Encontrar y mostrar el país con mayor población
        america.paisMasHabitantes();
    }
}

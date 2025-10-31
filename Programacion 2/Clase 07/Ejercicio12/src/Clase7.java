/*
 * EJERCICIO 12 - MAPAS - SORTEDMAP CON TREEMAP
 * 
 * ENUNCIADO:
 * Declarar un TreeMap con llaves de tipo Integer y values de tipo String. Agregar al mapa 
 * los siguientes elementos en el orden que se propone:
 * 
 * Key    Value
 * 3      "Tres"
 * 2      "Dos"
 * 44     "Cuarenta y Cuatro"
 * 
 * Imprimir los contenidos del mapa utilizando un ciclo for y discutir el resultado impreso.
 * 
 * CONCEPTO CLAVE: MAPAS - SORTEDMAP Y TREEMAP
 * - TreeMap: Implementa SortedMap
 * - Mantiene orden natural de las llaves
 * - Para números: orden ascendente (menor a mayor)
 * - Para String: orden alfabético
 * - Orden automático independiente del orden de inserción
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear TreeMap
 * 2. Agregar elementos en orden desordenado
 * 3. Iterar e imprimir (debe mostrar ordenado)
 */

import java.util.SortedMap;
import java.util.TreeMap;

public class Clase7 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Crea TreeMap y agrega elementos
     * - Demuestra orden automático
     */
    public static void main(String[] args) {
        // Crear TreeMap
        // SortedMap mantiene orden natural de las llaves
        SortedMap<Integer, String> treeMap = new TreeMap<>();
        
        // Agregar elementos en orden desordenado
        treeMap.put(3, "Tres");
        treeMap.put(2, "Dos");
        treeMap.put(44, "Cuarenta y Cuatro");
        
        // Imprimir contenidos del mapa
        // Debe mostrar ordenado por llave (2, 3, 44)
        System.out.println("=== TREEMAP (Orden Natural) ===\n");
        for (Integer key : treeMap.keySet()) {
            System.out.println(key + " > " + treeMap.get(key));
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. TREEMAP:
         *    - Implementa SortedMap automáticamente
         *    - Mantiene orden natural de las llaves
         *    - Para Integer: orden numérico ascendente
         * 
         * 2. ORDEN NATURAL:
         *    - Números: de menor a mayor (2, 3, 44)
         *    - String: alfabético (a-z)
         *    - Fechas: cronológico
         * 
         * 3. ORDEN DE INSERCIÓN:
         *    - No importa el orden en que se inserten
         *    - Siempre se mantiene orden natural
         *    - Se insertó 3, 2, 44 pero se imprime 2, 3, 44
         * 
         * 4. VENTAJAS:
         *    - Siempre ordenado
         *    - Útil para rangos (firstKey, lastKey, subMap)
         *    - Búsqueda en orden
         * 
         * 5. DESVENTAJAS:
         *    - Más lento que HashMap para operaciones básicas
         *    - Requiere que las llaves sean comparables
         * 
         * 6. RESULTADO ESPERADO:
         *    - 2 > Dos
         *    - 3 > Tres
         *    - 44 > Cuarenta y Cuatro
         *    - Orden ascendente por llave
         */
    }
}


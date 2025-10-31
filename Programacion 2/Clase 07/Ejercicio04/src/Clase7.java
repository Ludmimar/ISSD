/*
 * EJERCICIO 04 - MAPAS - HASHMAP VS LINKEDHASHMAP
 * 
 * ENUNCIADO:
 * Experimentar la diferencia entre HashMap y LinkedHashMap utilizando iteradores 
 * para mostrar el orden de los elementos. Definir dos mapas y cargar, con un ciclo 
 * de iteración en ambos, 5 números (keys) y apellidos (values).
 * 
 * CONCEPTO CLAVE: MAPAS - ORDEN DE ELEMENTOS
 * - HashMap: No preserva orden de inserción
 * - LinkedHashMap: Preserva orden de inserción
 * - La elección depende de si necesitas orden o rendimiento
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear HashMap y LinkedHashMap
 * 2. Cargar mismos datos en ambos
 * 3. Imprimir contenidos y comparar orden
 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Clase7 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Compara orden de HashMap y LinkedHashMap
     * - Demuestra diferencia en preservación de orden
     */
    public static void main(String[] args) {
        // Crear Scanner para entrada de datos
        Scanner teclado = new Scanner(System.in);
        
        // Crear HashMap (no preserva orden)
        Map<Integer, String> apellidosMap = new HashMap<>();
        
        // Crear LinkedHashMap (preserva orden de inserción)
        Map<Integer, String> apellidosLinkedMap = new LinkedHashMap<>();
        
        // Cargar datos en ambos mapas
        System.out.println("Ingrese 5 apellidos:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Apellido " + (i + 1) + ": ");
            String apellido = teclado.nextLine();
            
            // Agregar a ambos mapas con el mismo índice como llave
            apellidosMap.put(i, apellido);
            apellidosLinkedMap.put(i, apellido);
        }
        
        // Imprimir contenidos de HashMap
        System.out.println("\n=== HashMap (orden no garantizado) ===");
        for (Integer index : apellidosMap.keySet()) {
            System.out.println(index + " - " + apellidosMap.get(index));
        }
        
        // Imprimir contenidos de LinkedHashMap
        System.out.println("\n=== LinkedHashMap (orden de inserción) ===");
        for (Integer index : apellidosLinkedMap.keySet()) {
            System.out.println(index + " - " + apellidosLinkedMap.get(index));
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. HASHMAP:
         *    - No garantiza orden de inserción
         *    - Más rápido para operaciones básicas
         *    - Utiliza función hash para almacenamiento
         *    - El orden puede variar entre ejecuciones
         * 
         * 2. LINKEDHASHMAP:
         *    - Preserva orden de inserción
         *    - Ligeramente más lento que HashMap
         *    - Mantiene lista doblemente enlazada
         *    - Útil cuando el orden es importante
         * 
         * 3. ITERACIÓN:
         *    - keySet() devuelve conjunto de llaves
         *    - for-each itera sobre las llaves
         *    - LinkedHashMap itera en orden de inserción
         * 
         * 4. CUANDO USAR:
         *    - HashMap: Si no importa el orden y necesitas velocidad
         *    - LinkedHashMap: Si necesitas mantener orden de inserción
         * 
         * 5. RESULTADO ESPERADO:
         *    - HashMap: orden aleatorio o diferente
         *    - LinkedHashMap: orden 0, 1, 2, 3, 4 (orden de inserción)
         */
    }
}


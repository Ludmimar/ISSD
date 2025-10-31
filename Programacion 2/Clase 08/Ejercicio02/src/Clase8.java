/*
 * EJERCICIO 02 - SETS - HASHSET BÁSICO
 * 
 * ENUNCIADO:
 * Modelar el siguiente conjunto en un HashSet:
 * Formas = {Cuadrado, Círculo, Rombo, Triángulo}
 * Luego, obtener e imprimir el tamaño del mismo.
 * 
 * CONCEPTO CLAVE: SETS - HASHSET
 * - HashSet es la implementación más común de Set
 * - No garantiza orden de elementos
 * - Eficiente para operaciones básicas (add, remove, contains)
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear HashSet de formas
 * 2. Agregar formas geométricas
 * 3. Imprimir tamaño del conjunto
 */

import java.util.Set;
import java.util.HashSet;

public class Clase8 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Crea HashSet de formas geométricas
     * - Muestra el tamaño del conjunto
     */
    public static void main(String[] args) {
        // Crear HashSet de formas geométricas
        Set<String> formas = new HashSet<>();
        
        // Agregar las formas al HashSet
        formas.add("Cuadrado");
        formas.add("Círculo");
        formas.add("Rombo");
        formas.add("Triángulo");
        
        // Imprimir el tamaño del HashSet
        System.out.println("=== CONJUNTO DE FORMAS ===");
        System.out.println("El tamaño del conjunto de formas es: " + formas.size());
        
        // Mostrar los elementos del conjunto
        System.out.println("\nFormas en el conjunto:");
        for (String forma : formas) {
            System.out.println("- " + forma);
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. HASHSET:
         *    - Implementación de Set basada en tabla hash
         *    - No garantiza orden de elementos
         *    - Operaciones básicas son O(1) promedio
         * 
         * 2. DECLARACIÓN:
         *    - Set<String> formas = new HashSet<>();
         *    - Usar interface Set en la declaración (buena práctica)
         *    - new HashSet<>() crea la implementación
         * 
         * 3. ORDEN:
         *    - Los elementos pueden no estar en orden de inserción
         *    - Si necesitas orden: usar LinkedHashSet o TreeSet
         */
    }
}


/*
 * EJERCICIO 03 - SETS - ELEMENTOS DUPLICADOS EN HASHSET
 * 
 * ENUNCIADO:
 * Utilizando el conjunto del problema anterior, luego de imprimir el tamaño ejecutaremos 
 * el método add con cada uno de los siguientes elementos: "Rombo", "Pentágono" y "Rectángulo". 
 * Luego, imprimir el tamaño nuevamente.
 * 
 * RESULTADO ESPERADO:
 * El tamaño del conjunto de formas es: 4
 * El tamaño del conjunto de formas es: 6
 * 
 * A pesar de ejecutar add() tres veces, solo 2 objetos fueron incorporados porque "Rombo" 
 * ya existía en el conjunto.
 * 
 * CONCEPTO CLAVE: SETS - PREVENCIÓN DE DUPLICADOS
 * - El método add() retorna false si el elemento ya existe
 * - Los duplicados no se agregan automáticamente
 * - El tamaño solo aumenta con elementos nuevos
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear HashSet con formas iniciales
 * 2. Imprimir tamaño inicial
 * 3. Intentar agregar elementos (algunos duplicados)
 * 4. Imprimir tamaño final
 */

import java.util.Set;
import java.util.HashSet;

public class Clase8 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Demuestra que duplicados no se agregan
     * - Muestra el comportamiento del tamaño
     */
    public static void main(String[] args) {
        // Crear HashSet de formas geométricas
        Set<String> formas = new HashSet<>();
        
        // Agregar las formas iniciales al HashSet
        formas.add("Cuadrado");
        formas.add("Círculo");
        formas.add("Rombo");
        formas.add("Triángulo");
        
        // Imprimir el tamaño del HashSet inicial
        System.out.println("=== CONJUNTO DE FORMAS ===");
        System.out.println("Formas iniciales: " + formas);
        System.out.println("El tamaño del conjunto de formas es: " + formas.size());
        
        // Intentar agregar elementos nuevos y duplicados
        System.out.println("\nIntentando agregar: 'Rombo', 'Pentágono', 'Rectángulo'");
        
        boolean agregado1 = formas.add("Rombo");      // Ya existe, no se agrega
        boolean agregado2 = formas.add("Pentágono");   // Nuevo, se agrega
        boolean agregado3 = formas.add("Rectángulo");  // Nuevo, se agrega
        
        System.out.println("'Rombo' agregado? " + agregado1 + " (ya existía)");
        System.out.println("'Pentágono' agregado? " + agregado2);
        System.out.println("'Rectángulo' agregado? " + agregado3);
        
        // Imprimir el tamaño del HashSet después de agregar
        System.out.println("\nFormas finales: " + formas);
        System.out.println("El tamaño del conjunto de formas es: " + formas.size());
        
        System.out.println("\nCONCLUSIÓN: Solo se agregaron 2 elementos nuevos.");
        System.out.println("A pesar de ejecutar add() 3 veces, 'Rombo' ya existía.");
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. PREVENCIÓN DE DUPLICADOS:
         *    - HashSet automáticamente previene duplicados
         *    - Usa equals() para determinar si un elemento ya existe
         *    - No necesitas verificar manualmente
         * 
         * 2. MÉTODO add():
         *    - Retorna true si el elemento se agregó
         *    - Retorna false si el elemento ya existía
         *    - Útil para verificar si fue agregado
         * 
         * 3. TAMAÑO:
         *    - Solo aumenta cuando se agrega un elemento nuevo
         *    - Los duplicados no afectan el tamaño
         *    - Tamaño = cantidad de elementos únicos
         */
    }
}


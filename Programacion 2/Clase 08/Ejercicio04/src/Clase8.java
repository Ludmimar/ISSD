/*
 * EJERCICIO 04 - SETS - MÉTODO CONTAINS() Y EQUALS()
 * 
 * ENUNCIADO:
 * Demostrar cómo funciona contains() y equals() con Sets.
 * 
 * Ejemplos:
 * - Set de números enteros con contains()
 * - Set de Strings con contains() (case-sensitive)
 * - Comparación de equals() para Strings
 * 
 * CONCEPTO CLAVE: SETS - BÚSQUEDA Y COMPARACIÓN
 * - contains(): Verifica si un elemento está en el Set
 * - equals(): Compara si dos elementos son iguales
 * - Case-sensitive: "issd" ≠ "ISSD" para Strings
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear Sets de números y Strings
 * 2. Demostrar contains()
 * 3. Demostrar equals() y case-sensitivity
 */

import java.util.Set;
import java.util.HashSet;

public class Clase8 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Demuestra contains() con números
     * - Demuestra contains() y equals() con Strings
     */
    public static void main(String[] args) {
        // === EJEMPLO 1: SET DE NÚMEROS ===
        System.out.println("=== EJEMPLO 1: SET DE NÚMEROS ===\n");
        
        // Instanciar un Set de números enteros
        Set<Integer> numeros = new HashSet<>();
        
        // Agregar 25123 al Set
        numeros.add(25123);
        
        // Preguntar si el Set contiene el número 25123
        System.out.println("El Set contiene 25123?: " + numeros.contains(25123));
        
        // === EJEMPLO 2: SET DE STRINGS ===
        System.out.println("\n=== EJEMPLO 2: SET DE STRINGS ===\n");
        
        // Instanciar un Set de Strings
        Set<String> palabras = new HashSet<>();
        
        // Agregar "issd" al Set
        palabras.add("issd");
        
        // Preguntar si el Set contiene el string "issd"
        System.out.println("El Set contiene \"issd\"?: " + palabras.contains("issd"));
        
        // Preguntar si el Set contiene el string "ISSD" (mayúsculas)
        System.out.println("El Set contiene \"ISSD\"?: " + palabras.contains("ISSD"));
        
        // === EJEMPLO 3: COMPARACIÓN CON EQUALS() ===
        System.out.println("\n=== EJEMPLO 3: COMPARACIÓN CON EQUALS() ===\n");
        
        // Efectivamente, "issd" es igual a "issd" mediante el método .equals()
        System.out.println("\"issd\".equals(\"issd\"): " + "issd".equals("issd"));
        
        // No así para "ISSD"
        System.out.println("\"ISSD\".equals(\"issd\"): " + "ISSD".equals("issd"));
        
        // Comparación case-insensitive (alternativa)
        System.out.println("\"ISSD\".equalsIgnoreCase(\"issd\"): " + "ISSD".equalsIgnoreCase("issd"));
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. MÉTODO contains():
         *    - Verifica si un elemento está en el Set
         *    - Usa equals() internamente para comparar
         *    - Retorna true o false
         * 
         * 2. CASE-SENSITIVE:
         *    - Strings son case-sensitive por defecto
         *    - "issd" ≠ "ISSD"
         *    - Usar equalsIgnoreCase() si necesitas comparación sin mayúsculas
         * 
         * 3. EQUALS():
         *    - Compara si dos objetos son iguales
         *    - Para Strings: compara caracter por caracter
         *    - Para números: compara valores
         * 
         * 4. CÓMO FUNCIONA contains():
         *    - Para cada elemento en el Set, llama a elemento.equals(buscado)
         *    - Si alguna comparación retorna true, contains() retorna true
         *    - Eficiente gracias a la estructura hash
         */
    }
}


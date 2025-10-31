/*
 * EJERCICIO 03 - EXCEPCIONES - ARRAY FUERA DE RANGO
 * 
 * ENUNCIADO (Problemas 2 y 3):
 * Analiza el siguiente código y sin ejecutarlo, deducir y justificar: 
 * ¿qué debería imprimir por consola?
 * 
 * Problema 2:
 * System.out.print("A");
 * try {
 *     int[] array = new int[5];
 *     System.out.print("B");
 *     array[6] = 10;
 * } catch (Exception e) {
 *     System.out.print("C");
 * }
 * System.out.print("D");
 * 
 * Problema 3:
 * System.out.print("A");
 * try {
 *     int[] array = new int[5];
 *     array[6] = 10;
 *     System.out.print("B");
 * } catch (Exception e) {
 *     System.out.print("C");
 * }
 * System.out.print("D");
 * 
 * CONCEPTO CLAVE: EXCEPCIONES - CUÁNDO SE DETIENE EL TRY
 * - El código en try se ejecuta secuencialmente
 * - Cuando hay excepción, el resto del try no se ejecuta
 * - Salta directamente al bloque catch
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Ejecutar instrucciones en try hasta encontrar excepción
 * 2. Si hay excepción: saltar a catch inmediatamente
 * 3. Las instrucciones después de la excepción NO se ejecutan
 */

public class Clase9 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Analiza y ejecuta los problemas 2 y 3
     * - Demuestra cuándo se detiene la ejecución en try
     */
    public static void main(String[] args) {
        // === PROBLEMA 2 ===
        System.out.println("=== PROBLEMA 2 ===");
        System.out.println("Código: System.out.print(\"B\") ANTES de array[6] = 10;\n");
        System.out.print("Resultado: ");
        
        System.out.print("A");
        try {
            int[] array = new int[5];
            System.out.print("B");
            array[6] = 10;
        } catch (Exception e) {
            System.out.print("C");
        }
        System.out.print("D");
        
        System.out.println("\n\nRESPUESTA: El programa debería imprimir \"ABCD\"");
        System.out.println("\nJustificación:");
        System.out.println("1. Imprime 'A' (fuera de try-catch)");
        System.out.println("2. int[] array = new int[5]; → se ejecuta sin problemas");
        System.out.println("3. System.out.print(\"B\"); → se ejecuta antes de la excepción");
        System.out.println("   → Imprime 'B'");
        System.out.println("4. array[6] = 10; → genera ArrayIndexOutOfBoundsException");
        System.out.println("   → Salta a catch, imprime 'C'");
        System.out.println("5. System.out.print(\"D\"); → fuera de try-catch");
        System.out.println("   → Imprime 'D'");
        System.out.println("\nResultado: ABCD");
        
        // === PROBLEMA 3 ===
        System.out.println("\n\n=== PROBLEMA 3 ===");
        System.out.println("Código: array[6] = 10; ANTES de System.out.print(\"B\");\n");
        System.out.print("Resultado: ");
        
        System.out.print("A");
        try {
            int[] array = new int[5];
            array[6] = 10;
            System.out.print("B");
        } catch (Exception e) {
            System.out.print("C");
        }
        System.out.print("D");
        
        System.out.println("\n\nRESPUESTA: El programa debería imprimir \"ACD\"");
        System.out.println("\nJustificación:");
        System.out.println("1. Imprime 'A' (fuera de try-catch)");
        System.out.println("2. int[] array = new int[5]; → se ejecuta sin problemas");
        System.out.println("3. array[6] = 10; → genera ArrayIndexOutOfBoundsException");
        System.out.println("   → Salta inmediatamente a catch, IGNORANDO System.out.print(\"B\")");
        System.out.println("   → Imprime 'C'");
        System.out.println("4. System.out.print(\"D\"); → fuera de try-catch");
        System.out.println("   → Imprime 'D'");
        System.out.println("\nResultado: ACD");
        
        System.out.println("\n=== CONCLUSIÓN ===");
        System.out.println("El orden de las instrucciones en el try importa!");
        System.out.println("Si la excepción ocurre antes de una instrucción, esa");
        System.out.println("instrucción NO se ejecuta.");
    }
}


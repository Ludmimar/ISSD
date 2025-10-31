/*
 * EJERCICIO 07 - EXCEPCIONES - MÚLTIPLES TIPOS DE EXCEPCIONES
 * 
 * ENUNCIADO:
 * Demostrar cómo capturar diferentes tipos de excepciones con múltiples bloques catch.
 * 
 * Ejemplo del documento:
 * - División por cero (ArithmeticException)
 * - Array fuera de rango (ArrayIndexOutOfBoundsException)
 * - Capturar cada tipo con mensaje específico
 * 
 * CONCEPTO CLAVE: EXCEPCIONES - MÚLTIPLES CATCH
 * - Se pueden tener múltiples bloques catch
 * - Cada catch maneja un tipo específico de excepción
 * - Orden: de más específica a más general
 * - Permite acciones diferentes según el tipo de error
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Ejecutar código en try
 * 2. Si hay excepción, buscar catch que coincida con el tipo
 * 3. Ejecutar el catch correspondiente
 * 4. Ignorar otros catch si se encontró coincidencia
 */

public class Clase9 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Genera diferentes tipos de excepciones
     * - Captura cada tipo con catch específico
     */
    public static void main(String[] args) {
        System.out.println("=== MÚLTIPLES TIPOS DE EXCEPCIONES ===\n");
        
        int numerador = 1200;
        int[] denominadores = new int[]{-3, -2, -1, 0, 1, 2, 3};
        
        System.out.println("--- Con catch genérico (Exception) ---");
        // Usar catch genérico captura TODAS las excepciones
        for (int i = 0; i < 8; i++) {
            try {
                System.out.println(numerador / denominadores[i]);
            } catch (Exception e) {
                System.out.println("Cuidado! división por cero");
            }
        }
        
        System.out.println("\nObservación: El mensaje aparece 2 veces:");
        System.out.println("1. División por cero (índice 3: denominadores[3] = 0)");
        System.out.println("2. Array fuera de rango (índice 7: array tiene 7 elementos, índices 0-6)");
        System.out.println("   Pero el catch genérico captura ambas como 'división por cero'");
        
        System.out.println("\n--- Con catch específicos ---");
        // Usar catch específicos para cada tipo de excepción
        for (int i = 0; i < 8; i++) {
            try {
                System.out.println(numerador / denominadores[i]);
            } catch (ArithmeticException e1) {
                System.out.println("Cuidado! división por cero");
            } catch (ArrayIndexOutOfBoundsException e2) {
                System.out.println("Cuidado! Tratando de acceder a un índice fuera del array!");
            }
        }
        
        System.out.println("\nObservación: Ahora cada excepción tiene su mensaje específico:");
        System.out.println("- ArithmeticException: 'división por cero'");
        System.out.println("- ArrayIndexOutOfBoundsException: 'índice fuera del array'");
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. MÚLTIPLES CATCH:
         *    - Se pueden tener varios bloques catch
         *    - Cada uno maneja un tipo específico de excepción
         *    - Solo se ejecuta el catch que coincide con el tipo
         * 
         * 2. ORDEN DE CATCH:
         *    - De más específica a más general
         *    - Si pones Exception primero, captura todo
         *    - Los catch más específicos deben ir primero
         * 
         * 3. VENTAJAS:
         *    - Mensajes más descriptivos según el error
         *    - Acciones diferentes según el tipo
         *    - Mejor diagnóstico de problemas
         * 
         * 4. TIPOS DE EXCEPCIONES:
         *    - ArithmeticException: operaciones matemáticas inválidas
         *    - ArrayIndexOutOfBoundsException: índice fuera de rango
         *    - NumberFormatException: conversión fallida
         *    - NullPointerException: acceso a objeto null
         */
    }
}


/*
 * EJERCICIO 08 - EXCEPCIONES - FINALLY
 * 
 * ENUNCIADO (Problemas 5, 6, 7):
 * Analizar el flujo de ejecución con bloques finally.
 * 
 * Problema 5:
 * System.out.print("A");
 * try {
 *     int[] array = new int[5];
 *     array[6] = 10;
 *     System.out.print("B");
 * } catch (Exception e) {
 *     System.out.print("C");
 * } finally {
 *     System.out.print("D");
 * }
 * 
 * Problema 6:
 * ... (similar con System.out.print("E") al final)
 * 
 * Problema 7:
 * ... (con múltiples catch y finally)
 * 
 * CONCEPTO CLAVE: EXCEPCIONES - CLAUSULA FINALLY
 * - El bloque finally SIEMPRE se ejecuta
 * - Se ejecuta incluso si hay return en try o catch
 * - Útil para limpieza de recursos
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Ejecutar try
 * 2. Si hay excepción: ejecutar catch
 * 3. SIEMPRE ejecutar finally
 * 4. Continuar después del bloque try-catch-finally
 */

public class Clase9 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Demuestra ejecución de finally en diferentes escenarios
     */
    public static void main(String[] args) {
        // === PROBLEMA 5 ===
        System.out.println("=== PROBLEMA 5 ===");
        System.out.print("Resultado: ");
        
        System.out.print("A");
        try {
            int[] array = new int[5];
            array[6] = 10;
            System.out.print("B");
        } catch (Exception e) {
            System.out.print("C");
        } finally {
            System.out.print("D");
        }
        
        System.out.println("\n\nRESPUESTA: ACD");
        System.out.println("Justificación:");
        System.out.println("1. 'A' se imprime (fuera de try-catch)");
        System.out.println("2. array[6] genera excepción → salta a catch → 'C'");
        System.out.println("3. 'B' NO se imprime (después de la excepción)");
        System.out.println("4. finally SIEMPRE se ejecuta → 'D'");
        
        // === PROBLEMA 6 ===
        System.out.println("\n\n=== PROBLEMA 6 ===");
        System.out.print("Resultado: ");
        
        System.out.print("A");
        try {
            int[] array = new int[5];
            System.out.print("B");
            array[6] = 10;
        } catch (Exception e) {
            System.out.print("C");
        } finally {
            System.out.print("D");
        }
        System.out.print("E");
        
        System.out.println("\n\nRESPUESTA: ABCDE");
        System.out.println("Justificación:");
        System.out.println("1. 'A' se imprime (fuera)");
        System.out.println("2. 'B' se imprime (antes de la excepción)");
        System.out.println("3. array[6] genera excepción → catch → 'C'");
        System.out.println("4. finally SIEMPRE se ejecuta → 'D'");
        System.out.println("5. 'E' se imprime (después del bloque)");
        
        // === PROBLEMA 7 ===
        System.out.println("\n\n=== PROBLEMA 7 ===");
        System.out.print("Resultado: ");
        
        System.out.print("A");
        try {
            int[] array = new int[5];
            System.out.print("B");
            array[6] = 10;
        } catch (ArithmeticException e1) {
            System.out.print("C");
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.print("D");
        } finally {
            System.out.print("E");
        }
        System.out.print("F");
        
        System.out.println("\n\nRESPUESTA: ABDEF");
        System.out.println("Justificación:");
        System.out.println("1. 'A' se imprime (fuera)");
        System.out.println("2. 'B' se imprime (antes de la excepción)");
        System.out.println("3. array[6] genera ArrayIndexOutOfBoundsException");
        System.out.println("   → catch específico → 'D' (no 'C', que es para ArithmeticException)");
        System.out.println("4. finally SIEMPRE se ejecuta → 'E'");
        System.out.println("5. 'F' se imprime (después del bloque)");
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. FINALLY:
         *    - SIEMPRE se ejecuta, sin importar si hay excepción o no
         *    - Se ejecuta incluso si hay return en try o catch
         *    - Útil para limpieza: cerrar archivos, conexiones, etc.
         * 
         * 2. ORDEN DE EJECUCIÓN:
         *    - try → (excepción?) → catch → finally → después del bloque
         *    - finally NO evita que el programa continúe
         * 
         * 3. USOS COMUNES:
         *    - Cerrar recursos abiertos
         *    - Liberar memoria
         *    - Reseteo de variables
         *    - Logging final
         */
    }
}


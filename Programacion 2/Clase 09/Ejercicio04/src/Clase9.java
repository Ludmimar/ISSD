/*
 * EJERCICIO 04 - EXCEPCIONES - STACKTRACE Y GETMESSAGE()
 * 
 * ENUNCIADO:
 * Demostrar cómo obtener información de una excepción usando:
 * - printStackTrace(): Muestra el stack trace completo
 * - getMessage(): Obtiene el mensaje de error
 * 
 * CONCEPTO CLAVE: EXCEPCIONES - INFORMACIÓN DE ERRORES
 * - printStackTrace(): Imprime el stack trace completo con líneas
 * - getMessage(): Obtiene solo el mensaje descriptivo
 * - Útil para debugging y diagnóstico de problemas
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Generar excepción en try
 * 2. Capturar en catch
 * 3. Mostrar información usando métodos de Exception
 */

import java.util.Random;

public class Clase9 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Genera excepción de array fuera de rango
     * - Demuestra printStackTrace() y getMessage()
     */
    public static void main(String[] args) {
        System.out.println("=== EJEMPLO: ARRAY FUERA DE RANGO ===\n");
        
        // === SIN TRY-CATCH (FALLA) ===
        System.out.println("--- Sin try-catch (el programa falla) ---");
        System.out.println("(Código comentado para evitar detener ejecución)");
        System.out.println("Exception in thread \"main\" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5");
        
        // === CON TRY-CATCH SIN INFORMACIÓN ===
        System.out.println("\n--- Con try-catch (sin información) ---");
        try {
            int[] arrayDeEnteros = new int[5];
            for (int i = 0; i < 10; i++) {
                arrayDeEnteros[i] = i;
            }
            System.out.println("Números enteros del 0 al 9: ");
            for (int i = 0; i < 10; i++) {
                System.out.println("Elemento en el indice " + i + ": " + arrayDeEnteros[i]);
            }
        } catch (Exception e) {
            // Bloque catch vacío - oculta el problema
        }
        
        System.out.println("\nEl programa continúa pero perdimos información del error.\n");
        
        // === CON PRINTSTACKTRACE() ===
        System.out.println("--- Con printStackTrace() ---");
        try {
            int[] arrayDeEnteros = new int[5];
            for (int i = 0; i < 10; i++) {
                arrayDeEnteros[i] = i;
            }
            System.out.println("Números enteros del 0 al 9: ");
            for (int i = 0; i < 10; i++) {
                System.out.println("Elemento en el indice " + i + ": " + arrayDeEnteros[i]);
            }
        } catch (Exception e) {
            System.out.println("Ocurrió una excepción:");
            e.printStackTrace(); // Imprime stack trace completo
        }
        
        // Continuar con otra parte del programa
        double[] arrayDeDoubles = new double[10];
        for (int i = 0; i < 10; i++) {
            arrayDeDoubles[i] = new Random().nextDouble();
        }
        System.out.println("\nNúmeros double aleatorios: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Elemento en el indice " + i + ": " + arrayDeDoubles[i]);
        }
        
        // === CON GETMESSAGE() ===
        System.out.println("\n--- Con getMessage() ---");
        try {
            int[] arrayDeEnteros = new int[5];
            for (int i = 0; i < 10; i++) {
                arrayDeEnteros[i] = i;
            }
        } catch (Exception e) {
            System.out.println("Problemas!!!");
            System.out.println(e.getMessage()); // Solo el mensaje, sin stack trace
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. PRINTSTACKTRACE():
         *    - Muestra información completa: tipo, mensaje, línea, stack
         *    - Útil para debugging y encontrar el origen del error
         *    - Más detallado pero verboso
         * 
         * 2. GETMESSAGE():
         *    - Solo muestra el mensaje descriptivo del error
         *    - Más conciso, menos información técnica
         *    - Útil para mensajes al usuario
         * 
         * 3. DIFERENCIA:
         *    - printStackTrace(): "java.lang.ArrayIndexOutOfBoundsException: Index 5..."
         *      + stack completo con líneas de código
         *    - getMessage(): "Index 5 out of bounds for length 5"
         *      (solo el mensaje)
         * 
         * 4. USO RECOMENDADO:
         *    - Desarrollo: usar printStackTrace() para debugging
         *    - Producción: usar getMessage() para mensajes al usuario
         */
    }
}


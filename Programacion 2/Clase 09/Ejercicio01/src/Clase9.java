/*
 * EJERCICIO 01 - EXCEPCIONES - DIVISIÓN POR CERO
 * 
 * ENUNCIADO:
 * Intentar ejecutar una división por cero y capturar la excepción.
 * 
 * Ejemplo del documento:
 * - int a = 10;
 * - int b = 0;
 * - System.out.println("El resultado de la división es: " + a/b);
 * 
 * CONCEPTO CLAVE: EXCEPCIONES - TRY-CATCH BÁSICO
 * - Las excepciones interrumpen el flujo normal del programa
 * - try-catch permite capturar y manejar excepciones
 * - ArithmeticException: división por cero
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Intentar ejecutar código que puede fallar
 * 2. Si hay excepción, salta al bloque catch
 * 3. Código después de try-catch continúa normalmente
 */

public class Clase9 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Demuestra división por cero sin try-catch (falla)
     * - Demuestra división por cero con try-catch (manejado)
     * - Demuestra división normal (sin excepción)
     */
    public static void main(String[] args) {
        System.out.println("=== EJEMPLO 1: SIN TRY-CATCH (FALLA) ===\n");
        
        // Este código generará una excepción y detendrá el programa
        // Descomentar para ver el error:
        /*
        int a = 10;
        int b = 0;
        System.out.println("El resultado de la división es: " + (a / b));
        */
        System.out.println("(Código comentado - descomentar para ver excepción)");
        System.out.println("Exception in thread \"main\" java.lang.ArithmeticException: / by zero");
        
        System.out.println("\n=== EJEMPLO 2: CON TRY-CATCH (MANEJADO) ===\n");
        
        // Capturar la excepción con try-catch
        try {
            int a = 10;
            int b = 0;
            System.out.println("Dividiremos " + a + " por " + b);
            System.out.println("El resultado de la división es: " + (a / b));
            System.out.println("División finalizada");
        } catch (Exception e) {
            System.out.println("El programa sufrió una excepción!");
        }
        
        System.out.println("\n=== EJEMPLO 3: SIN EXCEPCIÓN ===\n");
        
        // División normal que no genera excepción
        try {
            int a = 10;
            int b = 2;
            System.out.println("Dividiremos " + a + " por " + b);
            System.out.println("El resultado de la división es: " + (a / b));
            System.out.println("División finalizada");
        } catch (Exception e) {
            System.out.println("El programa sufrió una excepción!");
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. BLOQUE TRY:
         *    - Contiene código que puede generar excepción
         *    - Se ejecuta normalmente hasta encontrar una excepción
         *    - Si hay excepción, el resto del código en try no se ejecuta
         * 
         * 2. BLOQUE CATCH:
         *    - Se ejecuta solo si hay excepción en try
         *    - Recibe el objeto Exception con información del error
         *    - Permite manejar el error sin detener el programa
         * 
         * 3. FLUJO DE EJECUCIÓN:
         *    - Sin excepción: ejecuta todo el try, ignora catch
         *    - Con excepción: ejecuta try hasta la excepción, luego catch
         *    - Después de try-catch: continúa normalmente
         * 
         * 4. ARITHMETICEXCEPTION:
         *    - Se lanza cuando hay división por cero
         *    - Es una excepción unchecked (no requiere manejo)
         *    - Pero es buena práctica manejarla
         */
    }
}


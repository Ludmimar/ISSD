/*
 * EJERCICIO 09 - EXCEPCIONES - THROWS Y PROPAGACIÓN
 * 
 * ENUNCIADO (Problemas 8 y 9):
 * Analizar cómo funciona la propagación de excepciones con throws.
 * 
 * Problema 8:
 * - método() arroja IndexOutOfBoundsException
 * - método() no la captura (solo tiene catch para ArithmeticException)
 * - main() captura IndexOutOfBoundsException
 * 
 * Problema 9:
 * - Similar pero método() SÍ captura IndexOutOfBoundsException
 * 
 * CONCEPTO CLAVE: EXCEPCIONES - THROWS Y PROPAGACIÓN
 * - throws: Declara que un método puede lanzar una excepción
 * - Propagación: La excepción se propaga al método llamador
 * - Si no se captura, se propaga hacia arriba en la pila de llamadas
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Método lanza excepción
 * 2. Si no se captura, se propaga al método llamador
 * 3. El método llamador debe capturarla o declararla con throws
 */

public class Clase9 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Demuestra propagación de excepciones
     * - Compara con y sin captura en método llamado
     */
    public static void main(String[] args) {
        // === PROBLEMA 8 ===
        System.out.println("=== PROBLEMA 8: Excepción NO capturada en metodo() ===\n");
        System.out.print("Resultado: ");
        
        System.out.print("A");
        try {
            metodo8();
        } catch (IndexOutOfBoundsException e2) {
            System.out.print("B");
        } finally {
            System.out.print("C");
        }
        System.out.print("D");
        
        System.out.println("\n\nRESPUESTA: AEBCD");
        System.out.println("Justificación:");
        System.out.println("1. 'A' se imprime (fuera de try)");
        System.out.println("2. Se llama metodo8()");
        System.out.println("3. metodo8() genera IndexOutOfBoundsException");
        System.out.println("4. metodo8() NO la captura (solo captura ArithmeticException)");
        System.out.println("5. La excepción se PROPAGA a main()");
        System.out.println("6. main() captura IndexOutOfBoundsException → 'B'");
        System.out.println("7. finally se ejecuta → 'C'");
        System.out.println("8. 'D' se imprime (después del bloque)");
        
        System.out.println("\n\n=== PROBLEMA 9: Excepción SÍ capturada en metodo() ===\n");
        System.out.print("Resultado: ");
        
        System.out.print("A");
        try {
            metodo9();
        } catch (ArithmeticException e2) {
            System.out.print("B");
        } finally {
            System.out.print("C");
        }
        System.out.print("D");
        
        System.out.println("\n\nRESPUESTA: AEFCD");
        System.out.println("Justificación:");
        System.out.println("1. 'A' se imprime (fuera de try)");
        System.out.println("2. Se llama metodo9()");
        System.out.println("3. metodo9() genera IndexOutOfBoundsException");
        System.out.println("4. metodo9() SÍ la captura (tiene catch para IndexOutOfBoundsException)");
        System.out.println("5. Se imprime 'F' dentro de metodo9()");
        System.out.println("6. NO se propaga a main() (ya fue manejada)");
        System.out.println("7. finally se ejecuta → 'C'");
        System.out.println("8. 'D' se imprime (después del bloque)");
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. PROPAGACIÓN:
         *    - Si una excepción no se captura, se propaga al método llamador
         *    - Continúa propagándose hasta que alguien la capture
         *    - Si nadie la captura, el programa termina
         * 
         * 2. THROWS:
         *    - Declara que un método puede lanzar una excepción
         *    - Obliga al método llamador a manejarla (para checked exceptions)
         *    - Útil para delegar el manejo de excepciones
         * 
         * 3. CAPTURA LOCAL vs PROPAGACIÓN:
         *    - Si se captura localmente: no se propaga
         *    - Si NO se captura: se propaga hacia arriba
         * 
         * 4. CHECKED EXCEPTIONS:
         *    - Deben declararse con throws o capturarse con try-catch
         *    - El compilador obliga a manejar estas excepciones
         */
    }
    
    /**
     * MÉTODO METODO8 - Arroja excepción que NO captura
     * 
     * Solo captura ArithmeticException, pero arroja IndexOutOfBoundsException
     * La excepción se propaga al método llamador (main)
     */
    public static void metodo8() throws IndexOutOfBoundsException {
        try {
            int[] array = new int[5];
            System.out.print("E");
            array[6] = 10;
        } catch (ArithmeticException e1) {
            System.out.print("F");
        }
        // IndexOutOfBoundsException no se captura, se propaga
    }
    
    /**
     * MÉTODO METODO9 - Arroja excepción que SÍ captura
     * 
     * Captura IndexOutOfBoundsException localmente
     * La excepción NO se propaga al método llamador
     */
    public static void metodo9() throws IndexOutOfBoundsException {
        try {
            int[] array = new int[5];
            System.out.print("E");
            array[6] = 10;
        } catch (IndexOutOfBoundsException e1) {
            System.out.print("F");
        }
        // IndexOutOfBoundsException se captura, NO se propaga
    }
}


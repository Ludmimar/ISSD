/*
 * EJERCICIO 02 - EXCEPCIONES - ANÁLISIS DE FLUJO TRY-CATCH
 * 
 * ENUNCIADO (Problema 1):
 * Analiza el siguiente código y sin ejecutarlo, deducir y justificar: 
 * ¿qué debería imprimir por consola?
 * 
 * System.out.print("A");
 * try {
 *     System.out.print("B");
 * } catch (Exception e) {
 *     System.out.print("C");
 * }
 * System.out.print("D");
 * 
 * CONCEPTO CLAVE: EXCEPCIONES - FLUJO DE EJECUCIÓN
 * - Código fuera de try-catch siempre se ejecuta
 * - Código en try se ejecuta si no hay excepción
 * - Código en catch se ejecuta solo si hay excepción
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Ejecutar código antes de try
 * 2. Intentar ejecutar código en try
 * 3. Si hay excepción: saltar a catch
 * 4. Si no hay excepción: continuar después de try
 * 5. Ejecutar código después de try-catch
 */

public class Clase9 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Analiza y ejecuta el problema 1
     * - Demuestra flujo de ejecución sin excepción
     */
    public static void main(String[] args) {
        System.out.println("=== PROBLEMA 1: ANÁLISIS DE FLUJO ===\n");
        
        System.out.println("Código a analizar:");
        System.out.println("System.out.print(\"A\");");
        System.out.println("try {");
        System.out.println("    System.out.print(\"B\");");
        System.out.println("} catch (Exception e) {");
        System.out.println("    System.out.print(\"C\");");
        System.out.println("}");
        System.out.println("System.out.print(\"D\");");
        
        System.out.println("\n--- EJECUTANDO CÓDIGO ---\n");
        System.out.print("Resultado: ");
        
        // Ejecutar el código del problema
        System.out.print("A");
        try {
            System.out.print("B");
        } catch (Exception e) {
            System.out.print("C");
        }
        System.out.print("D");
        
        System.out.println("\n\n=== ANÁLISIS ===");
        System.out.println("RESPUESTA: El programa debería imprimir \"ABD\"");
        System.out.println("\nJustificación:");
        System.out.println("1. System.out.print(\"A\") se encuentra fuera del bloque try-catch,");
        System.out.println("   dentro del flujo nominal del programa. → Imprime 'A'");
        System.out.println("2. El programa luego intentará ejecutar System.out.print(\"B\"),");
        System.out.println("   esta instrucción no debería fallar ya que no tiene errores lógicos.");
        System.out.println("   → Imprime 'B'");
        System.out.println("3. No hay excepción, por lo que NO se ejecuta el bloque catch.");
        System.out.println("   → No imprime 'C'");
        System.out.println("4. El programa sale del bloque try-catch y ejecuta la instrucción");
        System.out.println("   System.out.print(\"D\"). → Imprime 'D'");
        System.out.println("\nResultado final: ABD");
    }
}


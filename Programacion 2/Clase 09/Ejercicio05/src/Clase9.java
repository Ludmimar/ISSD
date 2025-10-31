/*
 * EJERCICIO 05 - EXCEPCIONES - SCOPE Y VARIABLES EN TRY-CATCH
 * 
 * ENUNCIADO:
 * Mejorar el programa anterior para mostrar información personalizada:
 * - Tamaño del array
 * - Índice que causó la excepción
 * 
 * CONCEPTO CLAVE: EXCEPCIONES - SCOPE DE VARIABLES
 * - Variables declaradas en try solo existen en ese bloque
 * - Para usar variables en catch, declararlas fuera del try
 * - Permite acceder a información útil para debugging
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Declarar variables fuera de try
 * 2. Usar variables en try
 * 3. Acceder a variables en catch para información
 */

import java.util.Random;

public class Clase9 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Declara variables fuera de try
     * - Muestra información personalizada en catch
     */
    public static void main(String[] args) {
        System.out.println("=== ARRAYS CON INFORMACIÓN PERSONALIZADA ===\n");
        
        // Declarar variables FUERA del try para poder usarlas en catch
        int i = 0;
        int[] arrayDeEnteros = new int[5];
        
        try {
            // Usar las variables declaradas fuera
            for (i = 0; i < 10; i++) {
                arrayDeEnteros[i] = i;
            }
            System.out.println("Números enteros del 0 al 9: ");
            for (i = 0; i < 10; i++) {
                System.out.println("Elemento en el indice " + i + ": " + arrayDeEnteros[i]);
            }
        } catch (Exception e) {
            // Acceder a variables declaradas fuera del try
            System.out.println("Problemas!!!");
            System.out.println(e.getMessage());
            System.out.println("Tamaño del array: " + arrayDeEnteros.length);
            System.out.println("Intentando acceder al índice: " + i);
            System.out.println("\nDiagnóstico: El array tiene tamaño " + arrayDeEnteros.length + 
                           " (índices válidos: 0-" + (arrayDeEnteros.length - 1) + ")");
            System.out.println("Se intentó acceder al índice " + i + ", que está fuera de rango.");
        }
        
        // Continuar con otra parte del programa
        System.out.println("\n=== CONTINUANDO CON OTRA OPERACIÓN ===");
        double[] arrayDeDoubles = new double[10];
        for (i = 0; i < 10; i++) {
            arrayDeDoubles[i] = new Random().nextDouble();
        }
        System.out.println("Números double aleatorios: ");
        for (i = 0; i < 10; i++) {
            System.out.println("Elemento en el indice " + i + ": " + arrayDeDoubles[i]);
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. SCOPE DE VARIABLES:
         *    - Variables declaradas en try: solo visibles en try
         *    - Variables declaradas fuera: visibles en try y catch
         *    - Para debugging: declarar variables fuera del try
         * 
         * 2. INFORMACIÓN ÚTIL:
         *    - Tamaño del array: array.length
         *    - Índice que causó error: valor de i en el momento de la excepción
         *    - Mensaje de error: e.getMessage()
         * 
         * 3. DEBUGGING:
         *    - Con esta información podemos entender el problema
         *    - Tamaño: 5, Índice intentado: 5 → fuera de rango
         *    - Solución: aumentar tamaño del array o ajustar el ciclo
         */
    }
}


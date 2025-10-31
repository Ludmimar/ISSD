/*
 * EJERCICIO 04 - ARCHIVOS - LEER LÍNEAS DEL TECLADO
 * 
 * ENUNCIADO (Problema Propuesto 2):
 * Implementar la clase LeeLíneas que lea cadenas de texto y luego los imprima 
 * en pantalla.
 * 
 * CONCEPTO CLAVE: ARCHIVOS - LECTURA DE LÍNEAS CON BUFFEREDREADER
 * - readLine(): Lee una línea completa de texto
 * - Retorna null cuando es fin de flujo
 * - Más útil que read() para entrada de usuario
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear BufferedReader con InputStreamReader(System.in)
 * 2. Leer líneas con readLine()
 * 3. Mostrar cada línea
 * 4. Continuar hasta palabra de terminación
 */

import java.io.*;

public class Clase10 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Lee líneas completas del teclado
     * - Las muestra en pantalla
     * - Termina cuando se ingresa "alto"
     */
    public static void main(String[] args) throws IOException {
        // Crear BufferedReader con System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String cad;
        
        System.out.println("=== LECTURA DE LÍNEAS ===");
        System.out.println("Escriba líneas de texto.");
        System.out.println("Escriba 'alto' para salir.\n");
        
        // Leer líneas del teclado
        do {
            cad = br.readLine(); // Lee una línea completa de texto
            
            // Mostrar la línea leída
            System.out.println(cad);
            
            // Continuar hasta que se ingrese "alto"
        } while (!cad.equals("alto"));
        
        System.out.println("\n=== FINALIZADO ===");
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. READLINE():
         *    - Lee una línea completa hasta el salto de línea
         *    - Retorna null cuando es fin de flujo
         *    - No incluye el salto de línea en el string retornado
         *    - Mucho más útil que read() para texto
         * 
         * 2. COMPARACIÓN:
         *    - read(): un carácter a la vez
         *    - readLine(): toda una línea
         *    - readLine() es más práctico para entrada de usuario
         * 
         * 3. EQUALS():
         *    - Usar equals() para comparar strings
         *    - No usar == (compararía referencias)
         *    - Case-sensitive: "alto" ≠ "ALTO"
         * 
         * 4. TERMINACIÓ N:
         *    - Se usa una palabra especial ("alto") para salir
         *    - Se puede usar cualquier palabra o condición
         *    - Alternativa: pedir número de líneas antes
         */
    }
}


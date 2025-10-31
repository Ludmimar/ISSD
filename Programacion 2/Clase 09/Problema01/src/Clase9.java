/*
 * PROBLEMA 01 - EXCEPCIONES - VALIDACIÓN DE ENTRADA NUMÉRICA
 * 
 * ENUNCIADO:
 * Desarrollar un programa que solicite al usuario un número por consola, el cual 
 * almacenaremos en una variable. Agregar al mismo manejo de excepciones de tal manera 
 * que si el usuario ingresa algo que no pueda ser interpretado como un número (como 
 * letras, o símbolos) se imprima un mensaje de alerta y se solicite nuevamente el 
 * ingreso de un dato. Algunas de las excepciones específicas que puedes utilizar 
 * son NumberFormatException o IllegalArgumentException, de acuerdo a cómo implementes 
 * tu programa.
 * 
 * CONCEPTO CLAVE: EXCEPCIONES - VALIDACIÓN Y REINTENTOS
 * - Validar entrada del usuario con try-catch
 * - NumberFormatException: cuando parseInt() falla
 * - Reintentar hasta obtener entrada válida
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Solicitar número al usuario
 * 2. Intentar convertir a entero
 * 3. Si falla: mostrar mensaje y volver a solicitar
 * 4. Si éxito: continuar con el programa
 */

import java.util.Scanner;

public class Clase9 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Solicita número al usuario
     * - Valida entrada con manejo de excepciones
     * - Reintenta hasta obtener entrada válida
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("=== VALIDACIÓN DE ENTRADA NUMÉRICA ===\n");
        
        int numero = 0;
        boolean entradaValida = false;
        
        // Ciclo hasta obtener entrada válida
        while (!entradaValida) {
            try {
                System.out.print("Ingrese un número entero: ");
                String entrada = teclado.nextLine();
                
                // Intentar convertir a entero
                // Si falla, lanza NumberFormatException
                numero = Integer.parseInt(entrada);
                
                // Si llegamos aquí, la conversión fue exitosa
                entradaValida = true;
                
            } catch (NumberFormatException e) {
                // Capturar excepción cuando la entrada no es un número
                System.out.println("¡Error! La entrada no es un número válido.");
                System.out.println("Por favor, ingrese solo números enteros (ejemplo: 123, -45, 0).");
                System.out.println();
            }
        }
        
        // Mostrar el número ingresado
        System.out.println("\n✓ Entrada válida recibida!");
        System.out.println("El número ingresado es: " + numero);
        
        // Continuar con el programa usando el número
        System.out.println("\nEl doble del número es: " + (numero * 2));
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. NUMBERFORMATEXCEPTION:
         *    - Se lanza cuando Integer.parseInt() no puede convertir el string
         *    - Causas: letras, símbolos, decimales (si se usa parseInt)
         *    - Es una excepción unchecked pero útil para validación
         * 
         * 2. CICLO DE REINTENTO:
         *    - while (!entradaValida): continúa hasta obtener entrada válida
         *    - Si hay excepción: muestra mensaje y vuelve a solicitar
         *    - Si no hay excepción: marca entradaValida = true y sale del ciclo
         * 
         * 3. VALIDACIÓN:
         *    - No usar excepciones como control de flujo normal
         *    - Pero útil cuando la entrada viene de fuentes externas (usuario, archivos)
         *    - parseInt() es la forma estándar de convertir strings a enteros
         * 
         * 4. MEJORAS POSIBLES:
         *    - Validar rango de números
         *    - Permitir números decimales (Double.parseDouble())
         *    - Mensajes más específicos según el tipo de error
         */
    }
}


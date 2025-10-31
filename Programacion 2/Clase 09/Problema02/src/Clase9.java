/*
 * PROBLEMA 02 - EXCEPCIONES - VALIDACIÓN DE NOMBRE COMPLETO
 * 
 * ENUNCIADO:
 * Desarrollar un programa que solicite al usuario el ingreso de su nombre completo, 
 * y almacenar cada palabra que ingrese en un arreglo de Strings de tamaño 10. 
 * Programar de tal forma que, si el usuario ingresa un nombre de más de 10 palabras, 
 * se atienda la excepción que se genera imprimiendo un mensaje "Ingrese un nombre válido".
 * 
 * Utilizar el siguiente esqueleto de programa:
 * 
 * String[] arrayNombre = new String[10];
 * String userIn = // El usuario ingresa su nombre
 * String[] nombre = userIn.split(" ");
 * for (int i = 0; i < nombre.length; i++) {
 *     arrayNombre[i] = nombre[i];
 * }
 * 
 * CONCEPTO CLAVE: EXCEPCIONES - VALIDACIÓN DE LÍMITES DE ARRAY
 * - ArrayIndexOutOfBoundsException cuando se excede el tamaño
 * - Validar antes de asignar o capturar excepción
 * - Mensajes informativos al usuario
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Solicitar nombre completo al usuario
 * 2. Dividir por espacios
 * 3. Intentar almacenar en array de tamaño 10
 * 4. Si excede 10 palabras: capturar excepción y mostrar mensaje
 */

import java.util.Scanner;

public class Clase9 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Solicita nombre completo al usuario
     * - Almacena palabras en array de tamaño 10
     * - Maneja excepción si excede el límite
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("=== VALIDACIÓN DE NOMBRE COMPLETO ===\n");
        System.out.println("Ingrese su nombre completo (máximo 10 palabras):");
        System.out.print("Nombre: ");
        
        String userIn = teclado.nextLine();
        
        String[] arrayNombre = new String[10];
        
        try {
            // Dividir el nombre por espacios
            String[] nombre = userIn.split(" ");
            
            // Almacenar cada palabra en el array
            // Si hay más de 10 palabras, se generará ArrayIndexOutOfBoundsException
            for (int i = 0; i < nombre.length; i++) {
                arrayNombre[i] = nombre[i];
            }
            
            // Si llegamos aquí, todo fue exitoso
            System.out.println("\n✓ Nombre almacenado correctamente!");
            System.out.println("Número de palabras: " + nombre.length);
            System.out.println("\nPalabras almacenadas:");
            for (int i = 0; i < nombre.length && i < arrayNombre.length; i++) {
                if (arrayNombre[i] != null) {
                    System.out.println("  " + (i + 1) + ". " + arrayNombre[i]);
                }
            }
            
        } catch (ArrayIndexOutOfBoundsException e) {
            // Capturar excepción cuando se excede el tamaño del array
            System.out.println("\n¡Error! Ingrese un nombre válido.");
            System.out.println("El nombre ingresado tiene más de 10 palabras.");
            System.out.println("Por favor, ingrese un nombre con máximo 10 palabras.");
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. ARRAYINDEXOUTOFBOUNDSEXCEPTION:
         *    - Se lanza cuando se intenta acceder a un índice fuera del rango
         *    - En este caso: array de tamaño 10 (índices 0-9)
         *    - Si hay 11 o más palabras, falla al intentar arrayNombre[10]
         * 
         * 2. VALIDACIÓN:
         *    - Alternativa: validar antes de asignar
         *    - if (nombre.length > 10) { mostrar error }
         *    - Pero usar try-catch también es válido para este caso
         * 
         * 3. SPLIT():
         *    - Divide el string por espacios
         *    - Retorna array de Strings con las palabras
         *    - "Juan Carlos" → ["Juan", "Carlos"]
         * 
         * 4. MEJORAS POSIBLES:
         *    - Validar nombre vacío
         *    - Eliminar espacios extra antes de dividir
         *    - Mostrar cuántas palabras se ingresaron vs cuántas se permiten
         */
    }
}


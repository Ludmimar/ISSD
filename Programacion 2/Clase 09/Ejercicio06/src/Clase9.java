/*
 * EJERCICIO 06 - EXCEPCIONES - DEBUGGING DE TARJETA DE CRÉDITO
 * 
 * ENUNCIADO (Problema 4):
 * El programa toma un número de tarjeta de crédito como String y lo transforma 
 * en un array de 4 números enteros. Hay algo que no funciona. Agregar mensajes 
 * en el bloque catch para detectar dónde está el problema.
 * 
 * String numeroDeTarjeta = "4704 4050 770O 8050";
 * 
 * CONCEPTO CLAVE: EXCEPCIONES - DEBUGGING CON EXCEPCIONES
 * - Usar excepciones para encontrar errores en el código
 * - Agregar información útil en catch para diagnóstico
 * - Identificar índice o valor que causa el problema
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Dividir string de tarjeta por espacios
 * 2. Convertir cada parte a entero
 * 3. Si falla, mostrar en qué índice y qué valor falló
 */

public class Clase9 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Convierte número de tarjeta string a array de enteros
     * - Detecta errores con mensajes informativos
     */
    public static void main(String[] args) {
        String numeroDeTarjeta = "4704 4050 770O 8050";
        int[] numerosDeLaTarjeta = tarjetaStringToArray(numeroDeTarjeta);
        
        System.out.println("=== CONVERSIÓN DE TARJETA ===\n");
        System.out.println("Número de tarjeta ingresado: " + numeroDeTarjeta);
        System.out.println("\nLos numeros de la tarjeta son: ");
        for (int numero : numerosDeLaTarjeta) {
            System.out.println(numero);
        }
    }
    
    /**
     * MÉTODO TARJETA STRING TO ARRAY - Convierte string de tarjeta a array de enteros
     * 
     * FUNCIONALIDAD:
     * - Divide el string por espacios
     * - Convierte cada parte a entero
     * - Si falla, muestra información útil para debugging
     * 
     * @param numeroDeTarjeta String con número de tarjeta (ej: "4704 4050 770O 8050")
     * @return int[] Array con 4 números enteros
     */
    public static int[] tarjetaStringToArray(String numeroDeTarjeta) {
        int[] arrayTarjeta = new int[4];
        int i = 0;
        int numero;
        
        try {
            // Dividir el string por espacios
            String[] tarjetaSplit = numeroDeTarjeta.split(" ");
            
            // Convertir cada parte a entero
            for (i = 0; i < arrayTarjeta.length; i++) {
                numero = Integer.parseInt(tarjetaSplit[i]);
                arrayTarjeta[i] = numero;
            }
        } catch (Exception e) {
            // Mensajes informativos para debugging
            System.out.println("Error con el numero de la tarjeta en el indice " + i);
            System.out.println("Mensaje del error: " + e.getMessage());
            System.out.println("Valor que causó el error: \"" + numeroDeTarjeta.split(" ")[i] + "\"");
            
            // El array queda con valores por defecto (0)
            // En un caso real, podríamos lanzar la excepción o retornar null
        }
        
        return arrayTarjeta;
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. PROBLEMA DETECTADO:
         *    - Error en índice 2
         *    - Mensaje: "For input string: \"770O\""
         *    - El problema: "770O" tiene una letra 'O' en lugar del número '0'
         * 
         * 2. SOLUCIÓN:
         *    - Cambiar "770O" por "7700" en el string original
         *    - O agregar validación antes de parseInt()
         * 
         * 3. DEBUGGING:
         *    - Los mensajes en catch ayudan a identificar:
         *      * En qué índice falló
         *      * Qué valor causó el error
         *      * Qué tipo de excepción se lanzó
         * 
         * 4. NUMBERFORMATEXCEPTION:
         *    - Se lanza cuando parseInt() no puede convertir el string
         *    - Causas comunes: letras, símbolos, espacios extra
         */
    }
}


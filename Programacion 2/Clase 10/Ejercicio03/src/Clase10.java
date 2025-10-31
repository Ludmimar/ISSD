/*
 * EJERCICIO 03 - ARCHIVOS - LEER CARACTERES DEL TECLADO
 * 
 * ENUNCIADO (Problema Propuesto 1):
 * Implementar la clase LeerCars que lea caracteres ingresados por el usuario 
 * y luego los imprima en pantalla.
 * 
 * CONCEPTO CLAVE: ARCHIVOS - ENTRADA DE CONSOLA CON BUFFEREDREADER
 * - InputStreamReader: Convierte System.in (bytes) a caracteres
 * - BufferedReader: Permite leer caracteres de forma eficiente
 * - read(): Lee un carácter del teclado
 * - Útil para entrada interactiva
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear BufferedReader con InputStreamReader(System.in)
 * 2. Leer caracteres uno por uno con read()
 * 3. Mostrar cada carácter en pantalla
 * 4. Continuar hasta encontrar carácter de terminación
 */

import java.io.*;

public class Clase10 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Lee caracteres del teclado
     * - Los imprime en pantalla
     * - Termina cuando se ingresa un punto
     */
    public static void main(String[] args) throws IOException {
        char c;
        
        // Crear BufferedReader conectado al teclado
        // InputStreamReader convierte bytes (System.in) a caracteres
        // BufferedReader permite leer de forma eficiente
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("=== LECTURA DE CARACTERES ===");
        System.out.println("Escriba caracteres; un punto para terminar.\n");
        
        // Leer caracteres del teclado
        do {
            c = (char) br.read(); // Lee un carácter
            
            // Mostrar el carácter leído
            System.out.println(c);
            
            // Continuar hasta encontrar un punto
        } while (c != '.');
        
        System.out.println("\n=== FINALIZADO ===");
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. BUFFEREDREADER:
         *    - Lee caracteres de forma eficiente
         *    - Usa un buffer interno para mejorar rendimiento
         *    - Ideal para lectura de entrada del usuario
         * 
         * 2. INPUTSTREAMREADER:
         *    - Convierte flujo de bytes a flujo de caracteres
         *    - System.in es un InputStream (bytes)
         *    - InputStreamReader lo convierte a Reader (caracteres)
         * 
         * 3. MÉTODO read():
         *    - Lee un carácter y lo retorna como int
         *    - Se debe castear a char para usar
         *    - Retorna -1 cuando es fin de flujo (raramente en System.in)
         * 
         * 4. COMPARACIÓN CON SCANNER:
         *    - BufferedReader: más bajo nivel, más control
         *    - Scanner: más alto nivel, más fácil de usar
         *    - BufferedReader: mejor para caracteres individuales
         *    - Scanner: mejor para tokens (números, palabras)
         * 
         * 5. NOTA:
         *    - read() puede leer varios caracteres en una llamada
         *    - Puede incluir saltos de línea (\n) en la entrada
         */
    }
}


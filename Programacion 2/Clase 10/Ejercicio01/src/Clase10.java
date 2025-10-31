/*
 * EJERCICIO 01 - ARCHIVOS - MOSTRAR ARCHIVO CON FILEINPUTSTREAM
 * 
 * ENUNCIADO (Problema 1):
 * Implementar la clase MostrarArchivo para mostrar el contenido del archivo hosts 
 * de nuestra PC.
 * 
 * CONCEPTO CLAVE: ARCHIVOS - LECTURA DE BYTES
 * - FileInputStream: Para leer archivos en bytes
 * - read(): Lee un byte, retorna -1 cuando es fin de archivo
 * - close(): Cierra el archivo y libera recursos
 * - FileNotFoundException: Si el archivo no existe
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear FileInputStream con ruta del archivo
 * 2. Leer bytes uno por uno hasta fin de archivo (-1)
 * 3. Convertir bytes a caracteres para mostrar
 * 4. Cerrar el archivo
 */

import java.io.*;

public class Clase10 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Abre el archivo hosts del sistema
     * - Lee y muestra su contenido byte por byte
     */
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream aren;
        
        // Ruta del archivo hosts en Windows
        // En Linux/Mac sería: "/etc/hosts"
        String rutaArchivo = "C:\\Windows\\System32\\drivers\\etc\\hosts";
        
        try {
            // Abrir archivo para lectura
            // Si el archivo no existe, lanza FileNotFoundException
            aren = new FileInputStream(rutaArchivo);
            
        } catch (FileNotFoundException exc) {
            System.out.println("Archivo no encontrado");
            System.out.println("Ruta intentada: " + rutaArchivo);
            return;
        }
        
        System.out.println("=== CONTENIDO DEL ARCHIVO HOSTS ===\n");
        
        // Lee bytes hasta el final del archivo
        // read() retorna -1 cuando llega al final
        do {
            i = aren.read(); // Lee un byte del archivo
            
            // Si no es fin de archivo, mostrar el carácter
            if (i != -1) {
                System.out.print((char) i); // Castear byte a char para mostrar
            }
            
        } while (i != -1); // Continuar mientras no sea fin de archivo
        
        // Cerrar el archivo para liberar el recurso
        // Importante: siempre cerrar archivos abiertos
        aren.close();
        
        System.out.println("\n\n=== ARCHIVO CERRADO ===");
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. FILEINPUTSTREAM:
         *    - Lee archivos byte por byte
         *    - Útil para archivos binarios o texto simple
         *    - Lanza FileNotFoundException si el archivo no existe
         * 
         * 2. MÉTODO read():
         *    - Lee un byte y lo retorna como int
         *    - Retorna -1 cuando llega al final del archivo
         *    - Lanza IOException si hay error de lectura
         * 
         * 3. CASTEO A CHAR:
         *    - Los bytes se convierten a char para mostrar texto
         *    - Cada byte representa un carácter en ASCII
         * 
         * 4. CERRAR ARCHIVOS:
         *    - Siempre cerrar archivos con close()
         *    - Libera recursos del sistema
         *    - Permite que otros programas accedan al archivo
         * 
         * 5. RUTAS:
         *    - Windows: "C:\\ruta\\archivo.txt" (doble barra invertida)
         *    - Linux/Mac: "/ruta/archivo.txt" (barra normal)
         *    - Ruta relativa: "archivo.txt" (en carpeta del proyecto)
         */
    }
}


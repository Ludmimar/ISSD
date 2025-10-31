/*
 * PROBLEMA 02 - ARCHIVOS - MOSTRAR ARCHIVO PERSONALIZADO
 * 
 * ENUNCIADO:
 * Desarrollar un aplicativo que permita abrir y mostrar el contenido de cualquier 
 * archivo de texto de la PC ingresando su ubicación por teclado.
 * 
 * CONCEPTO CLAVE: ARCHIVOS - LECTURA DE ARCHIVO ARBITRARIO
 * - Solicitar ruta del archivo al usuario
 * - Leer y mostrar contenido usando FileReader y BufferedReader
 * - Manejar excepciones si el archivo no existe
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Solicitar ruta del archivo al usuario
 * 2. Abrir archivo con FileReader
 * 3. Leer y mostrar contenido línea por línea
 * 4. Cerrar archivo
 */

import java.io.*;

public class Clase10 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Solicita ruta de archivo al usuario
     * - Muestra el contenido del archivo
     */
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("=== VISUALIZADOR DE ARCHIVOS ===\n");
        
        try {
            System.out.print("Ingrese la ruta completa del archivo de texto: ");
            String rutaArchivo = br.readLine();
            
            System.out.println("\nAbriendo archivo: " + rutaArchivo);
            System.out.println("\n============================================================");
            
            // Crear FileReader para leer el archivo
            FileReader fr = new FileReader(rutaArchivo);
            
            // Envolver en BufferedReader para mejor rendimiento
            BufferedReader archivoBr = new BufferedReader(fr);
            
            String linea;
            int numeroLinea = 1;
            
            // Leer y mostrar cada línea del archivo
            while ((linea = archivoBr.readLine()) != null) {
                System.out.printf("%4d | %s%n", numeroLinea, linea);
                numeroLinea++;
            }
            
            System.out.println("============================================================");
            System.out.println("\nTotal de líneas: " + (numeroLinea - 1));
            
            // Cerrar el archivo
            archivoBr.close();
            fr.close();
            
            System.out.println("Archivo cerrado correctamente.");
            
        } catch (FileNotFoundException e) {
            System.out.println("\n✗ Error: Archivo no encontrado.");
            System.out.println("Verifique que la ruta sea correcta y el archivo exista.");
            
        } catch (IOException e) {
            System.out.println("\n✗ Error al leer el archivo:");
            e.printStackTrace();
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. RUTAS:
         *    - Windows: "C:\\ruta\\archivo.txt" (doble barra invertida)
         *    - Linux/Mac: "/ruta/archivo.txt" (barra normal)
         *    - Relativa: "archivo.txt" (en carpeta del proyecto)
         * 
         * 2. FILEREADER vs FILEINPUTSTREAM:
         *    - FileReader: para archivos de texto (caracteres)
         *    - FileInputStream: para archivos binarios (bytes)
         *    - FileReader maneja codificación automáticamente
         * 
         * 3. NUMERACIÓN DE LÍNEAS:
         *    - Útil para referenciar líneas específicas
         *    - Facilita debugging y referencia
         * 
         * 4. MANEJO DE ERRORES:
         *    - FileNotFoundException: archivo no existe
         *    - IOException: error durante lectura
         *    - Siempre cerrar archivos incluso si hay error
         */
    }
}


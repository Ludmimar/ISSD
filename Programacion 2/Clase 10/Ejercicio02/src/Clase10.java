/*
 * EJERCICIO 02 - ARCHIVOS - COPIAR ARCHIVO
 * 
 * ENUNCIADO (Problema 2):
 * Implementar la clase CopiarArchivo para copiar el contenido de un archivo 
 * y replicarlo en una nueva ubicación.
 * 
 * CONCEPTO CLAVE: ARCHIVOS - LECTURA Y ESCRITURA DE BYTES
 * - FileInputStream: Para leer el archivo origen
 * - FileOutputStream: Para escribir el archivo destino
 * - Leer byte por byte y escribir en el destino
 * - Manejar excepciones de ambos archivos
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Abrir archivo origen con FileInputStream
 * 2. Abrir archivo destino con FileOutputStream
 * 3. Leer bytes del origen y escribir en destino
 * 4. Cerrar ambos archivos
 */

import java.io.*;

public class Clase10 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Copia el archivo hosts a un archivo local
     * - Lee byte por byte y escribe en destino
     */
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream aren;  // Archivo de entrada (origen)
        FileOutputStream arsal; // Archivo de salida (destino)
        
        // Ruta del archivo origen
        String rutaOrigen = "C:\\Windows\\System32\\drivers\\etc\\hosts";
        
        // Ruta del archivo destino (en la carpeta del proyecto)
        String rutaDestino = "prueba.txt";
        
        // === ABRIR ARCHIVO DE ENTRADA ===
        try {
            aren = new FileInputStream(rutaOrigen);
        } catch (FileNotFoundException exc) {
            System.out.println("Archivo de entrada no encontrado");
            System.out.println("Ruta: " + rutaOrigen);
            return;
        }
        
        // === ABRIR ARCHIVO DE SALIDA ===
        try {
            // Si el archivo no existe, lo crea
            // Si existe, lo sobrescribe
            arsal = new FileOutputStream(rutaDestino);
        } catch (FileNotFoundException exc) {
            System.out.println("Error al abrir el archivo de salida");
            System.out.println("Ruta: " + rutaDestino);
            aren.close(); // Cerrar el archivo de entrada antes de salir
            return;
        }
        
        // === COPIAR EL ARCHIVO ===
        try {
            System.out.println("Copiando archivo...");
            
            // Leer bytes del archivo origen y escribir en destino
            do {
                i = aren.read(); // Lee bytes de una línea
                
                if (i != -1) {
                    arsal.write(i); // Escribe el byte en el archivo destino
                }
                
            } while (i != -1); // Continuar hasta fin de archivo
            
            System.out.println("Archivo copiado exitosamente!");
            System.out.println("Origen: " + rutaOrigen);
            System.out.println("Destino: " + rutaDestino);
            
        } catch (IOException exc) {
            System.out.println("Error en archivo durante la copia");
            exc.printStackTrace();
        }
        
        // === CERRAR ARCHIVOS ===
        // Siempre cerrar ambos archivos
        aren.close();
        arsal.close();
        
        System.out.println("Archivos cerrados correctamente.");
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. FILEOUTPUTSTREAM:
         *    - Crea el archivo si no existe
         *    - Sobrescribe el archivo si ya existe
         *    - Usar constructor con boolean para adjuntar (append)
         * 
         * 2. PROCESO DE COPIA:
         *    - Leer un byte del origen
         *    - Escribir ese byte en el destino
         *    - Repetir hasta fin de archivo
         *    - Simple pero eficiente para archivos pequeños
         * 
         * 3. MANEJO DE ERRORES:
         *    - FileNotFoundException: archivo no encontrado o no se puede crear
         *    - IOException: error durante lectura/escritura
         *    - Siempre cerrar archivos incluso si hay error
         * 
         * 4. ADJUNTAR AL ARCHIVO:
         *    - FileOutputStream(ruta, true) - adjunta al final
         *    - FileOutputStream(ruta, false) - sobrescribe (por defecto)
         * 
         * 5. BUFFERING:
         *    - Para archivos grandes, considerar usar BufferedInputStream/BufferedOutputStream
         *    - Mejora significativamente el rendimiento
         */
    }
}


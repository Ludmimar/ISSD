/*
 * PROBLEMA 05 - ARCHIVOS - COPIAR ARCHIVO CON RUTA ORIGEN
 * 
 * ENUNCIADO:
 * Desarrollar un aplicativo que permita copiar un archivo a una nueva ubicación, 
 * luego abrir el archivo destino y agregarle la información de la ruta del 
 * archivo origen.
 * 
 * CONCEPTO CLAVE: ARCHIVOS - COPIA Y MODIFICACIÓN
 * - Copiar archivo con FileInputStream/FileOutputStream
 * - Abrir archivo destino en modo append
 * - Agregar información adicional al final
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Solicitar rutas de origen y destino
 * 2. Copiar archivo origen a destino
 * 3. Abrir archivo destino en modo append
 * 4. Agregar información de ruta origen
 * 5. Cerrar archivos
 */

import java.io.*;

public class Clase10 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Copia archivo a nueva ubicación
     * - Agrega información de ruta origen al destino
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("=== COPIAR ARCHIVO CON INFORMACIÓN DE ORIGEN ===\n");
        
        // Solicitar rutas
        System.out.print("Ingrese la ruta del archivo origen: ");
        String rutaOrigen = br.readLine();
        
        System.out.print("Ingrese la ruta del archivo destino: ");
        String rutaDestino = br.readLine();
        
        FileInputStream archivoEntrada = null;
        FileOutputStream archivoSalida = null;
        
        // === COPIAR ARCHIVO ===
        try {
            // Abrir archivo origen
            archivoEntrada = new FileInputStream(rutaOrigen);
            System.out.println("\n✓ Archivo origen abierto.");
            
            // Abrir archivo destino (sobrescribir)
            archivoSalida = new FileOutputStream(rutaDestino);
            System.out.println("✓ Archivo destino abierto.");
            
            System.out.println("\nCopiando archivo...");
            
            // Copiar contenido byte por byte
            int byteLeido;
            do {
                byteLeido = archivoEntrada.read();
                if (byteLeido != -1) {
                    archivoSalida.write(byteLeido);
                }
            } while (byteLeido != -1);
            
            // Cerrar archivos de copia
            archivoEntrada.close();
            archivoSalida.close();
            
            System.out.println("✓ Archivo copiado exitosamente.");
            
            // === AGREGAR INFORMACIÓN DE RUTA ORIGEN ===
            System.out.println("\nAgregando información de ruta origen...");
            
            // Abrir archivo destino en modo append
            FileWriter fw = new FileWriter(rutaDestino, true); // true = append
            
            // Agregar información al final del archivo
            fw.write("\r\n");
            fw.write("========================================\r\n");
            fw.write("INFORMACIÓN DEL ARCHIVO ORIGEN\r\n");
            fw.write("========================================\r\n");
            fw.write("Ruta origen: " + rutaOrigen + "\r\n");
            java.util.Date fecha = new java.util.Date();
            fw.write("Fecha de copia: " + fecha.toString() + "\r\n");
            fw.write("========================================\r\n");
            
            fw.close();
            
            System.out.println("✓ Información agregada al archivo destino.");
            
            // === MOSTRAR CONTENIDO DEL ARCHIVO DESTINO ===
            System.out.println("\n=== CONTENIDO DEL ARCHIVO DESTINO ===\n");
            
            FileReader fr = new FileReader(rutaDestino);
            BufferedReader archivoBr = new BufferedReader(fr);
            
            String linea;
            while ((linea = archivoBr.readLine()) != null) {
                System.out.println(linea);
            }
            
            archivoBr.close();
            fr.close();
            
            System.out.println("\n=== PROCESO COMPLETADO ===");
            
        } catch (FileNotFoundException e) {
            System.out.println("\n✗ Error: Archivo no encontrado.");
            System.out.println("Verifique que las rutas sean correctas.");
            
            // Cerrar archivos si estaban abiertos
            if (archivoEntrada != null) archivoEntrada.close();
            if (archivoSalida != null) archivoSalida.close();
            
        } catch (IOException e) {
            System.out.println("\n✗ Error durante la operación:");
            e.printStackTrace();
            
            // Cerrar archivos si estaban abiertos
            if (archivoEntrada != null) archivoEntrada.close();
            if (archivoSalida != null) archivoSalida.close();
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. COPIA DE ARCHIVO:
         *    - Leer byte por byte del origen
         *    - Escribir cada byte en el destino
         *    - Simple pero eficiente para archivos pequeños
         * 
         * 2. MODO APPEND:
         *    - FileWriter(ruta, true) - adjunta al final
         *    - FileWriter(ruta, false) - sobrescribe (por defecto)
         *    - Útil para agregar información sin perder contenido
         * 
         * 3. INFORMACIÓN ADICIONAL:
         *    - Ruta del archivo origen
         *    - Fecha y hora de copia
         *    - Cualquier metadato útil
         * 
         * 4. VALIDACIÓN:
         *    - Verificar que archivo origen existe
         *    - Verificar permisos de escritura en destino
         *    - Manejar errores apropiadamente
         */
    }
}


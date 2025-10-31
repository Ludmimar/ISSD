/*
 * EJERCICIO 05 - ARCHIVOS - TECLADO A DISCO (FILEWRITER)
 * 
 * ENUNCIADO:
 * Crear una aplicación simple de teclado a disco que lee líneas de texto 
 * introducidas en el teclado, las cuales ingresa en un archivo llamado "prueba.txt". 
 * El texto se lee hasta que el usuario ingresa la palabra "alto".
 * 
 * CONCEPTO CLAVE: ARCHIVOS - ESCRITURA CON FILEWRITER
 * - FileWriter: Para escribir archivos de caracteres
 * - write(): Escribe strings o caracteres en el archivo
 * - close(): Cierra el archivo y guarda los cambios
 * - append mode: Adjuntar al final del archivo
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear FileWriter con nombre de archivo
 * 2. Leer líneas del teclado con BufferedReader
 * 3. Escribir cada línea en el archivo
 * 4. Cerrar archivo cuando termine
 */

import java.io.*;

public class Clase10 {
    /**
     * MÉTODO CREAR ARCHIVO - Escribe texto del teclado a archivo
     * 
     * @throws IOException Si hay error al escribir el archivo
     */
    public void crearArchivo() throws IOException {
        String cad;
        FileWriter fw;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            // Crear FileWriter
            // Si el archivo no existe, lo crea
            // Si existe, lo sobrescribe
            fw = new FileWriter("prueba.txt");
            
        } catch (IOException exc) {
            System.out.println("No puede abrir el archivo.");
            return;
        }
        
        System.out.println("=== TECLADO A DISCO ===");
        System.out.println("Escriba texto ('alto' para salir).\n");
        
        // Leer líneas y escribir en archivo
        do {
            System.out.print(": ");
            cad = br.readLine();
            
            // Si se ingresa "alto", terminar
            if (cad.compareTo("alto") == 0) {
                break;
            }
            
            // Agregar salto de línea
            // \r\n es el salto de línea en Windows
            // \n sería suficiente en Linux/Mac
            cad = cad + "\r\n";
            
            // Escribir la línea en el archivo
            fw.write(cad);
            
        } while (cad.compareTo("alto") != 0);
        
        // Cerrar el archivo
        // Importante: los cambios se guardan al cerrar
        fw.close();
        
        System.out.println("\nArchivo 'prueba.txt' creado exitosamente!");
    }
    
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     */
    public static void main(String[] args) throws IOException {
        Clase10 tad = new Clase10();
        tad.crearArchivo();
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. FILEWRITER:
         *    - Escribe archivos de caracteres (texto)
         *    - Más simple que FileOutputStream para texto
         *    - Maneja automáticamente la codificación de caracteres
         * 
         * 2. MÉTODO write():
         *    - Escribe strings o arrays de caracteres
         *    - Más eficiente que escribir byte por byte
         *    - No agrega saltos de línea automáticamente
         * 
         * 3. COMPARETO():
         *    - Compara dos strings
         *    - Retorna 0 si son iguales
         *    - Alternativa a equals() en algunos contextos
         * 
         * 4. CERRAR ARCHIVO:
         *    - Siempre cerrar con close()
         *    - Los datos pueden quedar en buffer hasta cerrar
         *    - close() asegura que todo se escriba en disco
         * 
         * 5. ADJUNTAR AL ARCHIVO:
         *    - FileWriter("archivo.txt", true) - adjunta al final
         *    - FileWriter("archivo.txt", false) - sobrescribe (por defecto)
         */
    }
}


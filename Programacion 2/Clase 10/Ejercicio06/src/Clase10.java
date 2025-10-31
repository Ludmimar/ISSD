/*
 * EJERCICIO 06 - ARCHIVOS - DISCO A PANTALLA (FILEREADER)
 * 
 * ENUNCIADO:
 * Crear una aplicación sencilla de disco a pantalla que lee un archivo de texto 
 * llamado "prueba.txt" y despliega el contenido en la pantalla. Es el complemento 
 * de la aplicación de teclado a disco.
 * 
 * CONCEPTO CLAVE: ARCHIVOS - LECTURA CON FILEREADER
 * - FileReader: Para leer archivos de caracteres
 * - BufferedReader: Mejora rendimiento leyendo por líneas
 * - readLine(): Lee una línea completa
 * - null indica fin de archivo
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear FileReader con nombre de archivo
 * 2. Envolver en BufferedReader para mejor rendimiento
 * 3. Leer líneas con readLine() hasta null
 * 4. Mostrar cada línea en pantalla
 * 5. Cerrar archivo
 */

import java.io.*;

public class Clase10 {
    /**
     * MÉTODO DISCO PANTALLA - Lee archivo y muestra en pantalla
     * 
     * @throws Exception Si hay error al leer el archivo
     */
    public void discoPantalla() throws Exception {
        // Crear FileReader para leer el archivo
        FileReader fr = new FileReader("prueba.txt");
        
        // Envolver en BufferedReader para mejor rendimiento
        // Permite leer líneas completas con readLine()
        BufferedReader br = new BufferedReader(fr);
        
        String s;
        
        System.out.println("=== CONTENIDO DEL ARCHIVO prueba.txt ===\n");
        
        // Leer líneas del archivo hasta llegar al final
        // readLine() retorna null cuando es fin de archivo
        while ((s = br.readLine()) != null) {
            // Mostrar cada línea en la pantalla
            System.out.println(s);
        }
        
        // Cerrar el archivo
        // Cerrar BufferedReader también cierra el FileReader subyacente
        fr.close();
        
        System.out.println("\n=== FIN DE ARCHIVO ===");
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. FILEREADER:
         *    - Lee archivos de caracteres (texto)
         *    - Más simple que FileInputStream para texto
         *    - Maneja automáticamente la codificación
         * 
         * 2. BUFFEREDREADER:
         *    - Mejora rendimiento usando buffer interno
         *    - Permite leer líneas completas con readLine()
         *    - Mucho más eficiente que leer carácter por carácter
         * 
         * 3. READLINE():
         *    - Lee una línea completa
         *    - Retorna null cuando es fin de archivo
         *    - No incluye el salto de línea en el string
         * 
         * 4. CICLO WHILE:
         *    - while ((s = br.readLine()) != null)
         *    - Asigna y compara en la misma expresión
         *    - Eficiente y legible
         * 
         * 5. CERRAR ARCHIVOS:
         *    - Cerrar BufferedReader cierra el FileReader
         *    - Alternativa: cerrar solo el BufferedReader
         *    - Siempre cerrar para liberar recursos
         */
    }
    
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     */
    public static void main(String[] args) throws Exception {
        Clase10 dap = new Clase10();
        dap.discoPantalla();
    }
}


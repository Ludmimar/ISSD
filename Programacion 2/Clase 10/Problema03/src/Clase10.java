/*
 * PROBLEMA 03 - ARCHIVOS - FIBONACCI EN ARCHIVO
 * 
 * ENUNCIADO:
 * Desarrollar un aplicativo que genere los primeros 10 términos de la serie de 
 * Fibonacci y los almacene en un archivo de texto.
 * 
 * CONCEPTO CLAVE: ARCHIVOS - ESCRITURA DE DATOS CALCULADOS
 * - Calcular serie de Fibonacci
 * - Escribir resultados en archivo con FileWriter
 * - Formatear salida para legibilidad
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Calcular primeros 10 términos de Fibonacci
 * 2. Crear archivo con FileWriter
 * 3. Escribir términos en el archivo
 * 4. Cerrar archivo
 */

import java.io.*;

public class Clase10 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Genera primeros 10 términos de Fibonacci
     * - Los almacena en archivo de texto
     */
    public static void main(String[] args) {
        FileWriter fw = null;
        
        try {
            // Crear archivo para escribir
            fw = new FileWriter("fibonacci.txt");
            
            System.out.println("=== GENERADOR DE FIBONACCI ===");
            System.out.println("Generando primeros 10 términos...\n");
            
            // Calcular y escribir los primeros 10 términos
            int termino1 = 0;
            int termino2 = 1;
            
            // Escribir encabezado
            fw.write("Serie de Fibonacci - Primeros 10 términos\n");
            fw.write("========================================\n\n");
            
            // Escribir los dos primeros términos
            fw.write("Término 1: " + termino1 + "\r\n");
            fw.write("Término 2: " + termino2 + "\r\n");
            
            // Calcular y escribir los siguientes 8 términos
            for (int i = 3; i <= 10; i++) {
                int siguiente = termino1 + termino2;
                
                // Escribir término en archivo
                fw.write("Término " + i + ": " + siguiente + "\r\n");
                
                // Actualizar términos para siguiente iteración
                termino1 = termino2;
                termino2 = siguiente;
            }
            
            // Cerrar archivo
            fw.close();
            
            System.out.println("✓ Archivo 'fibonacci.txt' creado exitosamente!");
            System.out.println("\nContenido del archivo:");
            System.out.println("----------------------");
            
            // Leer y mostrar el contenido del archivo
            FileReader fr = new FileReader("fibonacci.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            
            br.close();
            fr.close();
            
        } catch (IOException e) {
            System.out.println("✗ Error al crear o escribir el archivo:");
            e.printStackTrace();
            
            // Asegurarse de cerrar el archivo si hubo error
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. SERIE DE FIBONACCI:
         *    - F(0) = 0, F(1) = 1
         *    - F(n) = F(n-1) + F(n-2)
         *    - Primeros 10: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
         * 
         * 2. FORMATO:
         *    - Agregar encabezado para claridad
         *    - Numerar términos para referencia
         *    - Usar \r\n para saltos de línea en Windows
         * 
         * 3. VALIDACIÓN:
         *    - Verificar que se calculen correctamente
         *    - Verificar que se escriban todos los términos
         * 
         * 4. MEJORAS POSIBLES:
         *    - Pedir cantidad de términos al usuario
         *    - Agregar validación de entrada
         *    - Formato más elaborado (tabla)
         */
    }
}


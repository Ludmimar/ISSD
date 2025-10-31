/*
 * PROBLEMA 04 - ARCHIVOS - LISTA DE ARTÍCULOS
 * 
 * ENUNCIADO:
 * Desarrollar un aplicativo que permita el ingreso de una lista de artículos hasta 
 * que se tipee la palabra "FIN" y los almacene en un archivo de texto, luego de 
 * eso acceder al mismo y mostrar la información cargada.
 * 
 * CONCEPTO CLAVE: ARCHIVOS - ESCRITURA Y LECTURA SECUENCIAL
 * - Escribir datos ingresados por usuario en archivo
 * - Leer y mostrar contenido del archivo después
 * - Usar palabra especial para terminar entrada
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Solicitar artículos al usuario hasta "FIN"
 * 2. Escribir artículos en archivo con FileWriter
 * 3. Cerrar archivo
 * 4. Leer archivo y mostrar contenido
 */

import java.io.*;

public class Clase10 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Permite ingresar artículos hasta "FIN"
     * - Guarda en archivo
     * - Muestra contenido del archivo
     */
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fw = null;
        
        try {
            // Crear archivo para escribir
            fw = new FileWriter("articulos.txt");
            
            System.out.println("=== LISTA DE ARTÍCULOS ===");
            System.out.println("Ingrese artículos (escriba 'FIN' para terminar):\n");
            
            String articulo;
            int contador = 0;
            
            // Leer artículos hasta que se ingrese "FIN"
            do {
                System.out.print("Artículo " + (contador + 1) + ": ");
                articulo = br.readLine();
                
                // Si no es "FIN", escribir en archivo
                if (!articulo.equalsIgnoreCase("FIN")) {
                    fw.write((contador + 1) + ". " + articulo + "\r\n");
                    contador++;
                }
                
            } while (!articulo.equalsIgnoreCase("FIN"));
            
            // Cerrar archivo de escritura
            fw.close();
            
            System.out.println("\n✓ Se guardaron " + contador + " artículos en 'articulos.txt'");
            
            // === LEER Y MOSTRAR CONTENIDO DEL ARCHIVO ===
            System.out.println("\n=== CONTENIDO DEL ARCHIVO ===\n");
            
            FileReader fr = new FileReader("articulos.txt");
            BufferedReader archivoBr = new BufferedReader(fr);
            
            String linea;
            while ((linea = archivoBr.readLine()) != null) {
                System.out.println(linea);
            }
            
            archivoBr.close();
            fr.close();
            
            System.out.println("\n=== FIN DEL ARCHIVO ===");
            
        } catch (IOException e) {
            System.out.println("✗ Error al trabajar con el archivo:");
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
         * 1. ENTRADA DE USUARIO:
         *    - Usar palabra especial ("FIN") para terminar
         *    - equalsIgnoreCase() para comparación sin mayúsculas
         *    - Contador para numerar artículos
         * 
         * 2. ESCRITURA:
         *    - Numerar artículos al guardar
         *    - Formato: "1. Artículo"
         *    - Agregar salto de línea después de cada artículo
         * 
         * 3. LECTURA:
         *    - Leer inmediatamente después de escribir
         *    - Verificar que los datos se guardaron correctamente
         *    - Útil para confirmar operación exitosa
         * 
         * 4. MEJORAS POSIBLES:
         *    - Validar que no se ingresen artículos vacíos
         *    - Permitir editar o eliminar artículos
         *    - Guardar fecha/hora de ingreso
         */
    }
}


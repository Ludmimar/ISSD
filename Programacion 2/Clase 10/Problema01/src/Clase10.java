/*
 * PROBLEMA 01 - ARCHIVOS - COMPARAR ARCHIVOS
 * 
 * ENUNCIADO:
 * Desarrollar un aplicativo que tome dos archivos, compare su contenido e informe 
 * si son iguales o diferentes, siendo la ubicación de los mismos ingresada por 
 * teclado por el usuario.
 * 
 * CONCEPTO CLAVE: ARCHIVOS - COMPARACIÓN DE CONTENIDO
 * - Leer ambos archivos byte por byte
 * - Comparar cada byte
 * - Determinar si son iguales o diferentes
 * - Manejo de excepciones para ambos archivos
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Solicitar rutas de ambos archivos al usuario
 * 2. Abrir ambos archivos con FileInputStream
 * 3. Comparar bytes uno por uno
 * 4. Informar resultado de la comparación
 */

import java.io.*;

public class Clase10 {
    private static FileInputStream a1, a2;
    
    /**
     * MÉTODO CARGAR ARCHIVOS - Solicita rutas y abre los archivos
     * 
     * @throws IOException Si hay error al abrir los archivos
     */
    public void cargaArchivos() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("=== COMPARACIÓN DE ARCHIVOS ===\n");
        
        System.out.print("Ingrese la ruta del primer archivo: ");
        String file1 = br.readLine();
        
        System.out.print("Ingrese la ruta del segundo archivo: ");
        String file2 = br.readLine();
        
        // === ABRIR EL PRIMER ARCHIVO ===
        try {
            a1 = new FileInputStream(file1);
            System.out.println("\n✓ Primer archivo abierto correctamente.");
        } catch (FileNotFoundException exc) {
            System.out.println("\n✗ Error: " + file1 + " - No se encuentra el archivo");
            return;
        }
        
        // === ABRIR EL SEGUNDO ARCHIVO ===
        try {
            a2 = new FileInputStream(file2);
            System.out.println("✓ Segundo archivo abierto correctamente.");
        } catch (FileNotFoundException exc) {
            System.out.println("\n✗ Error: " + file2 + " - No se encuentra el archivo");
            a1.close(); // Cerrar el primer archivo antes de salir
            return;
        }
    }
    
    /**
     * MÉTODO COMPARAR FILE - Compara el contenido de dos archivos
     * 
     * @param a1 FileInputStream del primer archivo
     * @param a2 FileInputStream del segundo archivo
     * @return boolean true si los archivos son iguales, false si son diferentes
     */
    public boolean comparaFile(FileInputStream a1, FileInputStream a2) {
        boolean resultado = false;
        int i = 0, j = 0;
        
        try {
            System.out.println("\nComparando archivos...");
            
            // Comparar byte por byte
            do {
                i = a1.read(); // Lee byte del primer archivo
                j = a2.read(); // Lee byte del segundo archivo
                
                // Si los bytes son diferentes, los archivos son diferentes
                if (i != j) {
                    break; // Salir del ciclo
                }
                
            } while (i != -1 && j != -1);
            // Continuar mientras no sea fin de archivo en ninguno
            
        } catch (IOException exc) {
            System.out.println("Error de archivo durante la comparación");
            exc.printStackTrace();
            return false;
        }
        
        // Si ambos llegaron a fin de archivo (-1) al mismo tiempo y todos los bytes fueron iguales
        if (i == j) {
            resultado = true;
        }
        
        return resultado;
    }
    
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     */
    public static void main(String[] args) throws IOException {
        Clase10 ca = new Clase10();
        ca.cargaArchivos();
        
        // Comparar los archivos si ambos se abrieron correctamente
        if (a1 != null && a2 != null) {
            if (ca.comparaFile(a1, a2)) {
                System.out.println("\n✓ Los archivos son iguales.");
            } else {
                System.out.println("\n✗ Archivos diferentes.");
            }
            
            // Cerrar ambos archivos
            a1.close();
            a2.close();
            System.out.println("\nArchivos cerrados correctamente.");
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. COMPARACIÓN BYTE POR BYTE:
         *    - Compara cada byte de ambos archivos
         *    - Si encuentra diferencia, detiene la comparación
         *    - Eficiente para archivos pequeños
         * 
         * 2. FIN DE ARCHIVO:
         *    - Ambos deben llegar a -1 al mismo tiempo para ser iguales
         *    - Si uno termina antes que el otro, son diferentes
         *    - Si los tamaños difieren, los archivos son diferentes
         * 
         * 3. EFICIENCIA:
         *    - Para archivos grandes, considerar comparar tamaños primero
         *    - Si tamaños son diferentes, no necesitan comparar contenido
         *    - Alternativa: usar buffers para mejorar rendimiento
         * 
         * 4. MEJORAS POSIBLES:
         *    - Comparar tamaños primero
         *    - Mostrar posición de la primera diferencia
         *    - Comparar con buffers para mejor rendimiento
         */
    }
}


/*
 * PROBLEMA 02 - MAPAS - COLORES RGB
 * 
 * ENUNCIADO:
 * Una forma de representar los colores en software es mediante la cantidad de rojo, 
 * verde y azul que lo componen (RGB) con números que van de 0 a 255 para cada componente. 
 * Crear un mapa con llaves String y valores int[]. Cargar el color "rojo" (255, 0, 0), 
 * "verde" (0, 255, 0), "azul" (0, 0, 255) y dos colores personalizados utilizando su 
 * nombre como llave y las componentes como valor. Imprimir los colores y sus componentes RGB.
 * 
 * CONCEPTO CLAVE: MAPAS - ARRAYS COMO VALORES
 * - Los valores pueden ser arrays
 * - Sintaxis: Map<String, int[]> colores
 * - Permite almacenar múltiples valores asociados a una llave
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear mapa con arrays como valores
 * 2. Agregar colores básicos y personalizados
 * 3. Imprimir componentes RGB
 */

import java.util.Map;
import java.util.HashMap;

public class Clase7 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Crea mapa de colores RGB
     * - Imprime componentes de cada color
     */
    public static void main(String[] args) {
        // Crear mapa de colores RGB
        // Llave: nombre del color (String)
        // Valor: array de 3 enteros [R, G, B]
        Map<String, int[]> colores = new HashMap<>();
        
        // Agregar colores básicos
        colores.put("rojo", new int[]{255, 0, 0});
        colores.put("verde", new int[]{0, 255, 0});
        colores.put("azul", new int[]{0, 0, 255});
        
        // Agregar dos colores personalizados
        colores.put("amarillo", new int[]{255, 255, 0});
        colores.put("morado", new int[]{128, 0, 128});
        
        // Imprimir colores y sus componentes RGB
        System.out.println("=== COLORES RGB ===\n");
        for (String nombreColor : colores.keySet()) {
            int[] rgb = colores.get(nombreColor);
            System.out.println(nombreColor + ": R=" + rgb[0] + ", G=" + rgb[1] + ", B=" + rgb[2]);
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. ARRAYS COMO VALORES:
         *    - int[] es un array, no un tipo primitivo
         *    - Por lo tanto, puede usarse como valor en mapas
         *    - Permite almacenar múltiples valores relacionados
         * 
         * 2. RGB:
         *    - Componente R (Rojo): 0-255
         *    - Componente G (Verde): 0-255
         *    - Componente B (Azul): 0-255
         *    - rgb[0] = Rojo, rgb[1] = Verde, rgb[2] = Azul
         * 
         * 3. CREACIÓN DE ARRAYS:
         *    - new int[]{255, 0, 0} crea array directamente
         *    - Sintaxis concisa para inicialización
         */
    }
}


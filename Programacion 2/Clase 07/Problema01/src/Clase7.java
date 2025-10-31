/*
 * PROBLEMA 01 - MAPAS - PAÍSES Y CAPITALES
 * 
 * ENUNCIADO:
 * Crear un mapa con llaves String y valores String. Cargar el mapa con el nombre de 
 * 5 paises como llave y sus capitales correspondientes como valor. Imprimir el nombre 
 * de los 5 paises y sus capitales, obteniendo los datos desde el mapa.
 * 
 * CONCEPTO CLAVE: MAPAS - RELACIÓN ENTRE DATOS
 * - Asociar países con sus capitales
 * - Búsqueda rápida de capital por país
 * - Ejemplo práctico de uso de mapas
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear mapa de países y capitales
 * 2. Agregar 5 países con sus capitales
 * 3. Iterar e imprimir usando keySet()
 */

import java.util.Map;
import java.util.HashMap;

public class Clase7 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Crea mapa de países y capitales
     * - Imprime todos los países y sus capitales
     */
    public static void main(String[] args) {
        // Crear mapa de países y capitales
        // Llave: nombre del país (String)
        // Valor: nombre de la capital (String)
        Map<String, String> paises = new HashMap<>();
        
        // Agregar 5 países con sus capitales
        paises.put("Argentina", "Buenos Aires");
        paises.put("España", "Madrid");
        paises.put("Francia", "París");
        paises.put("Japón", "Tokio");
        paises.put("Brasil", "Brasilia");
        
        // Imprimir países y capitales
        System.out.println("=== PAÍSES Y CAPITALES ===\n");
        for (String pais : paises.keySet()) {
            System.out.println("País: " + pais + " -> Capital: " + paises.get(pais));
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. USO PRÁCTICO:
         *    - Asociar datos relacionados (país-capital)
         *    - Búsqueda rápida: paises.get("Argentina") devuelve "Buenos Aires"
         *    - Útil para bases de datos simples
         * 
         * 2. VENTAJAS:
         *    - Acceso directo por nombre del país
         *    - No necesita conocer posición o índice
         *    - Más intuitivo que arrays o listas
         */
    }
}


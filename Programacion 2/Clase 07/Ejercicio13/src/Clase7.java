/*
 * EJERCICIO 13 - MAPAS - TREEMAP CON FIRSTKEY Y LASTKEY
 * 
 * ENUNCIADO:
 * Diseñar un programa que solicite al usuario que ingrese los siguientes datos de 
 * horario de partida para distintos trenes (entero, String) en un mapa:
 * 
 * Horario    Destino
 * 17         Paris
 * 4          Roma
 * 20         Viena
 * 22         Budapest
 * 
 * Imprimir el destino del primer y el último tren.
 * 
 * CONCEPTO CLAVE: MAPAS - MÉTODOS ESPECIALES DE SORTEDMAP
 * - firstKey(): Devuelve la primera llave (mínima)
 * - lastKey(): Devuelve la última llave (máxima)
 * - Útil para encontrar mínimo y máximo automáticamente
 * - Solo disponible en SortedMap/TreeMap
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear TreeMap de horarios
 * 2. Agregar horarios y destinos
 * 3. Obtener primer y último horario
 * 4. Imprimir destinos correspondientes
 */

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Scanner;

public class Clase7 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Crea TreeMap de horarios de trenes
     * - Encuentra primer y último tren
     * - Imprime destinos
     */
    public static void main(String[] args) {
        // Crear Scanner para entrada de datos
        Scanner teclado = new Scanner(System.in);
        
        // Crear TreeMap de horarios de trenes
        // Llave: horario (Integer) - se ordenará automáticamente
        // Valor: destino (String)
        SortedMap<Integer, String> trenes = new TreeMap<>();
        
        // Agregar horarios y destinos
        System.out.println("Ingrese los horarios y destinos de los trenes:\n");
        
        trenes.put(17, "Paris");
        trenes.put(4, "Roma");
        trenes.put(20, "Viena");
        trenes.put(22, "Budapest");
        
        // Mostrar todos los trenes ordenados
        System.out.println("=== TODOS LOS TRENES (Ordenados) ===");
        for (Integer horario : trenes.keySet()) {
            System.out.println("Horario: " + horario + " -> Destino: " + trenes.get(horario));
        }
        
        // Obtener primer y último tren usando métodos de SortedMap
        System.out.println("\n=== PRIMER Y ÚLTIMO TREN ===");
        System.out.println("Primer tren (horario " + trenes.firstKey() + "): " + trenes.get(trenes.firstKey()));
        System.out.println("Ultimo tren (horario " + trenes.lastKey() + "): " + trenes.get(trenes.lastKey()));
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. FIRSTKEY():
         *    - Devuelve la llave más pequeña (mínima)
         *    - Para números: el menor número
         *    - Para String: primero alfabéticamente
         *    - Requiere TreeMap/SortedMap
         * 
         * 2. LASTKEY():
         *    - Devuelve la llave más grande (máxima)
         *    - Para números: el mayor número
         *    - Para String: último alfabéticamente
         *    - Requiere TreeMap/SortedMap
         * 
         * 3. VENTAJAS:
         *    - Encuentra mínimo/máximo automáticamente
         *    - No necesita iterar para encontrar extremos
         *    - O(1) para obtener firstKey/lastKey
         * 
         * 4. RESULTADO ESPERADO:
         *    - Primer tren: horario 4 (Roma) - menor horario
         *    - Último tren: horario 22 (Budapest) - mayor horario
         *    - TreeMap ordena automáticamente por horario
         * 
         * 5. USOS PRÁCTICOS:
         *    - Horarios: primer y último del día
         *    - Precios: mínimo y máximo
         *    - Fechas: más antigua y más reciente
         */
    }
}


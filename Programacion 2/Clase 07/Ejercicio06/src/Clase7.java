/*
 * EJERCICIO 06 - MAPAS - MAPA DE NÚMEROS Y SUS CUBOS
 * 
 * ENUNCIADO:
 * Declarar un mapa cuyas llaves y valores sean números enteros. Con un ciclo de 
 * iteración cargar en el mapa los números del 1 al 5 como llaves, y el cubo de 
 * cada uno como valor asociado. Utilizando otro ciclo de iteración imprimir solo 
 * los valores del mapa.
 * 
 * CONCEPTO CLAVE: MAPAS - ITERACIÓN SOBRE VALORES
 * - values(): Devuelve colección de todos los valores
 * - Permite iterar solo sobre valores sin conocer las llaves
 * - Sintaxis: for (TipoValor value : mapa.values())
 * - Útil cuando solo necesitas procesar valores
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear mapa de tipo Map<Integer, Integer>
 * 2. Ciclo for para cargar números 1-5 y sus cubos
 * 3. Iterar sobre valores con values()
 * 4. Imprimir solo los valores
 */

import java.util.Map;
import java.util.HashMap;

public class Clase7 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Crea mapa de números y sus cubos
     * - Carga datos con ciclo
     * - Itera sobre valores e imprime
     */
    public static void main(String[] args) {
        // Crear mapa de números y sus cubos
        // Llave: número original (Integer)
        // Valor: cubo del número (Integer)
        Map<Integer, Integer> numeros = new HashMap<>();
        
        // Cargar números del 1 al 5 con sus cubos usando ciclo
        // Math.pow(i, 3) calcula el cubo, pero devuelve double
        // (int) convierte a entero
        for (int i = 1; i < 6; i++) {
            // Calcular cubo: i³ = i * i * i
            int cubo = i * i * i;
            numeros.put(i, cubo);
        }
        
        // Iterar sobre los valores del mapa usando values()
        // Sintaxis: for (TipoValor value : mapa.values())
        System.out.println("=== CUBOS DE LOS NÚMEROS 1-5 ===\n");
        for (Integer valor : numeros.values()) {
            System.out.println(valor);
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. MÉTODO .values():
         *    - Devuelve una Collection con todos los valores
         *    - No incluye las llaves, solo los valores
         *    - Útil cuando solo necesitas procesar valores
         * 
         * 2. ITERACIÓN SOBRE VALORES:
         *    - for (Integer valor : numeros.values())
         *    - Itera directamente sobre valores
         *    - No necesitas conocer las llaves
         * 
         * 3. CÁLCULO DE CUBO:
         *    - i * i * i calcula i³
         *    - Alternativa: Math.pow(i, 3) pero retorna double
         *    - Más eficiente usar multiplicación directa
         * 
         * 4. MAPA CON INTEGER:
         *    - Usar Integer en lugar de int (tipos primitivos no permitidos)
         *    - Java hace autoboxing: i se convierte automáticamente a Integer
         * 
         * 5. RESULTADO ESPERADO:
         *    - Valores impresos: 1, 8, 27, 64, 125 (cubos de 1-5)
         *    - El orden puede variar (HashMap no garantiza orden)
         * 
         * 6. DIFERENCIA CON KEYSET:
         *    - keySet(): itera sobre llaves, necesitas .get(key) para valor
         *    - values(): itera directamente sobre valores
         *    - values() es más eficiente si solo necesitas valores
         */
    }
}


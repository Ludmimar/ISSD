/*
 * EJERCICIO 01 - MAPAS - MAPA DE AUTOS (MODELO-FABRICANTE)
 * 
 * ENUNCIADO:
 * Programar un mapa que relacione llaves de tipo String con valores de tipo String. 
 * Cargar 5 modelos de autos, utilizando el modelo como Key/Llave y el fabricante 
 * como Value/Valor, mediante la instrucción .put(K,V). Imprimir modelo y fabricante 
 * de todos los autos ingresados, utilizando el método .get(K).
 * 
 * CONCEPTO CLAVE: MAPAS - PUT Y GET
 * - Los mapas relacionan una llave única con un valor
 * - .put(llave, valor): Agrega o actualiza un par llave-valor
 * - .get(llave): Obtiene el valor asociado a una llave
 * - Las llaves deben ser únicas
 * - Los valores pueden repetirse
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear mapa de tipo Map<String, String>
 * 2. Agregar 5 pares modelo-fabricante con .put()
 * 3. Imprimir cada modelo y su fabricante con .get()
 */

import java.util.Map;
import java.util.HashMap;

public class Clase7 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Crea mapa de autos (modelo-fabricante)
     * - Agrega 5 modelos con sus fabricantes
     * - Imprime modelo y fabricante de cada auto
     */
    public static void main(String[] args) {
        // Crear mapa de autos
        // Sintaxis: Map<TipoLlave, TipoValor> nombre = new HashMap<>();
        // En este caso: modelo (String) -> fabricante (String)
        Map<String, String> autos = new HashMap<>();
        
        // Agregar pares modelo-fabricante usando .put(llave, valor)
        autos.put("F100", "Ford");
        autos.put("Focus", "Ford");
        autos.put("Corolla", "Toyota");
        autos.put("Palio", "Fiat");
        autos.put("Clio", "Renault");
        
        // Imprimir modelo y fabricante de cada auto usando .get(llave)
        System.out.println("=== MAPA DE AUTOS ===\n");
        System.out.println("Modelo: F100, Fabricante: " + autos.get("F100"));
        System.out.println("Modelo: Focus, Fabricante: " + autos.get("Focus"));
        System.out.println("Modelo: Corolla, Fabricante: " + autos.get("Corolla"));
        System.out.println("Modelo: Palio, Fabricante: " + autos.get("Palio"));
        System.out.println("Modelo: Clio, Fabricante: " + autos.get("Clio"));
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. DECLARACIÓN DE MAPA:
         *    - Map<String, String> declara un mapa con llaves String y valores String
         *    - new HashMap<>() crea un mapa vacío de tipo HashMap
         *    - HashMap no garantiza orden de inserción
         * 
         * 2. MÉTODO .put(K, V):
         *    - Agrega un par llave-valor al mapa
         *    - Si la llave ya existe, reemplaza el valor anterior
         *    - Sintaxis: mapa.put(llave, valor)
         * 
         * 3. MÉTODO .get(K):
         *    - Obtiene el valor asociado a una llave
         *    - Retorna null si la llave no existe
         *    - La llave debe ser exactamente igual (case-sensitive)
         * 
         * 4. LLAVES ÚNICAS:
         *    - Cada llave debe ser única en el mapa
         *    - No se puede tener: autos.put("Ford", "F100") y autos.put("Ford", "Focus")
         *    - Los valores SÍ pueden repetirse (Ford aparece dos veces como valor)
         * 
         * 5. CASE-SENSITIVE:
         *    - "Ford" y "ford" son llaves diferentes
         *    - Debe usarse exactamente la misma cadena para obtener el valor
         */
    }
}


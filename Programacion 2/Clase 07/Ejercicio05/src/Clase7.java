/*
 * EJERCICIO 05 - MAPAS - ITERACIÓN SOBRE MAPAS
 * 
 * ENUNCIADO:
 * Declarar un mapa cuyas llaves sean nombres y sus valores asociados, números enteros. 
 * Agregar a este mapa tu nombre y el de dos compañeros/as como llaves asociadas a 
 * sus respectivas edades como valores. Imprimir los nombres y edades de cada uno(a) 
 * utilizando un iterador.
 * 
 * CONCEPTO CLAVE: MAPAS - ITERACIÓN CON KEYSET()
 * - keySet(): Devuelve conjunto de todas las llaves
 * - Permite iterar sobre las llaves del mapa
 * - Sintaxis: for (TipoLlave key : mapa.keySet())
 * - Luego usar mapa.get(key) para obtener el valor
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear mapa de tipo Map<String, Integer>
 * 2. Agregar nombres y edades
 * 3. Iterar sobre llaves con keySet()
 * 4. Imprimir nombre y edad
 */

import java.util.Map;
import java.util.HashMap;

public class Clase7 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Crea mapa de nombres y edades
     * - Itera sobre las llaves
     * - Imprime nombre y edad de cada persona
     */
    public static void main(String[] args) {
        // Crear mapa de nombres y edades
        // Llave: nombre (String)
        // Valor: edad (Integer)
        Map<String, Integer> nombres = new HashMap<>();
        
        // Agregar nombres y edades
        nombres.put("Fulano", 20);
        nombres.put("Mengano", 25);
        nombres.put("Sultano", 30);
        
        // Iterar sobre las llaves del mapa usando keySet()
        // Sintaxis: for (TipoLlave key : mapa.keySet())
        System.out.println("=== NOMBRES Y EDADES ===\n");
        for (String nombre : nombres.keySet()) {
            // Obtener el valor asociado a cada llave
            System.out.println(nombre + ": " + nombres.get(nombre));
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. MÉTODO .keySet():
         *    - Devuelve un Set con todas las llaves del mapa
         *    - Permite iterar sobre las llaves
         *    - No garantiza orden (depende del tipo de mapa)
         * 
         * 2. ITERACIÓN FOR-EACH:
         *    - for (String nombre : nombres.keySet())
         *    - 'nombre' toma el valor de cada llave en cada iteración
         *    - Similar a iteración sobre listas
         * 
         * 3. ACCESO AL VALOR:
         *    - nombres.get(nombre) obtiene el valor asociado
         *    - Se puede usar dentro del ciclo para acceder al valor
         * 
         * 4. VENTAJAS:
         *    - No necesitas conocer las llaves de antemano
         *    - Itera sobre todos los elementos del mapa
         *    - Más eficiente que obtener llaves manualmente
         * 
         * 5. EQUIVALENCIA:
         *    - Este código es equivalente a imprimir manualmente:
         *      System.out.println("Fulano: " + nombres.get("Fulano"));
         *      System.out.println("Mengano: " + nombres.get("Mengano"));
         *      System.out.println("Sultano: " + nombres.get("Sultano"));
         *    - Pero es más flexible y escalable
         */
    }
}


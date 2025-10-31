/*
 * EJERCICIO 02 - COLECCIONES - ARRAYLIST DE STRING
 * 
 * ENUNCIADO:
 * Programar un ArrayList de String que llamaremos nombres. 
 * Agregar tres nombres a la lista utilizando .add(), 
 * imprimir los nombres en la lista utilizando .get() 
 * y el tamaño de la lista utilizando .size().
 * 
 * CONCEPTO CLAVE: COLECCIONES - MÉTODO .size()
 * - El método .size() devuelve el número de elementos en la lista
 * - Equivalente al atributo .length de los arrays
 * - Útil para iterar sobre la lista
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear lista de String llamada nombres
 * 2. Agregar tres nombres con .add()
 * 3. Imprimir cada nombre con .get()
 * 4. Imprimir el tamaño con .size()
 */

import java.util.List;
import java.util.ArrayList;

public class Clase6 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Crea una lista de String
     * - Agrega tres nombres
     * - Imprime los nombres y el tamaño de la lista
     */
    public static void main(String[] args) {
        // Declaración y creación de lista de String
        List<String> nombres = new ArrayList<>();
        
        // Agregar tres nombres a la lista
        nombres.add("Bombon");
        nombres.add("Burbuja");
        nombres.add("Bellota");
        
        // Imprimir cada nombre utilizando .get() con el índice
        System.out.println(nombres.get(0));
        System.out.println(nombres.get(1));
        System.out.println(nombres.get(2));
        
        // Imprimir el tamaño de la lista utilizando .size()
        System.out.println("Tamano de la lista: " + nombres.size());
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. LISTAS DE STRING:
         *    - String ya es un objeto en Java, no un tipo primitivo
         *    - Por lo tanto, puede usarse directamente en listas
         *    - No necesita wrapper como Integer, Double, etc.
         * 
         * 2. MÉTODO .size():
         *    - Devuelve un int con el número de elementos
         *    - Equivalente a array.length para arrays
         *    - La lista vacía tiene tamaño 0
         * 
         * 3. MÉTODO .add():
         *    - Agrega elementos al final de la lista
         *    - Puede recibir directamente un String sin crear objeto
         *    - La lista crece automáticamente
         */
    }
}


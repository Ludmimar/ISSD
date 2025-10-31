/*
 * EJERCICIO 05 - COLECCIONES - ITERACIÓN CON FOR
 * 
 * ENUNCIADO:
 * Crear una lista de tres nombres, como en los ejercicios anteriores.
 * Imprimir los elementos utilizando un ciclo for.
 * 
 * CONCEPTO CLAVE: COLECCIONES - ITERACIÓN
 * - Los ciclos for permiten recorrer listas de forma eficiente
 * - Utilizar .size() para determinar el límite del ciclo
 * - Los índices van de 0 a size() - 1
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear lista con tres nombres
 * 2. Utilizar for tradicional con índice desde 0 hasta size() - 1
 * 3. Imprimir cada elemento usando .get(i)
 */

import java.util.List;
import java.util.ArrayList;

public class Clase6 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Crea lista con nombres
     * - Itera sobre la lista con for
     * - Imprime cada elemento
     */
    public static void main(String[] args) {
        // Crear lista de nombres
        List<String> nombres = new ArrayList<>();
        
        // Agregar tres nombres
        nombres.add("Bombon");
        nombres.add("Burbuja");
        nombres.add("Bellota");
        
        // Iterar sobre la lista utilizando for tradicional
        // i va desde 0 hasta nombres.size() - 1
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. CICLO FOR TRADICIONAL:
         *    - i comienza en 0 (primer índice)
         *    - Condición: i < nombres.size() (menor estricto)
         *    - Incremento: i++ (aumenta en 1)
         * 
         * 2. ACCESO A ELEMENTOS:
         *    - nombres.get(i) obtiene el elemento en el índice i
         *    - Los índices válidos van de 0 a size() - 1
         * 
         * 3. VENTAJAS:
         *    - Permite acceder al índice si es necesario
         *    - Control total sobre el recorrido
         *    - Útil cuando se necesita modificar elementos
         * 
         * 4. EQUIVALENCIA:
         *    - Este ciclo es equivalente a imprimir cada elemento individualmente
         *    - Pero es más eficiente y escalable
         */
    }
}


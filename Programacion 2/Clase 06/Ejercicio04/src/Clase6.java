/*
 * EJERCICIO 04 - COLECCIONES - MÉTODOS .isEmpty() Y .clear()
 * 
 * ENUNCIADO:
 * Crear una lista de tres nombres, como en el ejercicio anterior.
 * Imprimir el resultado de llamar el método .isEmpty() sobre la lista,
 * luego eliminar todos los elementos de la lista utilizando .clear()
 * y nuevamente preguntar el resultado del método isEmpty() sobre la lista.
 * Finalmente, preguntar el tamaño de la lista al final del programa.
 * 
 * CONCEPTO CLAVE: COLECCIONES - VERIFICACIÓN Y LIMPIEZA
 * - .isEmpty(): Devuelve true si la lista está vacía, false en caso contrario
 * - .clear(): Elimina todos los elementos de la lista
 * - Una lista vacía tiene tamaño 0
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear lista con tres nombres
 * 2. Verificar si está vacía (debe ser false)
 * 3. Limpiar la lista con .clear()
 * 4. Verificar si está vacía nuevamente (debe ser true)
 * 5. Mostrar el tamaño final (debe ser 0)
 */

import java.util.List;
import java.util.ArrayList;

public class Clase6 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Crea lista con nombres
     * - Verifica si está vacía antes de limpiar
     * - Limpia la lista
     * - Verifica si está vacía después de limpiar
     * - Muestra el tamaño final
     */
    public static void main(String[] args) {
        // Crear lista de nombres
        List<String> nombres = new ArrayList<>();
        
        // Agregar tres nombres
        nombres.add("Bombon");
        nombres.add("Burbuja");
        nombres.add("Bellota");
        
        // Verificar si la lista está vacía (debe ser false)
        System.out.println("La lista esta vacia? " + nombres.isEmpty());
        
        // Eliminar todos los elementos de la lista
        nombres.clear();
        
        // Verificar si la lista está vacía nuevamente (debe ser true)
        System.out.println("La lista esta vacia? " + nombres.isEmpty());
        
        // Mostrar el tamaño de la lista al final
        System.out.println("Tamano de la lista: " + nombres.size());
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. MÉTODO .isEmpty():
         *    - Devuelve true si la lista no tiene elementos
         *    - Devuelve false si tiene al menos un elemento
         *    - Equivalente a: lista.size() == 0
         * 
         * 2. MÉTODO .clear():
         *    - Elimina todos los elementos de la lista
         *    - El tamaño queda en 0
         *    - La lista sigue existiendo, solo se vacía
         *    - No devuelve ningún valor (void)
         * 
         * 3. RESULTADO ESPERADO:
         *    - Primera verificación: false (tiene 3 elementos)
         *    - Segunda verificación: true (lista vacía)
         *    - Tamaño final: 0
         * 
         * 4. USO PRÁCTICO:
         *    - .isEmpty() es útil para validar antes de operar con la lista
         *    - .clear() es útil para resetear una lista sin crear una nueva
         */
    }
}


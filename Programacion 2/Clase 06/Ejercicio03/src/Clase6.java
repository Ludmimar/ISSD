/*
 * EJERCICIO 03 - COLECCIONES - MÉTODOS .remove() Y .set()
 * 
 * ENUNCIADO:
 * Crear una lista de tres nombres, como en el ejercicio anterior.
 * Eliminar el último elemento de la lista y reemplazar el primer elemento por otro.
 * Imprimir los nombres en la lista y el tamaño de la misma.
 * 
 * CONCEPTO CLAVE: COLECCIONES - MANIPULACIÓN DE ELEMENTOS
 * - .remove(x): Elimina el elemento en el índice x y devuelve el elemento eliminado
 * - .set(x, objeto): Reemplaza el elemento en el índice x con el nuevo objeto
 * - La lista se ajusta automáticamente después de eliminar elementos
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear lista con tres nombres
 * 2. Eliminar el último elemento (índice size() - 1)
 * 3. Reemplazar el primer elemento (índice 0) con .set()
 * 4. Imprimir elementos restantes y tamaño
 */

import java.util.List;
import java.util.ArrayList;

public class Clase6 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Crea lista con tres nombres
     * - Elimina el último elemento
     * - Reemplaza el primer elemento
     * - Imprime elementos y tamaño final
     */
    public static void main(String[] args) {
        // Crear lista de nombres
        List<String> nombres = new ArrayList<>();
        
        // Agregar tres nombres iniciales
        nombres.add("Bombon");
        nombres.add("Burbuja");
        nombres.add("Bellota");
        
        // Eliminar el último elemento de la lista
        // nombres.size() - 1 es el índice del último elemento
        nombres.remove(nombres.size() - 1);
        
        // Reemplazar el primer elemento (índice 0) con otro nombre
        nombres.set(0, "Mojojojo");
        
        // Imprimir los elementos restantes
        System.out.println(nombres.get(0));
        System.out.println(nombres.get(1));
        
        // Imprimir el tamaño de la lista
        System.out.println("Tamano de la lista: " + nombres.size());
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. MÉTODO .remove(x):
         *    - Elimina el elemento en el índice x
         *    - Los elementos posteriores se mueven una posición hacia atrás
         *    - Devuelve el elemento eliminado
         *    - El tamaño de la lista se reduce en 1
         * 
         * 2. MÉTODO .set(x, objeto):
         *    - Reemplaza el elemento en el índice x
         *    - No cambia el tamaño de la lista
         *    - Devuelve el elemento que estaba antes en esa posición
         * 
         * 3. CÁLCULO DE ÍNDICE:
         *    - nombres.size() - 1 siempre es el índice del último elemento
         *    - Útil cuando no conocemos el tamaño exacto de la lista
         * 
         * 4. RESULTADO ESPERADO:
         *    - Después de remove: quedan "Bombon" y "Burbuja" (índices 0 y 1)
         *    - Después de set(0): "Mojojojo" y "Burbuja"
         *    - Tamaño final: 2
         */
    }
}


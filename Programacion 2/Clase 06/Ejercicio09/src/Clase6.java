/*
 * EJERCICIO 09 - COLECCIONES - ITERACIÓN FOR-EACH
 * 
 * ENUNCIADO:
 * Crear una lista de tres nombres, como en los ejercicios anteriores.
 * Imprimir los elementos utilizando un ciclo for con la nueva forma de iterar 
 * demostrada (for-each).
 * 
 * CONCEPTO CLAVE: COLECCIONES - FOR-EACH (ENHANCED FOR LOOP)
 * - Sintaxis: for (TipoObjeto elemento : coleccion)
 * - Itera automáticamente sobre todos los elementos
 * - No requiere índices ni .size()
 * - Más simple y legible que for tradicional
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear lista con nombres
 * 2. Usar for-each para iterar
 * 3. Imprimir cada elemento
 */

import java.util.List;
import java.util.ArrayList;

public class Clase6 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Crea lista con nombres
     * - Itera con for-each
     * - Imprime cada nombre
     */
    public static void main(String[] args) {
        // Crear lista de nombres
        List<String> nombres = new ArrayList<>();
        
        // Agregar tres nombres
        nombres.add("Bombon");
        nombres.add("Burbuja");
        nombres.add("Bellota");
        
        // Iterar sobre la lista utilizando for-each
        // Sintaxis: for (TipoObjeto variable : coleccion)
        // 'nombre' toma el valor de cada elemento en cada iteración
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. SINTAXIS FOR-EACH:
         *    - for (TipoObjeto variable : coleccion)
         *    - La variable 'nombre' se declara dentro del for
         *    - Toma el valor de cada elemento automáticamente
         * 
         * 2. VENTAJAS:
         *    - Más simple y legible
         *    - No requiere manejar índices
         *    - No necesita .size() ni .get()
         *    - Menos propenso a errores (fuera de rango)
         * 
         * 3. CUANDO USAR:
         *    - Ideal para solo leer elementos
         *    - Cuando no necesitas el índice
         *    - Para recorrer toda la colección
         * 
         * 4. LIMITACIONES:
         *    - No permite modificar elementos directamente
         *    - No proporciona acceso al índice
         *    - No permite recorrer en orden inverso
         * 
         * 5. EQUIVALENCIA:
         *    - Este código es equivalente a:
         *      for (int i = 0; i < nombres.size(); i++) {
         *          String nombre = nombres.get(i);
         *          System.out.println(nombre);
         *      }
         */
    }
}


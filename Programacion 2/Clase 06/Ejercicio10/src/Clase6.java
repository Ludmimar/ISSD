/*
 * EJERCICIO 10 - COLECCIONES - TRANSFORMAR ARRAY A LISTA
 * 
 * ENUNCIADO:
 * Crear un array de tres nombres y transformarlo a lista con alguno de los 
 * métodos presentados anteriormente.
 * 
 * CONCEPTO CLAVE: COLECCIONES - CONVERSIÓN ARRAY A LISTA
 * - Método 1: Arrays.asList(array) - rápido pero lista fija
 * - Método 2: Collections.addAll(lista, array) - más control
 * - Método 3: for-each manual - más flexible y educativo
 * - Cada método tiene sus ventajas
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear array de nombres
 * 2. Convertir a lista usando uno de los métodos
 * 3. Imprimir los elementos de la lista
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Clase6 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Crea array de nombres
     * - Demuestra tres métodos de conversión
     * - Imprime resultados
     */
    public static void main(String[] args) {
        // Crear array de nombres
        String[] arrayNombres = { "Bombon", "Burbuja", "Bellota" };
        
        // MÉTODO 1: Arrays.asList()
        // Crea una lista que está vinculada al array original
        // Nota: La lista es de tamaño fijo (no se puede agregar/eliminar)
        List<String> nombres = Arrays.asList(arrayNombres);
        System.out.println("Metodo 1 (Arrays.asList): " + nombres.toString());
        
        // MÉTODO 2: Collections.addAll()
        // Crea una lista nueva y agrega todos los elementos del array
        // La lista puede modificarse después
        List<String> nombres1 = new ArrayList<String>();
        Collections.addAll(nombres1, arrayNombres);
        System.out.println("Metodo 2 (Collections.addAll): " + nombres1.toString());
        
        // MÉTODO 3: For-each manual
        // Más explícito y educativo
        // Permite procesamiento adicional durante la conversión
        List<String> nombres2 = new ArrayList<String>();
        for (String nombre : arrayNombres) {
            nombres2.add(nombre);
        }
        System.out.println("Metodo 3 (for-each manual): " + nombres2.toString());
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. MÉTODO 1 - Arrays.asList():
         *    - Más rápido y directo
         *    - La lista resultante está vinculada al array
         *    - No se puede agregar ni eliminar elementos
         *    - Cambios en el array se reflejan en la lista
         * 
         * 2. MÉTODO 2 - Collections.addAll():
         *    - Crea una lista independiente del array
         *    - Permite modificar la lista después
         *    - Requiere crear la lista antes de llamar al método
         * 
         * 3. MÉTODO 3 - For-each manual:
         *    - Más explícito y fácil de entender
         *    - Permite procesamiento adicional durante la conversión
         *    - Más flexible para casos especiales
         * 
         * 4. RECOMENDACIÓN:
         *    - Usar método 3 para aprendizaje y casos simples
         *    - Usar método 2 cuando necesites lista modificable
         *    - Usar método 1 solo cuando la lista no necesita cambios
         */
    }
}


/*
 * EJERCICIO 11 - COLECCIONES - MÉTODOS DE COLLECTIONS
 * 
 * ENUNCIADO:
 * Crear una lista que contenga estos elementos, en este orden: 10, 1000, 3, 4, 99
 * Ordenar la lista en forma descendente e imprimir los elementos.
 * Encontrar e imprimir el mayor número de la lista.
 * Encontrar e imprimir el menor número de la lista.
 * Desordenar la lista de forma aleatoria e imprimir nuevamente sus elementos.
 * 
 * CONCEPTO CLAVE: COLECCIONES - CLASE COLLECTIONS
 * - Collections proporciona métodos estáticos para operar con colecciones
 * - sort(): ordena en orden ascendente (según orden natural)
 * - reverse(): invierte el orden de los elementos
 * - max(): encuentra el elemento máximo
 * - min(): encuentra el elemento mínimo
 * - shuffle(): desordena aleatoriamente
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear lista con números
 * 2. Ordenar en ascendente
 * 3. Invertir para orden descendente
 * 4. Imprimir elementos ordenados
 * 5. Encontrar y mostrar máximo y mínimo
 * 6. Desordenar y mostrar nuevamente
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
     * - Crea lista con números específicos
     * - Ordena en forma descendente
     * - Encuentra máximo y mínimo
     * - Desordena aleatoriamente
     */
    public static void main(String[] args) {
        // Crear array con los valores iniciales
        Integer[] array = {10, 1000, 3, 4, 99};
        
        // Convertir array a lista
        // Usar Integer[] en lugar de int[] porque las listas no aceptan primitivos
        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        
        // Ordenar la lista en forma ascendente
        Collections.sort(list);
        
        // Invertir el orden para tener descendente
        Collections.reverse(list);
        
        // Imprimir los elementos ordenados en forma descendente
        System.out.println("Lista ordenada en forma descendente:");
        for (Integer num : list) {
            System.out.println(num);
        }
        
        // Encontrar e imprimir el mayor número
        System.out.println("El mayor es: " + Collections.max(list));
        
        // Encontrar e imprimir el menor número
        System.out.println("El menor es: " + Collections.min(list));
        
        // Desordenar la lista de forma aleatoria
        Collections.shuffle(list);
        
        // Imprimir los elementos desordenados
        System.out.println("\nLista desordenada aleatoriamente:");
        for (Integer num : list) {
            System.out.println(num);
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. TIPO INTEGER VS INT:
         *    - Usar Integer[] en lugar de int[]
         *    - Las listas no aceptan tipos primitivos
         *    - Integer es el wrapper class para int
         * 
         * 2. MÉTODO .sort():
         *    - Ordena en orden ascendente según orden natural
         *    - Para números: de menor a mayor
         *    - Modifica la lista original
         * 
         * 3. MÉTODO .reverse():
         *    - Invierte el orden de los elementos
         *    - Útil para obtener orden descendente después de sort()
         * 
         * 4. MÉTODO .max() Y .min():
         *    - Devuelven el elemento máximo/mínimo según orden natural
         *    - No modifican la lista
         *    - Funcionan con cualquier lista ordenada o no
         * 
         * 5. MÉTODO .shuffle():
         *    - Desordena aleatoriamente los elementos
         *    - Cada ejecución produce un orden diferente
         *    - Útil para juegos y simulaciones
         * 
         * 6. ORDEN NATURAL:
         *    - Para números: orden numérico
         *    - Para String: orden alfabético
         *    - Para objetos: requiere implementar Comparable
         */
    }
}


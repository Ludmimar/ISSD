/*
 * PROBLEMA 07 - COLECCIONES - COPIAR Y COMPARAR LISTAS
 * 
 * ENUNCIADO:
 * Diseñar un programa que pida al usuario 5 números y los almacene en una lista. 
 * Copiar esta lista en otra nueva lista. Desordenar aleatoriamente la nueva lista. 
 * Imprimir los elementos de cada lista, línea por línea, de modo de que el primer 
 * elemento de cada lista se lea en una línea, el segundo elemento de cada lista en otra, 
 * y así.
 * 
 * EJEMPLO: 
 * lista original = 1,4,7,9
 * lista shuffled = 9,1,7,4
 * El programa imprimiría:
 * 1, 9
 * 4, 1
 * 7, 7
 * 9, 4
 * 
 * CONCEPTO CLAVE: COLECCIONES - COPIAR Y COMPARAR LISTAS
 * - Collections.copy() copia elementos de una lista a otra
 * - Collections.shuffle() desordena una lista
 * - Iteración paralela sobre dos listas
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Pedir 5 números al usuario
 * 2. Almacenar en lista original
 * 3. Crear copia de la lista
 * 4. Desordenar la copia
 * 5. Imprimir ambas listas lado a lado
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Clase6 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Pide 5 números al usuario
     * - Crea copia de la lista
     * - Desordena la copia
     * - Imprime ambas listas comparativamente
     */
    public static void main(String[] args) {
        // Crear Scanner para entrada de datos
        Scanner teclado = new Scanner(System.in);
        
        // Crear lista original para almacenar los números
        List<Integer> listaOriginal = new ArrayList<>();
        
        // Pedir 5 números al usuario
        System.out.println("Ingrese 5 numeros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            int numero = teclado.nextInt();
            listaOriginal.add(numero);
        }
        
        // Crear copia de la lista original
        // Primero crear lista destino del mismo tamaño
        List<Integer> listaCopia = new ArrayList<>();
        for (int i = 0; i < listaOriginal.size(); i++) {
            listaCopia.add(0); // Inicializar con valores placeholder
        }
        
        // Copiar elementos de lista original a lista copia
        Collections.copy(listaCopia, listaOriginal);
        
        // Desordenar aleatoriamente la lista copia
        Collections.shuffle(listaCopia);
        
        // Imprimir ambas listas línea por línea
        System.out.println("\n=== COMPARACION DE LISTAS ===");
        System.out.println("Original | Shuffled");
        System.out.println("---------|---------");
        
        // Iterar sobre ambas listas simultáneamente
        // Asumimos que tienen el mismo tamaño
        for (int i = 0; i < listaOriginal.size(); i++) {
            System.out.println(listaOriginal.get(i) + ", " + listaCopia.get(i));
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. CREACIÓN DE COPIA:
         *    - Collections.copy() requiere que la lista destino tenga al menos el mismo tamaño
         *    - Por eso se inicializa con valores placeholder
         *    - Alternativa: usar new ArrayList<>(listaOriginal) para copia superficial
         * 
         * 2. COLLECTIONS.COPY():
         *    - Copia elementos de origen a destino
         *    - La lista destino debe tener tamaño suficiente
         *    - Los elementos se copian por referencia
         * 
         * 3. COLLECTIONS.SHUFFLE():
         *    - Desordena aleatoriamente los elementos
         *    - Modifica la lista original (listaCopia)
         *    - No afecta a la lista original
         * 
         * 4. ITERACIÓN PARALELA:
         *    - Usar mismo índice para ambas listas
         *    - Asume que ambas tienen el mismo tamaño
         *    - Permite comparar elemento por elemento
         * 
         * 5. ALTERNATIVA MÁS SIMPLE:
         *    - List<Integer> listaCopia = new ArrayList<>(listaOriginal);
         *    - Esto crea una copia independiente más fácilmente
         */
    }
}


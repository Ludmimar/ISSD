/*
 * EJERCICIO 07 - QUEUES - PRIORITYQUEUE
 * 
 * ENUNCIADO:
 * Analizar qué sucede si ejecuto este código:
 * 
 * Queue<String> ll = new LinkedList<>();
 * ll.offer("Ana");
 * ll.offer("Bob");
 * ll.offer("Carlos");
 * ll.offer("Daniela");
 * 
 * while (!ll.isEmpty()) {
 *     System.out.println(ll.peek());
 * }
 * 
 * Luego demostrar PriorityQueue que ordena automáticamente.
 * 
 * CONCEPTO CLAVE: QUEUES - PRIORITYQUEUE
 * - PriorityQueue ordena elementos según orden natural o comparador
 * - Para Strings: orden alfabético
 * - El elemento con menor valor (según orden) es el primero
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Demostrar problema con peek() en while
 * 2. Crear PriorityQueue
 * 3. Agregar elementos desordenados
 * 4. Imprimir en orden automático
 */

import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Clase8 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Demuestra problema con peek() en while
     * - Demuestra PriorityQueue con orden natural
     */
    public static void main(String[] args) {
        // === PROBLEMA CON PEEK() EN WHILE ===
        System.out.println("=== PROBLEMA: peek() EN WHILE ===\n");
        
        Queue<String> ll = new LinkedList<>();
        ll.offer("Ana");
        ll.offer("Bob");
        ll.offer("Carlos");
        ll.offer("Daniela");
        
        System.out.println("Queue: " + ll);
        System.out.println("\nSi ejecutamos:");
        System.out.println("while (!ll.isEmpty()) {");
        System.out.println("    System.out.println(ll.peek());");
        System.out.println("}");
        System.out.println("\n¿Qué sucede?");
        System.out.println("RESPUESTA: Bucle infinito!");
        System.out.println("peek() NO elimina elementos, entonces ll.isEmpty() siempre es false");
        System.out.println("El programa se queda imprimiendo 'Ana' infinitamente.\n");
        
        // === DEMOSTRACIÓN: NO EJECUTAR ESTE CÓDIGO ===
        // while (!ll.isEmpty()) {
        //     System.out.println(ll.peek()); // ← BUCLE INFINITO
        // }
        
        // === PRIORITYQUEUE ===
        System.out.println("=== PRIORITYQUEUE (Orden Natural) ===\n");
        
        // Crear una PriorityQueue
        // Los elementos se ordenan automáticamente según orden natural
        Queue<String> pq = new PriorityQueue<>();
        
        // Agregar elementos en orden DESORDENADO
        pq.offer("Carlos");
        pq.offer("Ana");
        pq.offer("Daniela");
        pq.offer("Bob");
        
        System.out.println("Elementos agregados en este orden: Carlos, Ana, Daniela, Bob");
        System.out.println("Queue antes de procesar: " + pq);
        
        // Iterar e imprimir (deben salir en orden alfabético)
        System.out.println("\nElementos procesados (orden alfabético):");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); // poll() elimina y retorna
        }
        
        System.out.println("\nEl tamaño de la queue es: " + pq.size());
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. PRIORITYQUEUE:
         *    - Ordena elementos automáticamente
         *    - Orden natural para Strings: alfabético ascendente
         *    - El elemento con menor valor es el primero
         * 
         * 2. ORDEN DE INSERCIÓN:
         *    - No importa el orden en que agregues elementos
         *    - Siempre se procesan en orden natural
         *    - Útil para colas de prioridad
         * 
         * 3. DIFERENCIA CON LINKEDLIST:
         *    - LinkedList: mantiene orden de inserción (FIFO)
         *    - PriorityQueue: ordena según prioridad/orden natural
         * 
         * 4. USOS:
         *    - Sistema de prioridades
         *    - Algoritmos como Dijkstra
         *    - Procesamiento por prioridad
         * 
         * 5. COMPARADORES:
         *    - Se puede definir un comparador personalizado
         *    - Para ordenar de forma diferente
         */
    }
}


/*
 * EJERCICIO 06 - QUEUES - LINKEDLIST Y MÉTODOS BÁSICOS
 * 
 * ENUNCIADO:
 * Implementar un programa que agregue los siguientes nombres a una Queue de Strings: 
 * Ana, Bob, Carlos, Daniela. Utilizar peek, remove, element o poll para imprimir los 
 * nombres, uno a uno en la consola. ¿Qué método utilizaste? ¿Cuál es el tamaño de la 
 * Queue al final de tu programa?
 * 
 * CONCEPTO CLAVE: QUEUES - PRINCIPIO FIFO
 * - First In, First Out: El primer elemento en entrar es el primero en salir
 * - Métodos: offer() agrega, poll() elimina y retorna, peek() solo retorna
 * - LinkedList implementa Queue eficientemente
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear Queue con LinkedList
 * 2. Agregar nombres con offer()
 * 3. Imprimir y eliminar elementos con poll()
 * 4. Verificar tamaño final
 */

import java.util.Queue;
import java.util.LinkedList;

public class Clase8 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Crea Queue de nombres
     * - Demuestra métodos peek, poll, remove, element
     * - Imprime elementos uno a uno
     */
    public static void main(String[] args) {
        // Crear una Queue utilizando LinkedList para almacenar elementos tipo String
        Queue<String> queue = new LinkedList<>();
        
        // Agregar elementos a la Queue usando offer()
        queue.offer("Ana");
        queue.offer("Bob");
        queue.offer("Carlos");
        queue.offer("Daniela");
        
        System.out.println("=== QUEUE DE NOMBRES ===");
        System.out.println("Queue inicial: " + queue);
        System.out.println("Tamaño inicial: " + queue.size());
        
        // === DEMOSTRACIÓN DE MÉTODOS ===
        System.out.println("\n=== DEMOSTRACIÓN DE MÉTODOS ===\n");
        
        // peek(): Solo retorna, no elimina
        System.out.println("queue.peek() = " + queue.peek());
        System.out.println("Queue después de peek(): " + queue);
        System.out.println("Tamaño: " + queue.size());
        
        // element(): Solo retorna, no elimina (lanza excepción si está vacía)
        System.out.println("\nqueue.element() = " + queue.element());
        System.out.println("Queue después de element(): " + queue);
        
        // === IMPRIMIR Y ELIMINAR ELEMENTOS ===
        System.out.println("\n=== IMPRIMIENDO Y ELIMINANDO ELEMENTOS ===");
        
        // Usar poll() para imprimir y eliminar elementos uno a uno
        // poll() elimina y retorna el primer elemento, retorna null si está vacía
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        
        System.out.println("\n=== RESULTADO FINAL ===");
        System.out.println("El tamaño de la queue es: " + queue.size());
        System.out.println("Queue final: " + queue);
        
        System.out.println("\n=== RESPUESTAS ===");
        System.out.println("Método utilizado: poll()");
        System.out.println("poll() elimina y retorna el primer elemento");
        System.out.println("Es seguro usar en while porque retorna null cuando está vacía");
        System.out.println("El tamaño final es: 0");
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. MÉTODO poll():
         *    - Elimina y retorna el primer elemento (head)
         *    - Retorna null si la queue está vacía
         *    - No lanza excepción
         *    - Ideal para while (!queue.isEmpty())
         * 
         * 2. MÉTODO remove():
         *    - Similar a poll() pero lanza excepción si está vacía
         *    - Usar cuando quieres que falle si está vacía
         * 
         * 3. MÉTODO peek():
         *    - Solo retorna el primer elemento, no lo elimina
         *    - Retorna null si está vacía
         *    - Útil para "ver" sin eliminar
         * 
         * 4. MÉTODO element():
         *    - Similar a peek() pero lanza excepción si está vacía
         *    - Más estricto que peek()
         * 
         * 5. PRINCIPIO FIFO:
         *    - Los elementos se procesan en orden de llegada
         *    - "Ana" (primero en entrar) es el primero en salir
         *    - Útil para filas, procesos, etc.
         * 
         * 6. ADVERTENCIA CON FOR:
         *    - NO usar: for (int i = 0; i < queue.size(); i++) con poll()
         *    - El tamaño cambia en cada poll(), causando comportamiento inesperado
         *    - Usar: while (!queue.isEmpty()) con poll()
         */
    }
}


/*
 * EJERCICIO 08 - STACKS - LABERINTO Y BACKTRACKING
 * 
 * ENUNCIADO:
 * Supongamos que tenemos el siguiente laberinto simple. Partiendo desde la flecha verde 
 * e imaginando que estamos recorriendo el mismo, desarrollar un programa que lleve cuenta 
 * del recorrido mediante un stack de Strings, de modo que, cada que debamos tomar una 
 * decisión, agreguemos al stack "derecho", "izquierdo" o "derecha" según la dirección 
 * que debamos tomar.
 * 
 * CONCEPTO CLAVE: STACKS - PRINCIPIO LIFO Y BACKTRACKING
 * - Last In, First Out: El último elemento en entrar es el primero en salir
 * - Útil para backtracking: guardar decisiones y poder volver atrás
 * - Métodos: push() agrega, pop() elimina y retorna, peek() solo retorna
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear Stack de decisiones
 * 2. Agregar direcciones según el recorrido del laberinto
 * 3. Demostrar cómo se almacenan las decisiones
 * 4. Mostrar el camino completo
 */

import java.util.Stack;

public class Clase8 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Crea Stack con decisiones del laberinto
     * - Demuestra principio LIFO
     */
    public static void main(String[] args) {
        // Crear un Stack de Strings para almacenar las decisiones
        Stack<String> decisiones = new Stack<>();
        
        // Agregar direcciones al Stack según el recorrido del laberinto
        // Partiendo desde la flecha verde:
        decisiones.push("izquierda");  // Primera decisión
        decisiones.push("izquierda");  // Segunda decisión
        decisiones.push("derecho");    // Tercera decisión
        decisiones.push("derecha");    // Cuarta decisión
        decisiones.push("derecho");    // Quinta decisión
        
        System.out.println("=== RECORRIDO DEL LABERINTO ===\n");
        System.out.println("Decisiones almacenadas en el Stack:");
        System.out.println("(Última decisión en la cima)\n");
        
        // Mostrar el Stack completo
        System.out.println("Stack completo (de arriba a abajo):");
        System.out.println(decisiones);
        
        // Demostrar principio LIFO: la última en entrar es la primera en salir
        System.out.println("\n=== PRINCIPIO LIFO ===");
        System.out.println("Si necesitamos volver atrás, las decisiones se eliminan en orden inverso:");
        
        // Crear copia para no modificar el original
        Stack<String> copia = (Stack<String>) decisiones.clone();
        
        int paso = 1;
        while (!copia.empty()) {
            String decision = copia.pop();
            System.out.println("Paso " + paso + ": Volver - " + decision);
            paso++;
        }
        
        System.out.println("\n=== OBSERVACIONES ===");
        System.out.println("1. Las decisiones se almacenan en orden de recorrido");
        System.out.println("2. Para volver atrás, se desapilan en orden inverso (LIFO)");
        System.out.println("3. Útil para algoritmos de backtracking");
        System.out.println("4. Similar a la función 'Deshacer' (Ctrl+Z) en editores");
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. PRINCIPIO LIFO:
         *    - Last In, First Out
         *    - El último elemento agregado es el primero en salir
         *    - Como una pila de platos: el último que pones es el primero que sacas
         * 
         * 2. MÉTODO push():
         *    - Agrega elemento a la cima de la pila
         *    - Último en entrar
         * 
         * 3. MÉTODO pop():
         *    - Elimina y retorna el elemento de la cima
         *    - Primero en salir (el último que entró)
         * 
         * 4. MÉTODO peek():
         *    - Solo retorna el elemento de la cima, no lo elimina
         *    - Útil para "ver" sin eliminar
         * 
         * 5. BACKTRACKING:
         *    - Guardar decisiones en Stack
         *    - Si necesitas volver atrás, pop() te da la última decisión
         *    - Útil en: laberintos, navegadores (back button), deshacer operaciones
         * 
         * 6. APLICACIONES:
         *    - Evaluación de expresiones matemáticas
         *    - Algoritmos de búsqueda (DFS)
         *    - Parsing de código
         *    - Sistema de deshacer/rehacer
         */
    }
}


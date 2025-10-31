/*
 * PROBLEMA 05 - STACKS - CAMINO DE REGRESO EN LABERINTO
 * 
 * ENUNCIADO:
 * Desarrollar un programa que, dado el camino resolutivo para un laberinto en los 
 * términos del problema 8 de este capítulo, imprima el camino de regreso que una 
 * persona debería tomar si quisiera recorrerlo en el sentido inverso.
 * 
 * CONCEPTO CLAVE: STACKS - INVERSIÓN DE ORDEN (LIFO)
 * - El Stack almacena decisiones en orden
 * - Para volver atrás: invertir las direcciones opuestas
 * - LIFO: las últimas decisiones se revierten primero
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear Stack con camino de ida (del problema 8)
 * 2. Crear nuevo Stack para camino de regreso
 * 3. Invertir direcciones opuestas mientras se desapila
 * 4. Imprimir camino de regreso
 */

import java.util.Stack;

public class Clase8 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Crea Stack con camino de ida
     * - Genera camino de regreso invirtiendo direcciones
     * - Demuestra principio LIFO
     */
    public static void main(String[] args) {
        // Crear Stack con el camino de ida (del problema 8)
        Stack<String> caminoIda = new Stack<>();
        
        // Agregar direcciones del camino de ida
        caminoIda.push("izquierda");
        caminoIda.push("izquierda");
        caminoIda.push("derecho");
        caminoIda.push("derecha");
        caminoIda.push("derecho");
        
        System.out.println("=== CAMINO DE IDA ===");
        System.out.println("Decisiones almacenadas:");
        System.out.println(caminoIda);
        System.out.println();
        
        // Crear Stack para camino de regreso
        Stack<String> caminoRegreso = new Stack<>();
        
        // Crear copia para no modificar el original
        Stack<String> copia = (Stack<String>) caminoIda.clone();
        
        // Mientras haya decisiones en el camino de ida
        // Invertir cada dirección y agregar al camino de regreso
        while (!copia.empty()) {
            String decision = copia.pop();
            String decisionInversa = invertirDireccion(decision);
            caminoRegreso.push(decisionInversa);
        }
        
        System.out.println("=== CAMINO DE REGRESO ===");
        System.out.println("Para volver, tomar estas direcciones (en orden):");
        
        // Crear copia para mostrar sin modificar
        Stack<String> copiaRegreso = (Stack<String>) caminoRegreso.clone();
        
        int paso = 1;
        while (!copiaRegreso.empty()) {
            System.out.println("Paso " + paso + ": " + copiaRegreso.pop());
            paso++;
        }
        
        System.out.println("\nStack completo del camino de regreso:");
        System.out.println(caminoRegreso);
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. INVERSIÓN DE DIRECCIONES:
         *    - izquierda -> derecha
         *    - derecha -> izquierda
         *    - derecho -> izquierda
         *    - (o según corresponda)
         * 
         * 2. PRINCIPIO LIFO:
         *    - Al desapilar, las últimas decisiones salen primero
         *    - Perfecto para backtracking: revierte en orden inverso
         * 
         * 3. APLICACIONES:
         *    - Botón "atrás" en navegadores
         *    - Deshacer operaciones (Ctrl+Z)
         *    - Algoritmos de búsqueda (DFS backtracking)
         */
    }
    
    /**
     * MÉTODO INVERTIR DIRECCIÓN - Invierte una dirección para el camino de regreso
     * 
     * @param direccion Dirección original
     * @return String Dirección inversa
     */
    private static String invertirDireccion(String direccion) {
        switch (direccion) {
            case "izquierda":
                return "derecha";
            case "derecha":
                return "izquierda";
            case "derecho":
                return "izquierda";
            case "izquierdo":
                return "derecha";
            default:
                return direccion;
        }
    }
}


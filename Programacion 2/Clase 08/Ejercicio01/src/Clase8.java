/*
 * EJERCICIO 01 - SETS - CONCEPTOS BÁSICOS DE CONJUNTOS
 * 
 * ENUNCIADO:
 * Problema 1: Tomando en cuenta que los conjuntos no permiten elementos repetidos,
 * ¿Qué sucede si quiero agregar el color Azul al siguiente conjunto?
 * Colores = {Rojo, Amarillo, Azul}
 * 
 * Problema 2: ¿Cuál será el tamaño del conjunto después de agregar los colores 
 * Rojo y Negro al siguiente conjunto?
 * Colores = {Rojo, Amarillo, Azul}
 * 
 * CONCEPTO CLAVE: SETS - ELEMENTOS ÚNICOS
 * - Los Sets no permiten elementos duplicados
 * - Si intentas agregar un elemento que ya existe, no se agrega
 * - El método add() retorna false si el elemento ya existe
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear Set de colores
 * 2. Agregar colores iniciales
 * 3. Intentar agregar color duplicado (Problema 1)
 * 4. Agregar colores nuevos (Problema 2)
 * 5. Verificar tamaño final
 */

import java.util.Set;
import java.util.HashSet;

public class Clase8 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Demuestra que Sets no permiten duplicados
     * - Muestra el comportamiento al agregar elementos
     */
    public static void main(String[] args) {
        // === PROBLEMA 1 ===
        System.out.println("=== PROBLEMA 1 ===");
        System.out.println("Conjunto inicial: Colores = {Rojo, Amarillo, Azul}\n");
        
        // Crear Set de colores
        Set<String> colores = new HashSet<>();
        
        // Agregar colores iniciales
        colores.add("Rojo");
        colores.add("Amarillo");
        colores.add("Azul");
        
        System.out.println("Tamaño antes de agregar 'Azul': " + colores.size());
        System.out.println("Colores: " + colores);
        
        // Intentar agregar "Azul" que ya existe
        boolean agregado = colores.add("Azul");
        System.out.println("\n¿Se agregó 'Azul'? " + agregado);
        System.out.println("Tamaño después de intentar agregar 'Azul': " + colores.size());
        System.out.println("Colores: " + colores);
        System.out.println("RESPUESTA: No sucede nada, el conjunto ya contiene este elemento.");
        
        // === PROBLEMA 2 ===
        System.out.println("\n=== PROBLEMA 2 ===");
        System.out.println("Conjunto inicial: Colores = {Rojo, Amarillo, Azul}\n");
        
        // Reiniciar Set
        colores.clear();
        colores.add("Rojo");
        colores.add("Amarillo");
        colores.add("Azul");
        
        System.out.println("Tamaño inicial: " + colores.size());
        System.out.println("Colores: " + colores);
        
        // Agregar Rojo (duplicado) y Negro (nuevo)
        colores.add("Rojo");  // Duplicado, no se agrega
        colores.add("Negro"); // Nuevo, se agrega
        
        System.out.println("\nDespués de agregar 'Rojo' y 'Negro':");
        System.out.println("Tamaño: " + colores.size());
        System.out.println("Colores: " + colores);
        System.out.println("RESPUESTA: El tamaño será 4, ya que solo 'Negro' es nuevo.");
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. ELEMENTOS ÚNICOS:
         *    - Los Sets no permiten duplicados
         *    - Si agregas un elemento que ya existe, no se agrega
         *    - El método add() retorna false si el elemento ya existe
         * 
         * 2. COMPARACIÓN:
         *    - Usa equals() para determinar si un elemento ya existe
         *    - Para Strings: compara caracter por caracter
         *    - "Rojo" es igual a "Rojo", no a "rojo" (case-sensitive)
         * 
         * 3. TAMAÑO:
         *    - El tamaño solo aumenta si se agrega un elemento nuevo
         *    - Los duplicados no afectan el tamaño
         */
    }
}


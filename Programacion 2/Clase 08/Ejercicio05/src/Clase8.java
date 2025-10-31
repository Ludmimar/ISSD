/*
 * EJERCICIO 05 - SETS - SET DE OBJETOS PERSONALIZADOS
 * 
 * ENUNCIADO:
 * Implementar un HashSet que contenga elementos de tipo Estudiante, donde cada Estudiante 
 * tenga nombre y edad. Añadir al HashSet 5 estudiantes distintos y luego imprimir los elementos 
 * del set.
 * 
 * PREGUNTAS:
 * 1. ¿Cómo es el orden de los elementos respecto a la inserción?
 * 2. ¿Cómo podríamos modificar este programa para que el orden de los estudiantes sea 
 *    el mismo en el que fueron añadidos?
 * 
 * CONCEPTO CLAVE: SETS - HASHSET VS LINKEDHASHSET
 * - HashSet: No garantiza orden de inserción
 * - LinkedHashSet: Mantiene orden de inserción
 * - Para objetos personalizados: importante implementar equals() y hashCode()
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear HashSet de estudiantes
 * 2. Agregar 5 estudiantes
 * 3. Imprimir y observar el orden
 * 4. Demostrar LinkedHashSet para mantener orden
 */

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Clase8 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Crea HashSet de estudiantes
     * - Compara con LinkedHashSet
     */
    public static void main(String[] args) {
        // === HASHSET (ORDEN NO GARANTIZADO) ===
        System.out.println("=== HASHSET (Orden NO garantizado) ===\n");
        
        // Crear un HashSet para almacenar estudiantes
        Set<Estudiante> estudiantes = new HashSet<>();
        
        // Agregar 5 estudiantes distintos al HashSet
        estudiantes.add(new Estudiante("Juan", 20));
        estudiantes.add(new Estudiante("María", 22));
        estudiantes.add(new Estudiante("Pedro", 21));
        estudiantes.add(new Estudiante("Laura", 23));
        estudiantes.add(new Estudiante("Carlos", 19));
        
        // Imprimir estudiantes del HashSet
        System.out.println("Estudiantes en el HashSet (orden puede variar):");
        for (Estudiante e : estudiantes) {
            System.out.println(e.getNombre() + ", " + e.getEdad());
        }
        
        System.out.println("\nRESPUESTA 1:");
        System.out.println("El orden de los elementos en un HashSet no está garantizado");
        System.out.println("y puede cambiar después de agregar o eliminar elementos.");
        System.out.println("Por lo tanto, el orden NO seguirá el orden de inserción.\n");
        
        // === LINKEDHASHSET (ORDEN DE INSERCIÓN) ===
        System.out.println("=== LINKEDHASHSET (Orden de inserción) ===\n");
        
        // Crear un LinkedHashSet para mantener orden de inserción
        Set<Estudiante> estudiantesOrdenados = new LinkedHashSet<>();
        
        // Agregar los mismos estudiantes en el mismo orden
        estudiantesOrdenados.add(new Estudiante("Juan", 20));
        estudiantesOrdenados.add(new Estudiante("María", 22));
        estudiantesOrdenados.add(new Estudiante("Pedro", 21));
        estudiantesOrdenados.add(new Estudiante("Laura", 23));
        estudiantesOrdenados.add(new Estudiante("Carlos", 19));
        
        // Imprimir estudiantes del LinkedHashSet
        System.out.println("Estudiantes en el LinkedHashSet (orden de inserción):");
        for (Estudiante e : estudiantesOrdenados) {
            System.out.println(e.getNombre() + ", " + e.getEdad());
        }
        
        System.out.println("\nRESPUESTA 2:");
        System.out.println("Para mantener el orden de inserción, usar LinkedHashSet en lugar de HashSet:");
        System.out.println("Set<Estudiante> estudiantes = new LinkedHashSet<>();");
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. HASHSET:
         *    - No garantiza orden de inserción
         *    - Más eficiente para operaciones básicas
         *    - Orden puede cambiar entre ejecuciones
         * 
         * 2. LINKEDHASHSET:
         *    - Mantiene orden de inserción
         *    - Usa lista doblemente enlazada además de hash table
         *    - Ligeramente más lento que HashSet
         * 
         * 3. OBJETOS PERSONALIZADOS:
         *    - Para objetos personalizados, es importante implementar equals() y hashCode()
         *    - Sin estos métodos, dos objetos con los mismos valores se consideran diferentes
         *    - Esto es importante si quieres evitar duplicados correctamente
         * 
         * 4. TREESET:
         *    - Mantiene orden natural o por comparador
         *    - Útil cuando necesitas orden específico
         *    - Requiere que los objetos sean comparables
         */
    }
}


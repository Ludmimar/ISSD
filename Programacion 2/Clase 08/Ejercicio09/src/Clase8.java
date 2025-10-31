/*
 * EJERCICIO 09 - SETS - DRAGÓN CON Y SIN EQUALS()
 * 
 * ENUNCIADO:
 * Analizar qué sucede al agregar un Dragón duplicado al Set sin y con equals().
 * 
 * Demostrar:
 * - Sin equals(): dos objetos con mismos valores se consideran diferentes
 * - Con equals(): dos objetos con mismos valores se consideran iguales
 * - El Set previene duplicados solo si equals() está correctamente implementado
 * 
 * CONCEPTO CLAVE: SETS - EQUALS() Y HASHCODE()
 * - Los Sets usan equals() para determinar duplicados
 * - Sin equals() personalizado: cada objeto es único (comparación por referencia)
 * - Con equals() personalizado: objetos con mismos valores se consideran iguales
 * - Es importante implementar hashCode() junto con equals()
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear Set de dragones
 * 2. Agregar dragones con mismos valores
 * 3. Demostrar diferencia entre sin y con equals()
 */

import java.util.Set;
import java.util.HashSet;

public class Clase8 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Demuestra comportamiento sin equals()
     * - Demuestra comportamiento con equals()
     */
    public static void main(String[] args) {
        System.out.println("=== DRAGONES SIN EQUALS() (Comparación por referencia) ===\n");
        
        // Crear Set de dragones (sin equals() personalizado)
        Set<Dragon> dragones = new HashSet<>();
        
        // Crear dragones
        Dragon dragon1 = new Dragon("Fuego", 1);
        Dragon dragon2 = new Dragon("Hielo", 2);
        Dragon dragon3 = new Dragon("Rayo", 3);
        
        // Agregar dragones al Set
        dragones.add(dragon1);
        dragones.add(dragon2);
        dragones.add(dragon3);
        
        System.out.println("Tamaño después de agregar 3 dragones: " + dragones.size());
        
        // Crear dragón con mismos valores que dragon1
        Dragon dragon4 = new Dragon("Fuego", 1);
        
        System.out.println("\ndragon1: " + dragon1);
        System.out.println("dragon4: " + dragon4);
        System.out.println("¿Son iguales? " + dragon1.equals(dragon4));
        
        // Intentar agregar dragon4 (mismos valores que dragon1)
        boolean agregado = dragones.add(dragon4);
        System.out.println("¿Se agregó dragon4? " + agregado);
        System.out.println("Tamaño después de agregar dragon4: " + dragones.size());
        
        System.out.println("\nCONCLUSIÓN:");
        System.out.println("Con equals() implementado, dragon1 y dragon4 se consideran iguales.");
        System.out.println("Por lo tanto, dragon4 NO se agrega al Set (duplicado).");
        
        System.out.println("\n=== DRAGONES EN EL SET ===");
        for (Dragon d : dragones) {
            System.out.println(d);
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. EQUALS() PERSONALIZADO:
         *    - Permite definir cuándo dos objetos son iguales
         *    - En este caso: mismo nombre Y mismo id
         *    - Sin equals(): comparación por referencia (siempre diferentes)
         * 
         * 2. HASHCODE():
         *    - Debe implementarse junto con equals()
         *    - Objetos iguales deben tener mismo hashCode
         *    - Importante para el funcionamiento correcto de HashSet
         * 
         * 3. COMPARACIÓN:
         *    - dragon1.equals(dragon4) retorna true
         *    - Por lo tanto, dragon4 no se agrega al Set
         *    - El tamaño sigue siendo 3, no 4
         * 
         * 4. SIN EQUALS():
         *    - Si Dragon no tuviera equals() personalizado
         *    - Cada objeto sería único (comparación por referencia)
         *    - dragon4 se agregaría y el tamaño sería 4
         */
    }
}


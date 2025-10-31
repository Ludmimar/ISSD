/*
 * EJERCICIO 14 - COLECCIONES - ARRAYLIST VS LINKEDLIST
 * 
 * ENUNCIADO:
 * Realizar un ejercicio comparativo donde vamos a observar y medir el tiempo que tarda 
 * en realizarse una inserción en una lista ArrayList y en otra lista LinkedList.
 * 
 * PREGUNTA: ¿Cuál es la diferencia entre LinkedList y ArrayList?
 * 
 * ARRAYLIST:
 * - Implementa una matriz dinámica
 * - Acceso rápido por índice (O(1))
 * - Inserción/eliminación costosa en medio (O(n))
 * - Mejor para acceso frecuente por índice
 * 
 * LINKEDLIST:
 * - Implementa una lista doblemente enlazada
 * - Inserción/eliminación rápida (O(1) en inicio/fin)
 * - Acceso por índice más lento (O(n))
 * - Mejor para inserciones/eliminaciones frecuentes
 * 
 * CONCEPTO CLAVE: COLECCIONES - RENDIMIENTO Y MEDICIÓN
 * - System.nanoTime() permite medir tiempo de ejecución
 * - Diferentes estructuras tienen diferentes rendimientos
 * - La elección depende del uso específico
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear ArrayList y LinkedList
 * 2. Cargar 10,000 personas en ambas
 * 3. Medir tiempo de inserción en posición 0
 * 4. Medir tiempo de inserción en posición media
 * 5. Medir tiempo de inserción al final
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Clase6 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Crea ArrayList y LinkedList
     * - Carga datos iniciales
     * - Mide tiempos de inserción en diferentes posiciones
     */
    public static void main(String[] args) {
        // Crear lista basada en ArrayList
        List<Persona> listaArray = new ArrayList<>();
        
        // Crear lista basada en LinkedList
        List<Persona> listalinked = new LinkedList<>();
        
        // Variable para medir tiempo
        long antes;
        
        // Cargar 10,000 personas en ambas listas
        System.out.println("Cargando 10,000 personas en ambas listas...");
        for (int i = 0; i < 10000; i++) {
            listaArray.add(new Persona(i, "Persona" + i, i));
            listalinked.add(new Persona(i, "Persona" + i, i));
        }
        System.out.println("Carga completada.\n");
        
        // === PRUEBA 1: INSERCIÓN EN POSICIÓN 0 (INICIO) ===
        System.out.println("=== PRUEBA 1: INSERCION EN POSICION 0 (INICIO) ===");
        
        // Medir tiempo de inserción en ArrayList
        antes = System.nanoTime();
        listaArray.add(0, new Persona(10001, "Prueba", 10001));
        long tiempoArrayListInicio = System.nanoTime() - antes;
        System.out.println("Tiempo ArrayList (posicion 0): " + tiempoArrayListInicio + " nanosegundos");
        
        // Medir tiempo de inserción en LinkedList
        antes = System.nanoTime();
        listalinked.add(0, new Persona(10001, "Prueba", 10001));
        long tiempoLinkedListInicio = System.nanoTime() - antes;
        System.out.println("Tiempo LinkedList (posicion 0): " + tiempoLinkedListInicio + " nanosegundos");
        
        if (tiempoArrayListInicio > tiempoLinkedListInicio) {
            System.out.println("LinkedList es mas rapida para inserciones al inicio\n");
        } else {
            System.out.println("ArrayList es mas rapida para inserciones al inicio\n");
        }
        
        // Remover elementos agregados para mantener igualdad
        listaArray.remove(0);
        listalinked.remove(0);
        
        // === PRUEBA 2: INSERCIÓN EN POSICIÓN MEDIA ===
        System.out.println("=== PRUEBA 2: INSERCION EN POSICION MEDIA (5000) ===");
        
        // Medir tiempo de inserción en ArrayList (posición media)
        antes = System.nanoTime();
        listaArray.add(5000, new Persona(10002, "Prueba", 10002));
        long tiempoArrayListMedio = System.nanoTime() - antes;
        System.out.println("Tiempo ArrayList (posicion 5000): " + tiempoArrayListMedio + " nanosegundos");
        
        // Medir tiempo de inserción en LinkedList (posición media)
        antes = System.nanoTime();
        listalinked.add(5000, new Persona(10002, "Prueba", 10002));
        long tiempoLinkedListMedio = System.nanoTime() - antes;
        System.out.println("Tiempo LinkedList (posicion 5000): " + tiempoLinkedListMedio + " nanosegundos");
        
        if (tiempoArrayListMedio < tiempoLinkedListMedio) {
            System.out.println("ArrayList es mas rapida para inserciones en medio\n");
        } else {
            System.out.println("LinkedList es mas rapida para inserciones en medio\n");
        }
        
        // Remover elementos agregados
        listaArray.remove(5000);
        listalinked.remove(5000);
        
        // === PRUEBA 3: INSERCIÓN AL FINAL ===
        System.out.println("=== PRUEBA 3: INSERCION AL FINAL ===");
        
        // Medir tiempo de inserción en ArrayList (al final)
        antes = System.nanoTime();
        listaArray.add(new Persona(10003, "Prueba", 10003));
        long tiempoArrayListFinal = System.nanoTime() - antes;
        System.out.println("Tiempo ArrayList (al final): " + tiempoArrayListFinal + " nanosegundos");
        
        // Medir tiempo de inserción en LinkedList (al final)
        antes = System.nanoTime();
        listalinked.add(new Persona(10003, "Prueba", 10003));
        long tiempoLinkedListFinal = System.nanoTime() - antes;
        System.out.println("Tiempo LinkedList (al final): " + tiempoLinkedListFinal + " nanosegundos");
        
        if (tiempoArrayListFinal < tiempoLinkedListFinal) {
            System.out.println("ArrayList es mas rapida para inserciones al final\n");
        } else {
            System.out.println("LinkedList es mas rapida para inserciones al final\n");
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. ARRAYLIST:
         *    - Acceso directo por índice (muy rápido)
         *    - Inserción en medio requiere desplazar elementos
         *    - Mejor para: acceso frecuente, iteración
         *    - Peor para: inserciones/eliminaciones frecuentes en medio
         * 
         * 2. LINKEDLIST:
         *    - Estructura de nodos enlazados
         *    - Inserción rápida en inicio/fin (solo cambia enlaces)
         *    - Acceso por índice requiere recorrer desde inicio/fin
         *    - Mejor para: inserciones/eliminaciones frecuentes
         *    - Peor para: acceso aleatorio por índice
         * 
         * 3. MEDICIÓN DE TIEMPO:
         *    - System.nanoTime() mide en nanosegundos
         *    - Los tiempos varían según el sistema
         *    - Importante: ejecutar varias veces para promediar
         * 
         * 4. ELECCIÓN ADECUADA:
         *    - Si necesitas acceso por índice frecuente: ArrayList
         *    - Si necesitas insertar/eliminar frecuentemente: LinkedList
         *    - Si solo iteras secuencialmente: cualquiera (ArrayList suele ser más eficiente)
         * 
         * 5. RESULTADOS ESPERADOS:
         *    - Inserción inicio: LinkedList más rápida
         *    - Inserción medio: ArrayList puede ser similar o mejor
         *    - Inserción final: Similar en ambas
         */
    }
}


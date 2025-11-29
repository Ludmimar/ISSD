package com.issd;

import java.util.Random;

/**
 * Problema Propuesto 1 - Clase 12: Bubble Sort Multi-thread
 * 
 * Este programa compara el rendimiento de ordenar arrays usando:
 * a) Un solo thread (secuencial)
 * b) Múltiples threads (concurrente)
 * 
 * <p>Se ordenan 4 arrays de 100,000 números cada uno usando Bubble Sort
 * y se mide el tiempo de ejecución en cada caso.</p>
 * 
 * @author Ludmila Martos
 * @version 1.0.0
 */
public class App {
    
    // Tamaño de los arrays a ordenar
    private static final int ARRAY_SIZE = 100000;
    
    public static void main(String[] args) {
        System.out.println("═══════════════════════════════════════════════════════════════");
        System.out.println("   PROBLEMA PROPUESTO 1 - BUBBLE SORT MULTI-THREAD");
        System.out.println("═══════════════════════════════════════════════════════════════");
        System.out.println();
        System.out.println("📊 Configuración:");
        System.out.println("   - 4 arrays de " + ARRAY_SIZE + " elementos cada uno");
        System.out.println("   - Algoritmo: Bubble Sort");
        System.out.println();
        
        // ═══════════════════════════════════════════════════════════════
        // PARTE A: Ordenamiento SINGLE-THREAD (secuencial)
        // ═══════════════════════════════════════════════════════════════
        System.out.println("───────────────────────────────────────────────────────────────");
        System.out.println("📌 PARTE A: Ordenamiento SINGLE-THREAD (secuencial)");
        System.out.println("───────────────────────────────────────────────────────────────");
        
        // Crear y llenar los arrays
        int[] array1 = new int[ARRAY_SIZE];
        int[] array2 = new int[ARRAY_SIZE];
        int[] array3 = new int[ARRAY_SIZE];
        int[] array4 = new int[ARRAY_SIZE];
        
        fillArray(array1);
        fillArray(array2);
        fillArray(array3);
        fillArray(array4);
        
        System.out.println("✅ Arrays creados y llenados con números aleatorios");
        System.out.println("🔄 Ordenando arrays uno por uno (secuencial)...");
        System.out.println();
        
        // Medir tiempo de ordenamiento secuencial
        long startSingle = System.currentTimeMillis();
        
        bubbleSort(array1);
        System.out.println("   [✓] Array 1 ordenado");
        
        bubbleSort(array2);
        System.out.println("   [✓] Array 2 ordenado");
        
        bubbleSort(array3);
        System.out.println("   [✓] Array 3 ordenado");
        
        bubbleSort(array4);
        System.out.println("   [✓] Array 4 ordenado");
        
        long endSingle = System.currentTimeMillis();
        long tiempoSingleThread = endSingle - startSingle;
        
        System.out.println();
        System.out.println("⏱️  Tiempo SINGLE-THREAD: " + tiempoSingleThread + " ms");
        System.out.println();
        
        // ═══════════════════════════════════════════════════════════════
        // PARTE B: Ordenamiento MULTI-THREAD (concurrente)
        // ═══════════════════════════════════════════════════════════════
        System.out.println("───────────────────────────────────────────────────────────────");
        System.out.println("📌 PARTE B: Ordenamiento MULTI-THREAD (concurrente)");
        System.out.println("───────────────────────────────────────────────────────────────");
        
        // Volver a llenar los arrays (desordenar)
        fillArray(array1);
        fillArray(array2);
        fillArray(array3);
        fillArray(array4);
        
        System.out.println("✅ Arrays rellenados con nuevos números aleatorios");
        System.out.println("🔄 Ordenando arrays en paralelo (multi-thread)...");
        System.out.println();
        
        // Crear los threads para ordenar en paralelo
        Thread t1 = new Thread(new OrdenadorRunnable(array1, "Array 1"));
        Thread t2 = new Thread(new OrdenadorRunnable(array2, "Array 2"));
        Thread t3 = new Thread(new OrdenadorRunnable(array3, "Array 3"));
        Thread t4 = new Thread(new OrdenadorRunnable(array4, "Array 4"));
        
        // Medir tiempo de ordenamiento multi-thread
        long startMulti = System.currentTimeMillis();
        
        // Iniciar todos los threads simultáneamente
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        // Esperar a que todos los threads terminen
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        long endMulti = System.currentTimeMillis();
        long tiempoMultiThread = endMulti - startMulti;
        
        System.out.println();
        System.out.println("⏱️  Tiempo MULTI-THREAD: " + tiempoMultiThread + " ms");
        System.out.println();
        
        // ═══════════════════════════════════════════════════════════════
        // PARTE C: Comparación de resultados
        // ═══════════════════════════════════════════════════════════════
        System.out.println("───────────────────────────────────────────────────────────────");
        System.out.println("📌 PARTE C: Comparación de resultados");
        System.out.println("───────────────────────────────────────────────────────────────");
        System.out.println();
        System.out.println("┌─────────────────────┬──────────────────┐");
        System.out.println("│ Método              │ Tiempo (ms)      │");
        System.out.println("├─────────────────────┼──────────────────┤");
        System.out.printf("│ Single-Thread       │ %,14d   │%n", tiempoSingleThread);
        System.out.printf("│ Multi-Thread        │ %,14d   │%n", tiempoMultiThread);
        System.out.println("└─────────────────────┴──────────────────┘");
        System.out.println();
        
        double mejora = ((double) tiempoSingleThread / tiempoMultiThread);
        System.out.printf("📈 Mejora de rendimiento: %.2fx más rápido%n", mejora);
        System.out.println();
        
        System.out.println("═══════════════════════════════════════════════════════════════");
        System.out.println("🎓 CONCLUSIÓN:");
        System.out.println("   El ordenamiento multi-thread es más rápido porque cada");
        System.out.println("   array se ordena en un núcleo diferente del procesador.");
        System.out.println("   La mejora depende del número de núcleos disponibles.");
        System.out.println("═══════════════════════════════════════════════════════════════");
    }
    
    /**
     * Ordena un array usando el algoritmo Bubble Sort.
     * 
     * <p>Complejidad: O(n²)</p>
     * 
     * @param array El array a ordenar
     */
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Intercambiar elementos
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    
    /**
     * Llena un array con números enteros aleatorios entre 1 y 9999.
     * 
     * @param array El array a llenar
     */
    public static void fillArray(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(9999) + 1;
        }
    }
    
    /**
     * Clase Runnable que ordena un array usando Bubble Sort.
     */
    public static class OrdenadorRunnable implements Runnable {
        
        private int[] array;
        private String nombre;
        
        /**
         * Constructor del ordenador.
         * 
         * @param array El array a ordenar
         * @param nombre Nombre identificador para mostrar en consola
         */
        public OrdenadorRunnable(int[] array, String nombre) {
            this.array = array;
            this.nombre = nombre;
        }
        
        @Override
        public void run() {
            bubbleSort(array);
            System.out.println("   [✓] " + nombre + " ordenado");
        }
    }
}


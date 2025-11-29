package com.issd;

/**
 * Problema 4 - Clase 12: Multi-threading con implements Runnable
 * 
 * Este programa crea múltiples hilos implementando la interfaz Runnable
 * en lugar de extender la clase Thread.
 * 
 * <p>Ventajas de usar Runnable sobre extends Thread:</p>
 * <ul>
 *   <li>Permite herencia de otra clase (Java no soporta herencia múltiple)</li>
 *   <li>Mejor separación de responsabilidades</li>
 *   <li>Mayor flexibilidad para ejecutar en diferentes contextos</li>
 *   <li>Promueve la composición sobre la herencia</li>
 * </ul>
 * 
 * @author Ludmila Martos
 * @version 1.0.0
 */
public class App {
    
    public static void main(String[] args) {
        System.out.println("═══════════════════════════════════════════════════════════════");
        System.out.println("   PROBLEMA 4 - MULTI-THREADING CON IMPLEMENTS RUNNABLE");
        System.out.println("═══════════════════════════════════════════════════════════════");
        System.out.println();
        System.out.println("⚠️  NOTA: Ejecuta este programa varias veces y observa cómo");
        System.out.println("   el output cambia debido a la ejecución concurrente.");
        System.out.println();
        System.out.println("───────────────────────────────────────────────────────────────");
        System.out.println();
        
        // Crear los objetos Runnable
        MiHilo runnable1 = new MiHilo("Hilo-1");
        MiHilo runnable2 = new MiHilo("Hilo-2");
        MiHilo runnable3 = new MiHilo("Hilo-3");
        MiHilo runnable4 = new MiHilo("Hilo-4");
        
        // Crear los Thread pasando los Runnable como argumento
        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable2);
        Thread t3 = new Thread(runnable3);
        Thread t4 = new Thread(runnable4);
        
        // Iniciar todos los hilos
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        // Esperar a que todos los hilos terminen
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println();
        System.out.println("───────────────────────────────────────────────────────────────");
        System.out.println("✅ Todos los hilos han terminado su ejecución");
        System.out.println("═══════════════════════════════════════════════════════════════");
    }
    
    /**
     * Clase que implementa Runnable para crear un hilo de ejecución.
     * 
     * <p>Para crear un hilo implementando Runnable:</p>
     * <ol>
     *   <li>Implementar la interfaz Runnable con 'implements Runnable'</li>
     *   <li>Implementar el método run() con la lógica a ejecutar</li>
     *   <li>Crear un Thread pasando la instancia de Runnable</li>
     *   <li>Llamar a start() en el Thread</li>
     * </ol>
     */
    public static class MiHilo implements Runnable {
        
        private String nombre;
        
        /**
         * Constructor que establece el nombre del hilo.
         * 
         * @param nombre El nombre identificador del hilo
         */
        public MiHilo(String nombre) {
            this.nombre = nombre;
        }
        
        /**
         * Método que se ejecuta cuando el hilo inicia.
         * Imprime los números del 0 al 99, organizados en líneas de 10 números.
         */
        @Override
        public void run() {
            System.out.println("[" + nombre + "] Iniciando...");
            
            StringBuilder linea = new StringBuilder();
            linea.append("[").append(nombre).append("] ");
            
            for (int i = 0; i < 100; i++) {
                linea.append(String.format("%2d", i));
                
                if ((i + 1) % 10 == 0) {
                    System.out.println(linea.toString());
                    linea = new StringBuilder();
                    linea.append("[").append(nombre).append("] ");
                } else {
                    linea.append(", ");
                }
            }
            
            System.out.println("[" + nombre + "] ¡Terminado!");
        }
    }
}


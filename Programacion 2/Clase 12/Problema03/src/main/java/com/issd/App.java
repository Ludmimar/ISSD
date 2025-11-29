package com.issd;

/**
 * Problema 3 - Clase 12: Multi-threading con extends Thread
 * 
 * Este programa crea múltiples hilos que imprimen los números del 1 al 100
 * utilizando la extensión de la clase Thread.
 * 
 * <p>Observación importante: Al ejecutar el programa varias veces, notarás
 * que el output es diferente cada vez. Esto se debe a que los hilos se
 * ejecutan concurrentemente y el orden de ejecución no está garantizado.</p>
 * 
 * @author Ludmila Martos
 * @version 1.0.0
 */
public class App {
    
    public static void main(String[] args) {
        System.out.println("═══════════════════════════════════════════════════════════════");
        System.out.println("    PROBLEMA 3 - MULTI-THREADING CON EXTENDS THREAD");
        System.out.println("═══════════════════════════════════════════════════════════════");
        System.out.println();
        System.out.println("⚠️  NOTA: Ejecuta este programa varias veces y observa cómo");
        System.out.println("   el output cambia debido a la ejecución concurrente.");
        System.out.println();
        System.out.println("───────────────────────────────────────────────────────────────");
        System.out.println();
        
        // Crear 4 hilos
        MiHilo hilo1 = new MiHilo("Hilo-1");
        MiHilo hilo2 = new MiHilo("Hilo-2");
        MiHilo hilo3 = new MiHilo("Hilo-3");
        MiHilo hilo4 = new MiHilo("Hilo-4");
        
        // Iniciar todos los hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        
        // Esperar a que todos los hilos terminen para mostrar el mensaje final
        try {
            hilo1.join();
            hilo2.join();
            hilo3.join();
            hilo4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println();
        System.out.println("───────────────────────────────────────────────────────────────");
        System.out.println("✅ Todos los hilos han terminado su ejecución");
        System.out.println("═══════════════════════════════════════════════════════════════");
    }
    
    /**
     * Clase que extiende Thread para crear un hilo de ejecución.
     * 
     * <p>Para crear un hilo extendiendo Thread:</p>
     * <ol>
     *   <li>Extender la clase Thread con 'extends Thread'</li>
     *   <li>Sobrescribir el método run() con la lógica a ejecutar</li>
     *   <li>Crear una instancia y llamar a start()</li>
     * </ol>
     */
    public static class MiHilo extends Thread {
        
        /**
         * Constructor que establece el nombre del hilo.
         * 
         * @param nombre El nombre del hilo
         */
        public MiHilo(String nombre) {
            super(nombre);
        }
        
        /**
         * Método que se ejecuta cuando el hilo inicia.
         * Imprime los números del 0 al 99, organizados en líneas de 10 números.
         */
        @Override
        public void run() {
            System.out.println("[" + this.getName() + "] Iniciando...");
            
            StringBuilder linea = new StringBuilder();
            linea.append("[").append(this.getName()).append("] ");
            
            for (int i = 0; i < 100; i++) {
                linea.append(String.format("%2d", i));
                
                if ((i + 1) % 10 == 0) {
                    System.out.println(linea.toString());
                    linea = new StringBuilder();
                    linea.append("[").append(this.getName()).append("] ");
                } else {
                    linea.append(", ");
                }
            }
            
            System.out.println("[" + this.getName() + "] ¡Terminado!");
        }
    }
}


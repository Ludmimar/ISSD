package com.issd;

import java.util.ArrayList;
import java.util.List;

/**
 * Problema 5 - Clase 12: Sincronización con join()
 * 
 * Este programa demuestra cómo evitar problemas de acceso concurrente
 * (ConcurrentModificationException) utilizando el método join().
 * 
 * <p>El método join() hace que el hilo actual espere hasta que el hilo
 * sobre el que se llama termine su ejecución.</p>
 * 
 * <p>Problema original: Un hilo agrega números a una lista mientras otro
 * intenta leerla, lo que puede causar ConcurrentModificationException.</p>
 * 
 * <p>Solución: Usar join() para asegurar que el hilo que escribe termine
 * antes de que el hilo que lee comience.</p>
 * 
 * @author Ludmila Martos
 * @version 1.0.0
 */
public class App {
    
    public static void main(String[] args) {
        System.out.println("═══════════════════════════════════════════════════════════════");
        System.out.println("       PROBLEMA 5 - SINCRONIZACIÓN CON join()");
        System.out.println("═══════════════════════════════════════════════════════════════");
        System.out.println();
        
        // Lista compartida entre hilos
        List<Integer> listaDeNumeros = new ArrayList<>();
        
        // Crear los hilos
        Thread t1 = new Thread(new AgregarNumeros(listaDeNumeros));
        Thread t2 = new Thread(new ImprimirNumeros(listaDeNumeros));
        
        System.out.println("🔄 Iniciando hilo que AGREGA números a la lista...");
        t1.start();
        
        // SOLUCIÓN: Esperamos a que t1 termine antes de iniciar t2
        try {
            t1.join(); // El hilo principal espera a que t1 termine
            System.out.println("✅ Hilo de agregar números completado.");
            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("🔄 Iniciando hilo que LEE números de la lista...");
        t2.start();
        
        // Esperar a que t2 termine
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println();
        System.out.println("═══════════════════════════════════════════════════════════════");
        System.out.println("📊 RESUMEN:");
        System.out.println("   - Total de números en la lista: " + listaDeNumeros.size());
        System.out.println("   - Sin ConcurrentModificationException gracias a join()");
        System.out.println("═══════════════════════════════════════════════════════════════");
    }
    
    /**
     * Clase Runnable que agrega números a una lista compartida.
     */
    public static class AgregarNumeros implements Runnable {
        
        private List<Integer> listaDeNumeros;
        
        /**
         * Constructor que recibe la lista compartida.
         * 
         * @param listaDeNumeros La lista donde se agregarán los números
         */
        public AgregarNumeros(List<Integer> listaDeNumeros) {
            this.listaDeNumeros = listaDeNumeros;
        }
        
        @Override
        public void run() {
            System.out.println("   [AgregarNumeros] Agregando 1000 números...");
            for (int i = 0; i < 1000; i++) {
                listaDeNumeros.add(i);
            }
            System.out.println("   [AgregarNumeros] ¡Completado!");
        }
    }
    
    /**
     * Clase Runnable que lee e imprime números de una lista compartida.
     */
    public static class ImprimirNumeros implements Runnable {
        
        private List<Integer> listaDeNumeros;
        
        /**
         * Constructor que recibe la lista compartida.
         * 
         * @param listaDeNumeros La lista de donde se leerán los números
         */
        public ImprimirNumeros(List<Integer> listaDeNumeros) {
            this.listaDeNumeros = listaDeNumeros;
        }
        
        @Override
        public void run() {
            System.out.println("   [ImprimirNumeros] Leyendo números (mostrando cada 100)...");
            
            int contador = 0;
            StringBuilder sb = new StringBuilder();
            sb.append("   [ImprimirNumeros] ");
            
            for (int numero : listaDeNumeros) {
                if (numero % 100 == 0) {
                    sb.append(numero).append(" ");
                }
                contador++;
            }
            
            System.out.println(sb.toString());
            System.out.println("   [ImprimirNumeros] Total leídos: " + contador);
            System.out.println("   [ImprimirNumeros] ¡Completado!");
        }
    }
}


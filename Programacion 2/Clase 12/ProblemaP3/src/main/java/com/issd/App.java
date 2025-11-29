package com.issd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Problema Propuesto 3 - Clase 12: App Web Filtrar Números Primos
 * 
 * Aplicación web que permite al usuario ingresar una lista de números
 * separados por coma y obtiene como resultado todos los números primos
 * de esa lista.
 * 
 * <p>Características:</p>
 * <ul>
 *   <li>Backend en Java con Spring Boot</li>
 *   <li>Frontend en HTML/CSS/JavaScript</li>
 *   <li>Uso de programación concurrente para mejorar rendimiento</li>
 *   <li>Interfaz gráfica con CSS moderno</li>
 * </ul>
 * 
 * @author Ludmila Martos
 * @version 1.0.0
 */
@SpringBootApplication
public class App {
    
    public static void main(String[] args) {
        System.out.println("═══════════════════════════════════════════════════════════════");
        System.out.println("     PROBLEMA PROPUESTO 3 - FILTRADOR DE NÚMEROS PRIMOS");
        System.out.println("═══════════════════════════════════════════════════════════════");
        System.out.println();
        System.out.println("🔢 Servidor iniciando en: http://localhost:8080");
        System.out.println();
        System.out.println("📋 INSTRUCCIONES:");
        System.out.println("   1. Abre el archivo 'index.html' en tu navegador");
        System.out.println("   2. Ingresa números separados por coma (ej: 1,2,3,5,8,13)");
        System.out.println("   3. Presiona 'Filtrar Primos' para ver los resultados");
        System.out.println();
        System.out.println("🔗 Endpoint disponible:");
        System.out.println("   GET /filtrar?numeros=1,2,3,5,8,13,21");
        System.out.println("═══════════════════════════════════════════════════════════════");
        
        SpringApplication.run(App.class, args);
    }
}


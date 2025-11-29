package com.issd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Ejemplo Web - Clase 12: Aplicación Web con Backend Java
 * 
 * Este ejemplo demuestra cómo crear una aplicación web completa con:
 * - Backend en Java usando Spring Boot
 * - Frontend en HTML/CSS/JavaScript
 * - Comunicación mediante XMLHttpRequest
 * 
 * <p>Para usar esta aplicación:</p>
 * <ol>
 *   <li>Ejecutar esta clase para iniciar el servidor Spring Boot</li>
 *   <li>Abrir el archivo index.html en un navegador</li>
 *   <li>Ingresar una temperatura y presionar "Transformar!"</li>
 * </ol>
 * 
 * @author Ludmila Martos
 * @version 1.0.0
 */
@SpringBootApplication
public class App {
    
    public static void main(String[] args) {
        System.out.println("═══════════════════════════════════════════════════════════════");
        System.out.println("        EJEMPLO WEB - CONVERSOR DE TEMPERATURA");
        System.out.println("═══════════════════════════════════════════════════════════════");
        System.out.println();
        System.out.println("🌡️  Servidor iniciando en: http://localhost:8080");
        System.out.println();
        System.out.println("📋 INSTRUCCIONES:");
        System.out.println("   1. Abre el archivo 'index.html' en tu navegador");
        System.out.println("   2. Ingresa una temperatura en Celsius");
        System.out.println("   3. Presiona 'Transformar!' para convertir a Fahrenheit");
        System.out.println();
        System.out.println("🔗 Endpoints disponibles:");
        System.out.println("   GET /transformar?temp=30  → Convierte 30°C a Fahrenheit");
        System.out.println("═══════════════════════════════════════════════════════════════");
        
        SpringApplication.run(App.class, args);
    }
}


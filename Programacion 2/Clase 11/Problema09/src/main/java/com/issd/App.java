package com.issd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Problema 9 - Clase 11: Spring Boot - Transformar a Mayúsculas
 * 
 * Aplicación Spring Boot que transforma texto a mayúsculas
 * recibiendo el mensaje como parámetro en la URL.
 * 
 * Ejemplo de uso: http://localhost:8080/transformar?mensaje=hola%20mundo
 * 
 * @author Ludmila Martos
 * @version 1.0.0
 */
@SpringBootApplication
public class App {
    
    public static void main(String[] args) {
        System.out.println("═══════════════════════════════════════════════════════════════");
        System.out.println("           PROBLEMA 9 - TRANSFORMAR A MAYÚSCULAS");
        System.out.println("═══════════════════════════════════════════════════════════════");
        System.out.println("Iniciando servidor Spring Boot...");
        System.out.println("Accede a: http://localhost:8080/transformar?mensaje=hola%20mundo");
        System.out.println("═══════════════════════════════════════════════════════════════");
        
        SpringApplication.run(App.class, args);
    }
}



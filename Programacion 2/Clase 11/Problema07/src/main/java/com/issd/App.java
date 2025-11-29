package com.issd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Problema 7 - Clase 11: Spring Boot - Autor
 * 
 * Aplicación Spring Boot que muestra información del autor
 * cuando se accede a la URL http://localhost:8080/autor
 * 
 * @author Ludmila Martos
 * @version 1.0.0
 */
@SpringBootApplication
public class App {
    
    public static void main(String[] args) {
        System.out.println("═══════════════════════════════════════════════════════════════");
        System.out.println("           PROBLEMA 7 - SPRING BOOT AUTOR");
        System.out.println("═══════════════════════════════════════════════════════════════");
        System.out.println("Iniciando servidor Spring Boot...");
        System.out.println("Accede a: http://localhost:8080/autor");
        System.out.println("═══════════════════════════════════════════════════════════════");
        
        SpringApplication.run(App.class, args);
    }
}



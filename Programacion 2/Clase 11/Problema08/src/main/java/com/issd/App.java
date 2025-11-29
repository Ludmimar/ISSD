package com.issd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Problema 8 - Clase 11: Spring Boot - Contador de Visitas
 * 
 * Aplicación Spring Boot que cuenta las visitas
 * cada vez que se accede a la URL http://localhost:8080/contar
 * 
 * @author Ludmila Martos
 * @version 1.0.0
 */
@SpringBootApplication
public class App {
    
    public static void main(String[] args) {
        System.out.println("═══════════════════════════════════════════════════════════════");
        System.out.println("           PROBLEMA 8 - CONTADOR DE VISITAS");
        System.out.println("═══════════════════════════════════════════════════════════════");
        System.out.println("Iniciando servidor Spring Boot...");
        System.out.println("Accede a: http://localhost:8080/contar");
        System.out.println("Refresca la página (F5) para ver el contador incrementarse");
        System.out.println("═══════════════════════════════════════════════════════════════");
        
        SpringApplication.run(App.class, args);
    }
}



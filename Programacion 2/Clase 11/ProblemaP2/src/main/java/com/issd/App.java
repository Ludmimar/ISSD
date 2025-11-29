package com.issd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Problema Propuesto 2 - Clase 11: Spring Boot - Números Primos
 * 
 * Aplicación Spring Boot que recibe un número por URL y devuelve
 * todos los números primos entre 2 y dicho número.
 * 
 * Ejemplo de uso: http://localhost:8080/primos?numero=20
 * Resultado: 2,3,5,7,11,13,17,19
 * 
 * @author Ludmila Martos
 * @version 1.0.0
 */
@SpringBootApplication
public class App {
    
    public static void main(String[] args) {
        System.out.println("═══════════════════════════════════════════════════════════════");
        System.out.println("           PROBLEMA PROPUESTO 2 - NÚMEROS PRIMOS");
        System.out.println("═══════════════════════════════════════════════════════════════");
        System.out.println("Iniciando servidor Spring Boot...");
        System.out.println("Accede a: http://localhost:8080/primos?numero=20");
        System.out.println("═══════════════════════════════════════════════════════════════");
        
        SpringApplication.run(App.class, args);
    }
}



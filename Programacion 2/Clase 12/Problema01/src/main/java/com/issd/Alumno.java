package com.issd;

import lombok.Data;

/**
 * Problema 1 - Clase 12: Lombok Annotations
 * 
 * Clase Alumno que utiliza la anotación @Data de Lombok para generar
 * automáticamente: getters, setters, toString(), equals(), hashCode()
 * y constructor sin argumentos.
 * 
 * La anotación @Data equivale a usar:
 * - @Getter
 * - @Setter
 * - @ToString
 * - @EqualsAndHashCode
 * - @RequiredArgsConstructor
 * 
 * @author Ludmila Martos
 * @version 1.0.0
 */
@Data
public class Alumno {
    
    /**
     * Nombre completo del alumno
     */
    private String nombre;
    
    /**
     * Edad del alumno en años
     */
    private int edad;
    
    /**
     * Array con las notas del alumno
     */
    private int[] notas;
    
    /**
     * Indica si el alumno está cursando actualmente
     */
    private boolean cursando;
}


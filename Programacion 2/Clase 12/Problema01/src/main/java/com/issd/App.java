package com.issd;

import java.util.Arrays;

/**
 * Problema 1 - Clase 12: Lombok Annotations
 * 
 * Este programa demuestra el uso de Lombok para generar automáticamente
 * getters, setters y otros métodos comunes en una clase Java.
 * 
 * NOTA: Para que Lombok funcione correctamente en tu IDE, necesitas:
 * 1. Descargar lombok.jar desde https://projectlombok.org/download
 * 2. Ejecutar: java -jar lombok.jar
 * 3. Seleccionar tu IDE y hacer clic en "Install/Update"
 * 4. Reiniciar el IDE
 * 
 * @author Ludmila Martos
 * @version 1.0.0
 */
public class App {
    
    public static void main(String[] args) {
        System.out.println("═══════════════════════════════════════════════════════════════");
        System.out.println("          PROBLEMA 1 - LOMBOK ANNOTATIONS");
        System.out.println("═══════════════════════════════════════════════════════════════");
        System.out.println();
        
        // Crear una instancia de Alumno
        Alumno alumno = new Alumno();
        
        // Usar los setters generados por Lombok
        alumno.setNombre("Juan Pérez");
        alumno.setEdad(21);
        alumno.setNotas(new int[] {8, 10, 10, 9});
        alumno.setCursando(true);
        
        // Usar los getters generados por Lombok
        System.out.println("📚 DATOS DEL ALUMNO (usando getters):");
        System.out.println("───────────────────────────────────────────────────────────────");
        System.out.println("  Nombre:   " + alumno.getNombre());
        System.out.println("  Edad:     " + alumno.getEdad() + " años");
        System.out.println("  Notas:    " + Arrays.toString(alumno.getNotas()));
        System.out.println("  Cursando: " + (alumno.isCursando() ? "Sí" : "No"));
        System.out.println();
        
        // Usar toString() generado por Lombok
        System.out.println("📄 MÉTODO toString() (generado por @Data):");
        System.out.println("───────────────────────────────────────────────────────────────");
        System.out.println("  " + alumno);
        System.out.println();
        
        // Demostrar equals() generado por Lombok
        Alumno alumno2 = new Alumno();
        alumno2.setNombre("Juan Pérez");
        alumno2.setEdad(21);
        alumno2.setNotas(new int[] {8, 10, 10, 9});
        alumno2.setCursando(true);
        
        System.out.println("🔍 COMPARACIÓN CON equals() (generado por @Data):");
        System.out.println("───────────────────────────────────────────────────────────────");
        System.out.println("  alumno.equals(alumno2): " + alumno.equals(alumno2));
        System.out.println("  alumno.hashCode():      " + alumno.hashCode());
        System.out.println("  alumno2.hashCode():     " + alumno2.hashCode());
        System.out.println();
        
        System.out.println("═══════════════════════════════════════════════════════════════");
        System.out.println("✅ Lombok generó automáticamente todos los métodos!");
        System.out.println("═══════════════════════════════════════════════════════════════");
    }
}


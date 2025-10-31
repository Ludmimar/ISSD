/*
 * EJERCICIO 07 - MAPAS - MAPA DE CALIFICACIONES CON ENTRADA DEL USUARIO
 * 
 * ENUNCIADO:
 * Declarar un mapa vacío con llaves de tipo String y valores de tipo Integer. 
 * Realizar un ciclo de iteración donde se le pide al usuario ingresar un nombre 
 * y una calificación, para 5 alumnos. Guardar estos datos en el mapa e imprimirlos 
 * luego con la estructura "Nombre: calificación"
 * 
 * CONCEPTO CLAVE: MAPAS - INTERACCIÓN CON USUARIO
 * - Los mapas pueden llenarse dinámicamente con datos del usuario
 * - Scanner permite leer datos desde la consola
 * - Ciclos for permiten repetir la entrada de datos
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear mapa vacío
 * 2. Crear Scanner para entrada de datos
 * 3. Ciclo for para pedir 5 alumnos
 * 4. Agregar nombre y calificación al mapa
 * 5. Iterar e imprimir resultados
 */

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Clase7 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Pide datos de 5 alumnos
     * - Almacena en mapa
     * - Imprime calificaciones
     */
    public static void main(String[] args) {
        // Crear mapa vacío de calificaciones
        // Llave: nombre del alumno (String)
        // Valor: calificación (Integer)
        Map<String, Integer> calificaciones = new HashMap<>();
        
        // Crear Scanner para leer datos del teclado
        Scanner teclado = new Scanner(System.in);
        
        // Ciclo para pedir 5 alumnos
        for (int i = 1; i <= 5; i++) {
            System.out.println("--- Alumno " + i + " ---");
            
            // Pedir nombre del alumno
            System.out.print("Ingrese el nombre: ");
            String nombre = teclado.nextLine();
            
            // Pedir calificación
            System.out.print("Ingrese la calificacion: ");
            int nota = teclado.nextInt();
            teclado.nextLine(); // Consumir el salto de línea después de nextInt()
            
            // Agregar al mapa
            calificaciones.put(nombre, nota);
            
            System.out.println(); // Línea en blanco para separar
        }
        
        // Imprimir calificaciones usando iteración
        System.out.println("---- Calificaciones ----");
        for (String nombre : calificaciones.keySet()) {
            System.out.println(nombre + ": " + calificaciones.get(nombre));
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. MAPA VACÍO:
         *    - Se crea sin elementos iniciales
         *    - Se va llenando con datos del usuario
         *    - El tamaño crece conforme se agregan elementos
         * 
         * 2. SCANNER:
         *    - nextLine() lee una línea completa de texto
         *    - nextInt() lee un entero
         *    - Después de nextInt() se debe consumir el salto de línea
         * 
         * 3. CICLO DE ENTRADA:
         *    - Se ejecuta exactamente 5 veces
         *    - Cada iteración pide nombre y calificación
         *    - Los datos se agregan al mapa con .put()
         * 
         * 4. ITERACIÓN FINAL:
         *    - Itera sobre todas las llaves (nombres)
         *    - Imprime nombre y calificación asociada
         *    - No importa el orden de inserción
         * 
         * 5. VENTAJAS:
         *    - Fácil cambiar la cantidad de alumnos
         *    - Los datos se almacenan dinámicamente
         *    - Búsqueda rápida por nombre después
         */
    }
}


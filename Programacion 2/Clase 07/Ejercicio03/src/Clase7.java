/*
 * EJERCICIO 03 - MAPAS - MAPA DE PERSONAS CON DNI
 * 
 * ENUNCIADO:
 * Definir una clase llamada Persona, con un campo de tipo String para el nombre 
 * y un constructor acorde. Programar el getter para este campo. Instanciar 3 personas 
 * y agregarlas al mapa utilizando como llave un DNI ficticio. Imprimir el nombre de 
 * las tres personas en el Mapa utilizando el método .get() para obtener cada persona.
 * 
 * CONCEPTO CLAVE: MAPAS - OBJETOS COMO VALORES
 * - Los mapas pueden tener objetos personalizados como valores
 * - Sintaxis: Map<TipoLlave, TipoObjeto> mapa = new HashMap<>();
 * - Permite asociar identificadores (DNI) con objetos (Persona)
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear mapa de tipo Map<Integer, Persona>
 * 2. Instanciar 3 personas con nombres
 * 3. Agregar al mapa usando DNI como llave
 * 4. Imprimir nombres usando .get() y getNombre()
 */

import java.util.Map;
import java.util.HashMap;

public class Clase7 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Crea mapa de personas con DNI como llave
     * - Agrega 3 personas al mapa
     * - Imprime los nombres de las personas
     */
    public static void main(String[] args) {
        // Crear mapa de personas
        // Llave: DNI (Integer)
        // Valor: Persona (objeto de la clase Persona)
        Map<Integer, Persona> mapaDePersonas = new HashMap<>();
        
        // Instanciar 3 personas y agregarlas al mapa
        // Usar DNI ficticio como llave
        mapaDePersonas.put(123456789, new Persona("Kenny"));
        mapaDePersonas.put(3216544, new Persona("Cartman"));
        mapaDePersonas.put(5554687, new Persona("Randy"));
        
        // Imprimir el nombre de las tres personas
        // Obtener la persona con .get(DNI) y luego su nombre con .getNombre()
        System.out.println("=== MAPA DE PERSONAS ===\n");
        System.out.println("DNI: 123456789 -> Nombre: " + mapaDePersonas.get(123456789).getNombre());
        System.out.println("DNI: 3216544 -> Nombre: " + mapaDePersonas.get(3216544).getNombre());
        System.out.println("DNI: 5554687 -> Nombre: " + mapaDePersonas.get(5554687).getNombre());
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. MAPA CON OBJETOS:
         *    - Map<Integer, Persona> permite almacenar objetos Persona
         *    - La llave es Integer (DNI)
         *    - El valor es Persona (objeto personalizado)
         * 
         * 2. CREACIÓN DIRECTA EN .put():
         *    - new Persona("Kenny") crea el objeto directamente en .put()
         *    - Equivalente a:
         *      Persona p = new Persona("Kenny");
         *      mapaDePersonas.put(123456789, p);
         * 
         * 3. ACCESO ENCADENADO:
         *    - mapaDePersonas.get(DNI).getNombre()
         *    - Primero obtiene la Persona con .get(DNI)
         *    - Luego obtiene el nombre con .getNombre()
         * 
         * 4. VENTAJAS:
         *    - Búsqueda rápida por DNI (O(1) promedio)
         *    - Asociación directa identificador-objeto
         *    - No necesita recorrer listas para encontrar una persona
         * 
         * 5. USOS PRÁCTICOS:
         *    - Base de datos de empleados
         *    - Sistema de usuarios con ID
         *    - Catálogo de productos con código
         */
    }
}


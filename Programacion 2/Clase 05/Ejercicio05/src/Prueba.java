/*
 * EJERCICIO 05 - HERENCIA - CLASE PRUEBA
 * 
 * ENUNCIADO:
 * Confeccionar una clase Persona que tenga como atributos el nombre y la edad. 
 * Definir como responsabilidades un método que cargue los datos personales y otro que los imprima.
 * Plantear una segunda clase Empleado que herede de la clase Persona. 
 * Añadir un atributo sueldo y los métodos de cargar el sueldo e imprimir su sueldo.
 * Definir un objeto de la clase Persona y llamar a sus métodos. 
 * También crear un objeto de la clase Empleado y llamar a sus métodos.
 * 
 * CONCEPTO CLAVE: HERENCIA
 * - Esta clase demuestra el uso de la herencia
 * - Crea objetos de las clases Persona y Empleado
 * - Demuestra polimorfismo: mismo comportamiento, diferente implementación
 * - Muestra cómo las clases hijas extienden la funcionalidad de las clases padre
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crea objeto Persona y ejecuta operaciones
 * 2. Crea objeto Empleado y ejecuta operaciones
 * 3. Demuestra herencia y sobrescritura de métodos
 */

public class Prueba {

    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Demuestra el uso de herencia con las clases Persona y Empleado
     * - Cada objeto utiliza métodos heredados y propios
     * - Muestra el polimorfismo: mismo comportamiento, diferente implementación
     * - Demuestra cómo las clases hijas extienden la funcionalidad
     */
    public static void main(String[] args) {
        // === OBJETO DE LA CLASE PERSONA ===
        System.out.println("=== DATOS DE LA PERSONA ===");
        Persona persona1 = new Persona();
        persona1.cargar();    // Método de Persona
        persona1.imprimir();  // Método de Persona
        
        System.out.println(); // Línea en blanco para separar
        
        // === OBJETO DE LA CLASE EMPLEADO ===
        System.out.println("=== DATOS DEL EMPLEADO ===");
        Empleado empleado1 = new Empleado();
        empleado1.cargar();   // Método sobrescrito de Empleado (incluye sueldo)
        empleado1.imprimir(); // Método sobrescrito de Empleado (incluye sueldo)
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. HERENCIA:
         *    - Empleado hereda automáticamente todos los atributos y métodos de Persona
         *    - Un Empleado "es una" Persona con características adicionales
         *    - No necesita redefinir funcionalidad básica de Persona
         * 
         * 2. SOBRESCRITURA DE MÉTODOS:
         *    - Empleado sobrescribe cargar() e imprimir() para incluir sueldo
         *    - Usa super.cargar() y super.imprimir() para mantener funcionalidad heredada
         *    - Añade funcionalidad específica sin duplicar código
         * 
         * 3. POLIMORFISMO:
         *    - Ambos objetos tienen el mismo comportamiento externo
         *    - Ambos pueden cargar datos e imprimir información
         *    - La diferencia está en la implementación específica de cada clase
         * 
         * 4. REUTILIZACIÓN DE CÓDIGO:
         *    - Los métodos comunes se definen una sola vez en Persona
         *    - Empleado solo implementa lo específico de empleados
         *    - Esto reduce la duplicación de código y facilita el mantenimiento
         * 
         * 5. EXTENSIBILIDAD:
         *    - Fácil agregar nuevas clases que hereden de Persona
         *    - Cada nueva clase puede tener sus propios atributos y métodos
         *    - Mantiene la consistencia en el comportamiento básico
         */
    }
}

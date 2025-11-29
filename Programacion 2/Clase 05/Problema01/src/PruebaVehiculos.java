/*
 * PROBLEMA 01 - HERENCIA - CLASE PRUEBA VEHICULOS
 * 
 * ENUNCIADO:
 * Se tiene la siguiente jerarquía con sus métodos (mostrar un mensaje en cada método), 
 * crear las clases, métodos y definir al menos 2 objetos de algunas de las clases planteadas.
 * 
 * JERARQUÍA:
 * Vehículo
 * ├── Auto
 * ├── Moto
 * └── Colectivo
 * 
 * CONCEPTO CLAVE: HERENCIA
 * - Esta clase demuestra el uso de la herencia
 * - Crea objetos de las clases Auto y Moto
 * - Demuestra polimorfismo: mismo comportamiento, diferente implementación
 * - Muestra cómo las clases hijas extienden la funcionalidad de las clases padre
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crea objetos Auto y Moto
 * 2. Demuestra métodos heredados y propios
 * 3. Muestra sobrescritura de métodos
 */

public class PruebaVehiculos {

    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Demuestra el uso de herencia con las clases Auto y Moto
     * - Cada objeto utiliza métodos heredados y propios
     * - Muestra el polimorfismo: mismo comportamiento, diferente implementación
     * - Demuestra cómo las clases hijas extienden la funcionalidad
     */
    public static void main(String[] args) {
        // === OBJETO DE LA CLASE AUTO ===
        System.out.println("=== INFORMACIÓN DEL AUTO ===");
        Auto auto1 = new Auto("Toyota", "Corolla", 2023, 4);
        auto1.mostrarInfo();    // Método sobrescrito
        auto1.acelerar();       // Método sobrescrito
        auto1.frenar();         // Método sobrescrito
        auto1.abrirPuertas();   // Método propio
        auto1.cerrarPuertas();  // Método propio
        
        System.out.println(); // Línea en blanco para separar
        
        // === OBJETO DE LA CLASE MOTO ===
        System.out.println("=== INFORMACIÓN DE LA MOTO ===");
        Moto moto1 = new Moto("Honda", "CBR600", 2023, 600);
        moto1.mostrarInfo();    // Método sobrescrito
        moto1.acelerar();       // Método sobrescrito
        moto1.frenar();         // Método sobrescrito
        moto1.hacerWheelie();   // Método propio
        moto1.usarCasco();      // Método propio
        
        System.out.println(); // Línea en blanco para separar
        
        // === DEMOSTRACIÓN DE POLIMORFISMO ===
        System.out.println("=== DEMOSTRACIÓN DE POLIMORFISMO ===");
        
        // Crear array de Vehículos (polimorfismo)
        Vehiculo[] vehiculos = {
            new Auto("Ford", "Focus", 2022, 5),
            new Moto("Yamaha", "R1", 2022, 1000)
        };
        
        // Iterar sobre el array y mostrar información
        for (Vehículo vehiculo : vehiculos) {
            vehiculo.mostrarInfo(); // Polimorfismo: cada uno muestra su información específica
            vehiculo.acelerar();    // Polimorfismo: cada uno acelera de manera específica
            vehiculo.frenar();      // Polimorfismo: cada uno frena de manera específica
            System.out.println();   // Línea en blanco para separar
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. HERENCIA:
         *    - Auto y Moto heredan automáticamente todos los atributos y métodos de Vehículo
         *    - Un Auto "es un" Vehículo, una Moto "es un" Vehículo
         *    - No necesitan redefinir funcionalidad básica de Vehículo
         * 
         * 2. SOBRESCRITURA DE MÉTODOS:
         *    - Auto y Moto sobrescriben acelerar(), frenar() y mostrarInfo()
         *    - Cada uno proporciona su propia implementación específica
         *    - Mantienen la misma interfaz pero con comportamiento diferente
         * 
         * 3. POLIMORFISMO:
         *    - Los objetos pueden ser tratados como Vehículos
         *    - El mismo método puede tener diferentes comportamientos
         *    - Esto hace el código más flexible y extensible
         * 
         * 4. REUTILIZACIÓN DE CÓDIGO:
         *    - Los métodos comunes se definen una sola vez en Vehículo
         *    - Auto y Moto solo implementan lo específico de cada uno
         *    - Esto reduce la duplicación de código y facilita el mantenimiento
         * 
         * 5. EXTENSIBILIDAD:
         *    - Fácil agregar nuevas clases que hereden de Vehículo
         *    - Cada nueva clase puede tener sus propios atributos y métodos
         *    - Mantiene la consistencia en el comportamiento básico
         * 
         * 6. ENCAPSULACIÓN:
         *    - Los atributos específicos (numeroPuertas, cilindrada) son privados
         *    - Solo las clases que los definen pueden acceder a ellos
         *    - Esto mantiene la integridad de los datos
         */
    }
}




/*
 * EJERCICIO 04 - HERENCIA - CLASE PRUEBA
 * 
 * ENUNCIADO:
 * Implementar dos clases que llamaremos Suma y Resta. Cada clase tiene como atributo valor1, valor2 y resultado.
 * Los métodos a definir son cargar1 (que inicializa el atributo valor1), carga2 (que inicializa el atributo valor2), 
 * operar (que en el caso de la clase "Suma" suma los dos atributos y en el caso de la clase "Resta" hace la diferencia 
 * entre valor1 y valor2, y otro método mostrarResultado.
 * 
 * CONCEPTO CLAVE: HERENCIA
 * - Esta clase demuestra el uso de la herencia
 * - Crea objetos de las clases hijas Suma y Resta
 * - Utiliza tanto métodos heredados como métodos propios
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crea objeto Suma y ejecuta operación completa
 * 2. Crea objeto Resta y ejecuta operación completa
 * 3. Demuestra polimorfismo: mismo comportamiento, diferente implementación
 */

public class Prueba {
    
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Demuestra el uso de herencia con las clases Suma y Resta
     * - Cada objeto utiliza métodos heredados y propios
     * - Muestra el polimorfismo: mismo comportamiento, diferente implementación
     */
    public static void main(String[] ar) {
        // === OPERACIÓN DE SUMA ===
        System.out.println("=== OPERACIÓN DE SUMA ===");
        Suma suma1 = new Suma();
        suma1.cargar1();        // Método heredado
        suma1.cargar2();        // Método heredado
        suma1.operar();        // Método propio de Suma
        System.out.print("El resultado de la suma es: ");
        suma1.mostrarResultado(); // Método heredado
        
        System.out.println(); // Línea en blanco para separar
        
        // === OPERACIÓN DE RESTA ===
        System.out.println("=== OPERACIÓN DE RESTA ===");
        Resta resta1 = new Resta();
        resta1.cargar1();        // Método heredado
        resta1.cargar2();        // Método heredado
        resta1.operar();        // Método propio de Resta
        System.out.print("El resultado de la resta es: ");
        resta1.mostrarResultado(); // Método heredado
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. HERENCIA:
         *    - Suma y Resta heredan automáticamente todos los atributos y métodos de Operacion
         *    - No necesitan redefinir cargar1(), cargar2(), mostrarResultado()
         *    - Solo implementan su propio método operar()
         * 
         * 2. POLIMORFISMO:
         *    - Ambos objetos tienen el mismo comportamiento externo
         *    - Ambos pueden cargar valores, operar y mostrar resultados
         *    - La diferencia está en la implementación del método operar()
         * 
         * 3. REUTILIZACIÓN DE CÓDIGO:
         *    - Los métodos comunes se definen una sola vez en la clase padre
         *    - Las clases hijas solo implementan lo específico de cada una
         *    - Esto reduce la duplicación de código y facilita el mantenimiento
         */
    }
}




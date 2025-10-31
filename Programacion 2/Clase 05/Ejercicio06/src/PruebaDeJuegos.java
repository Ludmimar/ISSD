/*
 * EJERCICIO 06 - INTERFACES - CLASE PRUEBA DE JUEGOS
 * 
 * ENUNCIADO:
 * Se desea implementar dos juegos distintos.
 * El primero que permita ingresar el nombre de dos jugadores, tirar dos dados y mostrar cual de los dos ganó.
 * El segundo juego permita a un jugador adivinar un número entre 1 y 100 que elige la computadora al azar.
 * Podemos decir que todo juego tiene un inicio, estado de juego propiamente dicho y un fin. 
 * Si queremos estandarizar estos dos juegos y posibles nuevos juegos podemos declarar una interface llamada 'Juego' 
 * que declare los métodos: iniciar, jugar y finalizar.
 * 
 * CONCEPTO CLAVE: INTERFACES
 * - Esta clase demuestra el uso de interfaces
 * - Crea objetos de las clases que implementan la interfaz Juego
 * - Demuestra polimorfismo: mismo comportamiento, diferente implementación
 * - Muestra cómo las interfaces estandarizan el comportamiento
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crea objeto JuegoDeDados y ejecuta el juego completo
 * 2. Crea objeto JuegoAdivinaNumero y ejecuta el juego completo
 * 3. Demuestra que ambos juegos siguen el mismo patrón (interfaz)
 */

public class PruebaDeJuegos {

    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Demuestra el uso de interfaces con diferentes tipos de juegos
     * - Cada juego implementa la misma interfaz pero con comportamiento diferente
     * - Muestra el polimorfismo: mismo comportamiento externo, diferente implementación
     * - Demuestra cómo las interfaces estandarizan el comportamiento
     */
    public static void main(String[] args) {
        // === JUEGO DE DADOS ===
        System.out.println("=== JUEGO DE DADOS ===");
        JuegoDeDados juego1 = new JuegoDeDados();
        juego1.iniciar();    // Implementación específica de JuegoDeDados
        juego1.jugar();      // Implementación específica de JuegoDeDados
        juego1.finalizar();  // Implementación específica de JuegoDeDados
        
        System.out.println(); // Línea en blanco para separar
        
        // === JUEGO ADIVINA NÚMERO ===
        System.out.println("=== JUEGO ADIVINA NÚMERO ===");
        JuegoAdivinaNumero juego2 = new JuegoAdivinaNumero();
        juego2.iniciar();    // Implementación específica de JuegoAdivinaNumero
        juego2.jugar();      // Implementación específica de JuegoAdivinaNumero
        juego2.finalizar();  // Implementación específica de JuegoAdivinaNumero
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. INTERFACES:
         *    - La interfaz Juego define un contrato que deben cumplir todos los juegos
         *    - Todos los juegos deben implementar iniciar(), jugar() y finalizar()
         *    - Esto estandariza el comportamiento de diferentes tipos de juegos
         * 
         * 2. IMPLEMENTACIÓN:
         *    - JuegoDeDados implementa la interfaz con lógica específica de dados
         *    - JuegoAdivinaNumero implementa la interfaz con lógica específica de adivinanza
         *    - Cada clase proporciona su propia implementación de los métodos
         * 
         * 3. POLIMORFISMO:
         *    - Ambos objetos tienen el mismo comportamiento externo
         *    - Ambos pueden iniciar, jugar y finalizar
         *    - La diferencia está en la implementación específica de cada método
         * 
         * 4. ESTANDARIZACIÓN:
         *    - La interfaz garantiza que todos los juegos sigan el mismo patrón
         *    - Facilita agregar nuevos tipos de juegos
         *    - Mantiene consistencia en el comportamiento
         * 
         * 5. FLEXIBILIDAD:
         *    - Una clase puede implementar múltiples interfaces
         *    - Las interfaces permiten herencia múltiple de comportamiento
         *    - Facilita la extensión y modificación del código
         * 
         * 6. REUTILIZACIÓN:
         *    - El código que usa juegos no necesita conocer el tipo específico
         *    - Puede trabajar con cualquier objeto que implemente la interfaz
         *    - Esto hace el código más flexible y mantenible
         */
    }
}


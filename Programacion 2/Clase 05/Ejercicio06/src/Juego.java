/*
 * EJERCICIO 06 - INTERFACES - INTERFAZ JUEGO
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
 * - Una interfaz define un contrato que deben cumplir las clases que la implementen
 * - Declara métodos sin implementación (abstractos)
 * - Las clases que implementan la interfaz deben proporcionar la implementación
 * - Permite estandarizar el comportamiento de diferentes clases
 * - En Java no existe herencia múltiple, pero una clase puede implementar múltiples interfaces
 * 
 * MÉTODOS DE LA INTERFAZ:
 * - iniciar(): prepara el juego para comenzar
 * - jugar(): ejecuta la lógica principal del juego
 * - finalizar(): termina el juego y muestra resultados
 * 
 * IMPORTANTE:
 * - Los métodos de una interfaz son públicos y abstractos por defecto
 * - No se puede crear objetos de una interfaz
 * - Una clase puede implementar múltiples interfaces
 */

public interface Juego {
    
    /**
     * MÉTODO INICIAR - Prepara el juego para comenzar
     * 
     * FUNCIONALIDAD:
     * - Inicializa variables necesarias para el juego
     * - Solicita datos iniciales del usuario
     * - Prepara el entorno para el juego
     * 
     * IMPLEMENTACIÓN:
     * - Cada clase que implemente esta interfaz debe proporcionar su propia implementación
     * - El comportamiento específico depende del tipo de juego
     */
    void iniciar();
    
    /**
     * MÉTODO JUGAR - Ejecuta la lógica principal del juego
     * 
     * FUNCIONALIDAD:
     * - Contiene la lógica principal del juego
     * - Maneja la interacción con el usuario durante el juego
     * - Procesa las acciones del jugador
     * 
     * IMPLEMENTACIÓN:
     * - Cada clase que implemente esta interfaz debe proporcionar su propia implementación
     * - El comportamiento específico depende del tipo de juego
     */
    void jugar();
    
    /**
     * MÉTODO FINALIZAR - Termina el juego y muestra resultados
     * 
     * FUNCIONALIDAD:
     * - Muestra los resultados finales del juego
     * - Indica si el jugador ganó o perdió
     * - Proporciona información adicional sobre el juego
     * 
     * IMPLEMENTACIÓN:
     * - Cada clase que implemente esta interfaz debe proporcionar su propia implementación
     * - El comportamiento específico depende del tipo de juego
     */
    void finalizar();
}


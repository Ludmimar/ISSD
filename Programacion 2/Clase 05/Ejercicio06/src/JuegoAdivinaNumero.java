/*
 * EJERCICIO 06 - INTERFACES - CLASE JUEGO ADIVINA NUMERO
 * 
 * ENUNCIADO:
 * Se desea implementar dos juegos distintos.
 * El primero que permita ingresar el nombre de dos jugadores, tirar dos dados y mostrar cual de los dos ganó.
 * El segundo juego permita a un jugador adivinar un número entre 1 y 100 que elige la computadora al azar.
 * Podemos decir que todo juego tiene un inicio, estado de juego propiamente dicho y un fin. 
 * Si queremos estandarizar estos dos juegos y posibles nuevos juegos podemos declarar una interface llamada 'Juego' 
 * que declare los métodos: iniciar, jugar y finalizar.
 * 
 * CONCEPTO CLAVE: IMPLEMENTACIÓN DE INTERFACES
 * - La clase JuegoAdivinaNumero implementa la interfaz Juego usando 'implements'
 * - Debe proporcionar implementación para todos los métodos de la interfaz
 * - Un juego donde el jugador debe adivinar un número entre 1 y 100
 * - La computadora genera un número aleatorio y el jugador debe adivinarlo
 * 
 * IMPLEMENTACIÓN DE INTERFAZ:
 * - implements Juego: indica que esta clase implementa la interfaz Juego
 * - Debe implementar: iniciar(), jugar(), finalizar()
 * - Puede tener sus propios atributos y métodos adicionales
 * 
 * ATRIBUTOS:
 * - numAdivina: número que el jugador debe adivinar
 * - teclado: Scanner para entrada de datos
 * - intentos: contador de intentos realizados
 */

import java.util.Scanner;

public class JuegoAdivinaNumero implements Juego {
    // Atributos específicos del juego de adivinar número
    private int numAdivina;
    private Scanner teclado;
    private int intentos;

    /**
     * CONSTRUCTOR - Inicializa el Scanner para entrada de datos
     * 
     * FUNCIONALIDAD:
     * - Crea el objeto Scanner para leer datos del teclado
     * - Inicializa el contador de intentos en 0
     */
    public JuegoAdivinaNumero() {
        teclado = new Scanner(System.in);
    }

    /**
     * MÉTODO INICIAR - Implementación del método de la interfaz Juego
     * 
     * FUNCIONALIDAD:
     * - Genera un número aleatorio entre 1 y 100
     * - Inicializa el contador de intentos
     * - Prepara el juego para comenzar
     * 
     * IMPLEMENTACIÓN OBLIGATORIA:
     * - Debe implementar el método iniciar() de la interfaz Juego
     */
    public void iniciar() {
        // Generar número aleatorio entre 1 y 100
        numAdivina = 1 + (int) (Math.random() * 100);
        intentos = 0; // Inicializar contador de intentos
    }

    /**
     * MÉTODO JUGAR - Implementación del método de la interfaz Juego
     * 
     * FUNCIONALIDAD:
     * - Solicita al jugador que adivine el número
     * - Proporciona pistas (mayor o menor)
     * - Cuenta los intentos realizados
     * - Continúa hasta que el jugador adivine correctamente
     * 
     * IMPLEMENTACIÓN OBLIGATORIA:
     * - Debe implementar el método jugar() de la interfaz Juego
     */
    public void jugar() {
        int numero;
        
        // Bucle do-while para continuar hasta adivinar
        do {
            System.out.print("Adivina un número entre 1 y 100: ");
            numero = teclado.nextInt();
            
            // Proporcionar pistas al jugador
            if (numAdivina < numero) {
                System.out.println("El número a adivinar es menor");
            } else if (numAdivina > numero) {
                System.out.println("El número a adivinar es mayor");
            }
            
            intentos++; // Incrementar contador de intentos
            
        } while (numero != numAdivina); // Continuar hasta adivinar correctamente
    }

    /**
     * MÉTODO FINALIZAR - Implementación del método de la interfaz Juego
     * 
     * FUNCIONALIDAD:
     * - Muestra el resultado final del juego
     * - Indica cuántos intentos necesitó el jugador
     * - Felicita al jugador por ganar
     * 
     * IMPLEMENTACIÓN OBLIGATORIA:
     * - Debe implementar el método finalizar() de la interfaz Juego
     */
    public void finalizar() {
        System.out.println("¡Ganaste! Luego de " + intentos + " intentos");
    }
}




/*
 * EJERCICIO 06 - INTERFACES - CLASE JUEGO DE DADOS
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
 * - La clase JuegoDeDados implementa la interfaz Juego usando 'implements'
 * - Debe proporcionar implementación para todos los métodos de la interfaz
 * - Un juego de dados entre dos jugadores
 * - Cada jugador tira un dado y gana el que obtenga mayor valor
 * 
 * IMPLEMENTACIÓN DE INTERFAZ:
 * - implements Juego: indica que esta clase implementa la interfaz Juego
 * - Debe implementar: iniciar(), jugar(), finalizar()
 * - Puede tener sus propios atributos y métodos adicionales
 * 
 * ATRIBUTOS:
 * - dado1, dado2: valores de los dados
 * - jugador1, jugador2: nombres de los jugadores
 * - teclado: Scanner para entrada de datos
 */

import java.util.Scanner;

public class JuegoDeDados implements Juego {
    // Atributos específicos del juego de dados
    private int dado1, dado2;
    private String jugador1;
    private String jugador2;
    private Scanner teclado;

    /**
     * CONSTRUCTOR - Inicializa el Scanner para entrada de datos
     * 
     * FUNCIONALIDAD:
     * - Crea el objeto Scanner para leer datos del teclado
     * - Los atributos se inicializan automáticamente
     */
    public JuegoDeDados() {
        teclado = new Scanner(System.in);
    }

    /**
     * MÉTODO INICIAR - Implementación del método de la interfaz Juego
     * 
     * FUNCIONALIDAD:
     * - Solicita los nombres de los dos jugadores
     * - Prepara el juego para comenzar
     * 
     * IMPLEMENTACIÓN OBLIGATORIA:
     * - Debe implementar el método iniciar() de la interfaz Juego
     */
    public void iniciar() {
        System.out.print("Ingrese el nombre del primer jugador: ");
        jugador1 = teclado.nextLine();
        System.out.print("Ingrese el nombre del segundo jugador: ");
        jugador2 = teclado.nextLine();
    }

    /**
     * MÉTODO JUGAR - Implementación del método de la interfaz Juego
     * 
     * FUNCIONALIDAD:
     * - Genera valores aleatorios para cada dado
     * - Muestra los valores obtenidos por cada jugador
     * 
     * IMPLEMENTACIÓN OBLIGATORIA:
     * - Debe implementar el método jugar() de la interfaz Juego
     */
    public void jugar() {
        // Generar valores aleatorios para los dados (1-6)
        dado1 = 1 + (int) (Math.random() * 6);
        dado2 = 1 + (int) (Math.random() * 6);
        
        // Mostrar los valores obtenidos
        System.out.println(jugador1 + " le salió el valor " + dado1);
        System.out.println(jugador2 + " le salió el valor " + dado2);
    }

    /**
     * MÉTODO FINALIZAR - Implementación del método de la interfaz Juego
     * 
     * FUNCIONALIDAD:
     * - Compara los valores de los dados
     * - Determina el ganador
     * - Muestra el resultado final
     * 
     * IMPLEMENTACIÓN OBLIGATORIA:
     * - Debe implementar el método finalizar() de la interfaz Juego
     */
    public void finalizar() {
        // Determinar el ganador comparando los valores de los dados
        if (dado1 > dado2) {
            System.out.println("Ganó " + jugador1 + " con un valor de " + dado1);
        } else if (dado2 > dado1) {
            System.out.println("Ganó " + jugador2 + " con un valor de " + dado2);
        } else {
            System.out.println("Empataron los dos jugadores con el valor " + dado1);
        }
    }
}


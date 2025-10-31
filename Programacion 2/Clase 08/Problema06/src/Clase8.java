/*
 * PROBLEMA 06 - STACKS - PILA DE CARTAS ALEATORIAS
 * 
 * ENUNCIADO:
 * Desarrollar un algoritmo que coloque 10 cartas aleatorias, boca abajo, en una pila 
 * de cartas. Luego, cada que el usuario presione "Enter", se imprima por consola 
 * el valor de la carta superior de la pila.
 * 
 * CONCEPTO CLAVE: STACKS - PILA FÍSICA DE CARTAS
 * - Stack modela perfectamente una pila de cartas
 * - push(): colocar carta encima de la pila
 * - pop(): retirar carta de la cima
 * - peek(): ver carta de la cima sin retirarla
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear mazo de cartas
 * 2. Seleccionar 10 cartas aleatorias
 * 3. Apilar cartas en Stack (boca abajo)
 * 4. Pedir Enter al usuario
 * 5. Mostrar y retirar carta de la cima
 * 6. Repetir hasta agotar la pila
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Random;
import java.util.Scanner;

public class Clase8 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Crea pila de cartas aleatorias
     * - Permite ver y retirar cartas una por una
     */
    public static void main(String[] args) {
        // Crear Scanner para entrada de datos
        Scanner teclado = new Scanner(System.in);
        
        // Crear mazo completo de cartas
        List<Carta> mazo = crearMazo();
        
        // Crear Stack para pila de cartas
        Stack<Carta> pilaCartas = new Stack<>();
        
        // Seleccionar 10 cartas aleatorias y apilarlas
        Random random = new Random();
        System.out.println("=== CREANDO PILA DE CARTAS ===\n");
        System.out.println("Seleccionando 10 cartas aleatorias...\n");
        
        for (int i = 0; i < 10; i++) {
            // Seleccionar carta aleatoria del mazo
            int indiceAleatorio = random.nextInt(mazo.size());
            Carta carta = mazo.get(indiceAleatorio);
            
            // Apilar carta (boca abajo - no se ve hasta que se retira)
            pilaCartas.push(carta);
            System.out.println("Carta " + (i + 1) + " apilada (boca abajo)");
        }
        
        System.out.println("\nPila creada con " + pilaCartas.size() + " cartas.");
        System.out.println("Presione Enter para ver y retirar la carta superior.\n");
        
        // Permitir al usuario retirar cartas una por una
        while (!pilaCartas.empty()) {
            System.out.print("Presione Enter para ver la carta superior... ");
            teclado.nextLine(); // Esperar Enter
            
            // Ver y retirar carta de la cima
            Carta carta = pilaCartas.pop();
            System.out.println("Carta retirada: " + carta);
            System.out.println("Cartas restantes en la pila: " + pilaCartas.size());
            System.out.println();
        }
        
        System.out.println("=== PILA VACÍA ===");
        System.out.println("No hay más cartas en la pila.");
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. PILA FÍSICA:
         *    - Stack modela perfectamente una pila de cartas
         *    - Última carta agregada es la primera en salir (LIFO)
         *    - Como una pila real de cartas boca abajo
         * 
         * 2. MÉTODO pop():
         *    - Retira la carta de la cima
         *    - La pila se reduce automáticamente
         *    - Retorna la carta retirada
         * 
         * 3. SIMULACIÓN:
         *    - Las cartas se apilan "boca abajo"
         *    - No se ven hasta que se retiran
         *    - Perfecto para juegos de cartas
         */
    }
    
    /**
     * MÉTODO CREAR MAZO - Crea un mazo completo de cartas
     * 
     * @return List<Carta> Mazo completo de 52 cartas
     */
    private static List<Carta> crearMazo() {
        List<Carta> mazo = new ArrayList<>();
        
        String[] valores = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] palos = {"Corazones", "Diamantes", "Tréboles", "Picas"};
        
        // Crear todas las cartas del mazo
        for (String valor : valores) {
            for (String palo : palos) {
                mazo.add(new Carta(valor, palo));
            }
        }
        
        return mazo;
    }
}


/*
 * EJERCICIO 08 - COLECCIONES - MAZO COMPLETO DE CARTAS ESPAÑOLAS
 * 
 * ENUNCIADO:
 * Utilizando la clase Carta del principio de este apunte, crear un mazo de cartas 
 * españolas de 48 cartas (1 al 12 de oro, 1 al 12 de copas, 1 al 12 de espada, 
 * 1 al 12 de basto). El mazo será, por supuesto, una Lista de Cartas.
 * 
 * CONCEPTO CLAVE: COLECCIONES - CREACIÓN DINÁMICA CON CICLOS
 * - Los ciclos permiten crear múltiples objetos de forma eficiente
 * - Se pueden crear objetos directamente en .add(): lista.add(new Carta(...))
 * - Cada iteración crea un nuevo objeto
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear lista vacía para el mazo
 * 2. Ciclo for para números del 1 al 12
 * 3. En cada iteración, crear 4 cartas (uno por cada palo)
 * 4. Agregar cada carta al mazo
 */

import java.util.List;
import java.util.ArrayList;

public class Clase6 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Crea un mazo completo de cartas españolas
     * - 48 cartas en total: números del 1 al 12 para cada uno de los 4 palos
     */
    public static void main(String[] args) {
        // Crear lista vacía para el mazo de cartas
        List<Carta> mazo = new ArrayList<>();
        
        // Ciclo para crear las 48 cartas
        // i representa el número de la carta (1 al 12)
        // Nota: i comienza en 1 porque las cartas van del 1 al 12
        for (int i = 1; i <= 12; i++) {
            // Crear y agregar carta de oro
            mazo.add(new Carta(i, "oro"));
            
            // Crear y agregar carta de copa
            mazo.add(new Carta(i, "copa"));
            
            // Crear y agregar carta de espada
            mazo.add(new Carta(i, "espada"));
            
            // Crear y agregar carta de basto
            mazo.add(new Carta(i, "basto"));
        }
        
        // El mazo ahora contiene 48 cartas (12 números × 4 palos)
        System.out.println("Mazo creado con " + mazo.size() + " cartas");
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. CREACIÓN DIRECTA EN .add():
         *    - mazo.add(new Carta(i, "oro")) crea y agrega en una línea
         *    - Equivalente a:
         *      Carta carta = new Carta(i, "oro");
         *      mazo.add(carta);
         *    - Más conciso y eficiente
         * 
         * 2. CICLO ANIDADO IMPLÍCITO:
         *    - El ciclo externo itera sobre números (1-12)
         *    - En cada iteración, se crean 4 cartas (uno por palo)
         *    - Total: 12 × 4 = 48 cartas
         * 
         * 3. ORDEN DE CREACIÓN:
         *    - Las cartas se agregan en orden: 1 oro, 1 copa, 1 espada, 1 basto,
         *      2 oro, 2 copa, 2 espada, 2 basto, etc.
         * 
         * 4. OBJETOS ÚNICOS:
         *    - Cada llamada a 'new Carta()' crea un objeto diferente
         *    - Todas las cartas son independientes entre sí
         *    - La lista almacena referencias a cada objeto
         */
    }
}


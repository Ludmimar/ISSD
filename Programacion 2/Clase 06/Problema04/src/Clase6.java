/*
 * PROBLEMA 04 - COLECCIONES - MAZO DE BARAJA INGLESA
 * 
 * ENUNCIADO:
 * Programar una clase Carta, que tenga los parámetros numero (String) y palo (String), 
 * constructor y getters asociados. Programar un método llamado obtenerMazo que no tome 
 * parámetros, pero devuelva un mazo de cartas (Lista de Cartas) que contenga todas las 
 * cartas de la baraja inglesa (números: As, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K de 
 * palos: corazon, trébol, pica y diamante). Imprimir el número y palo de todas las cartas.
 * 
 * CONCEPTO CLAVE: COLECCIONES - MÉTODOS QUE RETORNAN LISTAS
 * - Los métodos pueden retornar List<TipoObjeto>
 * - Encapsula la lógica de creación del mazo
 * - Facilita la reutilización del código
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Llamar a obtenerMazo() para obtener el mazo completo
 * 2. Iterar sobre el mazo
 * 3. Imprimir número y palo de cada carta
 */

import java.util.List;
import java.util.ArrayList;

public class Clase6 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Obtiene mazo completo de baraja inglesa
     * - Imprime todas las cartas
     */
    public static void main(String[] args) {
        // Obtener el mazo completo de baraja inglesa
        List<Carta> mazo = obtenerMazo();
        
        // Imprimir el número y palo de todas las cartas
        System.out.println("=== MAZO DE BARAJA INGLESA ===\n");
        for (Carta carta : mazo) {
            System.out.println(carta.getNumero() + " de " + carta.getPalo());
        }
        
        System.out.println("\nTotal de cartas: " + mazo.size());
    }
    
    /**
     * MÉTODO OBTENER MAZO - Crea y retorna un mazo completo de baraja inglesa
     * 
     * FUNCIONALIDAD:
     * - Crea lista vacía para el mazo
     * - Genera todas las cartas (13 valores × 4 palos = 52 cartas)
     * - Retorna el mazo completo
     * 
     * @return List<Carta> Mazo completo de baraja inglesa (52 cartas)
     */
    public static List<Carta> obtenerMazo() {
        // Crear lista vacía para el mazo
        List<Carta> mazo = new ArrayList<>();
        
        // Array con los números/figuras de la baraja inglesa
        String[] numeros = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        
        // Array con los palos de la baraja inglesa
        String[] palos = {"corazon", "trebol", "pica", "diamante"};
        
        // Generar todas las cartas: 13 números × 4 palos = 52 cartas
        for (String numero : numeros) {
            for (String palo : palos) {
                // Crear y agregar cada carta al mazo
                mazo.add(new Carta(numero, palo));
            }
        }
        
        return mazo;
    }
    
    /*
     * OBSERVACIONES IMPORTANTES:
     * 
     * 1. MÉTODO QUE RETORNA LISTA:
     *    - Tipo de retorno: List<Carta>
     *    - Permite encapsular la creación del mazo
     *    - Facilita la reutilización del código
     * 
     * 2. CICLOS ANIDADOS:
     *    - Ciclo externo: itera sobre números/figuras
     *    - Ciclo interno: itera sobre palos
     *    - Cada combinación crea una carta
     * 
     * 3. BARAJA INGLESA:
     *    - 13 valores: As, 2-10, J, Q, K
     *    - 4 palos: corazon, trebol, pica, diamante
     *    - Total: 52 cartas
     * 
     * 4. VENTAJAS DEL MÉTODO:
     *    - Código organizado y reutilizable
     *    - Fácil de modificar si cambian las reglas
     *    - Separación de responsabilidades
     */
}


/*
 * PROBLEMA 04 - COLECCIONES - CLASE CARTA PARA BARAJA INGLESA
 * 
 * ENUNCIADO:
 * Programar una clase Carta, que tenga los parámetros numero (String) y palo (String), 
 * constructor y getters asociados. Programar un método llamado obtenerMazo que no tome 
 * parámetros, pero devuelva un mazo de cartas (Lista de Cartas) que contenga todas las 
 * cartas de la baraja inglesa (números: As, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K de 
 * palos: corazon, trébol, pica y diamante). Imprimir el número y palo de todas las cartas.
 * 
 * CONCEPTO CLAVE: COLECCIONES - MÉTODOS QUE RETORNAN LISTAS
 * - Los métodos pueden retornar listas de objetos
 * - Permite encapsular la creación de colecciones
 * - Útil para generar datos estructurados
 * 
 * ATRIBUTOS:
 * - numero: String (número o figura: As, 2-10, J, Q, K)
 * - palo: String (palo: corazon, trebol, pica, diamante)
 * 
 * MÉTODOS:
 * - constructor: inicializa número y palo
 * - getNumero: devuelve el número
 * - getPalo: devuelve el palo
 */

public class Carta {
    // Atributos privados
    private String numero;
    private String palo;

    /**
     * CONSTRUCTOR - Inicializa una carta
     * 
     * @param numero Número o figura de la carta (As, 2-10, J, Q, K)
     * @param palo Palo de la carta (corazon, trebol, pica, diamante)
     */
    public Carta(String numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    /**
     * MÉTODO GET NUMERO - Devuelve el número de la carta
     * 
     * @return String Número o figura de la carta
     */
    public String getNumero() {
        return this.numero;
    }

    /**
     * MÉTODO GET PALO - Devuelve el palo de la carta
     * 
     * @return String Palo de la carta
     */
    public String getPalo() {
        return this.palo;
    }
}


/*
 * PROBLEMA 05 - COLECCIONES - CLASE CARTA PARA CARTA ALEATORIA
 * 
 * ENUNCIADO:
 * Programar un método que tome de parámetro una Lista de Cartas, y retorne una carta aleatoria. 
 * Llamar a este método desde el main e imprimir el numero y palo del valor de retorno.
 * 
 * CONCEPTO CLAVE: COLECCIONES - SELECCIÓN ALEATORIA
 * - Random permite generar índices aleatorios
 * - Acceso a elementos aleatorios de una lista
 * - Útil para juegos y simulaciones
 * 
 * ATRIBUTOS:
 * - numero: String (número o figura de la carta)
 * - palo: String (palo de la carta)
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
     * @param numero Número o figura de la carta
     * @param palo Palo de la carta
     */
    public Carta(String numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    /**
     * MÉTODO GET NUMERO - Devuelve el número de la carta
     * 
     * @return String Número de la carta
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


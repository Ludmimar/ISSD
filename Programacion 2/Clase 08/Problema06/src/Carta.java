/*
 * PROBLEMA 06 - STACKS - CLASE CARTA
 * 
 * ENUNCIADO:
 * Desarrollar un algoritmo que coloque 10 cartas aleatorias, boca abajo, en una pila 
 * de cartas. Luego, cada que el usuario presione "Enter", se imprima por consola 
 * el valor de la carta superior de la pila.
 * 
 * CONCEPTO CLAVE: STACKS - PILA DE CARTAS (LIFO)
 * - Las cartas se apilan una encima de otra
 * - La última carta agregada es la primera en retirarse
 * - Perfecto para representar una pila física de cartas
 * 
 * ATRIBUTOS:
 * - valor: String (valor de la carta: As, 2-10, J, Q, K)
 * - palo: String (palo: Corazones, Diamantes, Tréboles, Picas)
 * 
 * MÉTODOS:
 * - constructor: inicializa valor y palo
 * - toString: devuelve representación de la carta
 */

public class Carta {
    // Atributos privados
    private String valor;
    private String palo;

    /**
     * CONSTRUCTOR - Inicializa una carta
     * 
     * @param valor Valor de la carta (As, 2-10, J, Q, K)
     * @param palo Palo de la carta (Corazones, Diamantes, Tréboles, Picas)
     */
    public Carta(String valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }

    /**
     * MÉTODO TO STRING - Representación de la carta
     * 
     * @return String Representación de la carta
     */
    @Override
    public String toString() {
        return valor + " de " + palo;
    }
}


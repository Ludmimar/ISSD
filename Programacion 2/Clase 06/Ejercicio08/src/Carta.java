/*
 * EJERCICIO 08 - COLECCIONES - CLASE CARTA PARA MAZO COMPLETO
 * 
 * ENUNCIADO:
 * Utilizando la clase Carta del principio de este apunte, crear un mazo de cartas 
 * españolas de 48 cartas (1 al 12 de oro, 1 al 12 de copas, 1 al 12 de espada, 
 * 1 al 12 de basto). El mazo será, por supuesto, una Lista de Cartas.
 * 
 * CONCEPTO CLAVE: COLECCIONES - CREACIÓN DINÁMICA DE OBJETOS
 * - Se pueden crear objetos directamente dentro de .add()
 * - Sintaxis: lista.add(new Carta(numero, palo))
 * - Más conciso que crear variable intermedia
 * 
 * ATRIBUTOS:
 * - numero: int (número de la carta, del 1 al 12)
 * - palo: String (palo de la carta: oro, copa, espada, basto)
 * 
 * MÉTODOS:
 * - constructor: inicializa número y palo
 * - getNumero: devuelve el número
 * - getPalo: devuelve el palo
 */

public class Carta {
    // Atributos privados
    private int numero;
    private String palo;

    /**
     * CONSTRUCTOR - Inicializa una carta
     * 
     * @param numero Número de la carta (1-12)
     * @param palo Palo de la carta (oro, copa, espada, basto)
     */
    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    /**
     * MÉTODO GET NUMERO - Devuelve el número de la carta
     * 
     * @return int Número de la carta
     */
    public int getNumero() {
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


/*
 * EJERCICIO 01 - COLECCIONES - CLASE CARTA
 * 
 * ENUNCIADO:
 * Instanciar las siguientes tres cartas: el 7 de espadas, el 6 de espadas y el 1 de basto.
 * Declarar una lista de cartas y añadir las tres cartas a dicha lista utilizando el método add().
 * Obtener e imprimir el número y el palo de las tres cartas utilizando el método .get().
 * 
 * CONCEPTO CLAVE: COLECCIONES - LISTAS
 * - Las colecciones permiten agrupar objetos de manera dinámica
 * - ArrayList es una implementación de List que permite tamaño variable
 * - Métodos básicos: add(), get(), size()
 * 
 * ATRIBUTOS:
 * - numero: int (número de la carta)
 * - palo: String (palo de la carta: espada, basto, copa, oro)
 * 
 * MÉTODOS:
 * - constructor: inicializa número y palo
 * - getNumero: devuelve el número de la carta
 * - getPalo: devuelve el palo de la carta
 */

public class Carta {
    // Atributos privados para encapsulación
    private int numero;
    private String palo;

    /**
     * CONSTRUCTOR - Inicializa una carta con número y palo
     * 
     * @param numero Número de la carta (1-12)
     * @param palo Palo de la carta (espada, basto, copa, oro)
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


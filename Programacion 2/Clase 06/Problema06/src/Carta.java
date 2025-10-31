/*
 * PROBLEMA 06 - COLECCIONES - CLASE CARTA PARA TRES CARTAS SIN REPETIR
 * 
 * ENUNCIADO:
 * Diseñar un método que tome de parámetro una Lista de Cartas (mazo completo) y retorne 
 * otra Lista, de solo tres cartas esta vez, elegidas al azar del mazo. Llamar a este 
 * método desde el programa principal e imprimir los valores de la Lista de retorno 
 * (las tres cartas elegidas al azar). Asegurarse de que en las tres cartas elegidas 
 * al azar, no existan repetidas.
 * 
 * CONCEPTO CLAVE: COLECCIONES - SELECCIÓN ALEATORIA SIN REPETICIÓN
 * - Seleccionar elementos aleatorios sin repetir
 * - Remover elementos de lista original o verificar duplicados
 * - Crear nueva lista con selección
 * 
 * ATRIBUTOS:
 * - numero: String (número o figura de la carta)
 * - palo: String (palo de la carta)
 * 
 * MÉTODOS:
 * - constructor: inicializa número y palo
 * - getNumero: devuelve el número
 * - getPalo: devuelve el palo
 * - equals: compara si dos cartas son iguales (necesario para contains)
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
    
    /**
     * MÉTODO EQUALS - Compara si dos cartas son iguales
     * 
     * @param obj Objeto a comparar
     * @return boolean true si las cartas son iguales (mismo número y palo)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Carta carta = (Carta) obj;
        return numero.equals(carta.numero) && palo.equals(carta.palo);
    }
}


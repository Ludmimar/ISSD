/*
 * EJERCICIO 08 - MAPAS - CLASE TARJETA
 * 
 * ENUNCIADO:
 * Declarar un mapa vacío con llaves de tipo String y valores de tipo Tarjeta. 
 * Supongamos que el número de una tarjeta de crédito solo es válido si es mayor 
 * a 4 cuadrillones (4000 0000 0000 0000) y menor a 6 cuadrillones (6000 0000 0000 0000), 
 * además, si comienza con 4 es Visa y si comienza con 5 es Master. Realizar un programa 
 * que pida al usuario el nombre y el número de tarjeta. Si el número es válido guardar 
 * la tarjeta en el mapa, de lo contrario informar un error y solicitar el numero nuevamente. 
 * Imprimir la Tarjeta almacenada en el mapa utilizando un iterador y el método entrySet.
 * 
 * CONCEPTO CLAVE: MAPAS - OBJETOS Y VALIDACIÓN
 * - Los mapas pueden almacenar objetos complejos como valores
 * - Validación de datos antes de agregar al mapa
 * - Iteración con entrySet() para obtener llave y valor juntos
 * 
 * ATRIBUTOS:
 * - entidad: String (Visa, MasterCard, Amex)
 * - numero: String (número de la tarjeta)
 * 
 * MÉTODOS:
 * - constructor: inicializa entidad y número
 * - getEntidad: devuelve la entidad
 * - getNumero: devuelve el número
 */

public class Tarjeta {
    // Atributos privados
    private String entidad;
    private String numero;

    /**
     * CONSTRUCTOR - Inicializa una tarjeta
     * 
     * @param entidad Entidad emisora (Visa, MasterCard, Amex)
     * @param numero Número de la tarjeta
     */
    public Tarjeta(String entidad, String numero) {
        this.entidad = entidad;
        this.numero = numero;
    }

    /**
     * MÉTODO GET ENTIDAD - Devuelve la entidad emisora
     * 
     * @return String Entidad de la tarjeta
     */
    public String getEntidad() {
        return this.entidad;
    }

    /**
     * MÉTODO GET NUMERO - Devuelve el número de la tarjeta
     * 
     * @return String Número de la tarjeta
     */
    public String getNumero() {
        return this.numero;
    }
}


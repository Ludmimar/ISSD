/*
 * EJERCICIO 14 - COLECCIONES - CLASE PERSONA PARA COMPARACIÓN
 * 
 * ENUNCIADO:
 * Realizar un ejercicio comparativo donde vamos a observar y medir el tiempo que tarda 
 * en realizarse una inserción en una lista ArrayList y en otra lista LinkedList.
 * 
 * CONCEPTO CLAVE: COLECCIONES - ARRAYLIST VS LINKEDLIST
 * - ArrayList: acceso rápido por índice, inserción lenta en medio
 * - LinkedList: inserción rápida, acceso por índice más lento
 * - Medición de tiempo para comparar rendimiento
 * 
 * ATRIBUTOS:
 * - idPersona: int (identificador único)
 * - nombre: String (nombre de la persona)
 * - altura: int (altura en cm)
 * 
 * MÉTODOS:
 * - constructor: inicializa todos los atributos
 * - toString: devuelve representación en String
 */

public class Persona {
    // Atributos privados
    private int idPersona;
    private String nombre;
    private int altura;

    /**
     * CONSTRUCTOR - Inicializa una persona
     * 
     * @param idPersona Identificador único de la persona
     * @param nombre Nombre de la persona
     * @param altura Altura en centímetros
     */
    public Persona(int idPersona, String nombre, int altura) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.altura = altura;
    }

    /**
     * MÉTODO TO STRING - Representación en String de la persona
     * 
     * @return String Representación de la persona
     */
    @Override
    public String toString() {
        return "Persona-> ID: " + idPersona + " Nombre: " + nombre + " Altura: " + altura + "\n";
    }
}


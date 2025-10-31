/*
 * EJERCICIO 03 - MAPAS - CLASE PERSONA
 * 
 * ENUNCIADO:
 * Definir una clase llamada Persona, con un campo de tipo String para el nombre 
 * y un constructor acorde. Programar el getter para este campo. Instanciar 3 personas 
 * y agregarlas al mapa utilizando como llave un DNI ficticio. Imprimir el nombre de 
 * las tres personas en el Mapa utilizando el método .get() para obtener cada persona.
 * 
 * CONCEPTO CLAVE: MAPAS - OBJETOS COMO VALORES
 * - Los mapas pueden tener objetos personalizados como valores
 * - Permite almacenar información compleja asociada a llaves
 * - Útil para búsqueda rápida por identificador
 * 
 * ATRIBUTOS:
 * - nombre: String (nombre de la persona)
 * 
 * MÉTODOS:
 * - constructor: inicializa con nombre
 * - getNombre: devuelve el nombre
 */

public class Persona {
    // Atributo privado
    private String nombre;

    /**
     * CONSTRUCTOR - Inicializa una persona con nombre
     * 
     * @param nombre Nombre de la persona
     */
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    /**
     * MÉTODO GET NOMBRE - Devuelve el nombre de la persona
     * 
     * @return String Nombre de la persona
     */
    public String getNombre() {
        return this.nombre;
    }
}


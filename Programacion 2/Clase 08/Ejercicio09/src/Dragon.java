/*
 * EJERCICIO 09 - SETS - CLASE DRAGON CON EQUALS()
 * 
 * ENUNCIADO (del documento):
 * Analizar qué sucede al agregar un Dragón duplicado al Set sin y con equals().
 * 
 * CONCEPTO CLAVE: SETS - EQUALS() Y HASHCODE()
 * - Los Sets usan equals() para determinar si un elemento ya existe
 * - Sin equals() personalizado, dos objetos con mismos valores se consideran diferentes
 * - Con equals() personalizado, puedes definir cuándo dos objetos son iguales
 * - Es importante también implementar hashCode() cuando se implementa equals()
 * 
 * ATRIBUTOS:
 * - nombre: String (nombre del dragón)
 * - id: int (identificador del dragón)
 * 
 * MÉTODOS:
 * - constructor: inicializa nombre e id
 * - equals: compara si dos dragones son iguales (mismo nombre e id)
 */

public class Dragon {
    // Atributos privados
    private String nombre;
    private int id;

    /**
     * CONSTRUCTOR - Inicializa un dragón
     * 
     * @param nombre Nombre del dragón
     * @param id Identificador del dragón
     */
    public Dragon(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    /**
     * MÉTODO EQUALS - Compara si dos dragones son iguales
     * 
     * Dos dragones son iguales si tienen el mismo nombre y el mismo id
     * 
     * @param obj Objeto a comparar
     * @return boolean true si los dragones son iguales
     */
    @Override
    public boolean equals(Object obj) {
        // Si es el mismo objeto, son iguales
        if (this == obj) return true;
        
        // Si obj es null o no es de la misma clase, no son iguales
        if (obj == null || getClass() != obj.getClass()) return false;
        
        // Convertir obj a Dragon
        Dragon dragon = (Dragon) obj;
        
        // Comparar id y nombre
        return id == dragon.id && nombre.equals(dragon.nombre);
    }
    
    /**
     * MÉTODO HASHCODE - Genera código hash para el dragón
     * 
     * IMPORTANTE: Cuando se implementa equals(), también se debe implementar hashCode()
     * para mantener la consistencia
     * 
     * @return int Código hash del dragón
     */
    @Override
    public int hashCode() {
        // Combinar hash de id y nombre
        return id * 31 + nombre.hashCode();
    }
    
    /**
     * MÉTODO TO STRING - Representación del dragón
     * 
     * @return String Representación del dragón
     */
    @Override
    public String toString() {
        return "Dragon [nombre=" + nombre + ", id=" + id + "]";
    }
}


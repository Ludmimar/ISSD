/*
 * EJERCICIO 05 - SETS - CLASE ESTUDIANTE
 * 
 * ENUNCIADO:
 * Implementar un HashSet que contenga elementos de tipo Estudiante, donde cada Estudiante 
 * tenga nombre y edad. Añadir al HashSet 5 estudiantes distintos y luego imprimir los elementos 
 * del set. Responder: ¿Cómo es el orden de los elementos respecto a la inserción? 
 * ¿Cómo podríamos modificar este programa para que el orden de los estudiantes sea el mismo 
 * en el que fueron añadidos?
 * 
 * CONCEPTO CLAVE: SETS - OBJETOS PERSONALIZADOS
 * - Los Sets pueden contener objetos de clases personalizadas
 * - HashSet no garantiza orden de inserción
 * - LinkedHashSet mantiene orden de inserción
 * - Es importante implementar equals() y hashCode() para objetos personalizados
 * 
 * ATRIBUTOS:
 * - nombre: String (nombre del estudiante)
 * - edad: int (edad del estudiante)
 * 
 * MÉTODOS:
 * - constructor: inicializa nombre y edad
 * - getNombre: devuelve el nombre
 * - getEdad: devuelve la edad
 */

public class Estudiante {
    // Atributos privados
    private String nombre;
    private int edad;

    /**
     * CONSTRUCTOR - Inicializa un estudiante
     * 
     * @param nombre Nombre del estudiante
     * @param edad Edad del estudiante
     */
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * MÉTODO GET NOMBRE - Devuelve el nombre del estudiante
     * 
     * @return String Nombre del estudiante
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * MÉTODO GET EDAD - Devuelve la edad del estudiante
     * 
     * @return int Edad del estudiante
     */
    public int getEdad() {
        return this.edad;
    }
}


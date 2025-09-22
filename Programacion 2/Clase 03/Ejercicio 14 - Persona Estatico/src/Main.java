/**
 * Ejercicio 14 - Clase Persona con atributos estáticos
 * Definir un atributo estático que almacene la cantidad de objetos creados de dicha clase.
 * Ejemplo de uso de atributos estáticos que son compartidos por todas las instancias de la clase.
 */
public class Persona {
    private String nombre;
    private int edad;
    public static int cantidad;

    /**
     * Constructor que inicializa los datos y incrementa el contador estático
     * @param nombre nombre de la persona
     * @param edad edad de la persona
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        cantidad++;
    }

    /**
     * Método para imprimir los datos de la persona
     */
    public void imprimir() {
        System.out.println(nombre + " " + edad);
    }
}

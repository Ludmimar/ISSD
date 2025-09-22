/**
 * Ejercicio 12 - Clase Usuario con palabra clave this
 * Plantear una clase llamada Usuario. Al constructor llega el nombre de usuario y su clave. 
 * Crear luego 2 objetos de la clase Usuario y llamar a un método imprimir.
 * Ejemplo del uso de la palabra clave 'this' cuando los parámetros del constructor 
 * tienen el mismo nombre que los atributos de la clase.
 */
public class Usuario {
    private String nombre;
    private String clave;

    /**
     * Constructor que recibe nombre y clave como parámetros
     * Se usa 'this' porque los parámetros tienen el mismo nombre que los atributos
     * @param nombre nombre del usuario
     * @param clave clave del usuario
     */
    public Usuario(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
    }

    /**
     * Método para imprimir los datos del usuario
     */
    public void imprimir() {
        System.out.println("Nombre:" + nombre);
        System.out.println("Clave:" + clave);
    }

    /**
     * Método principal
     */
    public static void main(String[] ar) {
        Usuario usuario1 = new Usuario("Juan", "123456");
        usuario1.imprimir();
        Usuario usuario2 = new Usuario("Ana", "abcdef");
        usuario2.imprimir();
    }
}

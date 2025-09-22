import java.util.Scanner;

/**
 * Ejercicio 7 - Clase Usuario con Constructor
 * Plantear una clase llamada Usuario. En el constructor realizar la carga de su nombre y clave. 
 * Definir otros dos métodos para imprimir los datos ingresados y un mensaje si la clave tiene menos de 6 caracteres.
 */
public class Usuario {
    private String nombre;
    private String clave;
    private Scanner teclado;

    /**
     * Constructor que inicializa los datos del usuario
     */
    public Usuario() {
        teclado = new Scanner(System.in);
        System.out.print("Ingrese nombre del usuario :");
        nombre = teclado.next();
        System.out.print("Ingrese la clave del usuario :");
        clave = teclado.next();
    }

    /**
     * Método para imprimir los datos del usuario
     */
    public void imprimir() {
        System.out.println("Nombre:" + nombre);
        System.out.println("Clave:" + clave);
    }

    /**
     * Método para verificar la longitud de la clave
     */
    public void largoClave() {
        if (clave.length() < 6) {
            System.out.println("Tiene menos de 6 caracteres la clave.");
        } else {
            System.out.println("Tiene 6 o más caracteres la clave.");
        }
    }

    /**
     * Método principal
     */
    public static void main(String[] ar) {
        Usuario usuario = new Usuario();
        usuario.imprimir();
        usuario.largoClave();
    }
}

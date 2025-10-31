/*
 * PROBLEMA 06 - MAPAS - CLASE ARTÍCULO
 * 
 * ENUNCIADO:
 * Crearemos una clase Articulo, con los campos nombre (String) y precio (double), 
 * con un constructor y getters para los campos. Cada artículo tendrá un identificador 
 * único dado por un numero entero (esto sería lo que se almacena el código de barras). 
 * Crear un mapa con llaves de tipo entero y valores de tipo Articulo y cargar los siguientes Artículos:
 * 
 * Código    Nombre        Precio
 * 10        Harina        100
 * 11        Fideos        150
 * 12        Aceite        400
 * 13        Yerba         700
 * 20        Fernet        900
 * 30        Coca-Cola     400
 * 
 * CONCEPTO CLAVE: MAPAS - OBJETOS CON IDENTIFICADOR
 * - Código de barras como llave única
 * - Objeto Artículo con nombre y precio
 * - Sistema de inventario básico
 * 
 * ATRIBUTOS:
 * - nombre: String (nombre del artículo)
 * - precio: double (precio del artículo)
 * 
 * MÉTODOS:
 * - constructor: inicializa nombre y precio
 * - getNombre: devuelve el nombre
 * - getPrecio: devuelve el precio
 */

public class Articulo {
    // Atributos privados
    private String nombre;
    private double precio;

    /**
     * CONSTRUCTOR - Inicializa un artículo
     * 
     * @param nombre Nombre del artículo
     * @param precio Precio del artículo
     */
    public Articulo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * MÉTODO GET NOMBRE - Devuelve el nombre del artículo
     * 
     * @return String Nombre del artículo
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * MÉTODO GET PRECIO - Devuelve el precio del artículo
     * 
     * @return double Precio del artículo
     */
    public double getPrecio() {
        return this.precio;
    }
}


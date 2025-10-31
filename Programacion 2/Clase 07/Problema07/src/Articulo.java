/*
 * PROBLEMA 07 - MAPAS - CLASE ARTÍCULO PARA FACTURACIÓN
 * 
 * ENUNCIADO:
 * Si tenemos el inventario del ejercicio anterior, diseñar un programa que pida al usuario 
 * ingresar códigos de artículos hasta que se ingrese un 0. Cada ingreso significará la 
 * adición de un artículo a la factura. Al finalizar el ingreso de artículos imprimir un 
 * detalle con la cantidad, el nombre y precio por cantidad del artículo en cada línea, 
 * al final imprimir el total de la factura.
 * 
 * CONCEPTO CLAVE: MAPAS - FACTURACIÓN Y CONTEO
 * - Contar cantidad de cada artículo
 * - Usar segundo mapa para contar ocurrencias
 * - Calcular totales
 * 
 * ATRIBUTOS:
 * - nombre: String
 * - precio: double
 * 
 * MÉTODOS:
 * - constructor
 * - getNombre
 * - getPrecio
 */

public class Articulo {
    private String nombre;
    private double precio;

    public Articulo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }
}


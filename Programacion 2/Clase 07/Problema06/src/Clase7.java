/*
 * PROBLEMA 06 - MAPAS - INVENTARIO DE ARTÍCULOS
 * 
 * ENUNCIADO:
 * Crear un mapa con llaves de tipo entero y valores de tipo Articulo y cargar los 
 * siguientes Artículos. Imprimir el inventario luego de cargar los datos.
 * 
 * CONCEPTO CLAVE: MAPAS - SISTEMA DE INVENTARIO
 * - Código como llave única (código de barras)
 * - Objeto Artículo con información completa
 * - Búsqueda rápida por código
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear mapa de artículos
 * 2. Agregar artículos con sus códigos
 * 3. Imprimir inventario completo
 */

import java.util.Map;
import java.util.HashMap;

public class Clase7 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Crea inventario de artículos
     * - Imprime catálogo completo
     */
    public static void main(String[] args) {
        // Crear mapa de inventario
        // Llave: código de barras (Integer)
        // Valor: objeto Articulo
        Map<Integer, Articulo> inventario = new HashMap<>();
        
        // Cargar artículos en el inventario
        inventario.put(10, new Articulo("Harina", 100));
        inventario.put(11, new Articulo("Fideos", 150));
        inventario.put(12, new Articulo("Aceite", 400));
        inventario.put(13, new Articulo("Yerba", 700));
        inventario.put(20, new Articulo("Fernet", 900));
        inventario.put(30, new Articulo("Coca-Cola", 400));
        
        // Imprimir inventario
        System.out.println("=== INVENTARIO ===\n");
        System.out.println("Código\tNombre\t\tPrecio");
        System.out.println("--------------------------------");
        
        for (Integer codigo : inventario.keySet()) {
            Articulo articulo = inventario.get(codigo);
            System.out.println(codigo + "\t" + articulo.getNombre() + "\t\t$" + articulo.getPrecio());
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. SISTEMA DE INVENTARIO:
         *    - Código de barras como identificador único
         *    - Búsqueda rápida por código: inventario.get(10)
         *    - Útil para sistemas de punto de venta
         * 
         * 2. OBJETOS COMO VALORES:
         *    - Almacena información completa (nombre, precio)
         *    - Fácil agregar más atributos después
         *    - Encapsulación de datos relacionados
         */
    }
}


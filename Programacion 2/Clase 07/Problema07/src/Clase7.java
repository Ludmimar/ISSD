/*
 * PROBLEMA 07 - MAPAS - SISTEMA DE FACTURACIÓN
 * 
 * ENUNCIADO:
 * Diseñar un programa que pida al usuario ingresar códigos de artículos hasta que se ingrese un 0. 
 * Cada ingreso significará la adición de un artículo a la factura. Al finalizar el ingreso de 
 * artículos imprimir un detalle con la cantidad, el nombre y precio por cantidad del artículo 
 * en cada línea, al final imprimir el total de la factura.
 * 
 * CONCEPTO CLAVE: MAPAS - FACTURACIÓN Y CONTEO
 * - Usar mapa para contar cantidad de cada artículo
 * - Mapa<Integer, Integer> para código -> cantidad
 * - Calcular subtotales y total
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear inventario (del problema anterior)
 * 2. Crear mapa de cantidades (código -> cantidad)
 * 3. Pedir códigos hasta ingresar 0
 * 4. Contar cantidad de cada artículo
 * 5. Imprimir factura con cantidades y totales
 */

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Clase7 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Permite agregar artículos a factura
     * - Cuenta cantidad de cada artículo
     * - Imprime factura con totales
     */
    public static void main(String[] args) {
        // Crear Scanner para entrada de datos
        Scanner teclado = new Scanner(System.in);
        
        // Crear inventario de artículos (del problema anterior)
        Map<Integer, Articulo> inventario = new HashMap<>();
        inventario.put(10, new Articulo("Harina", 100));
        inventario.put(11, new Articulo("Fideos", 150));
        inventario.put(12, new Articulo("Aceite", 400));
        inventario.put(13, new Articulo("Yerba", 700));
        inventario.put(20, new Articulo("Fernet", 900));
        inventario.put(30, new Articulo("Coca-Cola", 400));
        
        // Crear mapa para contar cantidad de cada artículo en la factura
        // Llave: código del artículo (Integer)
        // Valor: cantidad (Integer)
        Map<Integer, Integer> factura = new HashMap<>();
        
        int codigo;
        
        System.out.println("=== FACTURACIÓN ===");
        System.out.println("Ingrese códigos de artículos (0 para finalizar):\n");
        
        // Ciclo para ingresar códigos hasta ingresar 0
        do {
            System.out.print("Ingrese codigo de articulo: ");
            codigo = teclado.nextInt();
            
            // Si no es 0, agregar a la factura
            if (codigo != 0) {
                // Verificar que el artículo exista en el inventario
                if (inventario.containsKey(codigo)) {
                    // Si ya existe en la factura, incrementar cantidad
                    // Si no existe, agregar con cantidad 1
                    factura.put(codigo, factura.getOrDefault(codigo, 0) + 1);
                    System.out.println("Artículo agregado.");
                } else {
                    System.out.println("Código no encontrado en el inventario.");
                }
            }
        } while (codigo != 0);
        
        // Imprimir factura
        System.out.println("\n=== DETALLE DE FACTURA ===");
        System.out.println("Cantidad\tNombre\t\tPrecio Unit.\tSubtotal");
        System.out.println("------------------------------------------------------------");
        
        double total = 0;
        
        // Iterar sobre los artículos en la factura
        for (Integer codigoArticulo : factura.keySet()) {
            Articulo articulo = inventario.get(codigoArticulo);
            int cantidad = factura.get(codigoArticulo);
            double precioUnitario = articulo.getPrecio();
            double subtotal = cantidad * precioUnitario;
            total += subtotal;
            
            System.out.println(cantidad + " x\t\t" + articulo.getNombre() + 
                             "\t\t$" + precioUnitario + "\t\t$" + subtotal);
        }
        
        System.out.println("------------------------------------------------------------");
        System.out.println("TOTAL:\t\t\t\t\t\t$" + total);
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. MAPA DE CANTIDADES:
         *    - Map<Integer, Integer> para código -> cantidad
         *    - getOrDefault(codigo, 0) + 1 incrementa contador
         *    - Si no existe, crea con valor 1
         * 
         * 2. CÁLCULO DE TOTALES:
         *    - Subtotal = cantidad * precio unitario
         *    - Total = suma de todos los subtotales
         * 
         * 3. VALIDACIÓN:
         *    - Verifica que el código exista en inventario
         *    - Evita errores al acceder a artículo inexistente
         */
    }
}


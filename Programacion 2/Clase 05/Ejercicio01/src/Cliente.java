/*
 * EJERCICIO 01 - COMPOSICIÓN - CLASE CLIENTE
 * 
 * ENUNCIADO:
 * Un banco tiene 3 clientes que pueden hacer depósitos y extracciones. 
 * También el banco requiere que al final del día calcule la cantidad de dinero que hay depositado.
 * 
 * CONCEPTO CLAVE: COMPOSICIÓN
 * - La clase Cliente colabora con la clase Banco
 * - Un Cliente "es parte del" Banco
 * - El Banco tiene 3 objetos de la clase Cliente como atributos
 * 
 * ATRIBUTOS:
 * - nombre: String (nombre del cliente)
 * - monto: int (cantidad de dinero depositado)
 * 
 * MÉTODOS:
 * - constructor: inicializa nombre y monto en 0
 * - depositar: suma dinero al monto
 * - extraer: resta dinero del monto
 * - retornarMonto: devuelve el monto actual
 * - imprimir: muestra los datos del cliente
 */

public class Cliente {
    // Atributos privados para encapsulación
    private String nombre;
    private int monto;

    /**
     * CONSTRUCTOR - Inicializa un cliente con nombre y monto en 0
     * 
     * @param nom Nombre del cliente
     */
    public Cliente(String nom) {
        nombre = nom;
        monto = 0;
    }

    /**
     * MÉTODO DEPOSITAR - Suma dinero al monto del cliente
     * 
     * @param m Cantidad de dinero a depositar
     */
    public void depositar(int m) {
        monto = monto + m;
    }

    /**
     * MÉTODO EXTRAER - Resta dinero del monto del cliente
     * 
     * @param m Cantidad de dinero a extraer
     * NOTA: Para simplificar, no se valida que el monto quede negativo
     */
    public void extraer(int m) {
        monto = monto - m;
    }

    /**
     * MÉTODO RETORNAR MONTO - Devuelve el monto actual del cliente
     * 
     * @return int Cantidad de dinero depositado
     * IMPORTANTE: Como el atributo monto es privado, necesitamos este método
     * para que otras clases puedan acceder al valor
     */
    public int retornarMonto() {
        return monto;
    }

    /**
     * MÉTODO IMPRIMIR - Muestra los datos del cliente
     * 
     * FUNCIONALIDAD:
     * - Imprime el nombre y el monto depositado
     */
    public void imprimir() {
        System.out.println(nombre + " tiene depositado la suma de " + monto);
    }
}

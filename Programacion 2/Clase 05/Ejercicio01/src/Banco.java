/*
 * EJERCICIO 01 - COMPOSICIÓN - CLASE BANCO
 * 
 * ENUNCIADO:
 * Un banco tiene 3 clientes que pueden hacer depósitos y extracciones. 
 * También el banco requiere que al final del día calcule la cantidad de dinero que hay depositado.
 * 
 * CONCEPTO CLAVE: COMPOSICIÓN
 * - La clase Banco tiene una relación de composición con la clase Cliente
 * - El Banco "tiene" 3 objetos de la clase Cliente
 * - Esta es la clase principal que contiene el método main
 * 
 * ATRIBUTOS:
 * - cliente1, cliente2, cliente3: objetos de la clase Cliente
 * 
 * MÉTODOS:
 * - constructor: crea los 3 clientes con nombres específicos
 * - operar: realiza operaciones de depósito y extracción
 * - depositosTotales: calcula y muestra el total de dinero en el banco
 * - main: método principal que ejecuta el programa
 */

public class Banco {
    // Atributos de tipo Cliente - RELACIÓN DE COMPOSICIÓN
    private Cliente cliente1, cliente2, cliente3;

    /**
     * CONSTRUCTOR - Crea los tres clientes del banco
     * 
     * FUNCIONALIDAD:
     * - Instancia 3 objetos de la clase Cliente
     * - Cada cliente se inicializa con un nombre específico
     * - El monto de cada cliente se inicializa en 0 automáticamente
     */
    public Banco() {
        cliente1 = new Cliente("Juan");
        cliente2 = new Cliente("Ana");
        cliente3 = new Cliente("Pedro");
    }

    /**
     * MÉTODO OPERAR - Realiza operaciones bancarias
     * 
     * FUNCIONALIDAD:
     * - Llama a los métodos depositar y extraer de cada cliente
     * - Simula operaciones bancarias del día
     * 
     * OPERACIONES REALIZADAS:
     * - Juan deposita 100
     * - Ana deposita 150
     * - Pedro deposita 200
     * - Pedro extrae 150
     */
    public void operar() {
        cliente1.depositar(100);
        cliente2.depositar(150);
        cliente3.depositar(200);
        cliente3.extraer(150);
    }

    /**
     * MÉTODO DEPOSITOS TOTALES - Calcula y muestra el total de dinero
     * 
     * FUNCIONALIDAD:
     * 1. Suma el monto de los tres clientes
     * 2. Muestra el total de dinero en el banco
     * 3. Imprime los datos de cada cliente
     * 
     * IMPORTANTE: 
     * - Usa el método retornarMonto() para acceder al monto privado de cada cliente
     * - Llama al método imprimir() de cada cliente para mostrar sus datos
     */
    public void depositosTotales() {
        // Suma los montos de los tres clientes
        int t = cliente1.retornarMonto() + 
                cliente2.retornarMonto() + 
                cliente3.retornarMonto();
        
        // Muestra el total de dinero en el banco
        System.out.println("El total de dinero en el banco es:" + t);
        
        // Imprime los datos de cada cliente
        cliente1.imprimir();
        cliente2.imprimir();
        cliente3.imprimir();
    }

    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FLUJO DE EJECUCIÓN:
     * 1. Crea un objeto Banco (ejecuta constructor)
     * 2. Llama al método operar() para realizar operaciones
     * 3. Llama al método depositosTotales() para mostrar resultados
     */
    public static void main(String[] ar) {
        // Creación del objeto Banco
        Banco banco1 = new Banco();
        
        // Realización de operaciones bancarias
        banco1.operar();
        
        // Cálculo y muestra de totales
        banco1.depositosTotales();
    }
}


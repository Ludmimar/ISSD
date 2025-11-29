/*
 * EJERCICIO 04 - HERENCIA - CLASE PADRE OPERACION
 * 
 * ENUNCIADO:
 * Implementar dos clases que llamaremos Suma y Resta. Cada clase tiene como atributo valor1, valor2 y resultado.
 * Los métodos a definir son cargar1 (que inicializa el atributo valor1), carga2 (que inicializa el atributo valor2), 
 * operar (que en el caso de la clase "Suma" suma los dos atributos y en el caso de la clase "Resta" hace la diferencia 
 * entre valor1 y valor2, y otro método mostrarResultado.
 * 
 * CONCEPTO CLAVE: HERENCIA
 * - La clase Operacion es la clase padre (superclase)
 * - Las clases Suma y Resta heredan de Operacion
 * - Los atributos y métodos comunes se definen en la clase padre
 * - Cada clase hija implementa su propio método operar()
 * 
 * ATRIBUTOS PROTEGIDOS (accesibles por las subclases):
 * - teclado: Scanner para entrada de datos
 * - valor1, valor2: valores a operar
 * - resultado: resultado de la operación
 * 
 * MÉTODOS:
 * - constructor: inicializa el Scanner
 * - cargar1: solicita y carga el primer valor
 * - cargar2: solicita y carga el segundo valor
 * - mostrarResultado: muestra el resultado
 */

import java.util.Scanner;

public class Operacion {
    // Atributos protegidos para que las subclases puedan acceder
    protected Scanner teclado;
    protected int valor1;
    protected int valor2;
    protected int resultado;

    /**
     * CONSTRUCTOR - Inicializa el Scanner para entrada de datos
     * 
     * FUNCIONALIDAD:
     * - Crea el objeto Scanner para leer datos del teclado
     * - Los atributos valor1, valor2 y resultado se inicializan automáticamente en 0
     */
    public Operacion() {
        teclado = new Scanner(System.in);
    }

    /**
     * MÉTODO CARGAR1 - Solicita y carga el primer valor
     * 
     * FUNCIONALIDAD:
     * - Solicita al usuario que ingrese el primer valor
     * - Almacena el valor en el atributo valor1
     */
    public void cargar1() {
        System.out.print("Ingrese el primer valor: ");
        valor1 = teclado.nextInt();
    }

    /**
     * MÉTODO CARGAR2 - Solicita y carga el segundo valor
     * 
     * FUNCIONALIDAD:
     * - Solicita al usuario que ingrese el segundo valor
     * - Almacena el valor en el atributo valor2
     */
    public void cargar2() {
        System.out.print("Ingrese el segundo valor: ");
        valor2 = teclado.nextInt();
    }

    /**
     * MÉTODO MOSTRAR RESULTADO - Muestra el resultado de la operación
     * 
     * FUNCIONALIDAD:
     * - Imprime el valor almacenado en el atributo resultado
     * - Este método es común para todas las operaciones
     */
    public void mostrarResultado() {
        System.out.println(resultado);
    }
}




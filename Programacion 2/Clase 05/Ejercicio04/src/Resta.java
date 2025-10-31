/*
 * EJERCICIO 04 - HERENCIA - CLASE HIJA RESTA
 * 
 * ENUNCIADO:
 * Implementar dos clases que llamaremos Suma y Resta. Cada clase tiene como atributo valor1, valor2 y resultado.
 * Los métodos a definir son cargar1 (que inicializa el atributo valor1), carga2 (que inicializa el atributo valor2), 
 * operar (que en el caso de la clase "Suma" suma los dos atributos y en el caso de la clase "Resta" hace la diferencia 
 * entre valor1 y valor2, y otro método mostrarResultado.
 * 
 * CONCEPTO CLAVE: HERENCIA
 * - La clase Resta hereda de la clase Operacion usando 'extends'
 * - Hereda automáticamente todos los atributos y métodos de Operacion
 * - Implementa su propio método operar() específico para la resta
 * 
 * HERENCIA:
 * - Atributos heredados: teclado, valor1, valor2, resultado
 * - Métodos heredados: cargar1(), cargar2(), mostrarResultado()
 * - Método propio: operar() - resta valor1 - valor2
 */

public class Resta extends Operacion {
    
    /**
     * MÉTODO OPERAR - Realiza la operación de resta
     * 
     * FUNCIONALIDAD:
     * - Resta valor2 de valor1 (valor1 - valor2)
     * - Almacena el resultado en el atributo resultado
     * - Utiliza los atributos heredados de la clase padre
     * 
     * OPERACIÓN:
     * resultado = valor1 - valor2
     */
    public void operar() {
        resultado = valor1 - valor2;
    }
}


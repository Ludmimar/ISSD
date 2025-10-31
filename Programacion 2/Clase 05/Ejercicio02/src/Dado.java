/*
 * EJERCICIO 02 - COMPOSICIÓN - CLASE DADO
 * 
 * ENUNCIADO:
 * Plantear un programa que permita jugar a los dados. Las reglas de juego son: 
 * se tiran tres dados si los tres salen con el mismo valor mostrar un mensaje que "gano", sino "perdió".
 * 
 * CONCEPTO CLAVE: COMPOSICIÓN
 * - La clase Dado colabora con la clase JuegoDeDados
 * - Un Dado "es parte del" JuegoDeDados
 * - El JuegoDeDados tiene 3 objetos de la clase Dado como atributos
 * 
 * ATRIBUTOS:
 * - valor: int (valor que sale al tirar el dado)
 * 
 * MÉTODOS:
 * - tirar: genera un valor aleatorio entre 1 y 6
 * - imprimir: muestra el valor del dado
 * - retornarValor: devuelve el valor actual del dado
 */

public class Dado {
    // Atributo privado para almacenar el valor del dado
    private int valor;
    
    /**
     * MÉTODO TIRAR - Genera un valor aleatorio entre 1 y 6
     * 
     * FUNCIONALIDAD:
     * - Utiliza Math.random() para generar números aleatorios
     * - Math.random() genera valores entre 0.0 y 0.999...
     * - Multiplicamos por 6 y convertimos a int para obtener 0-5
     * - Sumamos 1 para obtener valores entre 1-6
     * 
     * EXPLICACIÓN MATEMÁTICA:
     * - Math.random() * 6 genera valores entre 0.0 y 5.999...
     * - (int)(Math.random() * 6) genera enteros entre 0 y 5
     * - 1 + (int)(Math.random() * 6) genera enteros entre 1 y 6
     */
    public void tirar() {
        valor = 1 + (int)(Math.random() * 6);
    }
    
    /**
     * MÉTODO IMPRIMIR - Muestra el valor del dado
     * 
     * FUNCIONALIDAD:
     * - Imprime el valor actual del dado en consola
     */
    public void imprimir() {
        System.out.println("El valor del dado es:" + valor);
    }
    
    /**
     * MÉTODO RETORNAR VALOR - Devuelve el valor actual del dado
     * 
     * @return int Valor actual del dado
     * IMPORTANTE: Como el atributo valor es privado, necesitamos este método
     * para que otras clases puedan acceder al valor
     */
    public int retornarValor() {
        return valor;
    }
}


/**
 * Ejercicio 15 - Clase Operación con métodos estáticos
 * Implementar una clase llamada Operacion. Definir dos métodos estáticos que permitan sumar y restar dos valores enteros.
 * Ejemplo de métodos estáticos que se pueden llamar sin crear objetos de la clase.
 */
public class Operacion {

    /**
     * Método estático para sumar dos enteros
     * @param x1 primer valor
     * @param x2 segundo valor
     * @return suma de los dos valores
     */
    public static int sumar(int x1, int x2) {
        int s = x1 + x2;
        return s;
    }

    /**
     * Método estático para restar dos enteros
     * @param x1 primer valor
     * @param x2 segundo valor
     * @return resta de los dos valores
     */
    public static int restar(int x1, int x2) {
        int r = x1 - x2;
        return r;
    }
}

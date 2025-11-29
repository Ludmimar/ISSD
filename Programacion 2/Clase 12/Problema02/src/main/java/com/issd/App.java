package com.issd;

import java.util.ArrayList;

/**
 * Problema 2 - Clase 12: Documentación JavaDoc
 * 
 * Esta clase demuestra el uso de anotaciones JavaDoc para documentar
 * métodos y clases en Java. La documentación aparece en las ventanas
 * emergentes del IDE cuando se consulta información sobre los métodos.
 * 
 * <p>Las anotaciones principales de JavaDoc son:</p>
 * <ul>
 *   <li><b>@param</b> - Documenta los parámetros de un método</li>
 *   <li><b>@return</b> - Documenta el valor de retorno</li>
 *   <li><b>@throws</b> - Documenta las excepciones que puede lanzar</li>
 *   <li><b>@author</b> - Indica el autor del código</li>
 *   <li><b>@version</b> - Indica la versión del código</li>
 *   <li><b>@since</b> - Indica desde qué versión existe</li>
 *   <li><b>@see</b> - Referencias a otras clases o métodos</li>
 * </ul>
 * 
 * @author Ludmila Martos
 * @version 1.0.0
 * @since 2025
 */
public class App {
    
    public static void main(String[] args) {
        System.out.println("═══════════════════════════════════════════════════════════════");
        System.out.println("          PROBLEMA 2 - DOCUMENTACIÓN JAVADOC");
        System.out.println("═══════════════════════════════════════════════════════════════");
        System.out.println();
        
        // Probar el método suma
        int resultado = suma(5, 3);
        System.out.println("📊 Prueba de suma(5, 3): " + resultado);
        System.out.println();
        
        // Probar el método obtenerDivisores
        int numero = 24;
        ArrayList<Integer> divisores = obtenerDivisores(numero);
        System.out.println("📊 Divisores de " + numero + ": " + divisores);
        System.out.println();
        
        // Probar el método esPrimo
        System.out.println("📊 ¿Es 17 primo? " + esPrimo(17));
        System.out.println("📊 ¿Es 24 primo? " + esPrimo(24));
        System.out.println();
        
        // Probar el método factorial
        System.out.println("📊 Factorial de 5: " + factorial(5));
        System.out.println();
        
        System.out.println("═══════════════════════════════════════════════════════════════");
        System.out.println("💡 TIP: Pasa el mouse sobre los métodos en el IDE para ver");
        System.out.println("   la documentación JavaDoc que hemos escrito!");
        System.out.println("═══════════════════════════════════════════════════════════════");
    }
    
    /**
     * Este método suma dos números enteros y devuelve el resultado.
     * 
     * <p>Ejemplo de uso:</p>
     * <pre>
     * int resultado = suma(5, 3);  // resultado = 8
     * </pre>
     * 
     * @param numero1 El primer número a sumar.
     * @param numero2 El segundo número a sumar.
     * @return La suma de los dos números.
     * @see #factorial(int)
     */
    public static int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }
    
    /**
     * Este método calcula y devuelve todos los divisores de un número entero dado.
     * 
     * <p>Un divisor es un número que divide exactamente a otro número sin dejar resto.</p>
     * 
     * <p>Ejemplo de uso:</p>
     * <pre>
     * ArrayList&lt;Integer&gt; divs = obtenerDivisores(12);
     * // divs = [1, 2, 3, 4, 6, 12]
     * </pre>
     * 
     * @param numero El número entero del cual se desean obtener los divisores.
     *               Debe ser un número positivo mayor que 0.
     * @return Un ArrayList que contiene todos los divisores del número dado,
     *         ordenados de menor a mayor.
     * @throws IllegalArgumentException Si el número es menor o igual a 0.
     * @see #esPrimo(int)
     */
    public static ArrayList<Integer> obtenerDivisores(int numero) {
        if (numero <= 0) {
            throw new IllegalArgumentException("El número debe ser positivo");
        }
        
        ArrayList<Integer> divisores = new ArrayList<>();
        
        // Iteramos desde 1 hasta la mitad del número, ya que los divisores 
        // no pueden ser mayores que la mitad del número
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                divisores.add(i);
            }
        }
        
        // Agregamos el propio número como divisor
        divisores.add(numero);
        
        return divisores;
    }
    
    /**
     * Determina si un número es primo.
     * 
     * <p>Un número primo es aquel que solo es divisible por 1 y por sí mismo.
     * Los primeros números primos son: 2, 3, 5, 7, 11, 13, 17, 19...</p>
     * 
     * <p>Ejemplo de uso:</p>
     * <pre>
     * boolean resultado = esPrimo(17);  // true
     * boolean resultado2 = esPrimo(24); // false
     * </pre>
     * 
     * @param numero El número a verificar. Debe ser mayor que 1.
     * @return {@code true} si el número es primo, {@code false} en caso contrario.
     * @see #obtenerDivisores(int)
     */
    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        
        // Solo necesitamos verificar hasta la raíz cuadrada del número
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    /**
     * Calcula el factorial de un número entero no negativo.
     * 
     * <p>El factorial de un número n (denotado como n!) es el producto de todos
     * los enteros positivos menores o iguales a n.</p>
     * 
     * <p>Definición matemática:</p>
     * <ul>
     *   <li>0! = 1 (por convención)</li>
     *   <li>n! = n × (n-1) × (n-2) × ... × 2 × 1</li>
     * </ul>
     * 
     * <p>Ejemplo de uso:</p>
     * <pre>
     * long fact5 = factorial(5);  // 5! = 5×4×3×2×1 = 120
     * </pre>
     * 
     * @param n El número del cual calcular el factorial. Debe ser >= 0.
     * @return El factorial del número como {@code long}.
     * @throws IllegalArgumentException Si n es negativo.
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número debe ser no negativo");
        }
        
        if (n == 0 || n == 1) {
            return 1;
        }
        
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        
        return resultado;
    }
}


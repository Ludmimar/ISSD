/*
 * PROBLEMA 02 - COLECCIONES - LISTA DE NÚMEROS CON PROMEDIO
 * 
 * ENUNCIADO:
 * Crear una lista de enteros llamada números (List<Integer>). 
 * Pedirle al usuario que agregue números a esta lista, recursivamente, 
 * hasta que este ingrese un 0. Cuando eso suceda, imprimir todos los 
 * números ingresados y el promedio de los mismos.
 * 
 * CONCEPTO CLAVE: COLECCIONES - ENTRADA RECURSIVA Y CÁLCULOS
 * - Ciclo while para entrada indefinida hasta condición de salida
 * - Las listas permiten agregar elementos dinámicamente
 * - Cálculo de promedio con suma y tamaño
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear lista de Integer
 * 2. Ciclo while para pedir números hasta ingresar 0
 * 3. Agregar números a la lista
 * 4. Calcular y mostrar promedio
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Clase6 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Pide números al usuario hasta ingresar 0
     * - Almacena números en lista
     * - Calcula y muestra promedio
     */
    public static void main(String[] args) {
        // Crear Scanner para entrada de datos
        Scanner teclado = new Scanner(System.in);
        
        // Crear lista de números enteros
        // Usar Integer porque las listas no aceptan tipos primitivos
        List<Integer> numeros = new ArrayList<>();
        
        // Variable para almacenar el número ingresado
        int numero;
        
        // Ciclo para pedir números hasta ingresar 0
        System.out.println("Ingrese numeros (0 para terminar):");
        
        do {
            System.out.print("Ingrese un numero: ");
            numero = teclado.nextInt();
            
            // Si el número no es 0, agregarlo a la lista
            if (numero != 0) {
                numeros.add(numero);
            }
        } while (numero != 0); // Continuar mientras no sea 0
        
        // Imprimir todos los números ingresados
        System.out.println("\nNumeros ingresados:");
        for (Integer num : numeros) {
            System.out.println(num);
        }
        
        // Calcular el promedio
        if (numeros.size() > 0) {
            int suma = 0;
            
            // Sumar todos los números
            for (Integer num : numeros) {
                suma += num;
            }
            
            // Calcular promedio (dividir suma por cantidad)
            double promedio = (double) suma / numeros.size();
            
            System.out.println("\nPromedio: " + promedio);
        } else {
            System.out.println("No se ingresaron numeros.");
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. LISTA DE INTEGER:
         *    - Usar Integer[] o List<Integer> en lugar de int[]
         *    - Las listas no aceptan tipos primitivos
         *    - Integer es el wrapper class de int
         * 
         * 2. CICLO DO-WHILE:
         *    - Se ejecuta al menos una vez
         *    - Evalúa la condición al final
         *    - Útil cuando necesitamos leer antes de validar
         * 
         * 3. CONDICIÓN DE SALIDA:
         *    - El 0 actúa como centinela (valor de parada)
         *    - Se valida dentro del ciclo antes de agregar
         *    - Permite entrada indefinida de datos
         * 
         * 4. CÁLCULO DE PROMEDIO:
         *    - Sumar todos los elementos
         *    - Dividir por la cantidad (size())
         *    - Usar (double) para división con decimales
         * 
         * 5. VALIDACIÓN:
         *    - Verificar que la lista no esté vacía antes de calcular
         *    - Evita división por cero
         */
    }
}


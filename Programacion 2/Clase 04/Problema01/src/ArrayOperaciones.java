/*
 * PROBLEMA 01 - OPERACIONES CON ARRAYS UNIDIMENSIONALES
 * 
 * ENUNCIADO:
 * Desarrollar un programa que permita ingresar un Array de 4 elementos de tipo int, 
 * e implemente los siguientes métodos:
 * a) El constructor donde creamos el Arreglo.
 * b) Un método para cargar sus componentes.
 * c) Calcular el valor acumulado de todos los elementos del Array.
 * d) Cantidad de valores mayores a 50.
 * 
 * OBJETIVO:
 * - Practicar operaciones básicas con arrays
 * - Implementar múltiples métodos para una misma estructura
 * - Calcular sumas y conteos condicionales
 * - Separar responsabilidades en métodos diferentes
 * 
 * CONCEPTOS CLAVE:
 * - Arrays de tamaño fijo (4 elementos)
 * - Carga de datos por teclado
 * - Suma acumulativa de elementos
 * - Conteo condicional (valores > 50)
 * - Separación de métodos por funcionalidad
 */

import java.util.Scanner;

public class ArrayOperaciones {
    // Scanner para entrada de datos por teclado
    private Scanner teclado;
    
    // Array de 4 elementos enteros
    private int[] array;

    /**
     * CONSTRUCTOR - Crea el array de 4 elementos
     * 
     * FUNCIONALIDAD:
     * - Inicializa el Scanner para entrada de datos
     * - Crea el array de 4 elementos (todos inicializados en 0)
     * - NO carga datos (eso se hace en método separado)
     * 
     * SEPARACIÓN DE RESPONSABILIDADES:
     * - Constructor: solo inicializa objetos
     * - Método cargar: llena el array con datos del usuario
     */
    public ArrayOperaciones() {
        teclado = new Scanner(System.in);
        
        // Crear array de 4 elementos
        // Todos los elementos se inicializan automáticamente en 0
        array = new int[4];
    }

    /**
     * MÉTODO CARGAR - Llena el array con datos ingresados por el usuario
     * 
     * FUNCIONALIDAD:
     * - Solicita al usuario que ingrese 4 valores
     * - Almacena cada valor en la posición correspondiente del array
     * - Muestra mensaje descriptivo para cada elemento
     * 
     * INTERFAZ DE USUARIO:
     * - Mensajes claros indicando qué elemento se está cargando
     * - Entrada secuencial de datos
     */
    public void cargar() {
        // Bucle para cargar los 4 elementos del array
        for (int f = 0; f < array.length; f++) {
            // Solicitar valor para el elemento f-ésimo
            System.out.print("Ingrese componente " + f + ":");
            // Leer y almacenar el valor ingresado
            array[f] = teclado.nextInt();
        }
    }

    /**
     * MÉTODO CALCULAR VALOR ACUMULADO - Suma todos los elementos del array
     * 
     * FUNCIONALIDAD:
     * - Recorre todos los elementos del array
     * - Suma cada elemento a un acumulador
     * - Muestra el resultado de la suma total
     * 
     * ALGORITMO DE SUMA:
     * 1. Inicializar acumulador en 0
     * 2. Recorrer todos los elementos
     * 3. Sumar cada elemento al acumulador
     * 4. Mostrar resultado final
     */
    public void calcularValorAcumulado() {
        // Variable acumulador inicializada en 0
        int suma = 0;
        
        // Bucle para recorrer todos los elementos del array
        for (int f = 0; f < array.length; f++) {
            // Sumar elemento actual al acumulador
            suma += array[f];
        }
        
        // Mostrar resultado de la suma total
        System.out.println("El valor acumulado de todos los elementos es: " + suma);
    }

    /**
     * MÉTODO CANTIDAD VALORES MAYORES 50 - Cuenta elementos mayores a 50
     * 
     * FUNCIONALIDAD:
     * - Recorre todos los elementos del array
     * - Cuenta cuántos elementos son mayores a 50
     * - Muestra el resultado del conteo
     * 
     * ALGORITMO DE CONTEO CONDICIONAL:
     * 1. Inicializar contador en 0
     * 2. Recorrer todos los elementos
     * 3. Si elemento > 50, incrementar contador
     * 4. Mostrar resultado final
     */
    public void cantidadValoresMayores50() {
        // Variable contador inicializada en 0
        int cant = 0;
        
        // Bucle para recorrer todos los elementos del array
        for (int f = 0; f < array.length; f++) {
            // Condición: si el elemento actual es mayor a 50
            if (array[f] > 50) {
                // Incrementar contador
                cant++;
            }
        }
        
        // Mostrar resultado del conteo
        System.out.println("Cantidad de valores mayores a 50: " + cant);
    }

    /**
     * MÉTODO IMPRIMIR - Muestra todos los elementos del array
     * 
     * FUNCIONALIDAD:
     * - Recorre el array completo
     * - Muestra cada elemento separado por espacio
     * - Útil para verificar los datos cargados
     * 
     * PROPÓSITO:
     * - Verificación visual de los datos
     * - Confirmación de que la carga fue correcta
     */
    public void imprimir() {
        System.out.println("Array completo:");
        
        // Bucle para mostrar todos los elementos
        for (int f = 0; f < array.length; f++) {
            // Imprimir elemento seguido de espacio
            System.out.print(array[f] + " ");
        }
        
        // Nueva línea al final para mejor presentación
        System.out.println();
    }

    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FLUJO DE EJECUCIÓN:
     * 1. Crear objeto (ejecuta constructor)
     * 2. Cargar datos del usuario
     * 3. Mostrar array completo
     * 4. Calcular suma total
     * 5. Contar valores mayores a 50
     * 
     * ORDEN DE EJECUCIÓN:
     * - Primero cargar datos
     * - Luego realizar operaciones
     * - Finalmente mostrar resultados
     */
    public static void main(String[] args) {
        // Crear objeto: ejecuta constructor
        ArrayOperaciones ao = new ArrayOperaciones();
        
        // Cargar datos ingresados por el usuario
        ao.cargar();
        
        // Mostrar array completo para verificación
        ao.imprimir();
        
        // Calcular y mostrar suma total de elementos
        ao.calcularValorAcumulado();
        
        // Contar y mostrar elementos mayores a 50
        ao.cantidadValoresMayores50();
    }
}

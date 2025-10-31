/*
 * EJERCICIO 06 - COLECCIONES - ENTRADA DE DATOS Y LISTAS
 * 
 * ENUNCIADO:
 * Crear una lista vacía. Utilizando un ciclo iterativo, pedirle al usuario 
 * tres nombres que guardaremos en la lista. Con otro ciclo for, imprimir 
 * los elementos almacenados en la lista.
 * 
 * CONCEPTO CLAVE: COLECCIONES - INTERACCIÓN CON USUARIO
 * - Las listas pueden llenarse dinámicamente con datos del usuario
 * - Scanner permite leer datos desde la consola
 * - Ciclos for permiten repetir la entrada de datos
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear lista vacía
 * 2. Crear Scanner para entrada de datos
 * 3. Ciclo for para pedir 3 nombres
 * 4. Agregar cada nombre a la lista
 * 5. Ciclo for para imprimir los nombres
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Clase6 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Crea lista vacía
     * - Pide tres nombres al usuario
     * - Almacena los nombres en la lista
     * - Imprime todos los nombres
     */
    public static void main(String[] args) {
        // Crear lista vacía de nombres
        List<String> nombres = new ArrayList<>();
        
        // Crear Scanner para leer datos del teclado
        Scanner teclado = new Scanner(System.in);
        
        // Ciclo para pedir tres nombres al usuario
        // Se ejecuta 3 veces (i = 0, 1, 2)
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese un nombre: ");
            String nombre = teclado.nextLine(); // Leer nombre ingresado
            nombres.add(nombre); // Agregar nombre a la lista
        }
        
        // Ciclo para imprimir todos los elementos de la lista
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. LISTA VACÍA:
         *    - Se crea sin elementos iniciales
         *    - Se va llenando con datos del usuario
         *    - El tamaño crece conforme se agregan elementos
         * 
         * 2. SCANNER:
         *    - nextLine() lee una línea completa de texto
         *    - Permite leer espacios en el nombre
         *    - next() solo lee hasta el primer espacio
         * 
         * 3. CICLO DE ENTRADA:
         *    - Se ejecuta exactamente 3 veces
         *    - Cada iteración pide un nombre y lo agrega
         *    - La variable 'nombre' es local al ciclo
         * 
         * 4. CICLO DE SALIDA:
         *    - Utiliza nombres.size() para determinar cuántos elementos hay
         *    - Es seguro usar .size() porque ya sabemos que hay 3 elementos
         * 
         * 5. VENTAJAS:
         *    - Fácil cambiar la cantidad de nombres a pedir
         *    - Los datos se almacenan dinámicamente
         *    - La lista crece automáticamente
         */
    }
}


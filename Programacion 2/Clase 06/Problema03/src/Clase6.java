/*
 * PROBLEMA 03 - COLECCIONES - LISTA DE OBJETOS AUTO
 * 
 * ENUNCIADO:
 * Programar una clase Auto que tenga los parámetros marca (String) y modelo (int), 
 * un constructor con estos parámetros y getters para ambos. Crear una lista de 
 * objetos Auto (List<Auto>) y pedirle al usuario que ingrese 3 autos, que serán 
 * almacenados en la lista. Imprimir la marca y modelo de cada uno de los Autos 
 * ingresados en la lista.
 * 
 * CONCEPTO CLAVE: COLECCIONES - ENTRADA DE OBJETOS PERSONALIZADOS
 * - Crear objetos desde entrada del usuario
 * - Almacenar objetos en lista
 * - Acceder a métodos de objetos en la lista
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear lista de Auto
 * 2. Pedir 3 autos al usuario (marca y modelo)
 * 3. Crear objetos Auto y agregar a lista
 * 4. Imprimir marca y modelo de cada auto
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Clase6 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Pide 3 autos al usuario
     * - Almacena en lista
     * - Imprime información de cada auto
     */
    public static void main(String[] args) {
        // Crear Scanner para entrada de datos
        Scanner teclado = new Scanner(System.in);
        
        // Crear lista de objetos Auto
        List<Auto> autos = new ArrayList<>();
        
        // Ciclo para pedir 3 autos
        for (int i = 0; i < 3; i++) {
            System.out.println("--- Auto " + (i + 1) + " ---");
            
            // Pedir marca
            System.out.print("Ingrese la marca del auto: ");
            String marca = teclado.nextLine();
            
            // Pedir modelo
            System.out.print("Ingrese el modelo del auto: ");
            int modelo = teclado.nextInt();
            teclado.nextLine(); // Consumir el salto de línea después de nextInt()
            
            // Crear objeto Auto y agregarlo a la lista
            Auto auto = new Auto(marca, modelo);
            autos.add(auto);
            
            System.out.println(); // Línea en blanco para separar
        }
        
        // Imprimir información de cada auto en la lista
        System.out.println("=== AUTOS INGRESADOS ===");
        for (int i = 0; i < autos.size(); i++) {
            Auto auto = autos.get(i);
            System.out.println("Auto " + (i + 1) + ":");
            System.out.println("  Marca: " + auto.getMarca());
            System.out.println("  Modelo: " + auto.getModelo());
            System.out.println();
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. LISTAS DE OBJETOS PERSONALIZADOS:
         *    - List<Auto> declara una lista de objetos Auto
         *    - Cada elemento es un objeto independiente
         *    - Permite agrupar objetos relacionados
         * 
         * 2. CREACIÓN DE OBJETOS DESDE ENTRADA:
         *    - Leer datos del usuario
         *    - Crear objeto con esos datos
         *    - Agregar objeto a la lista
         * 
         * 3. ACCESO A MÉTODOS:
         *    - autos.get(i) obtiene el objeto en índice i
         *    - auto.getMarca() y auto.getModelo() acceden a atributos
         *    - Los getters permiten acceder a datos privados
         * 
         * 4. NEXTINT Y NEXTLINE:
         *    - nextInt() lee el número pero deja el salto de línea
         *    - nextLine() adicional consume ese salto de línea
         *    - Evita problemas con la siguiente lectura
         */
    }
}


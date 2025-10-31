/*
 * PROBLEMA 03 - SETS - NÚMEROS ÚNICOS ALEATORIOS
 * 
 * ENUNCIADO:
 * Generar una lista de 1000 números aleatorios comprendidos entre 1 y 100. 
 * Imprimir la cantidad de números únicos que hay en la lista.
 * 
 * CONCEPTO CLAVE: SETS - CONTAR ELEMENTOS ÚNICOS
 * - Agregar todos los números a un Set
 * - El tamaño del Set es la cantidad de elementos únicos
 * - Eficiente para contar sin duplicados
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear lista de 1000 números aleatorios (1-100)
 * 2. Agregar todos los números a un Set
 * 3. El tamaño del Set es la cantidad de números únicos
 * 4. Imprimir resultado
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Random;

public class Clase8 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Genera 1000 números aleatorios
     * - Cuenta números únicos usando Set
     * - Imprime resultado
     */
    public static void main(String[] args) {
        // Crear objeto Random para generar números aleatorios
        Random random = new Random();
        
        // Crear lista para almacenar 1000 números aleatorios
        List<Integer> numeros = new ArrayList<>();
        
        // Generar 1000 números aleatorios entre 1 y 100
        System.out.println("Generando 1000 números aleatorios entre 1 y 100...");
        for (int i = 0; i < 1000; i++) {
            // random.nextInt(100) genera 0-99, sumamos 1 para obtener 1-100
            int numeroAleatorio = random.nextInt(100) + 1;
            numeros.add(numeroAleatorio);
        }
        
        System.out.println("Números generados: " + numeros.size());
        
        // Crear Set para almacenar números únicos
        // El Set automáticamente eliminará duplicados
        Set<Integer> numerosUnicos = new HashSet<>();
        
        // Agregar todos los números al Set
        // Los duplicados se eliminarán automáticamente
        for (Integer numero : numeros) {
            numerosUnicos.add(numero);
        }
        
        // Imprimir resultados
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Total de números generados: " + numeros.size());
        System.out.println("Cantidad de números únicos: " + numerosUnicos.size());
        
        // Calcular estadísticas
        int duplicados = numeros.size() - numerosUnicos.size();
        System.out.println("Números duplicados: " + duplicados);
        
        // Como los números van del 1 al 100, el máximo de números únicos es 100
        System.out.println("\nNota: Como los números van del 1 al 100,");
        System.out.println("el máximo posible de números únicos es 100.");
        System.out.println("Con 1000 números aleatorios, es muy probable que todos");
        System.out.println("los números del 1 al 100 aparezcan al menos una vez.");
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. CONTAR ÚNICOS:
         *    - Agregar a un Set elimina duplicados automáticamente
         *    - El tamaño del Set = cantidad de elementos únicos
         *    - Más eficiente que verificar manualmente con contains()
         * 
         * 2. NÚMEROS ALEATORIOS:
         *    - Random.nextInt(100) genera 0-99
         *    - Sumar 1 para obtener 1-100
         *    - Con 1000 números y rango 1-100, muchos serán duplicados
         * 
         * 3. ESTADÍSTICA:
         *    - Máximo posible de únicos: 100 (números del 1 al 100)
         *    - Con 1000 números, es muy probable tener todos los 100
         *    - Promedio esperado: aproximadamente 100 únicos
         */
    }
}


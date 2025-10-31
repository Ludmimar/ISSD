/*
 * EJERCICIO 09 - MAPAS - SISTEMA DE HASH PARA USUARIOS Y PINS
 * 
 * ENUNCIADO:
 * Supongamos que tenemos una suerte de función Hash. Simplificaremos nuestro problema 
 * diciendo que esta función toma números enteros y devuelve números enteros utilizando 
 * la siguiente formula:
 * 
 * numeroHash = (numeroOriginal * 2) + 256
 * 
 * Diseñaremos un programa que solicite un nombre de usuario (String) y un pin (int) 
 * que será un número de 4 dígitos. Almacenaremos la información en un mapa cuya llave 
 * será el nombre de usuario y el valor el pin, luego de atravesar la función de Hash. 
 * Imprimir finalmente los contenidos del mapa y analizar los resultados.
 * 
 * CONCEPTO CLAVE: MAPAS - FUNCIONES HASH Y SEGURIDAD
 * - Las funciones hash transforman valores en otros valores
 * - Se usan para almacenar contraseñas de forma segura
 * - El valor hash no puede revertirse para obtener el original
 * - HashMap utiliza funciones hash internamente
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear mapa de usuarios y PINs hasheados
 * 2. Pedir 3 usuarios con sus PINs
 * 3. Aplicar función hash al PIN
 * 4. Almacenar usuario y PIN hash en mapa
 * 5. Imprimir contenidos
 */

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Clase7 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Registra usuarios con PINs hasheados
     * - Almacena en mapa de forma segura
     * - Imprime información
     */
    public static void main(String[] args) {
        // Crear Scanner para entrada de datos
        Scanner teclado = new Scanner(System.in);
        
        // Crear mapa de usuarios y PINs hasheados
        // Llave: nombre de usuario (String)
        // Valor: PIN hash (Integer)
        Map<String, Integer> users = new HashMap<>();
        
        // Registrar 3 usuarios
        for (int i = 0; i < 3; i++) {
            System.out.println("--- Registro de Usuario " + (i + 1) + " ---");
            
            // Pedir nombre de usuario
            System.out.print("Registre el usuario: ");
            String user = teclado.nextLine();
            
            // Pedir PIN (número de 4 dígitos)
            System.out.print("Registre el pin (4 digitos): ");
            int pin = teclado.nextInt();
            teclado.nextLine(); // Consumir salto de línea
            
            // Aplicar función hash al PIN y almacenar
            users.put(user, hash(pin));
            
            System.out.println(); // Línea en blanco
        }
        
        // Imprimir contenidos del mapa
        System.out.println("=== USUARIOS Y PINs HASH ===\n");
        for (String user : users.keySet()) {
            System.out.println(user + " - PIN Hash: " + users.get(user));
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. FUNCIONES HASH:
         *    - Transforman un valor en otro valor
         *    - Determinística: mismo input = mismo output
         *    - No reversible: no se puede obtener el original desde el hash
         * 
         * 2. SEGURIDAD:
         *    - El PIN original no se almacena
         *    - Solo se guarda el hash
         *    - Incluso si alguien accede al mapa, no puede obtener los PINs originales
         * 
         * 3. VERIFICACIÓN:
         *    - Para verificar un PIN, se aplica hash y se compara
         *    - Si hash(pinIngresado) == hashAlmacenado, es correcto
         * 
         * 4. EJEMPLO:
         *    - PIN original: 1234
         *    - PIN hash: (1234 * 2) + 256 = 2724
         *    - Se almacena 2724, no 1234
         * 
         * 5. HASHMAP:
         *    - Utiliza funciones hash internamente
         *    - Permite acceso rápido O(1) promedio
         *    - Las llaves se procesan con hash para encontrar posición
         */
    }
    
    /**
     * MÉTODO HASH - Aplica función hash a un PIN
     * 
     * FÓRMULA:
     * hash = (pin * 2) + 256
     * 
     * @param pin PIN original a hashear
     * @return int PIN hash resultante
     */
    private static int hash(int pin) {
        return pin * 2 + 256;
    }
}


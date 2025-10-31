/*
 * EJERCICIO 10 - MAPAS - SISTEMA DE LOGIN BÁSICO
 * 
 * ENUNCIADO:
 * Ampliar el ejercicio anterior para que, luego de registrar los usuarios y los 
 * respectivos PIN, se solicite al usuario que "se loguee" en nuestro programa. 
 * Para lo cual deberá ingresar su usuario y pin. En caso de logging exitoso imprimir 
 * el mensaje "Acceso correcto", en caso contrario imprimir el mensaje "Acceso incorrecto".
 * 
 * CONCEPTO CLAVE: MAPAS - AUTENTICACIÓN CON HASH
 * - Comparar hash del PIN ingresado con hash almacenado
 * - Si coinciden, el usuario se autentica correctamente
 * - No se compara el PIN original directamente
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Registrar usuarios (del ejercicio anterior)
 * 2. Solicitar login
 * 3. Aplicar hash al PIN ingresado
 * 4. Comparar con hash almacenado
 * 5. Mostrar resultado
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
     * - Permite login verificando hash
     */
    public static void main(String[] args) {
        // Crear Scanner para entrada de datos
        Scanner teclado = new Scanner(System.in);
        
        // Crear mapa de usuarios y PINs hasheados
        Map<String, Integer> users = new HashMap<>();
        
        // === REGISTRO DE USUARIOS ===
        System.out.println("=== REGISTRO DE USUARIOS ===\n");
        for (int i = 0; i < 3; i++) {
            System.out.println("--- Usuario " + (i + 1) + " ---");
            
            System.out.print("Registre el usuario: ");
            String user = teclado.nextLine();
            
            System.out.print("Registre el pin: ");
            int pin = teclado.nextInt();
            teclado.nextLine();
            
            // Almacenar usuario con PIN hash
            users.put(user, hash(pin));
            
            System.out.println();
        }
        
        // === LOGIN ===
        System.out.println("--- LOG IN ---");
        System.out.print("Ingrese el usuario: ");
        String usuario = teclado.nextLine();
        
        System.out.print("Ingrese el pin: ");
        int pin = teclado.nextInt();
        
        // Verificar login
        // Comparar hash del PIN ingresado con hash almacenado
        Integer pinHashAlmacenado = users.get(usuario);
        int pinHashIngresado = hash(pin);
        
        if (pinHashAlmacenado != null && pinHashAlmacenado == pinHashIngresado) {
            System.out.println("Acceso correcto");
        } else {
            System.out.println("Acceso incorrecto");
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. VERIFICACIÓN DE LOGIN:
         *    - Se obtiene el hash almacenado: users.get(usuario)
         *    - Se calcula hash del PIN ingresado: hash(pin)
         *    - Se comparan ambos hashes
         * 
         * 2. SEGURIDAD:
         *    - El PIN original nunca se compara directamente
         *    - Solo se comparan hashes
         *    - Si alguien accede al mapa, no puede obtener PINs originales
         * 
         * 3. VERIFICACIÓN NULL:
         *    - pinHashAlmacenado puede ser null si el usuario no existe
         *    - Se debe verificar antes de comparar
         * 
         * 4. RESULTADO:
         *    - "Acceso correcto": hash coincide
         *    - "Acceso incorrecto": hash no coincide o usuario no existe
         */
    }
    
    /**
     * MÉTODO HASH - Aplica función hash a un PIN
     * 
     * @param pin PIN original
     * @return int PIN hash
     */
    private static int hash(int pin) {
        return pin * 2 + 256;
    }
}


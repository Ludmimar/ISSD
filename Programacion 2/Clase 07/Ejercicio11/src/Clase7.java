/*
 * EJERCICIO 11 - MAPAS - SISTEMA DE LOGIN MEJORADO
 * 
 * ENUNCIADO:
 * Ampliar el ejercicio anterior para que el programa detecte si el usuario no existe, 
 * el usuario existe pero la contraseña es incorrecta.
 * 
 * CONCEPTO CLAVE: MAPAS - VALIDACIÓN Y MENSAJES ESPECÍFICOS
 * - containsKey(): Verifica si un usuario existe
 * - Diferentes mensajes según el tipo de error
 * - Mejor experiencia de usuario
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Registrar usuarios
 * 2. Solicitar login
 * 3. Verificar si usuario existe
 * 4. Si existe, verificar PIN
 * 5. Mostrar mensaje específico según situación
 */

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Clase7 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Registra usuarios
     * - Login con mensajes específicos
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
            // Usar nextLine() y parseInt para evitar problemas
            int pin = Integer.parseInt(teclado.nextLine());
            
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
        teclado.nextLine(); // Consumir salto de línea
        
        // Verificar login con mensajes específicos
        if (!users.containsKey(usuario)) {
            // El usuario no existe
            System.out.println("El usuario no existe");
        } else {
            // El usuario existe, verificar PIN
            Integer pinHashAlmacenado = users.get(usuario);
            int pinHashIngresado = hash(pin);
            
            if (pinHashAlmacenado == pinHashIngresado) {
                System.out.println("Acceso correcto");
            } else {
                System.out.println("Contraseña incorrecta");
            }
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. CONTAINSKEY():
         *    - Verifica si el usuario existe antes de obtener su PIN
         *    - Evita obtener null y hacer comparaciones innecesarias
         *    - Mejor práctica de programación defensiva
         * 
         * 2. MENSAJES ESPECÍFICOS:
         *    - "El usuario no existe": Usuario no registrado
         *    - "Contraseña incorrecta": Usuario existe pero PIN incorrecto
         *    - "Acceso correcto": Todo es correcto
         * 
         * 3. EXPERIENCIA DE USUARIO:
         *    - Mensajes claros ayudan al usuario a entender el problema
         *    - No revela información sensible (no dice "usuario válido, PIN incorrecto" en producción)
         * 
         * 4. SEGURIDAD:
         *    - En producción, ambos casos deberían mostrar el mismo mensaje
         *    - Para evitar que atacantes sepan qué usuarios existen
         *    - Aquí es educativo para entender los diferentes casos
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


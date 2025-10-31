/*
 * PROBLEMA 05 - MAPAS - HASH DE USUARIO Y CONTRASEÑA
 * 
 * ENUNCIADO:
 * Ampliar el programa anterior para que, además de modificar la contraseña, se modifique 
 * el nombre de usuario de la siguiente forma: se le sumará 1 a todas las letras que lo 
 * componen (asumir que el usuario solo contiene letras minúsculas o mayúsculas). 
 * El usuario "laura" pasaría a ser "mbrsb" luego de ejecutar nuestro algoritmo. 
 * Imprimir los contenidos del mapa con las modificaciones solicitadas.
 * 
 * CONCEPTO CLAVE: MAPAS - TRANSFORMACIÓN DE STRINGS
 * - Manipulación de caracteres en strings
 * - Conversión entre char e int para operaciones
 * - Almacenar tanto usuario como contraseña transformados
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear mapa
 * 2. Pedir usuario y contraseña
 * 3. Transformar usuario (+1 a cada letra)
 * 4. Aplicar hash a contraseña
 * 5. Almacenar ambos transformados
 */

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Clase7 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Transforma usuario y contraseña
     * - Almacena versiones transformadas
     */
    public static void main(String[] args) {
        // Crear Scanner para entrada de datos
        Scanner teclado = new Scanner(System.in);
        
        // Crear mapa de usuarios y contraseñas transformados
        Map<String, Integer> usuarios = new HashMap<>();
        
        // Registrar 3 usuarios
        System.out.println("=== REGISTRO DE USUARIOS (Transformados) ===\n");
        for (int i = 0; i < 3; i++) {
            System.out.println("--- Usuario " + (i + 1) + " ---");
            
            // Pedir nombre de usuario original
            System.out.print("Ingrese el nombre de usuario: ");
            String usuarioOriginal = teclado.nextLine();
            
            // Pedir contraseña
            System.out.print("Ingrese la contraseña (5 digitos): ");
            int contrasena = teclado.nextInt();
            teclado.nextLine();
            
            // Transformar usuario (+1 a cada letra)
            String usuarioTransformado = transformarUsuario(usuarioOriginal);
            
            // Aplicar hash a contraseña
            int hashContrasena = hashPersonalizado(usuarioOriginal, contrasena);
            
            // Almacenar usuario transformado y contraseña hash
            usuarios.put(usuarioTransformado, hashContrasena);
            
            System.out.println("Usuario original: '" + usuarioOriginal + "' -> Transformado: '" + usuarioTransformado + "'");
            System.out.println();
        }
        
        // Imprimir contenidos del mapa
        System.out.println("=== USUARIOS Y CONTRASEÑAS TRANSFORMADOS ===\n");
        for (String usuario : usuarios.keySet()) {
            System.out.println("Usuario: " + usuario + " -> Contraseña Hash: " + usuarios.get(usuario));
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. TRANSFORMACIÓN DE USUARIO:
         *    - Sumar 1 a cada carácter
         *    - 'a' + 1 = 'b', 'z' + 1 = '{' (necesita manejo especial)
         *    - Para mayúsculas y minúsculas por separado
         * 
         * 2. EJEMPLO:
         *    - Usuario: "laura"
         *    - Transformado: "mbrsb" (cada letra +1)
         *    - l->m, a->b, u->v, r->s, a->b
         */
    }
    
    /**
     * MÉTODO TRANSFORMAR USUARIO - Suma 1 a cada letra
     * 
     * @param usuario Usuario original
     * @return String Usuario transformado
     */
    private static String transformarUsuario(String usuario) {
        StringBuilder transformado = new StringBuilder();
        
        for (char c : usuario.toCharArray()) {
            if (Character.isLowerCase(c)) {
                // Minúsculas: a-z
                char nuevo = (char)(c + 1);
                if (nuevo > 'z') {
                    nuevo = 'a'; // Circular: z -> a
                }
                transformado.append(nuevo);
            } else if (Character.isUpperCase(c)) {
                // Mayúsculas: A-Z
                char nuevo = (char)(c + 1);
                if (nuevo > 'Z') {
                    nuevo = 'A'; // Circular: Z -> A
                }
                transformado.append(nuevo);
            } else {
                // Si no es letra, mantener igual
                transformado.append(c);
            }
        }
        
        return transformado.toString();
    }
    
    /**
     * MÉTODO HASH PERSONALIZADO - Aplica hash a contraseña
     * 
     * @param usuario Nombre de usuario original
     * @param contrasena Contraseña original
     * @return int Contraseña hash
     */
    private static int hashPersonalizado(String usuario, int contrasena) {
        return contrasena + (usuario.length() * 5);
    }
}


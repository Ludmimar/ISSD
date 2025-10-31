/*
 * PROBLEMA 04 - MAPAS - SISTEMA DE HASH PERSONALIZADO
 * 
 * ENUNCIADO:
 * Queremos almacenar usuarios y contraseñas de un modo seguro, para lo cual programaremos 
 * una función que modifique la contraseña con un algoritmo que solo nosotros conocemos y 
 * la almacene en un mapa. La contraseña será un número entero de 5 cifras. Nuestro algoritmo 
 * tomará la contraseña y le sumará la cantidad de letras del usuario multiplicada por 5. 
 * Solicitar al usuario el ingreso de tres pares usuario-contraseña y almacenarlos en un mapa. 
 * Imprimir los contenidos del mapa luego de esto.
 * 
 * CONCEPTO CLAVE: MAPAS - FUNCIÓN HASH PERSONALIZADA
 * - Algoritmo hash específico para el ejercicio
 * - hash = contraseña + (longitudUsuario * 5)
 * - Almacenamiento seguro de contraseñas
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear mapa de usuarios y contraseñas hasheadas
 * 2. Pedir 3 usuarios con contraseñas de 5 dígitos
 * 3. Aplicar hash personalizado
 * 4. Almacenar en mapa
 * 5. Imprimir resultados
 */

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Clase7 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Registra usuarios con contraseñas hasheadas
     * - Aplica hash personalizado
     * - Almacena y muestra resultados
     */
    public static void main(String[] args) {
        // Crear Scanner para entrada de datos
        Scanner teclado = new Scanner(System.in);
        
        // Crear mapa de usuarios y contraseñas hasheadas
        // Llave: nombre de usuario (String)
        // Valor: contraseña hash (Integer)
        Map<String, Integer> usuarios = new HashMap<>();
        
        // Registrar 3 usuarios
        System.out.println("=== REGISTRO DE USUARIOS ===\n");
        for (int i = 0; i < 3; i++) {
            System.out.println("--- Usuario " + (i + 1) + " ---");
            
            // Pedir nombre de usuario
            System.out.print("Ingrese el nombre de usuario: ");
            String usuario = teclado.nextLine();
            
            // Pedir contraseña (número de 5 cifras)
            System.out.print("Ingrese la contraseña (5 digitos): ");
            int contrasena = teclado.nextInt();
            teclado.nextLine(); // Consumir salto de línea
            
            // Aplicar función hash personalizada y almacenar
            int hashContrasena = hashPersonalizado(usuario, contrasena);
            usuarios.put(usuario, hashContrasena);
            
            System.out.println();
        }
        
        // Imprimir contenidos del mapa
        System.out.println("=== USUARIOS Y CONTRASEÑAS HASH ===\n");
        for (String usuario : usuarios.keySet()) {
            System.out.println("Usuario: " + usuario + " -> Contraseña Hash: " + usuarios.get(usuario));
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. HASH PERSONALIZADO:
         *    - Algoritmo específico: hash = contrasena + (longitud * 5)
         *    - Combina contraseña y características del usuario
         *    - Más seguro que solo la contraseña
         * 
         * 2. EJEMPLO:
         *    - Usuario: "juan" (4 letras)
         *    - Contraseña: 12345
         *    - Hash: 12345 + (4 * 5) = 12345 + 20 = 12365
         * 
         * 3. SEGURIDAD:
         *    - La contraseña original no se almacena
         *    - El hash es específico para cada usuario
         *    - Incluso misma contraseña genera hash diferente si el usuario es diferente
         */
    }
    
    /**
     * MÉTODO HASH PERSONALIZADO - Aplica hash a una contraseña
     * 
     * ALGORITMO:
     * hash = contraseña + (cantidad de letras del usuario * 5)
     * 
     * @param usuario Nombre de usuario
     * @param contrasena Contraseña original (5 dígitos)
     * @return int Contraseña hash resultante
     */
    private static int hashPersonalizado(String usuario, int contrasena) {
        // Calcular cantidad de letras del usuario
        int cantidadLetras = usuario.length();
        
        // Aplicar fórmula: contraseña + (cantidadLetras * 5)
        return contrasena + (cantidadLetras * 5);
    }
}


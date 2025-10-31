/*
 * EJERCICIO 02 - MAPAS - MAPA DE CONSTANTES MATEMÁTICAS
 * 
 * ENUNCIADO:
 * Programar un mapa que relacione llaves de tipo String con valores de tipo Double. 
 * Cargar el mapa con las siguientes constantes matemáticas:
 * 
 * Nombre        Valor
 * pi            3.1415
 * e             2.7182
 * GoldenRatio   1.6180
 * 
 * Imprimir los contenidos del mapa con el mensaje "Llave = valor".
 * Imprimir el tamaño del mapa utilizando .size().
 * Imprimir el resultado de ejecutar el método .containsValue(1.6180)
 * Imprimir el resultado de ejecutar el método .containsKey("phi")
 * Imprimir el resultado de ejecutar el método isEmpty()
 * 
 * CONCEPTO CLAVE: MAPAS - MÉTODOS ÚTILES
 * - .size(): Devuelve el número de pares llave-valor
 * - .containsKey(K): Verifica si existe una llave
 * - .containsValue(V): Verifica si existe un valor
 * - .isEmpty(): Verifica si el mapa está vacío
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear mapa de tipo Map<String, Double>
 * 2. Agregar constantes matemáticas
 * 3. Imprimir contenidos
 * 4. Probar métodos de verificación
 */

import java.util.Map;
import java.util.HashMap;

public class Clase7 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Crea mapa de constantes matemáticas
     * - Demuestra uso de métodos de verificación
     */
    public static void main(String[] args) {
        // Crear mapa de constantes matemáticas
        // Llave: nombre de la constante (String)
        // Valor: valor numérico (Double)
        Map<String, Double> constantes = new HashMap<>();
        
        // Agregar constantes matemáticas
        constantes.put("pi", 3.1415);
        constantes.put("e", 2.7182);
        constantes.put("GoldenRatio", 1.6180);
        
        // Imprimir los contenidos del mapa
        System.out.println("=== CONSTANTES MATEMÁTICAS ===\n");
        System.out.println("pi = " + constantes.get("pi"));
        System.out.println("e = " + constantes.get("e"));
        System.out.println("GoldenRatio = " + constantes.get("GoldenRatio"));
        
        // Imprimir el tamaño del mapa
        System.out.println("\nTamaño del mapa: " + constantes.size());
        
        // Verificar si contiene el valor 1.6180
        System.out.println("Contiene el valor 1.6180? " + constantes.containsValue(1.6180));
        
        // Verificar si contiene la llave "phi"
        System.out.println("Contiene la llave \"phi\"? " + constantes.containsKey("phi"));
        
        // Verificar si el mapa está vacío
        System.out.println("El mapa está vacío? " + constantes.isEmpty());
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. MAPA CON DOUBLE:
         *    - Usar Double en lugar de double (tipos primitivos no permitidos)
         *    - Double es el wrapper class de double
         *    - Java hace autoboxing automáticamente (3.1415 se convierte en Double)
         * 
         * 2. MÉTODO .size():
         *    - Devuelve int con el número de pares llave-valor
         *    - Equivalente a .length en arrays o .size() en listas
         * 
         * 3. MÉTODO .containsKey(K):
         *    - Devuelve true si la llave existe en el mapa
         *    - La búsqueda es case-sensitive
         *    - "phi" no es igual a "GoldenRatio"
         * 
         * 4. MÉTODO .containsValue(V):
         *    - Devuelve true si el valor existe en el mapa
         *    - Compara usando equals()
         *    - Puede haber múltiples llaves con el mismo valor
         * 
         * 5. MÉTODO .isEmpty():
         *    - Devuelve true si el mapa no tiene elementos
         *    - Equivalente a: mapa.size() == 0
         * 
         * 6. RESULTADOS ESPERADOS:
         *    - Tamaño: 3 (tres constantes)
         *    - containsValue(1.6180): true (existe GoldenRatio)
         *    - containsKey("phi"): false (no existe esa llave)
         *    - isEmpty(): false (el mapa tiene elementos)
         */
    }
}


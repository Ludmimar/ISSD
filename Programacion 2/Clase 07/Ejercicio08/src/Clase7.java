/*
 * EJERCICIO 08 - MAPAS - MAPA DE TARJETAS CON VALIDACIÓN
 * 
 * ENUNCIADO:
 * Declarar un mapa vacío con llaves de tipo String y valores de tipo Tarjeta. 
 * Supongamos que el número de una tarjeta de crédito solo es válido si es mayor 
 * a 4 cuadrillones (4000 0000 0000 0000) y menor a 6 cuadrillones (6000 0000 0000 0000), 
 * además, si comienza con 4 es Visa y si comienza con 5 es Master. Realizar un programa 
 * que pida al usuario el nombre y el número de tarjeta. Si el número es válido guardar 
 * la tarjeta en el mapa, de lo contrario informar un error y solicitar el numero nuevamente. 
 * Imprimir la Tarjeta almacenada en el mapa utilizando un iterador y el método entrySet.
 * 
 * CONCEPTO CLAVE: MAPAS - ITERACIÓN CON ENTRYSET()
 * - entrySet(): Devuelve conjunto de entradas (pares llave-valor)
 * - Permite iterar sobre llave y valor simultáneamente
 * - Sintaxis: for (Map.Entry<K, V> entry : mapa.entrySet())
 * - entry.getKey() obtiene la llave, entry.getValue() obtiene el valor
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear mapa de tarjetas
 * 2. Pedir datos al usuario con validación
 * 3. Validar número de tarjeta
 * 4. Determinar entidad (Visa/Master)
 * 5. Agregar al mapa si es válido
 * 6. Imprimir usando entrySet()
 */

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Clase7 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Pide datos de tarjeta con validación
     * - Almacena en mapa
     * - Imprime usando entrySet()
     */
    public static void main(String[] args) {
        // Crear Scanner para entrada de datos
        Scanner teclado = new Scanner(System.in);
        
        // Crear mapa de tarjetas
        // Llave: nombre del titular (String)
        // Valor: objeto Tarjeta
        Map<String, Tarjeta> tarjetas = new HashMap<>();
        
        String numero = "";
        String titular;
        
        // Ciclo para pedir tarjeta válida
        while (!esValida(numero)) {
            System.out.print("Ingrese el nombre del titular como figura en la tarjeta: ");
            titular = teclado.nextLine();
            
            System.out.print("Ingrese los 16 numeros de la tarjeta: ");
            numero = teclado.nextLine();
            
            if (esValida(numero)) {
                // Si es válida, determinar entidad y agregar al mapa
                String entidad = determinarEntidad(numero);
                tarjetas.put(titular, new Tarjeta(entidad, numero));
                System.out.println("Tarjeta registrada correctamente.\n");
            } else {
                System.out.println("El numero ingresado es incorrecto. Intente nuevamente.\n");
            }
        }
        
        // Imprimir tarjetas almacenadas usando entrySet()
        System.out.println("=== TARJETAS REGISTRADAS ===");
        for (Map.Entry<String, Tarjeta> entry : tarjetas.entrySet()) {
            String titular = entry.getKey();
            Tarjeta tc = entry.getValue();
            System.out.println(titular + ": " + tc.getNumero() + " (" + tc.getEntidad() + ")");
        }
    }
    
    /**
     * MÉTODO ES VALIDA - Valida si el número de tarjeta es válido
     * 
     * REGLAS:
     * - Debe tener exactamente 16 dígitos
     * - El primer dígito debe ser 4 o 5
     * - El número debe estar entre 4000000000000000 y 6000000000000000
     * 
     * @param numero Número de tarjeta a validar
     * @return boolean true si el número es válido
     */
    public static boolean esValida(String numero) {
        // Verificar que tenga exactamente 16 dígitos
        if (numero.length() != 16) {
            return false;
        }
        
        try {
            // Obtener el primer dígito
            int primerDigito = Integer.parseInt(numero.substring(0, 1));
            
            // Verificar que el primer dígito sea 4 o 5
            if (primerDigito == 4 || primerDigito == 5) {
                return true;
            }
        } catch (NumberFormatException e) {
            // Si no es un número válido
            return false;
        }
        
        return false;
    }
    
    /**
     * MÉTODO DETERMINAR ENTIDAD - Determina la entidad emisora según el primer dígito
     * 
     * @param numero Número de la tarjeta
     * @return String "Visa" si empieza con 4, "MasterCard" si empieza con 5
     */
    public static String determinarEntidad(String numero) {
        int primerDigito = Integer.parseInt(numero.substring(0, 1));
        if (primerDigito == 4) {
            return "Visa";
        } else if (primerDigito == 5) {
            return "MasterCard";
        }
        return "Desconocida";
    }
    
    /*
     * OBSERVACIONES IMPORTANTES:
     * 
     * 1. ENTRYSET():
     *    - Devuelve Set<Map.Entry<K, V>> con todos los pares llave-valor
     *    - Cada entry tiene getKey() y getValue()
     *    - Permite iterar sobre ambos simultáneamente
     * 
     * 2. ITERACIÓN CON ENTRYSET:
     *    - for (Map.Entry<String, Tarjeta> entry : tarjetas.entrySet())
     *    - entry.getKey() obtiene la llave (titular)
     *    - entry.getValue() obtiene el valor (Tarjeta)
     * 
     * 3. VENTAJAS DE ENTRYSET:
     *    - Más eficiente que keySet() + get()
     *    - Acceso directo a llave y valor
     *    - Útil cuando necesitas ambos
     * 
     * 4. VALIDACIÓN:
     *    - Verifica longitud del número
     *    - Verifica primer dígito (4 o 5)
     *    - Maneja excepciones de conversión
     * 
     * 5. DETERMINACIÓN DE ENTIDAD:
     *    - Basada en el primer dígito
     *    - 4 = Visa, 5 = MasterCard
     *    - Simplificado para el ejercicio
     */
}


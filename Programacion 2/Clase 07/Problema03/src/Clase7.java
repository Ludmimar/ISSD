/*
 * PROBLEMA 03 - MAPAS - APELLIDOS Y CALIFICACIONES CON ELIMINACIÓN
 * 
 * ENUNCIADO:
 * Crear un mapa con llaves String y valores enteros. Solicitaremos al usuario que cargue 
 * apellidos (llave) y calificaciones (valor) hasta que se ingrese el string "finalizar" 
 * como apellido. Si el apellido que se quiere cargar ya existe en el mapa, esta entrada 
 * debe ser eliminada. Al finalizar la carga del mapa, imprimir la lista de alumnos y sus 
 * calificaciones en orden alfabético.
 * 
 * CONCEPTO CLAVE: MAPAS - ELIMINACIÓN Y ORDEN ALFABÉTICO
 * - remove(K): Elimina entrada si la llave existe
 * - TreeMap: Mantiene orden alfabético de llaves
 * - Verificación con containsKey() antes de agregar
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear TreeMap para orden alfabético
 * 2. Ciclo hasta ingresar "finalizar"
 * 3. Si apellido existe, eliminar; si no, agregar
 * 4. Imprimir en orden alfabético
 */

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Scanner;

public class Clase7 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Carga apellidos y calificaciones
     * - Elimina si existe, agrega si no existe
     * - Imprime en orden alfabético
     */
    public static void main(String[] args) {
        // Crear Scanner para entrada de datos
        Scanner teclado = new Scanner(System.in);
        
        // Crear TreeMap para mantener orden alfabético
        // Llave: apellido (String)
        // Valor: calificación (Integer)
        SortedMap<String, Integer> calificaciones = new TreeMap<>();
        
        String apellido;
        
        System.out.println("=== CARGA DE CALIFICACIONES ===");
        System.out.println("(Ingrese 'finalizar' para terminar)\n");
        
        // Ciclo hasta ingresar "finalizar"
        do {
            System.out.print("Ingrese el apellido: ");
            apellido = teclado.nextLine();
            
            // Verificar si se debe finalizar
            if (apellido.equalsIgnoreCase("finalizar")) {
                break;
            }
            
            // Verificar si el apellido ya existe
            if (calificaciones.containsKey(apellido)) {
                // Si existe, eliminar la entrada
                calificaciones.remove(apellido);
                System.out.println("Apellido '" + apellido + "' eliminado del mapa.\n");
            } else {
                // Si no existe, pedir calificación y agregar
                System.out.print("Ingrese la calificacion: ");
                int calificacion = teclado.nextInt();
                teclado.nextLine(); // Consumir salto de línea
                
                calificaciones.put(apellido, calificacion);
                System.out.println("Apellido '" + apellido + "' agregado al mapa.\n");
            }
        } while (true);
        
        // Imprimir lista de alumnos y calificaciones en orden alfabético
        System.out.println("\n=== CALIFICACIONES (Orden Alfabético) ===");
        for (String apellidoAlumno : calificaciones.keySet()) {
            System.out.println(apellidoAlumno + ": " + calificaciones.get(apellidoAlumno));
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. TREEMAP PARA ORDEN:
         *    - TreeMap mantiene orden alfabético automáticamente
         *    - No importa el orden de inserción
         *    - Siempre se imprime alfabéticamente
         * 
         * 2. ELIMINACIÓN CONDICIONAL:
         *    - Si apellido existe: remove()
         *    - Si no existe: put()
         *    - Lógica inversa al comportamiento normal
         * 
         * 3. EQUALSIGNORECASE:
         *    - Compara ignorando mayúsculas/minúsculas
         *    - "Finalizar", "FINALIZAR", "finalizar" todos funcionan
         * 
         * 4. DO-WHILE:
         *    - Se ejecuta al menos una vez
         *    - Evalúa condición al final
         *    - Útil para este tipo de entrada
         */
    }
}


/*
 * PROBLEMA 01 - SETS - INTERESES ÚNICOS DE USUARIOS
 * 
 * ENUNCIADO:
 * Se dispone de una lista de objetos que representan usuarios de un sitio web. 
 * En cada objeto Usuario hay un array de Strings representando la lista de intereses 
 * de cada uno. Desarrollar un programa que, dada la lista de usuarios 
 * (por ejemplo, ArrayList<Usuario>), imprima una lista de intereses, sin repeticiones, 
 * de todos los usuarios que visitan el sitio web.
 * 
 * CONCEPTO CLAVE: SETS - ELIMINAR DUPLICADOS
 * - Agregar todos los intereses de todos los usuarios a un Set
 * - El Set automáticamente elimina duplicados
 * - Resultado: lista única de intereses
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear lista de usuarios con sus intereses
 * 2. Crear Set para almacenar intereses únicos
 * 3. Iterar sobre usuarios e intereses
 * 4. Agregar todos los intereses al Set
 * 5. Imprimir intereses únicos
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Clase8 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Crea lista de usuarios con intereses
     * - Obtiene intereses únicos usando Set
     * - Imprime lista sin duplicados
     */
    public static void main(String[] args) {
        // Crear lista de usuarios
        List<Usuario> usuarios = new ArrayList<>();
        
        // Crear usuarios con sus intereses
        usuarios.add(new Usuario(new String[]{"Programación", "Música", "Deportes"}));
        usuarios.add(new Usuario(new String[]{"Música", "Cine", "Viajes"}));
        usuarios.add(new Usuario(new String[]{"Deportes", "Programación", "Libros", "Música"}));
        usuarios.add(new Usuario(new String[]{"Cine", "Gastronomía", "Viajes"}));
        
        // Crear Set para almacenar intereses únicos
        // El Set automáticamente eliminará duplicados
        Set<String> interesesUnicos = new HashSet<>();
        
        // Iterar sobre cada usuario
        for (Usuario usuario : usuarios) {
            // Obtener intereses del usuario actual
            String[] intereses = usuario.getIntereses();
            
            // Agregar cada interés al Set
            // Si un interés ya existe, no se agregará (duplicado)
            for (String interes : intereses) {
                interesesUnicos.add(interes);
            }
        }
        
        // Imprimir lista de intereses únicos
        System.out.println("=== INTERESES ÚNICOS DE TODOS LOS USUARIOS ===\n");
        System.out.println("Total de intereses únicos: " + interesesUnicos.size());
        System.out.println("\nLista de intereses (sin repeticiones):");
        
        for (String interes : interesesUnicos) {
            System.out.println("- " + interes);
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. ELIMINACIÓN AUTOMÁTICA DE DUPLICADOS:
         *    - El Set elimina duplicados automáticamente
         *    - No necesitas verificar manualmente si ya existe
         *    - Más eficiente que usar List y verificar contains()
         * 
         * 2. ITERACIÓN ANIDADA:
         *    - Ciclo externo: itera sobre usuarios
         *    - Ciclo interno: itera sobre intereses de cada usuario
         *    - Cada interés se agrega al Set
         * 
         * 3. RESULTADO:
         *    - Todos los intereses de todos los usuarios
         *    - Sin repeticiones
         *    - En este ejemplo: Programación, Música, Deportes, Cine, Viajes, Libros, Gastronomía
         */
    }
}


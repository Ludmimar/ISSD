/*
 * PROBLEMA 02 - SETS - INTERESES ÚNICOS EN ORDEN ALFABÉTICO
 * 
 * ENUNCIADO:
 * Mejorar el programa del problema 1 para que la lista de intereses se imprima 
 * en orden alfabético.
 * 
 * CONCEPTO CLAVE: SETS - TREESET
 * - TreeSet mantiene orden natural de los elementos
 * - Para Strings: orden alfabético ascendente
 * - Solo cambiar HashSet por TreeSet
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear TreeSet en lugar de HashSet
 * 2. Agregar intereses (igual que problema anterior)
 * 3. Imprimir en orden alfabético automático
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Clase8 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Crea lista de usuarios con intereses
     * - Usa TreeSet para orden alfabético
     * - Imprime intereses únicos ordenados
     */
    public static void main(String[] args) {
        // Crear lista de usuarios
        List<Usuario> usuarios = new ArrayList<>();
        
        // Crear usuarios con sus intereses
        usuarios.add(new Usuario(new String[]{"Programación", "Música", "Deportes"}));
        usuarios.add(new Usuario(new String[]{"Música", "Cine", "Viajes"}));
        usuarios.add(new Usuario(new String[]{"Deportes", "Programación", "Libros", "Música"}));
        usuarios.add(new Usuario(new String[]{"Cine", "Gastronomía", "Viajes"}));
        
        // Crear TreeSet para almacenar intereses únicos EN ORDEN ALFABÉTICO
        // TreeSet mantiene orden natural (alfabético para Strings)
        Set<String> interesesUnicos = new TreeSet<>();
        
        // Iterar sobre cada usuario
        for (Usuario usuario : usuarios) {
            // Obtener intereses del usuario actual
            String[] intereses = usuario.getIntereses();
            
            // Agregar cada interés al TreeSet
            // Se ordenarán automáticamente en orden alfabético
            for (String interes : intereses) {
                interesesUnicos.add(interes);
            }
        }
        
        // Imprimir lista de intereses únicos en orden alfabético
        System.out.println("=== INTERESES ÚNICOS (ORDEN ALFABÉTICO) ===\n");
        System.out.println("Total de intereses únicos: " + interesesUnicos.size());
        System.out.println("\nLista de intereses (sin repeticiones, orden alfabético):");
        
        // Los elementos ya están ordenados automáticamente
        for (String interes : interesesUnicos) {
            System.out.println("- " + interes);
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. TREESET:
         *    - Mantiene orden natural de los elementos
         *    - Para Strings: orden alfabético ascendente (a-z)
         *    - Más lento que HashSet para operaciones básicas
         *    - Útil cuando necesitas orden
         * 
         * 2. ORDEN AUTOMÁTICO:
         *    - No importa el orden en que agregues elementos
         *    - Siempre se mantienen ordenados
         *    - No necesitas ordenar manualmente después
         * 
         * 3. DIFERENCIA CON HASHSET:
         *    - HashSet: sin orden, más rápido
         *    - TreeSet: ordenado, ligeramente más lento
         *    - Elegir según necesidad
         * 
         * 4. RESULTADO ESPERADO:
         *    - Cine
         *    - Deportes
         *    - Gastronomía
         *    - Libros
         *    - Música
         *    - Programación
         *    - Viajes
         */
    }
}


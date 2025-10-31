/*
 * PROBLEMA 01 - COLECCIONES - PLANETAS DEL SISTEMA SOLAR
 * 
 * ENUNCIADO:
 * Crear una lista de Strings llamada sistemaSolar y cargar uno por uno y en orden 
 * el nombre de los planetas del sistema solar. Imprimir el tamaño de la lista 
 * y todos los elementos y su índice.
 * 
 * CONCEPTO CLAVE: COLECCIONES - LISTA ORDENADA Y ACCESO POR ÍNDICE
 * - Las listas mantienen el orden de inserción
 * - Se puede acceder a elementos por índice y mostrar ambos
 * - Útil para listas que tienen orden significativo
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear lista sistemaSolar
 * 2. Agregar planetas en orden
 * 3. Imprimir tamaño
 * 4. Imprimir cada planeta con su índice
 */

import java.util.List;
import java.util.ArrayList;

public class Clase6 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Crea lista con planetas del sistema solar
     * - Muestra tamaño y elementos con sus índices
     */
    public static void main(String[] args) {
        // Crear lista de planetas del sistema solar
        List<String> sistemaSolar = new ArrayList<>();
        
        // Agregar planetas en orden (desde el más cercano al Sol)
        sistemaSolar.add("Mercurio");
        sistemaSolar.add("Venus");
        sistemaSolar.add("Tierra");
        sistemaSolar.add("Marte");
        sistemaSolar.add("Jupiter");
        sistemaSolar.add("Saturno");
        sistemaSolar.add("Urano");
        sistemaSolar.add("Neptuno");
        
        // Imprimir el tamaño de la lista
        System.out.println("Cantidad de planetas: " + sistemaSolar.size());
        System.out.println();
        
        // Imprimir todos los elementos con su índice
        for (int i = 0; i < sistemaSolar.size(); i++) {
            System.out.println("Indice " + i + ": " + sistemaSolar.get(i));
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. ORDEN DE INSERCIÓN:
         *    - Las listas mantienen el orden en que se insertan los elementos
         *    - El primer elemento agregado queda en índice 0
         *    - Cada nuevo elemento se agrega al final
         * 
         * 2. ACCESO POR ÍNDICE:
         *    - Cada elemento tiene un índice único
         *    - Los índices van de 0 a size() - 1
         *    - Permite acceder a elementos por posición
         * 
         * 3. IMPRESIÓN CON ÍNDICE:
         *    - Útil para mostrar la posición de cada elemento
         *    - Ayuda a entender cómo están almacenados
         *    - Facilita la depuración y visualización
         */
    }
}


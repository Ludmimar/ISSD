/*
 * EJERCICIO 13 - COLECCIONES - LISTAS DE LISTAS
 * 
 * DESAFÍO FINAL:
 * Construir una Lista de Listas de elementos String, donde podamos almacenar la siguiente tabla:
 * 
 * Argentina    Brasil      Paraguay    Peru
 * Guatemala    Cuba        Nicaragua   Puerto Rico
 * Estados Unidos Canada    Mexico
 * Alemania     Francia     Italia      Portugal
 * 
 * De modo que la Lista índice 0 contenga los nombres de los países de Latinoamérica, 
 * la lista de índice uno contenga los países de Centroamérica, etc.
 * 
 * Por ejemplo, si ejecuto la operación:
 * System.out.println(listaDePaises.get(0).get(0));
 * se debería leer el nombre Argentina en la consola.
 * 
 * Imprimir todos los países contenidos en esta estructura de datos, utilizando iteradores.
 * 
 * CONCEPTO CLAVE: COLECCIONES - ESTRUCTURAS MULTIDIMENSIONALES
 * - Las listas pueden contener otras listas
 * - Sintaxis: List<List<String>> para lista de listas de String
 * - Acceso con dos índices: lista.get(i).get(j)
 * - Útil para representar tablas o matrices dinámicas
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear lista de listas
 * 2. Crear cada sub-lista de países por región
 * 3. Agregar sub-listas a la lista principal
 * 4. Iterar sobre todas las listas y elementos
 */

import java.util.List;
import java.util.ArrayList;

public class Clase6 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Crea estructura de lista de listas
     * - Almacena países por región
     * - Imprime todos los países
     */
    public static void main(String[] args) {
        // Crear lista de listas de String
        // Cada elemento de la lista principal es una lista de países
        List<List<String>> listaDePaises = new ArrayList<>();
        
        // === CREAR LISTA DE PAÍSES DE LATINOAMÉRICA (índice 0) ===
        List<String> latinoamerica = new ArrayList<>();
        latinoamerica.add("Argentina");
        latinoamerica.add("Brasil");
        latinoamerica.add("Paraguay");
        latinoamerica.add("Peru");
        listaDePaises.add(latinoamerica);
        
        // === CREAR LISTA DE PAÍSES DE CENTROAMÉRICA (índice 1) ===
        List<String> centroamerica = new ArrayList<>();
        centroamerica.add("Guatemala");
        centroamerica.add("Cuba");
        centroamerica.add("Nicaragua");
        centroamerica.add("Puerto Rico");
        listaDePaises.add(centroamerica);
        
        // === CREAR LISTA DE PAÍSES DE AMÉRICA DEL NORTE (índice 2) ===
        List<String> norteamerica = new ArrayList<>();
        norteamerica.add("Estados Unidos");
        norteamerica.add("Canada");
        norteamerica.add("Mexico");
        listaDePaises.add(norteamerica);
        
        // === CREAR LISTA DE PAÍSES DE EUROPA (índice 3) ===
        List<String> europa = new ArrayList<>();
        europa.add("Alemania");
        europa.add("Francia");
        europa.add("Italia");
        europa.add("Portugal");
        listaDePaises.add(europa);
        
        // === DEMOSTRACIÓN DE ACCESO ===
        // Acceder al primer país de la primera lista
        System.out.println("=== DEMOSTRACION DE ACCESO ===");
        System.out.println("listaDePaises.get(0).get(0) = " + listaDePaises.get(0).get(0));
        System.out.println();
        
        // === IMPRIMIR TODOS LOS PAÍSES ===
        System.out.println("=== TODOS LOS PAISES POR REGION ===");
        
        // Iterar sobre cada lista de países (región)
        for (int i = 0; i < listaDePaises.size(); i++) {
            List<String> region = listaDePaises.get(i);
            
            System.out.print("Region " + i + ": ");
            
            // Iterar sobre cada país en la región
            for (int j = 0; j < region.size(); j++) {
                System.out.print(region.get(j));
                if (j < region.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        
        // === IMPRIMIR PAÍS POR PAÍS CON ÍNDICES ===
        System.out.println("\n=== PAISES CON SUS INDICES ===");
        for (int i = 0; i < listaDePaises.size(); i++) {
            List<String> region = listaDePaises.get(i);
            for (int j = 0; j < region.size(); j++) {
                System.out.println("Region[" + i + "][" + j + "] = " + region.get(j));
            }
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. DECLARACIÓN DE LISTA DE LISTAS:
         *    - List<List<String>> declara una lista que contiene listas de String
         *    - Cada elemento de la lista principal es una List<String>
         *    - Permite estructuras bidimensionales dinámicas
         * 
         * 2. ACCESO A ELEMENTOS:
         *    - listaDePaises.get(i): obtiene la lista en índice i
         *    - listaDePaises.get(i).get(j): obtiene el String en posición j de la lista i
         *    - Requiere dos índices: uno para la lista principal, otro para la sub-lista
         * 
         * 3. VENTAJAS SOBRE ARRAYS MULTIDIMENSIONALES:
         *    - Tamaño variable por fila (regiones pueden tener diferente cantidad de países)
         *    - Fácil agregar/eliminar elementos
         *    - Métodos útiles de Collections disponibles
         * 
         * 4. ITERACIÓN ANIDADA:
         *    - Ciclo externo: itera sobre las regiones (listas principales)
         *    - Ciclo interno: itera sobre países en cada región
         *    - Permite acceder a cada elemento con sus índices
         * 
         * 5. ESTRUCTURA DINÁMICA:
         *    - Cada sub-lista puede tener diferente tamaño
         *    - Se pueden agregar/eliminar países de cualquier región
         *    - Más flexible que arrays bidimensionales
         */
    }
}


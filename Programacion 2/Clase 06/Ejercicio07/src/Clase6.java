/*
 * EJERCICIO 07 - COLECCIONES - LISTAS COMO PARÁMETROS
 * 
 * ENUNCIADO:
 * Crear una lista con tres marcas de autos (String) y un método llamado imprimirLista 
 * que tome de parámetro la lista, no tenga valor de retorno e imprima los elementos 
 * de la lista uno por uno. Llamar a este método desde el main.
 * 
 * CONCEPTO CLAVE: COLECCIONES - LISTAS COMO ARGUMENTOS
 * - Las listas pueden pasarse como parámetros a métodos
 * - Las listas funcionan con referencias (no se copian)
 * - Sintaxis: public static void metodo(List<Tipo> lista)
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear lista con marcas de autos
 * 2. Definir método que recibe lista como parámetro
 * 3. Imprimir elementos dentro del método
 * 4. Llamar al método desde main
 */

import java.util.List;
import java.util.ArrayList;

public class Clase6 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Crea lista con marcas de autos
     * - Llama al método imprimirLista
     */
    public static void main(String[] args) {
        // Crear lista de marcas de autos
        List<String> marcas = new ArrayList<>();
        
        // Agregar tres marcas
        marcas.add("Toyota");
        marcas.add("Ford");
        marcas.add("Chevrolet");
        
        // Llamar al método que imprime la lista
        imprimirLista(marcas);
    }
    
    /**
     * MÉTODO IMPRIMIR LISTA - Imprime los elementos de una lista
     * 
     * FUNCIONALIDAD:
     * - Recibe una lista de String como parámetro
     * - Itera sobre la lista
     * - Imprime cada elemento
     * 
     * @param marcas Lista de marcas de autos a imprimir
     */
    public static void imprimirLista(List<String> marcas) {
        // Iterar sobre la lista utilizando for tradicional
        for (int i = 0; i < marcas.size(); i++) {
            System.out.println(marcas.get(i));
        }
    }
    
    /*
     * OBSERVACIONES IMPORTANTES:
     * 
     * 1. LISTAS COMO PARÁMETROS:
     *    - Sintaxis: List<TipoObjeto> nombreParametro
     *    - La lista se pasa por referencia, no por valor
     *    - Los cambios en el método afectan a la lista original
     * 
     * 2. MÉTODO ESTÁTICO:
     *    - Puede llamarse desde main sin crear objeto
     *    - Recibe y procesa la lista pasada como parámetro
     * 
     * 3. REFERENCIAS:
     *    - 'marcas' en main y 'marcas' en imprimirLista apuntan a la misma lista
     *    - No se crea una copia de la lista
     *    - Esto es eficiente en memoria
     * 
     * 4. REUTILIZACIÓN:
     *    - El método puede usarse con cualquier lista de String
     *    - Es genérico y reutilizable
     */
}


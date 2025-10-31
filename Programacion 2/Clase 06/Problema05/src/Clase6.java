/*
 * PROBLEMA 05 - COLECCIONES - CARTA ALEATORIA
 * 
 * ENUNCIADO:
 * Programar un método que tome de parámetro una Lista de Cartas, y retorne una carta aleatoria. 
 * Llamar a este método desde el main e imprimir el numero y palo del valor de retorno.
 * 
 * CONCEPTO CLAVE: COLECCIONES - SELECCIÓN ALEATORIA
 * - Random permite generar números aleatorios
 * - Acceder a elementos aleatorios por índice
 * - Retornar objeto seleccionado aleatoriamente
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear mazo de cartas (usar método del problema anterior o crear uno simple)
 * 2. Llamar método que retorna carta aleatoria
 * 3. Imprimir carta seleccionada
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Clase6 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Crea mazo de cartas
     * - Obtiene carta aleatoria
     * - Imprime carta seleccionada
     */
    public static void main(String[] args) {
        // Crear un mazo simple de ejemplo
        List<Carta> mazo = new ArrayList<>();
        mazo.add(new Carta("As", "corazon"));
        mazo.add(new Carta("Rey", "pica"));
        mazo.add(new Carta("Reina", "diamante"));
        mazo.add(new Carta("Jota", "trebol"));
        mazo.add(new Carta("10", "corazon"));
        
        // Obtener una carta aleatoria del mazo
        Carta cartaAleatoria = obtenerCartaAleatoria(mazo);
        
        // Imprimir la carta seleccionada
        System.out.println("Carta aleatoria seleccionada:");
        System.out.println(cartaAleatoria.getNumero() + " de " + cartaAleatoria.getPalo());
    }
    
    /**
     * MÉTODO OBTENER CARTA ALEATORIA - Selecciona una carta aleatoria del mazo
     * 
     * FUNCIONALIDAD:
     * - Genera índice aleatorio dentro del rango de la lista
     * - Obtiene la carta en ese índice
     * - Retorna la carta seleccionada
     * 
     * @param mazo Lista de cartas de la cual seleccionar
     * @return Carta Carta seleccionada aleatoriamente
     */
    public static Carta obtenerCartaAleatoria(List<Carta> mazo) {
        // Crear objeto Random para generar números aleatorios
        Random random = new Random();
        
        // Generar índice aleatorio entre 0 y tamaño del mazo - 1
        int indiceAleatorio = random.nextInt(mazo.size());
        
        // Retornar la carta en el índice aleatorio
        return mazo.get(indiceAleatorio);
    }
    
    /*
     * OBSERVACIONES IMPORTANTES:
     * 
     * 1. CLASE RANDOM:
     *    - Permite generar números aleatorios
     *    - nextInt(n) genera número entre 0 y n-1
     *    - Útil para selecciones aleatorias
     * 
     * 2. ÍNDICE ALEATORIO:
     *    - Debe estar entre 0 y mazo.size() - 1
     *    - random.nextInt(mazo.size()) genera exactamente ese rango
     *    - Garantiza acceso válido a la lista
     * 
     * 3. RETORNO DE OBJETO:
     *    - El método retorna un objeto Carta
     *    - Se puede usar directamente o almacenar en variable
     *    - Permite encadenar llamadas si es necesario
     * 
     * 4. VALIDACIÓN:
     *    - Asume que el mazo no está vacío
     *    - En producción, sería bueno validar tamaño > 0
     */
}


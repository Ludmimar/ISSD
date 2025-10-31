/*
 * PROBLEMA 06 - COLECCIONES - TRES CARTAS ALEATORIAS SIN REPETIR
 * 
 * ENUNCIADO:
 * Diseñar un método que tome de parámetro una Lista de Cartas (mazo completo) y retorne 
 * otra Lista, de solo tres cartas esta vez, elegidas al azar del mazo. Llamar a este 
 * método desde el programa principal e imprimir los valores de la Lista de retorno 
 * (las tres cartas elegidas al azar). Asegurarse de que en las tres cartas elegidas 
 * al azar, no existan repetidas.
 * 
 * CONCEPTO CLAVE: COLECCIONES - SELECCIÓN SIN REPETICIÓN
 * - Seleccionar elementos aleatorios sin repetir
 * - Verificar que el elemento no esté ya en la lista resultado
 * - Remover de lista temporal o verificar con contains()
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear mazo completo
 * 2. Llamar método que retorna 3 cartas aleatorias sin repetir
 * 3. Imprimir las 3 cartas seleccionadas
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Clase6 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Crea mazo completo de cartas
     * - Obtiene 3 cartas aleatorias sin repetir
     * - Imprime las cartas seleccionadas
     */
    public static void main(String[] args) {
        // Crear mazo completo de ejemplo (baraja española simplificada)
        List<Carta> mazo = new ArrayList<>();
        
        // Agregar algunas cartas de ejemplo
        String[] numeros = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        String[] palos = {"oro", "copa", "espada", "basto"};
        
        for (String numero : numeros) {
            for (String palo : palos) {
                mazo.add(new Carta(numero, palo));
            }
        }
        
        System.out.println("Mazo completo: " + mazo.size() + " cartas\n");
        
        // Obtener 3 cartas aleatorias sin repetir
        List<Carta> tresCartas = obtenerTresCartasAleatorias(mazo);
        
        // Imprimir las tres cartas seleccionadas
        System.out.println("=== TRES CARTAS ALEATORIAS SIN REPETIR ===");
        for (int i = 0; i < tresCartas.size(); i++) {
            Carta carta = tresCartas.get(i);
            System.out.println("Carta " + (i + 1) + ": " + carta.getNumero() + " de " + carta.getPalo());
        }
    }
    
    /**
     * MÉTODO OBTENER TRES CARTAS ALEATORIAS - Selecciona 3 cartas aleatorias sin repetir
     * 
     * FUNCIONALIDAD:
     * - Crea lista vacía para las 3 cartas
     * - Crea copia del mazo para no modificar el original
     * - Selecciona 3 cartas aleatorias
     * - Verifica que no estén repetidas usando contains()
     * - Retorna lista con las 3 cartas
     * 
     * @param mazo Lista completa de cartas
     * @return List<Carta> Lista con 3 cartas aleatorias sin repetir
     */
    public static List<Carta> obtenerTresCartasAleatorias(List<Carta> mazo) {
        // Crear lista para almacenar las 3 cartas seleccionadas
        List<Carta> cartasSeleccionadas = new ArrayList<>();
        
        // Crear copia del mazo para no modificar el original
        List<Carta> mazoTemporal = new ArrayList<>(mazo);
        
        // Crear objeto Random para generar índices aleatorios
        Random random = new Random();
        
        // Seleccionar 3 cartas aleatorias
        while (cartasSeleccionadas.size() < 3 && mazoTemporal.size() > 0) {
            // Generar índice aleatorio dentro del rango del mazo temporal
            int indiceAleatorio = random.nextInt(mazoTemporal.size());
            
            // Obtener la carta en el índice aleatorio
            Carta cartaSeleccionada = mazoTemporal.get(indiceAleatorio);
            
            // Verificar que la carta no esté ya en la lista de seleccionadas
            if (!cartasSeleccionadas.contains(cartaSeleccionada)) {
                cartasSeleccionadas.add(cartaSeleccionada);
            }
            
            // Remover la carta del mazo temporal para evitar repetición
            mazoTemporal.remove(indiceAleatorio);
        }
        
        return cartasSeleccionadas;
    }
    
    /*
     * OBSERVACIONES IMPORTANTES:
     * 
     * 1. COPIA DEL MAZO:
     *    - Se crea copia para no modificar el mazo original
     *    - Permite reutilizar el mazo original después
     *    - new ArrayList<>(mazo) crea copia superficial
     * 
     * 2. VERIFICACIÓN DE REPETICIÓN:
     *    - contains() verifica si la carta ya está en la lista
     *    - Requiere que la clase Carta implemente equals()
     *    - Garantiza que no haya duplicados
     * 
     * 3. REMOCIÓN DEL MAZO TEMPORAL:
     *    - Se remueve la carta seleccionada del mazo temporal
     *    - Garantiza que no se pueda seleccionar dos veces
     *    - Simplifica la lógica de verificación
     * 
     * 4. CONDICIÓN DE PARADA:
     *    - El ciclo continúa hasta tener 3 cartas o agotar el mazo
     *    - Protege contra mazos con menos de 3 cartas
     * 
     * 5. ALTERNATIVA CON SHUFFLE:
     *    - También se podría hacer: Collections.shuffle(mazoTemporal)
     *    - Luego tomar las primeras 3 cartas
     *    - Ambas formas son válidas
     */
}


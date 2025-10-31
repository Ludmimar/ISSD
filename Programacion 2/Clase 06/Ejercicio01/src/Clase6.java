/*
 * EJERCICIO 01 - COLECCIONES - LISTAS DE OBJETOS
 * 
 * ENUNCIADO:
 * Instanciar las siguientes tres cartas: el 7 de espadas, el 6 de espadas y el 1 de basto.
 * Declarar una lista de cartas y añadir las tres cartas a dicha lista utilizando el método add().
 * Obtener e imprimir el número y el palo de las tres cartas utilizando el método .get().
 * 
 * CONCEPTO CLAVE: COLECCIONES - LISTAS
 * - Las colecciones permiten agrupar objetos bajo un mismo nombre
 * - ArrayList permite tamaño variable y métodos útiles
 * - Sintaxis: List<TipoObjeto> nombreLista = new ArrayList<>();
 * - Métodos básicos: .add() para agregar, .get() para obtener
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Importar List y ArrayList
 * 2. Crear lista de Cartas
 * 3. Instanciar tres cartas específicas
 * 4. Agregar cartas a la lista con .add()
 * 5. Obtener e imprimir cada carta con .get()
 */

import java.util.List;
import java.util.ArrayList;

public class Clase6 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Crea una lista de cartas
     * - Instancia tres cartas específicas
     * - Añade las cartas a la lista
     * - Imprime el número y palo de cada carta
     */
    public static void main(String[] args) {
        // Declaración y creación de la lista de cartas
        // Sintaxis: List<TipoObjeto> nombreLista = new ArrayList<>();
        List<Carta> cartas = new ArrayList<>();
        
        // Instanciar la primera carta: 7 de espadas
        Carta carta = new Carta(7, "espada");
        cartas.add(carta); // Agregar la carta a la lista
        
        // Instanciar la segunda carta: 6 de espadas
        carta = new Carta(6, "espada");
        cartas.add(carta); // Agregar la carta a la lista
        
        // Instanciar la tercera carta: 1 de basto
        carta = new Carta(1, "basto");
        cartas.add(carta); // Agregar la carta a la lista
        
        // Imprimir cada carta utilizando .get() con el índice
        // Las cartas se almacenan en los índices 0, 1 y 2
        System.out.println(cartas.get(0).getNumero() + " de " + cartas.get(0).getPalo());
        System.out.println(cartas.get(1).getNumero() + " de " + cartas.get(1).getPalo());
        System.out.println(cartas.get(2).getNumero() + " de " + cartas.get(2).getPalo());
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. DECLARACIÓN DE LISTAS:
         *    - List<Carta> define el tipo de colección (List) y el tipo de objeto (Carta)
         *    - new ArrayList<>() crea una lista vacía de tipo ArrayList
         *    - Los < > vacíos son obligatorios desde Java 1.8 en adelante
         * 
         * 2. MÉTODO .add():
         *    - Agrega un elemento al final de la lista
         *    - El primer elemento agregado va al índice 0
         *    - Cada nuevo elemento se agrega en el siguiente índice disponible
         * 
         * 3. MÉTODO .get():
         *    - Obtiene el elemento en el índice especificado
         *    - Los índices comienzan en 0
         *    - Permite encadenar métodos: cartas.get(0).getNumero()
         * 
         * 4. REUTILIZACIÓN DE VARIABLE:
         *    - La variable 'carta' se reutiliza para cada nueva carta
         *    - Esto es válido porque cada vez que se hace .add(), se almacena la referencia
         * 
         * 5. ALMACENAMIENTO:
         *    - Las listas almacenan referencias a objetos, no los objetos en sí
         *    - Cada objeto se crea con 'new' y se almacena su referencia en la lista
         */
    }
}


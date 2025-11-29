/*
 * EJERCICIO 02 - COMPOSICIÓN - CLASE JUEGO DE DADOS
 * 
 * ENUNCIADO:
 * Plantear un programa que permita jugar a los dados. Las reglas de juego son: 
 * se tiran tres dados si los tres salen con el mismo valor mostrar un mensaje que "gano", sino "perdió".
 * 
 * CONCEPTO CLAVE: COMPOSICIÓN
 * - La clase JuegoDeDados tiene una relación de composición con la clase Dado
 * - El JuegoDeDados "tiene" 3 objetos de la clase Dado
 * - Esta es la clase principal que contiene el método main
 * 
 * ATRIBUTOS:
 * - dado1, dado2, dado3: objetos de la clase Dado
 * 
 * MÉTODOS:
 * - constructor: crea los 3 dados
 * - jugar: ejecuta el juego completo
 * - main: método principal que ejecuta el programa
 */

public class JuegoDeDados {
    // Atributos de tipo Dado - RELACIÓN DE COMPOSICIÓN
    private Dado dado1, dado2, dado3;
    
    /**
     * CONSTRUCTOR - Crea los tres dados del juego
     * 
     * FUNCIONALIDAD:
     * - Instancia 3 objetos de la clase Dado
     * - Cada dado se inicializa automáticamente
     */
    public JuegoDeDados() {
        dado1 = new Dado();
        dado2 = new Dado();
        dado3 = new Dado();        	
    }
    
    /**
     * MÉTODO JUGAR - Ejecuta el juego completo
     * 
     * FUNCIONALIDAD:
     * 1. Tira cada uno de los tres dados
     * 2. Imprime el valor de cada dado
     * 3. Compara los valores de los tres dados
     * 4. Muestra si ganó o perdió según las reglas
     * 
     * REGLAS DEL JUEGO:
     * - Si los tres dados tienen el mismo valor: "Ganó"
     * - Si no tienen el mismo valor: "Perdió"
     * 
     * LÓGICA DE COMPARACIÓN:
     * - Compara dado1 con dado2 Y dado1 con dado3
     * - Si ambas condiciones son verdaderas, todos tienen el mismo valor
     */
    public void jugar() {
        // Tirar cada dado
        dado1.tirar();
        dado1.imprimir();
        dado2.tirar();
        dado2.imprimir();
        dado3.tirar();
        dado3.imprimir();
        
        // Verificar si ganó o perdió
        // Compara si los tres dados tienen el mismo valor
        if (dado1.retornarValor() == dado2.retornarValor() && 
            dado1.retornarValor() == dado3.retornarValor()) {
            System.out.println("Ganó");
        } else {
            System.out.println("Perdió");
        }        	
    }
    
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FLUJO DE EJECUCIÓN:
     * 1. Crea un objeto JuegoDeDados (ejecuta constructor)
     * 2. Llama al método jugar() para ejecutar el juego
     */
    public static void main(String[] ar){
        // Creación del objeto JuegoDeDados
        JuegoDeDados j = new JuegoDeDados();
        
        // Ejecución del juego
        j.jugar();
    }
}




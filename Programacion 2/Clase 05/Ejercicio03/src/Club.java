/*
 * EJERCICIO 03 - COMPOSICIÓN - CLASE CLUB
 * 
 * ENUNCIADO:
 * Plantear una clase Club y otra clase Socio.
 * La clase Socio debe tener los siguientes atributos privados: 
 * nombre y la antigüedad en el club (en años). 
 * En el constructor pedir la carga del nombre y su antigüedad. 
 * La clase Club debe tener como atributos 3 objetos de la clase Socio. 
 * Definir una responsabilidad para imprimir el nombre del socio con mayor antigüedad en el club.
 * 
 * CONCEPTO CLAVE: COMPOSICIÓN
 * - La clase Club tiene una relación de composición con la clase Socio
 * - El Club "tiene" 3 objetos de la clase Socio
 * - Esta es la clase principal que contiene el método main
 * 
 * ATRIBUTOS:
 * - socio1, socio2, socio3: objetos de la clase Socio
 * 
 * MÉTODOS:
 * - constructor: crea los 3 socios solicitando sus datos
 * - socioMayorAntiguedad: encuentra y muestra el socio con mayor antigüedad
 * - imprimirSocios: muestra todos los socios del club
 * - main: método principal que ejecuta el programa
 */

public class Club {
    // Atributos de tipo Socio - RELACIÓN DE COMPOSICIÓN
    private Socio socio1, socio2, socio3;

    /**
     * CONSTRUCTOR - Crea los tres socios del club
     * 
     * FUNCIONALIDAD:
     * - Instancia 3 objetos de la clase Socio
     * - Cada socio solicita sus datos al usuario (nombre y antigüedad)
     * - Los datos se cargan automáticamente en el constructor de Socio
     */
    public Club() {
        System.out.println("=== CARGA DE SOCIOS DEL CLUB ===");
        socio1 = new Socio();
        socio2 = new Socio();
        socio3 = new Socio();
    }

    /**
     * MÉTODO SOCIO MAYOR ANTIGUEDAD - Encuentra el socio con mayor antigüedad
     * 
     * FUNCIONALIDAD:
     * 1. Compara la antigüedad de los tres socios
     * 2. Identifica cuál tiene la mayor antigüedad
     * 3. Muestra el nombre del socio con mayor antigüedad
     * 
     * LÓGICA DE COMPARACIÓN:
     * - Compara socio1 con socio2 y socio3
     * - Si socio1 tiene mayor antigüedad que ambos, es el mayor
     * - Si no, compara socio2 con socio3
     * - El que tenga mayor antigüedad es el ganador
     */
    public void socioMayorAntiguedad() {
        System.out.println("\n=== SOCIO CON MAYOR ANTIGÜEDAD ===");
        
        // Comparar antigüedades para encontrar el mayor
        if (socio1.getAntiguedad() >= socio2.getAntiguedad() && 
            socio1.getAntiguedad() >= socio3.getAntiguedad()) {
            System.out.println("El socio con mayor antigüedad es: " + socio1.getNombre() + 
                             " con " + socio1.getAntiguedad() + " años");
        } else if (socio2.getAntiguedad() >= socio3.getAntiguedad()) {
            System.out.println("El socio con mayor antigüedad es: " + socio2.getNombre() + 
                             " con " + socio2.getAntiguedad() + " años");
        } else {
            System.out.println("El socio con mayor antigüedad es: " + socio3.getNombre() + 
                             " con " + socio3.getAntiguedad() + " años");
        }
    }

    /**
     * MÉTODO IMPRIMIR SOCIOS - Muestra todos los socios del club
     * 
     * FUNCIONALIDAD:
     * - Imprime los datos de los tres socios del club
     * - Utiliza el método imprimir() de cada socio
     */
    public void imprimirSocios() {
        System.out.println("\n=== LISTADO DE SOCIOS ===");
        socio1.imprimir();
        socio2.imprimir();
        socio3.imprimir();
    }

    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FLUJO DE EJECUCIÓN:
     * 1. Crea un objeto Club (ejecuta constructor y carga socios)
     * 2. Llama al método imprimirSocios() para mostrar todos los socios
     * 3. Llama al método socioMayorAntiguedad() para encontrar el socio con mayor antigüedad
     */
    public static void main(String[] ar) {
        // Creación del objeto Club
        Club club1 = new Club();
        
        // Mostrar todos los socios
        club1.imprimirSocios();
        
        // Encontrar y mostrar el socio con mayor antigüedad
        club1.socioMayorAntiguedad();
    }
}

/*
 * EJERCICIO 02 - ATRIBUTO LENGTH Y VALORES ALEATORIOS
 * 
 * ENUNCIADO:
 * Crear una clase con un Array de 100 elementos enteros. Almacenar valores aleatorios 
 * comprendidos entre 1 y 10. Imprimir el Array y mostrar la cantidad de elementos 
 * que tienen almacenado el valor 10.
 * 
 * OBJETIVO:
 * - Introducir el atributo 'length' de los arrays
 * - Trabajar con valores aleatorios usando Math.random()
 * - Implementar conteo de elementos con condición específica
 * - Mostrar ventajas del atributo length para arrays dinámicos
 * 
 * CONCEPTOS CLAVE:
 * - array.length: atributo que almacena el tamaño del array
 * - Math.random(): genera valores aleatorios entre 0.0 y 1.0
 * - Conteo condicional: contar elementos que cumplen una condición
 * - Arrays de tamaño fijo vs uso del atributo length
 */

public class ProblemaArray1 {
    // Declaración del array unidimensional de 100 elementos
    private int[] array;

    /**
     * CONSTRUCTOR - Crea el array de 100 elementos
     * 
     * FUNCIONALIDAD:
     * - Solo crea el array, NO carga valores
     * - Los elementos se inicializan automáticamente en 0
     * - Demuestra que la creación es independiente de la carga
     */
    public ProblemaArray1() {
        // Creación del array de 100 elementos
        // Todos los elementos se inicializan en 0 por defecto
        array = new int[100];
    }

    /**
     * MÉTODO CARGAR VALORES ALEATORIOS
     * 
     * FUNCIONALIDAD:
     * - Genera valores aleatorios entre 1 y 10 para cada elemento
     * - Usa el atributo length para determinar el tamaño del array
     * - Demuestra la ventaja de usar length en lugar de valores fijos
     * 
     * FÓRMULA ALEATORIA:
     * - Math.random() genera valores entre 0.0 y 1.0
     * - (int)(Math.random() * 10) genera valores entre 0 y 9
     * - 1 + (int)(Math.random() * 10) genera valores entre 1 y 10
     */
    public void cargarValoresAleatorios() {
        // Bucle que usa array.length en lugar de valor fijo (100)
        // VENTAJA: Si cambiamos el tamaño del array, no hay que modificar este método
        for (int f = 0; f < array.length; f++) {
            // Genera valor aleatorio entre 1 y 10
            // Math.random() * 10 genera valores entre 0.0 y 10.0
            // (int) convierte a entero (0 a 9)
            // +1 desplaza el rango a 1-10
            array[f] = 1 + (int) (Math.random() * 10);
        }
    }

    /**
     * MÉTODO IMPRIMIR - Muestra todos los elementos del array
     * 
     * FUNCIONALIDAD:
     * - Recorre el array usando array.length
     * - Imprime cada elemento separado por guión
     * - Al final imprime una nueva línea
     * 
     * FORMATO DE SALIDA:
     * - Elementos separados por "-"
     * - Ejemplo: 5-3-8-2-10-...
     */
    public void imprimir() {
        // Bucle que usa array.length para recorrer todos los elementos
        for (int f = 0; f < array.length; f++) {
            // Imprime el elemento seguido de un guión
            System.out.print(array[f] + "-");
        }
        // Nueva línea al final para separar de la siguiente salida
        System.out.println();
    }

    /**
     * MÉTODO CANTIDAD IGUALES 10 - Cuenta elementos con valor 10
     * 
     * FUNCIONALIDAD:
     * - Recorre el array completo
     * - Cuenta cuántos elementos tienen el valor 10
     * - Muestra el resultado por pantalla
     * 
     * ALGORITMO DE CONTEO:
     * 1. Inicializar contador en 0
     * 2. Recorrer todos los elementos
     * 3. Si elemento == 10, incrementar contador
     * 4. Mostrar resultado final
     */
    public void cantidadIguales10() {
        // Variable contador inicializada en 0
        int cant = 0;
        
        // Bucle para recorrer todos los elementos del array
        for (int f = 0; f < array.length; f++) {
            // Condición: si el elemento actual es igual a 10
            if (array[f] == 10) {
                // Incrementar contador
                cant += 1;  // Equivale a: cant = cant + 1; o cant++;
            }
        }
        
        // Mostrar resultado del conteo
        System.out.println("Cantidad de elementos que tienen un 10:" + cant);
    }

    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FLUJO DE EJECUCIÓN:
     * 1. Crear objeto (ejecuta constructor)
     * 2. Cargar valores aleatorios
     * 3. Imprimir array completo
     * 4. Contar elementos con valor 10
     */
    public static void main(String[] args) {
        // Crear objeto: ejecuta constructor
        ProblemaArray1 pa = new ProblemaArray1();
        
        // Cargar valores aleatorios en el array
        pa.cargarValoresAleatorios();
        
        // Mostrar todos los elementos del array
        pa.imprimir();
        
        // Contar y mostrar elementos con valor 10
        pa.cantidadIguales10();
    }
}

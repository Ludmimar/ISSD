/*
 * PROBLEMA 02 - ANÁLISIS DE ALTURAS CON PROMEDIO
 * 
 * ENUNCIADO:
 * Definir un Array de 5 componentes de tipo float que representen las alturas de 5 personas.
 * Implementar los siguientes métodos: 
 * - Obtener el promedio de las alturas.
 * - Contar cuántas personas son más altas que el promedio y cuántas más bajas.
 * 
 * OBJETIVO:
 * - Trabajar con arrays de tipo float
 * - Calcular promedios aritméticos
 * - Implementar comparaciones con el promedio
 * - Contar elementos por categorías (altos/bajos)
 * 
 * CONCEPTOS CLAVE:
 * - Arrays de tipo float para datos decimales
 * - Cálculo de promedio: suma / cantidad
 * - Comparaciones con valor calculado
 * - Conteo condicional múltiple
 * - Separación de responsabilidades en métodos
 */

import java.util.Scanner;

public class AlturasPersonas {
    // Scanner para entrada de datos por teclado
    private Scanner teclado;
    
    // Array de 5 elementos float para almacenar alturas
    // Tipo float permite valores decimales (ej: 1.75, 1.82)
    private float[] alturas;

    /**
     * CONSTRUCTOR - Crea el array de 5 elementos float
     * 
     * FUNCIONALIDAD:
     * - Inicializa el Scanner para entrada de datos
     * - Crea el array de 5 elementos float (inicializados en 0.0)
     * - NO carga datos (eso se hace en método separado)
     * 
     * TIPO FLOAT:
     * - Permite valores decimales
     * - Ideal para alturas (ej: 1.75 metros)
     * - Precisión suficiente para este tipo de datos
     */
    public AlturasPersonas() {
        teclado = new Scanner(System.in);
        
        // Crear array de 5 elementos float
        // Todos los elementos se inicializan automáticamente en 0.0
        alturas = new float[5];
    }

    /**
     * MÉTODO CARGAR - Llena el array con alturas ingresadas por el usuario
     * 
     * FUNCIONALIDAD:
     * - Solicita al usuario que ingrese 5 alturas
     * - Almacena cada altura en la posición correspondiente del array
     * - Muestra mensaje descriptivo para cada persona
     * 
     * INTERFAZ DE USUARIO:
     * - Mensajes claros indicando qué persona se está cargando
     * - Entrada de valores decimales (ej: 1.75)
     * - Numeración desde 1 para mejor comprensión del usuario
     */
    public void cargar() {
        // Bucle para cargar las 5 alturas del array
        for (int f = 0; f < alturas.length; f++) {
            // Solicitar altura para la persona f+1 (numeración desde 1)
            System.out.print("Ingrese altura de la persona " + (f + 1) + ":");
            // Leer y almacenar la altura ingresada (tipo float)
            alturas[f] = teclado.nextFloat();
        }
    }

    /**
     * MÉTODO OBTENER PROMEDIO - Calcula el promedio de las alturas
     * 
     * FUNCIONALIDAD:
     * - Suma todas las alturas del array
     * - Divide la suma entre la cantidad de elementos
     * - Retorna el valor del promedio calculado
     * 
     * ALGORITMO DE PROMEDIO:
     * 1. Inicializar suma en 0.0
     * 2. Recorrer todos los elementos
     * 3. Sumar cada elemento al acumulador
     * 4. Dividir suma entre cantidad de elementos
     * 5. Retornar resultado
     * 
     * @return promedio de las alturas
     */
    public float obtenerPromedio() {
        // Variable acumulador inicializada en 0.0
        float suma = 0;
        
        // Bucle para recorrer todos los elementos del array
        for (int f = 0; f < alturas.length; f++) {
            // Sumar altura actual al acumulador
            suma += alturas[f];
        }
        
        // Calcular y retornar el promedio
        // División entre cantidad de elementos (alturas.length)
        return suma / alturas.length;
    }

    /**
     * MÉTODO CONTAR ALTURAS - Analiza alturas respecto al promedio
     * 
     * FUNCIONALIDAD:
     * - Calcula el promedio de las alturas
     * - Cuenta personas más altas que el promedio
     * - Cuenta personas más bajas que el promedio
     * - Muestra todos los resultados
     * 
     * ANÁLISIS ESTADÍSTICO:
     * - Promedio como punto de referencia
     * - Clasificación en dos categorías: altos y bajos
     * - Conteo independiente para cada categoría
     * 
     * NOTA: No cuenta personas con altura igual al promedio
     */
    public void contarAlturas() {
        // Obtener el promedio de las alturas
        float promedio = obtenerPromedio();
        
        // Contadores para cada categoría
        int masAltas = 0;  // Personas más altas que el promedio
        int masBajas = 0;  // Personas más bajas que el promedio
        
        // Bucle para analizar cada altura respecto al promedio
        for (int f = 0; f < alturas.length; f++) {
            // Si la altura actual es mayor que el promedio
            if (alturas[f] > promedio) {
                masAltas++;  // Incrementar contador de altos
            } 
            // Si la altura actual es menor que el promedio
            else if (alturas[f] < promedio) {
                masBajas++;  // Incrementar contador de bajos
            }
            // Si altura == promedio, no se cuenta en ninguna categoría
        }
        
        // Mostrar resultados del análisis
        System.out.println("Promedio de alturas: " + promedio);
        System.out.println("Personas más altas que el promedio: " + masAltas);
        System.out.println("Personas más bajas que el promedio: " + masBajas);
    }

    /**
     * MÉTODO IMPRIMIR - Muestra todas las alturas ingresadas
     * 
     * FUNCIONALIDAD:
     * - Recorre el array completo
     * - Muestra cada altura con su número de persona
     * - Útil para verificar los datos cargados
     * 
     * PROPÓSITO:
     * - Verificación visual de los datos
     * - Confirmación de que la carga fue correcta
     * - Presentación ordenada de la información
     */
    public void imprimir() {
        System.out.println("Alturas ingresadas:");
        
        // Bucle para mostrar todas las alturas
        for (int f = 0; f < alturas.length; f++) {
            // Imprimir persona y altura correspondiente
            System.out.println("Persona " + (f + 1) + ": " + alturas[f] + " m");
        }
    }

    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FLUJO DE EJECUCIÓN:
     * 1. Crear objeto (ejecuta constructor)
     * 2. Cargar alturas del usuario
     * 3. Mostrar alturas ingresadas
     * 4. Analizar alturas respecto al promedio
     * 
     * ORDEN DE EJECUCIÓN:
     * - Primero cargar datos
     * - Luego mostrar datos para verificación
     * - Finalmente realizar análisis estadístico
     */
    public static void main(String[] args) {
        // Crear objeto: ejecuta constructor
        AlturasPersonas ap = new AlturasPersonas();
        
        // Cargar alturas ingresadas por el usuario
        ap.cargar();
        
        // Mostrar alturas ingresadas para verificación
        ap.imprimir();
        
        // Analizar alturas respecto al promedio y mostrar resultados
        ap.contarAlturas();
    }
}

/*
 * PROBLEMA 01 - HERENCIA - CLASE HIJA AUTO
 * 
 * ENUNCIADO:
 * Se tiene la siguiente jerarquía con sus métodos (mostrar un mensaje en cada método), 
 * crear las clases, métodos y definir al menos 2 objetos de algunas de las clases planteadas.
 * 
 * JERARQUÍA:
 * Vehículo
 * ├── Auto
 * ├── Moto
 * └── Colectivo
 * 
 * CONCEPTO CLAVE: HERENCIA
 * - La clase Auto hereda de la clase Vehículo usando 'extends'
 * - Un Auto "es un" Vehículo (relación de herencia)
 * - Hereda automáticamente todos los atributos y métodos de Vehículo
 * - Añade atributos y métodos específicos de auto
 * - Sobrescribe métodos para comportamiento específico
 * 
 * HERENCIA:
 * - Atributos heredados: marca, modelo, año
 * - Métodos heredados: acelerar(), frenar(), mostrarInfo()
 * - Atributo propio: numeroPuertas
 * - Métodos propios: abrirPuertas(), cerrarPuertas()
 * - Métodos sobrescritos: acelerar(), frenar()
 */

public class Auto extends Vehiculo {
    // Atributo específico de la clase Auto
    private int numeroPuertas;

    /**
     * CONSTRUCTOR - Inicializa los atributos del auto
     * 
     * @param marca Marca del auto
     * @param modelo Modelo del auto
     * @param año Año de fabricación
     * @param numeroPuertas Número de puertas del auto
     */
    public Auto(String marca, String modelo, int año, int numeroPuertas) {
        super(marca, modelo, año); // Llama al constructor de la clase padre
        this.numeroPuertas = numeroPuertas;
    }

    /**
     * MÉTODO ACELERAR - Sobrescribe el método de la clase padre
     * 
     * FUNCIONALIDAD:
     * - Muestra un mensaje específico de aceleración para autos
     * - Sobrescribe el comportamiento genérico de Vehículo
     */
    @Override
    public void acelerar() {
        System.out.println("El auto " + marca + " " + modelo + " está acelerando suavemente");
    }

    /**
     * MÉTODO FRENAR - Sobrescribe el método de la clase padre
     * 
     * FUNCIONALIDAD:
     * - Muestra un mensaje específico de frenado para autos
     * - Sobrescribe el comportamiento genérico de Vehículo
     */
    @Override
    public void frenar() {
        System.out.println("El auto " + marca + " " + modelo + " está frenando con ABS");
    }

    /**
     * MÉTODO ABRIR PUERTAS - Método específico de la clase Auto
     * 
     * FUNCIONALIDAD:
     * - Muestra un mensaje específico para abrir puertas
     * - Utiliza el atributo específico numeroPuertas
     */
    public void abrirPuertas() {
        System.out.println("Abriendo las " + numeroPuertas + " puertas del auto " + marca + " " + modelo);
    }

    /**
     * MÉTODO CERRAR PUERTAS - Método específico de la clase Auto
     * 
     * FUNCIONALIDAD:
     * - Muestra un mensaje específico para cerrar puertas
     * - Utiliza el atributo específico numeroPuertas
     */
    public void cerrarPuertas() {
        System.out.println("Cerrando las " + numeroPuertas + " puertas del auto " + marca + " " + modelo);
    }

    /**
     * MÉTODO MOSTRAR INFO - Sobrescribe el método de la clase padre
     * 
     * FUNCIONALIDAD:
     * - Muestra información específica del auto
     * - Incluye el número de puertas
     * - Sobrescribe el comportamiento genérico de Vehículo
     */
    @Override
    public void mostrarInfo() {
        System.out.println("Auto: " + marca + " " + modelo + " (" + año + ") - " + numeroPuertas + " puertas");
    }
}

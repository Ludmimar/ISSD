/*
 * PROBLEMA 01 - HERENCIA - CLASE PADRE VEHICULO
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
 * - La clase Vehículo es la clase padre (superclase)
 * - Las clases Auto, Moto y Colectivo heredan de Vehículo
 * - Un Auto "es un" Vehículo, una Moto "es un" Vehículo, etc.
 * - Los atributos y métodos comunes se definen en Vehículo
 * 
 * ATRIBUTOS PROTEGIDOS (accesibles por las subclases):
 * - marca: String (marca del vehículo)
 * - modelo: String (modelo del vehículo)
 * - año: int (año de fabricación)
 * 
 * MÉTODOS:
 * - constructor: inicializa los atributos
 * - acelerar: método común para todos los vehículos
 * - frenar: método común para todos los vehículos
 * - mostrarInfo: muestra información del vehículo
 */

public class Vehiculo {
    // Atributos protegidos para que las subclases puedan acceder
    protected String marca;
    protected String modelo;
    protected int año;

    /**
     * CONSTRUCTOR - Inicializa los atributos del vehículo
     * 
     * @param marca Marca del vehículo
     * @param modelo Modelo del vehículo
     * @param año Año de fabricación
     */
    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    /**
     * MÉTODO ACELERAR - Método común para todos los vehículos
     * 
     * FUNCIONALIDAD:
     * - Muestra un mensaje genérico de aceleración
     * - Puede ser sobrescrito por las subclases para comportamiento específico
     */
    public void acelerar() {
        System.out.println("El vehículo " + marca + " " + modelo + " está acelerando");
    }

    /**
     * MÉTODO FRENAR - Método común para todos los vehículos
     * 
     * FUNCIONALIDAD:
     * - Muestra un mensaje genérico de frenado
     * - Puede ser sobrescrito por las subclases para comportamiento específico
     */
    public void frenar() {
        System.out.println("El vehículo " + marca + " " + modelo + " está frenando");
    }

    /**
     * MÉTODO MOSTRAR INFO - Muestra información del vehículo
     * 
     * FUNCIONALIDAD:
     * - Imprime la marca, modelo y año del vehículo
     * - Método común para todos los vehículos
     */
    public void mostrarInfo() {
        System.out.println("Vehículo: " + marca + " " + modelo + " (" + año + ")");
    }
}

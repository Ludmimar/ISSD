/*
 * PROBLEMA 01 - HERENCIA - CLASE HIJA MOTO
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
 * - La clase Moto hereda de la clase Vehículo usando 'extends'
 * - Una Moto "es un" Vehículo (relación de herencia)
 * - Hereda automáticamente todos los atributos y métodos de Vehículo
 * - Añade atributos y métodos específicos de moto
 * - Sobrescribe métodos para comportamiento específico
 * 
 * HERENCIA:
 * - Atributos heredados: marca, modelo, año
 * - Métodos heredados: acelerar(), frenar(), mostrarInfo()
 * - Atributo propio: cilindrada
 * - Métodos propios: hacerWheelie(), usarCasco()
 * - Métodos sobrescritos: acelerar(), frenar()
 */

public class Moto extends Vehiculo {
    // Atributo específico de la clase Moto
    private int cilindrada;

    /**
     * CONSTRUCTOR - Inicializa los atributos de la moto
     * 
     * @param marca Marca de la moto
     * @param modelo Modelo de la moto
     * @param año Año de fabricación
     * @param cilindrada Cilindrada de la moto en cc
     */
    public Moto(String marca, String modelo, int año, int cilindrada) {
        super(marca, modelo, año); // Llama al constructor de la clase padre
        this.cilindrada = cilindrada;
    }

    /**
     * MÉTODO ACELERAR - Sobrescribe el método de la clase padre
     * 
     * FUNCIONALIDAD:
     * - Muestra un mensaje específico de aceleración para motos
     * - Sobrescribe el comportamiento genérico de Vehículo
     */
    @Override
    public void acelerar() {
        System.out.println("La moto " + marca + " " + modelo + " está acelerando rápidamente");
    }

    /**
     * MÉTODO FRENAR - Sobrescribe el método de la clase padre
     * 
     * FUNCIONALIDAD:
     * - Muestra un mensaje específico de frenado para motos
     * - Sobrescribe el comportamiento genérico de Vehículo
     */
    @Override
    public void frenar() {
        System.out.println("La moto " + marca + " " + modelo + " está frenando con frenos delanteros y traseros");
    }

    /**
     * MÉTODO HACER WHEELIE - Método específico de la clase Moto
     * 
     * FUNCIONALIDAD:
     * - Muestra un mensaje específico para hacer wheelie
     * - Utiliza el atributo específico cilindrada
     */
    public void hacerWheelie() {
        System.out.println("La moto " + marca + " " + modelo + " (" + cilindrada + "cc) está haciendo wheelie");
    }

    /**
     * MÉTODO USAR CASCO - Método específico de la clase Moto
     * 
     * FUNCIONALIDAD:
     * - Muestra un mensaje específico para usar casco
     * - Método de seguridad específico de motos
     */
    public void usarCasco() {
        System.out.println("El conductor de la moto " + marca + " " + modelo + " está usando casco");
    }

    /**
     * MÉTODO MOSTRAR INFO - Sobrescribe el método de la clase padre
     * 
     * FUNCIONALIDAD:
     * - Muestra información específica de la moto
     * - Incluye la cilindrada
     * - Sobrescribe el comportamiento genérico de Vehículo
     */
    @Override
    public void mostrarInfo() {
        System.out.println("Moto: " + marca + " " + modelo + " (" + año + ") - " + cilindrada + "cc");
    }
}


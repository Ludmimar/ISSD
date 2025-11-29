/*
 * EJERCICIO 05 - HERENCIA - CLASE HIJA EMPLEADO
 * 
 * ENUNCIADO:
 * Confeccionar una clase Persona que tenga como atributos el nombre y la edad. 
 * Definir como responsabilidades un método que cargue los datos personales y otro que los imprima.
 * Plantear una segunda clase Empleado que herede de la clase Persona. 
 * Añadir un atributo sueldo y los métodos de cargar el sueldo e imprimir su sueldo.
 * Definir un objeto de la clase Persona y llamar a sus métodos. 
 * También crear un objeto de la clase Empleado y llamar a sus métodos.
 * 
 * CONCEPTO CLAVE: HERENCIA
 * - La clase Empleado hereda de la clase Persona usando 'extends'
 * - Un Empleado "es una" Persona (relación de herencia)
 * - Hereda automáticamente todos los atributos y métodos de Persona
 * - Añade atributos y métodos específicos de empleado
 * - Sobrescribe métodos para incluir información adicional
 * 
 * HERENCIA:
 * - Atributos heredados: nombre, edad, teclado
 * - Métodos heredados: cargar(), imprimir()
 * - Atributo propio: sueldo
 * - Métodos sobrescritos: cargar(), imprimir() (usando super)
 */

public class Empleado extends Persona {
    // Atributo específico de la clase Empleado
    protected float sueldo;
    
    /**
     * MÉTODO CARGAR - Sobrescribe el método de la clase padre
     * 
     * FUNCIONALIDAD:
     * - Llama al método cargar() de la clase padre usando super
     * - Solicita y carga el sueldo del empleado
     * - Combina la funcionalidad de Persona con la específica de Empleado
     * 
     * IMPORTANTE:
     * - super.cargar() llama al método cargar() de la clase Persona
     * - Esto evita duplicar código y mantiene la funcionalidad heredada
     */
    public void cargar() {
        super.cargar(); // Llama al método cargar() de Persona
        System.out.print("Ingrese el sueldo: ");
        sueldo = teclado.nextFloat();
    }
    
    /**
     * MÉTODO IMPRIMIR - Sobrescribe el método de la clase padre
     * 
     * FUNCIONALIDAD:
     * - Llama al método imprimir() de la clase padre usando super
     * - Imprime el sueldo del empleado
     * - Combina la funcionalidad de Persona con la específica de Empleado
     * 
     * IMPORTANTE:
     * - super.imprimir() llama al método imprimir() de la clase Persona
     * - Esto evita duplicar código y mantiene la funcionalidad heredada
     */
    public void imprimir() {
        super.imprimir(); // Llama al método imprimir() de Persona
        System.out.println("Sueldo: " + sueldo);
    }
}




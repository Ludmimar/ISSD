/*
 * EJERCICIO 03 - COMPOSICIÓN - CLASE SOCIO
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
 * - La clase Socio colabora con la clase Club
 * - Un Socio "es parte del" Club
 * - El Club tiene 3 objetos de la clase Socio como atributos
 * 
 * ATRIBUTOS:
 * - nombre: String (nombre del socio)
 * - antiguedad: int (años de antigüedad en el club)
 * 
 * MÉTODOS:
 * - constructor: solicita y carga nombre y antigüedad
 * - getNombre: devuelve el nombre del socio
 * - getAntiguedad: devuelve la antigüedad del socio
 * - imprimir: muestra los datos del socio
 */

import java.util.Scanner;

public class Socio {
    // Scanner para entrada de datos por teclado
    private Scanner teclado;
    
    // Atributos privados para encapsulación
    private String nombre;
    private int antiguedad;

    /**
     * CONSTRUCTOR - Solicita y carga los datos del socio
     * 
     * FUNCIONALIDAD:
     * - Crea el objeto Scanner para entrada de datos
     * - Solicita al usuario el nombre del socio
     * - Solicita al usuario la antigüedad en años
     * - Almacena los datos en los atributos correspondientes
     */
    public Socio() {
        teclado = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del socio: ");
        nombre = teclado.nextLine();
        
        System.out.print("Ingrese la antigüedad en años: ");
        antiguedad = teclado.nextInt();
    }

    /**
     * MÉTODO GET NOMBRE - Devuelve el nombre del socio
     * 
     * @return String Nombre del socio
     * IMPORTANTE: Como el atributo nombre es privado, necesitamos este método
     * para que otras clases puedan acceder al nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * MÉTODO GET ANTIGUEDAD - Devuelve la antigüedad del socio
     * 
     * @return int Antigüedad en años
     * IMPORTANTE: Como el atributo antiguedad es privado, necesitamos este método
     * para que otras clases puedan acceder a la antigüedad
     */
    public int getAntiguedad() {
        return antiguedad;
    }

    /**
     * MÉTODO IMPRIMIR - Muestra los datos del socio
     * 
     * FUNCIONALIDAD:
     * - Imprime el nombre y la antigüedad del socio
     */
    public void imprimir() {
        System.out.println("Socio: " + nombre + " - Antigüedad: " + antiguedad + " años");
    }
}


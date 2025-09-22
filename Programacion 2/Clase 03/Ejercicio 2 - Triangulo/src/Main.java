import java.util.Scanner;

/**
 * Ejercicio 2 - Clase Triángulo
 * Desarrollar un programa que permita:
 * - Cargar los lados de un triángulo
 * - Inicializar los atributos
 * - Imprimir el valor del lado mayor
 * - Imprimir un método que muestre si es equilátero o no
 */
public class Triangulo {
    private Scanner teclado;
    private int lado1, lado2, lado3;

    /**
     * Método para inicializar los lados del triángulo
     */
    public void inicializar() {
        teclado = new Scanner(System.in);
        System.out.print("Medida lado 1:");
        lado1 = teclado.nextInt();
        System.out.print("Medida lado 2:");
        lado2 = teclado.nextInt();
        System.out.print("Medida lado 3:");
        lado3 = teclado.nextInt();
    }

    /**
     * Método para imprimir el lado mayor
     */
    public void ladoMayor() {
        System.out.print("Lado mayor:");
        if (lado1 > lado2 && lado1 > lado3) {
            System.out.println(lado1);
        } else {
            if (lado2 > lado3) {
                System.out.println(lado2);
            } else {
                System.out.println(lado3);
            }
        }
    }

    /**
     * Método para verificar si es equilátero
     */
    public void esEquilatero() {
        if (lado1 == lado2 && lado1 == lado3) {
            System.out.print("Es un triangulo equilatero");
        } else {
            System.out.print("No es un triangulo equilatero");
        }
    }

    /**
     * Método principal
     */
    public static void main(String[] ar) {
        Triangulo triangulo1 = new Triangulo();
        triangulo1.inicializar();
        triangulo1.ladoMayor();
        triangulo1.esEquilatero();
    }
}

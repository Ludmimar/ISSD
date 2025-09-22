import java.util.Scanner;

/**
 * Ejercicio 4 - Clase Cuadrado
 * Desarrollar una clase que represente un Cuadrado y tenga los métodos para:
 * - Cargar el valor de su lado
 * - Imprimir su perímetro
 * - Imprimir su superficie
 */
public class Cuadrado {
    private Scanner teclado;
    int lado;

    /**
     * Método para inicializar el lado del cuadrado
     */
    public void inicializar() {
        teclado = new Scanner(System.in);
        System.out.print("Ingrese valor del lado :");
        lado = teclado.nextInt();
    }

    /**
     * Método para imprimir el perímetro del cuadrado
     */
    public void imprimirPerimetro() {
        int perimetro;
        perimetro = lado * 4;
        System.out.println("El perimetro es:" + perimetro);
    }

    /**
     * Método para imprimir la superficie del cuadrado
     */
    public void imprimirSuperficie() {
        int superficie;
        superficie = lado * lado;
        System.out.println("La superficie es:" + superficie);
    }

    /**
     * Método principal
     */
    public static void main(String[] ar) {
        Cuadrado cuadrado1;
        cuadrado1 = new Cuadrado();
        cuadrado1.inicializar();
        cuadrado1.imprimirPerimetro();
        cuadrado1.imprimirSuperficie();
    }
}

import java.util.Scanner;

/**
 * Ejercicio 3 - Clase Punto
 * Desarrollar una clase que represente un punto en el plano y tenga los métodos para:
 * - Cargar los valores de x e y
 * - Imprimir en que cuadrante se encuentra dicho punto
 */
public class Punto {
    private Scanner teclado;
    int x, y;

    /**
     * Método para inicializar las coordenadas del punto
     */
    public void inicializar() {
        teclado = new Scanner(System.in);
        System.out.print("Ingrese coordenada x :");
        x = teclado.nextInt();
        System.out.print("Ingrese coordenada y :");
        y = teclado.nextInt();
    }

    /**
     * Método para imprimir el cuadrante del punto
     */
    void imprimirCuadrante() {
        if (x > 0 && y > 0) {
            System.out.print("Se encuentra en el primer cuadrante.");
        } else {
            if (x < 0 && y > 0) {
                System.out.print("Se encuentra en el segundo cuadrante.");
            } else {
                if (x < 0 && y < 0) {
                    System.out.print("Se encuentra en el tercer cuadrante.");
                } else {
                    if (x > 0 && y < 0) {
                        System.out.print("Se encuentra en el cuarto cuadrante.");
                    } else {
                        System.out.print("El punto no está en un cuadrante.");
                    }
                }
            }
        }
    }

    /**
     * Método principal
     */
    public static void main(String[] ar) {
        Punto punto1;
        punto1 = new Punto();
        punto1.inicializar();
        punto1.imprimirCuadrante();
    }
}

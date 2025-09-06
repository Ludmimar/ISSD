import java.util.Scanner

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10]; // arreglo para almacenar los 10 valores
        int suma = 0;

        // Cargar los 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese número " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // Sumar los últimos 5
        for (int i = 5; i < 10; i++) {
            suma += numeros[i];
        }

        System.out.println("La suma de los últimos 5 valores ingresados es: " + suma);
        sc.close();
    }
}
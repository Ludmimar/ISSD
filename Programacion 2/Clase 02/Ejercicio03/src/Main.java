import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x, suma, valor, promedio;
        x = 1;
        suma = 0;
        while (x <= 5) {
            System.out.print("Ingrese un valor:");
            valor = teclado.nextInt();
            suma = suma + valor;
            x = x + 1;
        }
        promedio = suma / 5;
        System.out.print("La suma de los 5 valores es:");
        System.out.println(suma);
        System.out.print("El promedio es:");
        System.out.print(promedio);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entre 1 y 10: ");
        int num = sc.nextInt();

        if (num < 1 || num > 10) {
            System.out.println("Número fuera de rango. Debe estar entre 1 y 10.");
        } else {
            System.out.println("Tabla de multiplicar del " + num + ":");
            for (int i = 1; i <= 12; i++) {
                int resultado = num * i;
                System.out.println(num + " x " + i + " = " + resultado);
            }
        }

        sc.close();
    }
}
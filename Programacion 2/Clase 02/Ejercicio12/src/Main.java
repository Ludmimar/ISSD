import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir cantidad de puntos
        System.out.print("Ingrese la cantidad de puntos a procesar: ");
        int n = sc.nextInt();

        // Contadores para cada cuadrante
        int primerCuadrante = 0;
        int segundoCuadrante = 0;
        int tercerCuadrante = 0;
        int cuartoCuadrante = 0;

        // Procesar puntos
        for (int i = 1; i <= n; i++) {
            System.out.println("\nPunto " + i + ":");
            System.out.print("Ingrese coordenada x: ");
            int x = sc.nextInt();
            System.out.print("Ingrese coordenada y: ");
            int y = sc.nextInt();

            if (x > 0 && y > 0) {
                primerCuadrante++;
            } else if (x < 0 && y > 0) {
                segundoCuadrante++;
            } else if (x < 0 && y < 0) {
                tercerCuadrante++;
            } else if (x > 0 && y < 0) {
                cuartoCuadrante++;
            } else {
                System.out.println("⚠ El punto (" + x + "," + y + ") está sobre un eje y no pertenece a ningún cuadrante.");
            }
        }

        // Mostrar resultados
        System.out.println("\n📊 Resultados:");
        System.out.println("Primer cuadrante: " + primerCuadrante);
        System.out.println("Segundo cuadrante: " + segundoCuadrante);
        System.out.println("Tercer cuadrante: " + tercerCuadrante);
        System.out.println("Cuarto cuadrante: " + cuartoCuadrante);

        sc.close();
    }
}
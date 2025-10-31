/*Autor: Ludmila Martos
Dni:34811684
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Configuración inicial del sistema
        int cantidadAlumnos = 3;
        int notaAprobacion = 60;

        // Crear el objeto Examen
        Examen examen = new Examen(cantidadAlumnos, notaAprobacion);

        // Cargar datos parametrizados de los alumnos
        cargarDatosAlumnos(examen);

        // Mostrar menú de opciones
        mostrarMenu(examen);
    }

    /**
     * Método que carga los datos de los alumnos de forma parametrizada
     * @param examen Objeto examen donde se cargarán los alumnos
     */
    private static void cargarDatosAlumnos(Examen examen) {
        // Alumno 1: Ludmila Martos
        Alumno alumno1 = new Alumno(1001, "Ludmila Martos", 4);
        alumno1.setMateriaNota(0, "Programación 1", 55);
        alumno1.setMateriaNota(1, "Matematica", 72);
        alumno1.setMateriaNota(2, "Base de Datos", 60);
        alumno1.setMateriaNota(3, "Ingles Tecnico",45);
        examen.agregarAlumno(0, alumno1);

        // Alumno 2: Maximiliano Orosco
        Alumno alumno2 = new Alumno(1002, "Maximiliano Orosco", 4);
        alumno2.setMateriaNota(0, "Programacion 1", 95);
        alumno2.setMateriaNota(1, "Matematica", 50);
        alumno2.setMateriaNota(2, "Base de Datos", 92);
        alumno2.setMateriaNota(3, "Ingles Tecnico", 78);
        examen.agregarAlumno(1, alumno2);

        // Alumno 3: Ailen Acuña
        Alumno alumno3 = new Alumno(1003, "Ailen Acuña", 4);
        alumno3.setMateriaNota(0, "Programacion 1", 55);
        alumno3.setMateriaNota(1, "Matematica", 68);
        alumno3.setMateriaNota(2, "Base de Datos", 70);
        alumno3.setMateriaNota(3, "Ingles Tecnico", 58);
        examen.agregarAlumno(2, alumno3);

        System.out.println("╔════════════════════════════════════════════════════════════════════╗");
        System.out.println("║      SISTEMA DE GESTIÓN DE NOTAS ACADÉMICAS - PARCIAL 01          ║");
        System.out.println("╚════════════════════════════════════════════════════════════════════╝");
        System.out.println("\n✓ Datos de " + examen.getAlumnos().length + " alumnos cargados exitosamente.");
        System.out.println("✓ Nota de aprobación establecida en: " + examen.getNotaAprobacion() + " puntos.\n");
    }

    /**
     * Método que muestra el menú de opciones del sistema
     * @param examen Objeto examen con los datos cargados
     */
    private static void mostrarMenu(Examen examen) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n╔════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                        MENÚ PRINCIPAL                              ║");
            System.out.println("╠════════════════════════════════════════════════════════════════════╣");
            System.out.println("║  1. Mostrar listado de alumnos con estado de materias             ║");
            System.out.println("║  2. Mostrar promedios de alumnos                                   ║");
            System.out.println("║  3. Mostrar materias superiores al promedio por alumno             ║");
            System.out.println("║  4. Mostrar todos los reportes                                     ║");
            System.out.println("║  0. Salir del sistema                                              ║");
            System.out.println("╚════════════════════════════════════════════════════════════════════╝");
            System.out.print("\n→ Ingrese su opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    examen.mostrarListadoAlumnos();
                    break;
                case 2:
                    examen.mostrarPromedios();
                    break;
                case 3:
                    examen.mostrarMateriasSuperioresAlPromedio();
                    break;
                case 4:
                    System.out.println("\n════════════════════ REPORTE COMPLETO ════════════════════");
                    examen.mostrarListadoAlumnos();
                    examen.mostrarPromedios();
                    examen.mostrarMateriasSuperioresAlPromedio();
                    System.out.println("\n═══════════════════ FIN DEL REPORTE ═══════════════════");
                    break;
                case 0:
                    System.out.println("\n╔════════════════════════════════════════════════════════════════════╗");
                    System.out.println("║       Gracias por usar el Sistema de Gestión de Notas             ║");
                    System.out.println("║                    ¡Hasta pronto!                                  ║");
                    System.out.println("╚════════════════════════════════════════════════════════════════════╝");
                    break;
                default:
                    System.out.println("\n✗ Opción inválida. Por favor, seleccione una opción del menú.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}

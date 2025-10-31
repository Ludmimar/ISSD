/*Autor: Ludmila Martos
Dni:34811684
*/
public class Examen {
    // Atributos
    private Alumno[] alumnos;
    private int notaAprobacion;

    /**
     * Constructor que inicializa el examen con la cantidad de alumnos y nota de aprobación
     * @param cantidadAlumnos Cantidad de alumnos que rendirán el examen
     * @param notaAprobacion Nota mínima requerida para aprobar
     */
    public Examen(int cantidadAlumnos, int notaAprobacion) {
        this.alumnos = new Alumno[cantidadAlumnos];
        this.notaAprobacion = notaAprobacion;
    }

    // Getters y Setters
    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }

    public int getNotaAprobacion() {
        return notaAprobacion;
    }

    public void setNotaAprobacion(int notaAprobacion) {
        this.notaAprobacion = notaAprobacion;
    }

    /**
     * Agrega un alumno al examen en una posición específica
     * @param indice Posición donde se agregará el alumno
     * @param alumno Objeto alumno a agregar
     */
    public void agregarAlumno(int indice, Alumno alumno) {
        // Validación de límites del array para evitar excepciones
        if (indice >= 0 && indice < alumnos.length) {
            // Almacena la referencia del objeto Alumno en el array
            this.alumnos[indice] = alumno;
        }
    }

    /**
     * Muestra el listado completo de alumnos con sus materias y estado de aprobación
     */
    public void mostrarListadoAlumnos() {
        // Encabezado del reporte con formato de tabla usando caracteres Unicode
        System.out.println("\n╔════════════════════════════════════════════════════════════════════╗");
        System.out.println("║         LISTADO DE ALUMNOS - ESTADO DE MATERIAS                   ║");
        System.out.println("╚════════════════════════════════════════════════════════════════════╝");

        // Itera sobre cada alumno del array usando for-each
        for (Alumno alumno : alumnos) {
            // Verifica que el alumno no sea null (posiciones vacías del array)
            if (alumno != null) {
                // Muestra información básica del alumno
                System.out.println("\n┌─────────────────────────────────────────────────────────────────┐");
                System.out.println("│ Legajo: " + alumno.getLegajo() + " - Nombre: " + alumno.getNombre());
                System.out.println("├─────────────────────────────────────────────────────────────────┤");

                // Obtiene los arrays paralelos de materias y notas
                String[] materias = alumno.getMaterias();
                int[] notas = alumno.getNotas();

                // Recorre todas las materias del alumno
                for (int i = 0; i < materias.length; i++) {
                    // Operador ternario: compara nota con notaAprobacion
                    // Si nota >= notaAprobacion → "APROBADA", sino → "REPROBADA"
                    String estado = notas[i] >= notaAprobacion ? "APROBADA" : "REPROBADA";
                    String simbolo = notas[i] >= notaAprobacion ? "✓" : "✗";
                    
                    // printf permite formateo: %-30s (izquierda, 30 caracteres), %2d (número 2 dígitos)
                    System.out.printf("│ %-30s - Nota: %2d - %s %s%n",
                            materias[i], notas[i], simbolo, estado);
                }
                System.out.println("└─────────────────────────────────────────────────────────────────┘");
            }
        }
    }

    /**
     * Calcula y muestra el promedio de notas de cada alumno
     */
    public void mostrarPromedios() {
        // Encabezado del reporte de promedios
        System.out.println("\n╔════════════════════════════════════════════════════════════════════╗");
        System.out.println("║              PROMEDIOS TOTALES POR ALUMNO                          ║");
        System.out.println("╚════════════════════════════════════════════════════════════════════╝");

        // Recorre todos los alumnos
        for (Alumno alumno : alumnos) {
            if (alumno != null) {
                // Delega el cálculo al método de la clase Alumno (Responsabilidad única)
                double promedio = alumno.calcularPromedio();
                
                // Muestra el resultado formateado
                System.out.println("\n┌─────────────────────────────────────────────────────────────────┐");
                System.out.printf("│ Alumno: %-54s │%n", alumno.getNombre());
                System.out.printf("│ Legajo: %-54d │%n", alumno.getLegajo());
                // %.2f formatea el double con 2 decimales
                System.out.printf("│ Promedio General: %-43.2f │%n", promedio);
                System.out.println("└─────────────────────────────────────────────────────────────────┘");
            }
        }
    }

    /**
     * Muestra las materias de cada alumno que superan su promedio general
     */
    public void mostrarMateriasSuperioresAlPromedio() {
        // Encabezado del reporte
        System.out.println("\n╔════════════════════════════════════════════════════════════════════╗");
        System.out.println("║         MATERIAS CON NOTA SUPERIOR AL PROMEDIO DEL ALUMNO          ║");
        System.out.println("╚════════════════════════════════════════════════════════════════════╝");

        // Procesa cada alumno
        for (Alumno alumno : alumnos) {
            if (alumno != null) {
                // Calcula el promedio del alumno como referencia
                double promedio = alumno.calcularPromedio();
                
                System.out.println("\n┌─────────────────────────────────────────────────────────────────┐");
                System.out.printf("│ Alumno: %-54s │%n", alumno.getNombre());
                System.out.printf("│ Promedio General: %-43.2f │%n", promedio);
                System.out.println("├─────────────────────────────────────────────────────────────────┤");
                System.out.println("│ Materias superiores al promedio:                               │");

                // Obtiene arrays de materias y notas
                String[] materias = alumno.getMaterias();
                int[] notas = alumno.getNotas();
                
                // Flag para controlar si hay materias que cumplan la condición
                boolean tieneMateriasSuperiores = false;

                // Filtra materias donde nota > promedio (nota mayor, no igual)
                for (int i = 0; i < materias.length; i++) {
                    if (notas[i] > promedio) {
                        System.out.printf("│   ★ %-30s - Nota: %2d                   │%n",
                                materias[i], notas[i]);
                        tieneMateriasSuperiores = true; // Marca que al menos una cumple
                    }
                }

                // Si ninguna materia supera el promedio, muestra mensaje informativo
                if (!tieneMateriasSuperiores) {
                    System.out.println("│   (No hay materias superiores al promedio)                     │");
                }

                System.out.println("└─────────────────────────────────────────────────────────────────┘");
            }
        }
    }
}

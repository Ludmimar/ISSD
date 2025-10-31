/*Autor: Ludmila Martos
Dni:34811684
*/
public class Alumno {
    // Atributos
    private int legajo;
    private String nombre;
    private String[] materias;
    private int[] notas;

    /**
     * Constructor que inicializa el alumno con la cantidad de materias especificada
     * @param legajo Número de legajo del alumno
     * @param nombre Nombre completo del alumno
     * @param cantidadMaterias Cantidad de materias que cursará el alumno
     */
    public Alumno(int legajo, String nombre, int cantidadMaterias) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.materias = new String[cantidadMaterias];
        this.notas = new int[cantidadMaterias];
    }

    // Getters y Setters
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    /**
     * Establece el nombre y la nota de una materia en una posición específica
     * @param indice Posición de la materia en el array
     * @param nombreMateria Nombre de la materia
     * @param nota Nota obtenida en la materia
     */
    public void setMateriaNota(int indice, String nombreMateria, int nota) {
        // Validación: verifica que el índice esté dentro de los límites del array
        if (indice >= 0 && indice < materias.length) {
            // Asigna la materia y la nota en la misma posición (arrays paralelos)
            this.materias[indice] = nombreMateria;
            this.notas[indice] = nota;
        }
    }

    /**
     * Calcula el promedio de todas las notas del alumno
     * @return Promedio de notas
     */
    public double calcularPromedio() {
        // Validación: si no hay notas, retorna 0 para evitar división por cero
        if (notas.length == 0) return 0;

        // Acumula la suma de todas las notas
        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        // Cast a double para obtener resultado con decimales
        // Ejemplo: 250/4 = 62.5 (en vez de 62 si fuera int)
        return (double) suma / notas.length;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "legajo=" + legajo +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

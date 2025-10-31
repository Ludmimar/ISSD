/*
 * EJERCICIO 12 - COLECCIONES - CLASE ALUMNO
 * 
 * ENUNCIADO:
 * Si tenemos una clase Alumno, con los campos nombre (String) y nota (Int), 
 * un constructor que admita el nombre como parámetro, un getter para el nombre 
 * y un setter para la nota, programar esta clase crear una lista con 4 alumnos 
 * (de nombres ficticios). Desordenar esta lista e iterar sobre ella, pidiéndole 
 * al usuario que ingrese la nota del estudiante en ese lugar de la lista.
 * 
 * CONCEPTO CLAVE: COLECCIONES - LISTAS DE OBJETOS PERSONALIZADOS
 * - Las listas pueden contener objetos de clases definidas por el usuario
 * - Collections.shuffle() funciona con cualquier tipo de objeto
 * - Permite manejar datos complejos de forma organizada
 * 
 * ATRIBUTOS:
 * - nombre: String (nombre del alumno)
 * - nota: int (nota del alumno)
 * 
 * MÉTODOS:
 * - constructor: inicializa con nombre, nota en 0
 * - getName: devuelve el nombre
 * - setNota: establece la nota
 */

public class Alumno {
    // Atributos privados
    private String nombre;
    private int nota;

    /**
     * CONSTRUCTOR - Inicializa un alumno con nombre
     * 
     * @param nombre Nombre del alumno
     */
    public Alumno(String nombre) {
        this.nombre = nombre;
        this.nota = 0; // Inicializar nota en 0
    }

    /**
     * MÉTODO GET NAME - Devuelve el nombre del alumno
     * 
     * @return String Nombre del alumno
     */
    public String getName() {
        return this.nombre;
    }

    /**
     * MÉTODO SET NOTA - Establece la nota del alumno
     * 
     * @param nota Nota del alumno
     */
    public void setNota(int nota) {
        this.nota = nota;
    }
}


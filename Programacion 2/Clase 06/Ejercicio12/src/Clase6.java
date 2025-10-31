/*
 * EJERCICIO 12 - COLECCIONES - LISTA DE OBJETOS CON COLLECTIONS.SHUFFLE()
 * 
 * ENUNCIADO:
 * Si tenemos una clase Alumno, con los campos nombre (String) y nota (Int), 
 * un constructor que admita el nombre como parámetro, un getter para el nombre 
 * y un setter para la nota, programar esta clase crear una lista con 4 alumnos 
 * (de nombres ficticios). Desordenar esta lista e iterar sobre ella, pidiéndole 
 * al usuario que ingrese la nota del estudiante en ese lugar de la lista.
 * 
 * CONCEPTO CLAVE: COLECCIONES - LISTAS DE OBJETOS Y SHUFFLE
 * - Collections.shuffle() funciona con cualquier tipo de objeto
 * - Permite aleatorizar el orden de elementos
 * - Útil para procesar datos en orden aleatorio
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear lista de Alumnos
 * 2. Agregar 4 alumnos con nombres ficticios
 * 3. Desordenar la lista con shuffle()
 * 4. Iterar y pedir nota para cada alumno
 * 5. Establecer la nota usando setter
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Clase6 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Crea lista con 4 alumnos
     * - Desordena la lista
     * - Pide nota para cada alumno en orden aleatorio
     */
    public static void main(String[] args) {
        // Crear Scanner para entrada de datos
        Scanner teclado = new Scanner(System.in);
        
        // Crear lista de alumnos
        List<Alumno> lista = new ArrayList<>();
        
        // Agregar 4 alumnos con nombres ficticios
        lista.add(new Alumno("Juan"));
        lista.add(new Alumno("Carlos"));
        lista.add(new Alumno("Damian"));
        lista.add(new Alumno("Nicolas"));
        
        // Desordenar la lista aleatoriamente
        Collections.shuffle(lista);
        
        // Iterar sobre la lista desordenada
        // Usar for-each para simplificar el código
        for (Alumno alumno : lista) {
            // Pedir la nota del alumno actual
            System.out.print("Ingrese la nota de " + alumno.getName() + ": ");
            int nota = teclado.nextInt();
            
            // Establecer la nota usando el setter
            alumno.setNota(nota);
        }
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. LISTAS DE OBJETOS PERSONALIZADOS:
         *    - Las listas pueden contener objetos de cualquier clase
         *    - List<Alumno> declara una lista de objetos Alumno
         *    - Cada elemento es un objeto independiente
         * 
         * 2. COLLECTIONS.SHUFFLE():
         *    - Funciona con cualquier tipo de colección
         *    - Desordena aleatoriamente los elementos
         *    - Útil para aleatorizar el orden de procesamiento
         * 
         * 3. ITERACIÓN FOR-EACH:
         *    - Simplifica el código cuando solo necesitas leer/iterar
         *    - La variable 'alumno' toma cada elemento en cada iteración
         *    - Permite acceder a métodos del objeto directamente
         * 
         * 4. ENTRADA DE DATOS:
         *    - nextInt() lee un entero desde la consola
         *    - Se puede validar el rango si es necesario
         * 
         * 5. SETTER:
         *    - setNota() modifica el atributo privado 'nota'
         *    - Encapsula la modificación del estado del objeto
         * 
         * 6. VENTAJA DEL SHUFFLE:
         *    - Aleatoriza el orden de evaluación
         *    - Útil para evitar sesgos en la evaluación
         *    - Cada ejecución procesa los alumnos en orden diferente
         */
    }
}


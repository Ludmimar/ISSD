/**
 * Ejercicio 8 - Clase TablaMultiplicación con parámetros
 * Plantear una clase TablaMultiplicación que al constructor llegue como parámetro 
 * el valor de la tabla de multiplicación que debe generar.
 * En un segundo método llamado imprimir proceder a mostrar la tabla de multiplicación indicada en el constructor.
 */
public class TablaMultiplicacion {
    private int tabla;

    /**
     * Constructor que recibe el valor de la tabla
     * @param ta valor de la tabla de multiplicación
     */
    public TablaMultiplicacion(int ta) {
        tabla = ta;
    }

    /**
     * Método para imprimir la tabla de multiplicación
     */
    public void imprimir() {
        for (int f = 1; f <= 10; f++) {
            int resu = tabla * f;
            System.out.println(tabla + " * " + f + " = " + resu);
        }
    }

    /**
     * Método principal
     */
    public static void main(String[] ar) {
        TablaMultiplicacion tablamultiplicacion = new TablaMultiplicacion(5);
        tablamultiplicacion.imprimir();
    }
}

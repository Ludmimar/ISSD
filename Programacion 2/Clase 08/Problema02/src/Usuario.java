/*
 * PROBLEMA 02 - SETS - CLASE USUARIO PARA ORDEN ALFABÉTICO
 * 
 * ENUNCIADO:
 * Mejorar el programa del problema 1 para que la lista de intereses se imprima 
 * en orden alfabético.
 * 
 * CONCEPTO CLAVE: SETS - TREESET PARA ORDEN
 * - TreeSet mantiene orden natural (alfabético para Strings)
 * - Cambiar HashSet por TreeSet
 * - Resultado ordenado automáticamente
 * 
 * ATRIBUTOS:
 * - intereses: String[] (array de intereses del usuario)
 * 
 * MÉTODOS:
 * - getIntereses: devuelve el array de intereses
 * - setIntereses: establece el array de intereses
 */

public class Usuario {
    private String[] intereses;

    public Usuario(String[] intereses) {
        this.intereses = intereses;
    }

    public String[] getIntereses() {
        return intereses;
    }

    public void setIntereses(String[] intereses) {
        this.intereses = intereses;
    }
}


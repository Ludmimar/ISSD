/*
 * PROBLEMA 01 - SETS - CLASE USUARIO
 * 
 * ENUNCIADO:
 * Se dispone de una lista de objetos que representan usuarios de un sitio web, según 
 * la siguiente Clase. En cada objeto Usuario hay un array de Strings representando 
 * la lista de intereses de cada uno. Desarrollar un programa que, dada la lista de 
 * usuarios (por ejemplo, ArrayList<Usuario>), imprima una lista de intereses, sin 
 * repeticiones, de todos los usuarios que visitan el sitio web.
 * 
 * CONCEPTO CLAVE: SETS - ELIMINAR DUPLICADOS
 * - Los Sets automáticamente eliminan duplicados
 * - Útil para obtener elementos únicos de múltiples fuentes
 * - Agregar elementos desde arrays de diferentes usuarios
 * 
 * ATRIBUTOS:
 * - intereses: String[] (array de intereses del usuario)
 * 
 * MÉTODOS:
 * - getIntereses: devuelve el array de intereses
 * - setIntereses: establece el array de intereses
 */

public class Usuario {
    // Atributo privado
    private String[] intereses;

    /**
     * CONSTRUCTOR - Inicializa un usuario con intereses
     * 
     * @param intereses Array de intereses del usuario
     */
    public Usuario(String[] intereses) {
        this.intereses = intereses;
    }

    /**
     * MÉTODO GET INTERESES - Devuelve el array de intereses
     * 
     * @return String[] Array de intereses del usuario
     */
    public String[] getIntereses() {
        return intereses;
    }

    /**
     * MÉTODO SET INTERESES - Establece el array de intereses
     * 
     * @param intereses Nuevo array de intereses
     */
    public void setIntereses(String[] intereses) {
        this.intereses = intereses;
    }
}


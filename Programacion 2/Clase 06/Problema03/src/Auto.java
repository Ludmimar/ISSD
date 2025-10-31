/*
 * PROBLEMA 03 - COLECCIONES - CLASE AUTO
 * 
 * ENUNCIADO:
 * Programar una clase Auto que tenga los parámetros marca (String) y modelo (int), 
 * un constructor con estos parámetros y getters para ambos. Crear una lista de 
 * objetos Auto (List<Auto>) y pedirle al usuario que ingrese 3 autos, que serán 
 * almacenados en la lista. Imprimir la marca y modelo de cada uno de los Autos 
 * ingresados en la lista.
 * 
 * CONCEPTO CLAVE: COLECCIONES - LISTAS DE OBJETOS PERSONALIZADOS
 * - Las listas pueden contener objetos de clases definidas por el usuario
 * - Permite agrupar objetos relacionados
 * - Facilita el manejo de datos complejos
 * 
 * ATRIBUTOS:
 * - marca: String (marca del auto)
 * - modelo: int (año o número de modelo)
 * 
 * MÉTODOS:
 * - constructor: inicializa marca y modelo
 * - getMarca: devuelve la marca
 * - getModelo: devuelve el modelo
 */

public class Auto {
    // Atributos privados
    private String marca;
    private int modelo;

    /**
     * CONSTRUCTOR - Inicializa un auto con marca y modelo
     * 
     * @param marca Marca del auto
     * @param modelo Modelo del auto (puede ser año o número)
     */
    public Auto(String marca, int modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * MÉTODO GET MARCA - Devuelve la marca del auto
     * 
     * @return String Marca del auto
     */
    public String getMarca() {
        return this.marca;
    }

    /**
     * MÉTODO GET MODELO - Devuelve el modelo del auto
     * 
     * @return int Modelo del auto
     */
    public int getModelo() {
        return this.modelo;
    }
}


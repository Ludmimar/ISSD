/**
 * Ejercicio 10 - Clase Cuadrado con método que retorna String
 * Declarar una clase llamada Cuadrado. Considerar que:
 * - Al constructor debe llegar la medida del lado (no se ingresa por teclado)
 * - Se necesita definir un método que retorne un String indicando que el cuadrado es "grande" 
 *   si la superficie es mayor a 100 en caso contrario retornar un String indicando que es "chico".
 * - Mostrar en la main el valor retornado.
 */
public class Cuadrado {
    int lado;

    /**
     * Constructor que recibe la medida del lado
     * @param la medida del lado del cuadrado
     */
    public Cuadrado(int la) {
        lado = la;
    }

    /**
     * Método que retorna el tipo de cuadrado según su superficie
     * @return "grande" si superficie > 100, "chico" en caso contrario
     */
    public String retornarTipo() {
        int superficie = lado * lado;
        if (superficie > 100) {
            return "grande";
        } else {
            return "chico";
        }
    }

    /**
     * Método principal
     */
    public static void main(String[] ar) {
        Cuadrado cuadrado1;
        cuadrado1 = new Cuadrado(3);
        System.out.println("Se trata de un cuadrado:" + cuadrado1.retornarTipo());
    }
}

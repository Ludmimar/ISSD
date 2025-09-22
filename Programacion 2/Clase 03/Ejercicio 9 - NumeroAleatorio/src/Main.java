/**
 * Ejercicio 9 - Clase NumeroAleatorio
 * Plantear una clase llamada NumeroAleatorio. Al constructor enviar el rango de valores 
 * (mínimo y máximo, por ejemplo si queremos generar un valor aleatorio entre 1 y 80, le pasaremos dichos enteros)
 * Definir un segundo método que retorne un valor aleatorio en el rango especificado en el constructor. 
 * Llamar luego 10 veces a dicho método.
 */
public class NumeroAleatorio {
    private int minimo, maximo;

    /**
     * Constructor que recibe el rango de valores
     * @param mi valor mínimo
     * @param ma valor máximo
     */
    public NumeroAleatorio(int mi, int ma) {
        minimo = mi;
        maximo = ma;
    }

    /**
     * Método que retorna un número aleatorio en el rango especificado
     * @return número aleatorio entre mínimo y máximo
     */
    public int retornar() {
        int rango = maximo - minimo + 1;
        int valor = minimo + (int) (Math.random() * rango);
        return valor;
    }

    /**
     * Método principal
     */
    public static void main(String[] ar) {
        NumeroAleatorio numero = new NumeroAleatorio(1, 4);
        for (int x = 1; x <= 10; x++) {
            System.out.println(numero.retornar());
        }
    }
}

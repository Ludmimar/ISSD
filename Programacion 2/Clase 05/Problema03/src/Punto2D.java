/*
 * PROBLEMA 03 - HERENCIA - CLASE PADRE PUNTO2D
 * 
 * ENUNCIADO:
 * Plantear una clase Punto2D que permita administrar la coordenada de un punto en el plano.
 * Definir como atributos el x e y del punto.
 * Definir getter y setter
 * 
 * Plantear una clase Punto3D que permita administrar la coordenada de un punto en el espacio.
 * Definir como atributos el x,y y z.
 * 
 * Plantear una relación de herencia entre Punto3D y Punto2D
 * 
 * CONCEPTO CLAVE: HERENCIA
 * - La clase Punto2D es la clase padre (superclase)
 * - La clase Punto3D hereda de Punto2D
 * - Un Punto3D "es un" Punto2D con una coordenada adicional
 * - Los atributos y métodos comunes se definen en Punto2D
 * 
 * ATRIBUTOS PROTEGIDOS (accesibles por las subclases):
 * - x: double (coordenada x del punto)
 * - y: double (coordenada y del punto)
 * 
 * MÉTODOS:
 * - constructor: inicializa las coordenadas
 * - getX, getY: devuelven las coordenadas
 * - setX, setY: establecen las coordenadas
 * - mostrar: muestra las coordenadas del punto
 * - distancia: calcula la distancia desde el origen
 */

public class Punto2D {
    // Atributos protegidos para que las subclases puedan acceder
    protected double x;
    protected double y;

    /**
     * CONSTRUCTOR POR DEFECTO - Inicializa el punto en el origen
     * 
     * FUNCIONALIDAD:
     * - Inicializa las coordenadas en (0, 0)
     */
    public Punto2D() {
        this.x = 0.0;
        this.y = 0.0;
    }

    /**
     * CONSTRUCTOR CON PARÁMETROS - Inicializa el punto con coordenadas específicas
     * 
     * @param x Coordenada x del punto
     * @param y Coordenada y del punto
     */
    public Punto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * MÉTODO GET X - Devuelve la coordenada x
     * 
     * @return double Coordenada x del punto
     */
    public double getX() {
        return x;
    }

    /**
     * MÉTODO GET Y - Devuelve la coordenada y
     * 
     * @return double Coordenada y del punto
     */
    public double getY() {
        return y;
    }

    /**
     * MÉTODO SET X - Establece la coordenada x
     * 
     * @param x Nueva coordenada x del punto
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * MÉTODO SET Y - Establece la coordenada y
     * 
     * @param y Nueva coordenada y del punto
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * MÉTODO MOSTRAR - Muestra las coordenadas del punto
     * 
     * FUNCIONALIDAD:
     * - Imprime las coordenadas del punto en formato (x, y)
     */
    public void mostrar() {
        System.out.println("Punto 2D: (" + x + ", " + y + ")");
    }

    /**
     * MÉTODO DISTANCIA - Calcula la distancia desde el origen
     * 
     * FUNCIONALIDAD:
     * - Calcula la distancia euclidiana desde el origen (0, 0)
     * - Utiliza la fórmula: √(x² + y²)
     * 
     * @return double Distancia desde el origen
     */
    public double distancia() {
        return Math.sqrt(x * x + y * y);
    }

    /**
     * MÉTODO DISTANCIA A PUNTO - Calcula la distancia a otro punto
     * 
     * FUNCIONALIDAD:
     * - Calcula la distancia euclidiana a otro punto
     * - Utiliza la fórmula: √((x2-x1)² + (y2-y1)²)
     * 
     * @param otro Punto2D al cual calcular la distancia
     * @return double Distancia al otro punto
     */
    public double distanciaA(Punto2D otro) {
        double dx = this.x - otro.x;
        double dy = this.y - otro.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}




/*
 * PROBLEMA 03 - HERENCIA - CLASE HIJA PUNTO3D
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
 * - La clase Punto3D hereda de la clase Punto2D usando 'extends'
 * - Un Punto3D "es un" Punto2D con una coordenada adicional
 * - Hereda automáticamente todos los atributos y métodos de Punto2D
 * - Añade atributos y métodos específicos para puntos 3D
 * - Sobrescribe métodos para comportamiento específico
 * 
 * HERENCIA:
 * - Atributos heredados: x, y
 * - Métodos heredados: getX(), getY(), setX(), setY(), mostrar(), distancia()
 * - Atributo propio: z
 * - Métodos propios: getZ(), setZ()
 * - Métodos sobrescritos: mostrar(), distancia()
 */

public class Punto3D extends Punto2D {
    // Atributo específico de la clase Punto3D
    private double z;

    /**
     * CONSTRUCTOR POR DEFECTO - Inicializa el punto en el origen
     * 
     * FUNCIONALIDAD:
     * - Inicializa las coordenadas en (0, 0, 0)
     * - Llama al constructor de la clase padre
     */
    public Punto3D() {
        super(); // Llama al constructor de Punto2D
        this.z = 0.0;
    }

    /**
     * CONSTRUCTOR CON PARÁMETROS - Inicializa el punto con coordenadas específicas
     * 
     * @param x Coordenada x del punto
     * @param y Coordenada y del punto
     * @param z Coordenada z del punto
     */
    public Punto3D(double x, double y, double z) {
        super(x, y); // Llama al constructor de Punto2D
        this.z = z;
    }

    /**
     * MÉTODO GET Z - Devuelve la coordenada z
     * 
     * @return double Coordenada z del punto
     */
    public double getZ() {
        return z;
    }

    /**
     * MÉTODO SET Z - Establece la coordenada z
     * 
     * @param z Nueva coordenada z del punto
     */
    public void setZ(double z) {
        this.z = z;
    }

    /**
     * MÉTODO MOSTRAR - Sobrescribe el método de la clase padre
     * 
     * FUNCIONALIDAD:
     * - Muestra las coordenadas del punto en formato (x, y, z)
     * - Sobrescribe el comportamiento genérico de Punto2D
     */
    @Override
    public void mostrar() {
        System.out.println("Punto 3D: (" + x + ", " + y + ", " + z + ")");
    }

    /**
     * MÉTODO DISTANCIA - Sobrescribe el método de la clase padre
     * 
     * FUNCIONALIDAD:
     * - Calcula la distancia euclidiana desde el origen (0, 0, 0)
     * - Utiliza la fórmula: √(x² + y² + z²)
     * - Sobrescribe el comportamiento genérico de Punto2D
     * 
     * @return double Distancia desde el origen
     */
    @Override
    public double distancia() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     * MÉTODO DISTANCIA A PUNTO - Calcula la distancia a otro punto 3D
     * 
     * FUNCIONALIDAD:
     * - Calcula la distancia euclidiana a otro punto 3D
     * - Utiliza la fórmula: √((x2-x1)² + (y2-y1)² + (z2-z1)²)
     * 
     * @param otro Punto3D al cual calcular la distancia
     * @return double Distancia al otro punto
     */
    public double distanciaA(Punto3D otro) {
        double dx = this.x - otro.x;
        double dy = this.y - otro.y;
        double dz = this.z - otro.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    /**
     * MÉTODO DISTANCIA A PUNTO2D - Calcula la distancia a un punto 2D
     * 
     * FUNCIONALIDAD:
     * - Calcula la distancia euclidiana a un punto 2D
     * - Trata el punto 2D como si tuviera z = 0
     * - Utiliza la fórmula: √((x2-x1)² + (y2-y1)² + z²)
     * 
     * @param otro Punto2D al cual calcular la distancia
     * @return double Distancia al otro punto
     */
    public double distanciaA(Punto2D otro) {
        double dx = this.x - otro.getX();
        double dy = this.y - otro.getY();
        return Math.sqrt(dx * dx + dy * dy + z * z);
    }

    /**
     * MÉTODO VOLUMEN - Calcula el volumen de un cubo desde el origen
     * 
     * FUNCIONALIDAD:
     * - Calcula el volumen de un cubo con vértices en (0,0,0) y (x,y,z)
     * - Utiliza la fórmula: |x| * |y| * |z|
     * 
     * @return double Volumen del cubo
     */
    public double volumen() {
        return Math.abs(x) * Math.abs(y) * Math.abs(z);
    }
}


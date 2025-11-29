/*
 * PROBLEMA 02 - HERENCIA - CLASE HIJA LIBRO VIRTUAL
 * 
 * ENUNCIADO:
 * Se tienen que almacenar una serie de datos de libros que vende una librería.
 * La empresa vende libros tanto físicos como en formato virtual.
 * 
 * Plantear las clases: Libro, LibroFisico, LibroVirtual y Empresa
 * 
 * CONCEPTO CLAVE: HERENCIA
 * - La clase LibroVirtual hereda de la clase Libro usando 'extends'
 * - Un LibroVirtual "es un" Libro (relación de herencia)
 * - Hereda automáticamente todos los atributos y métodos de Libro
 * - Añade atributos y métodos específicos de libros virtuales
 * 
 * HERENCIA:
 * - Atributos heredados: titulo, autor, editorial, numeroPaginas
 * - Métodos heredados: mostrarInfo(), getTitulo(), getAutor(), etc.
 * - Atributos propios: formato, cantidadVentas
 * - Métodos propios: descargar(), calcularPrecio()
 */

public class LibroVirtual extends Libro {
    // Atributos específicos de la clase LibroVirtual
    private String formato; // PDF, EPUB, MOBI, etc.
    private int cantidadVentas;

    /**
     * CONSTRUCTOR - Inicializa los atributos del libro virtual
     * 
     * @param titulo Título del libro
     * @param autor Autor del libro
     * @param editorial Editorial del libro
     * @param numeroPaginas Número de páginas del libro
     * @param formato Formato del libro virtual (PDF, EPUB, etc.)
     */
    public LibroVirtual(String titulo, String autor, String editorial, int numeroPaginas, String formato) {
        super(titulo, autor, editorial, numeroPaginas); // Llama al constructor de la clase padre
        this.formato = formato;
        this.cantidadVentas = 0;
    }

    /**
     * MÉTODO DESCARGAR - Simula la descarga del libro virtual
     * 
     * FUNCIONALIDAD:
     * - Simula la descarga del libro
     * - Aumenta el contador de ventas
     * - Muestra mensaje de confirmación
     */
    public void descargar() {
        cantidadVentas++;
        System.out.println("Descargando '" + titulo + "' en formato " + formato);
        System.out.println("¡Descarga completada!");
    }

    /**
     * MÉTODO CALCULAR PRECIO - Calcula el precio del libro virtual
     * 
     * FUNCIONALIDAD:
     * - Calcula el precio basado en el número de páginas
     * - Precio base: $0.30 por página
     * - Descuento por ser digital: 20%
     * 
     * @return double Precio del libro virtual
     */
    public double calcularPrecio() {
        double precioBase = numeroPaginas * 0.30;
        return precioBase * 0.80; // 20% de descuento
    }

    /**
     * MÉTODO MOSTRAR INFO - Sobrescribe el método de la clase padre
     * 
     * FUNCIONALIDAD:
     * - Muestra información específica del libro virtual
     * - Incluye formato y cantidad de ventas
     * - Sobrescribe el comportamiento genérico de Libro
     */
    @Override
    public void mostrarInfo() {
        System.out.println("=== LIBRO VIRTUAL ===");
        super.mostrarInfo(); // Llama al método de la clase padre
        System.out.println("Formato: " + formato);
        System.out.println("Ventas: " + cantidadVentas + " descargas");
        System.out.println("Precio: $" + String.format("%.2f", calcularPrecio()));
    }

    /**
     * MÉTODO GET FORMATO - Devuelve el formato del libro
     * 
     * @return String Formato del libro virtual
     */
    public String getFormato() {
        return formato;
    }

    /**
     * MÉTODO GET CANTIDAD VENTAS - Devuelve la cantidad de ventas
     * 
     * @return int Cantidad de ventas del libro virtual
     */
    public int getCantidadVentas() {
        return cantidadVentas;
    }
}




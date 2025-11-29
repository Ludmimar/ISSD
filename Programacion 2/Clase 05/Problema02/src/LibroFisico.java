/*
 * PROBLEMA 02 - HERENCIA - CLASE HIJA LIBRO FISICO
 * 
 * ENUNCIADO:
 * Se tienen que almacenar una serie de datos de libros que vende una librería.
 * La empresa vende libros tanto físicos como en formato virtual.
 * 
 * Plantear las clases: Libro, LibroFisico, LibroVirtual y Empresa
 * 
 * CONCEPTO CLAVE: HERENCIA
 * - La clase LibroFisico hereda de la clase Libro usando 'extends'
 * - Un LibroFisico "es un" Libro (relación de herencia)
 * - Hereda automáticamente todos los atributos y métodos de Libro
 * - Añade atributos y métodos específicos de libros físicos
 * 
 * HERENCIA:
 * - Atributos heredados: titulo, autor, editorial, numeroPaginas
 * - Métodos heredados: mostrarInfo(), getTitulo(), getAutor(), etc.
 * - Atributos propios: stock, cantidadVendidos
 * - Métodos propios: vender(), verificarStock(), calcularPrecio()
 */

public class LibroFisico extends Libro {
    // Atributos específicos de la clase LibroFisico
    private int stock;
    private int cantidadVendidos;

    /**
     * CONSTRUCTOR - Inicializa los atributos del libro físico
     * 
     * @param titulo Título del libro
     * @param autor Autor del libro
     * @param editorial Editorial del libro
     * @param numeroPaginas Número de páginas del libro
     * @param stock Cantidad en stock
     */
    public LibroFisico(String titulo, String autor, String editorial, int numeroPaginas, int stock) {
        super(titulo, autor, editorial, numeroPaginas); // Llama al constructor de la clase padre
        this.stock = stock;
        this.cantidadVendidos = 0;
    }

    /**
     * MÉTODO VENDER - Vende un libro físico
     * 
     * FUNCIONALIDAD:
     * - Verifica si hay stock disponible
     * - Si hay stock, reduce el stock y aumenta las ventas
     * - Muestra mensaje de confirmación o error
     * 
     * @return boolean true si se pudo vender, false si no hay stock
     */
    public boolean vender() {
        if (stock > 0) {
            stock--;
            cantidadVendidos++;
            System.out.println("Se vendió un ejemplar de '" + titulo + "'");
            return true;
        } else {
            System.out.println("No hay stock disponible de '" + titulo + "'");
            return false;
        }
    }

    /**
     * MÉTODO VERIFICAR STOCK - Verifica el stock disponible
     * 
     * FUNCIONALIDAD:
     * - Muestra la cantidad de libros disponibles en stock
     * - Indica si hay stock disponible o no
     */
    public void verificarStock() {
        System.out.println("Stock disponible de '" + titulo + "': " + stock + " ejemplares");
        if (stock == 0) {
            System.out.println("¡Sin stock!");
        }
    }

    /**
     * MÉTODO CALCULAR PRECIO - Calcula el precio del libro físico
     * 
     * FUNCIONALIDAD:
     * - Calcula el precio basado en el número de páginas
     * - Precio base: $0.50 por página
     * - Añade costo de impresión: $5.00
     * 
     * @return double Precio del libro físico
     */
    public double calcularPrecio() {
        return (numeroPaginas * 0.50) + 5.00;
    }

    /**
     * MÉTODO MOSTRAR INFO - Sobrescribe el método de la clase padre
     * 
     * FUNCIONALIDAD:
     * - Muestra información específica del libro físico
     * - Incluye stock y cantidad vendida
     * - Sobrescribe el comportamiento genérico de Libro
     */
    @Override
    public void mostrarInfo() {
        System.out.println("=== LIBRO FÍSICO ===");
        super.mostrarInfo(); // Llama al método de la clase padre
        System.out.println("Stock: " + stock + " ejemplares");
        System.out.println("Vendidos: " + cantidadVendidos + " ejemplares");
        System.out.println("Precio: $" + String.format("%.2f", calcularPrecio()));
    }

    /**
     * MÉTODO GET STOCK - Devuelve el stock disponible
     * 
     * @return int Stock disponible
     */
    public int getStock() {
        return stock;
    }

    /**
     * MÉTODO GET CANTIDAD VENDIDOS - Devuelve la cantidad vendida
     * 
     * @return int Cantidad de libros vendidos
     */
    public int getCantidadVendidos() {
        return cantidadVendidos;
    }
}




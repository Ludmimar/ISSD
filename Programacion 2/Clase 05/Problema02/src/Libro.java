/*
 * PROBLEMA 02 - HERENCIA - CLASE PADRE LIBRO
 * 
 * ENUNCIADO:
 * Se tienen que almacenar una serie de datos de libros que vende una librería.
 * La empresa vende libros tanto físicos como en formato virtual.
 * 
 * Plantear las clases: Libro, LibroFisico, LibroVirtual y Empresa
 * 
 * CONCEPTO CLAVE: HERENCIA
 * - La clase Libro es la clase padre (superclase)
 * - Las clases LibroFisico y LibroVirtual heredan de Libro
 * - Un LibroFisico "es un" Libro, un LibroVirtual "es un" Libro
 * - Los atributos y métodos comunes se definen en Libro
 * 
 * ATRIBUTOS PROTEGIDOS (accesibles por las subclases):
 * - titulo: String (título del libro)
 * - autor: String (autor del libro)
 * - editorial: String (editorial del libro)
 * - numeroPaginas: int (número de páginas)
 * 
 * MÉTODOS:
 * - constructor: inicializa los atributos
 * - mostrarInfo: muestra información básica del libro
 * - calcularPrecio: método abstracto para calcular precio
 */

public class Libro {
    // Atributos protegidos para que las subclases puedan acceder
    protected String titulo;
    protected String autor;
    protected String editorial;
    protected int numeroPaginas;

    /**
     * CONSTRUCTOR - Inicializa los atributos del libro
     * 
     * @param titulo Título del libro
     * @param autor Autor del libro
     * @param editorial Editorial del libro
     * @param numeroPaginas Número de páginas del libro
     */
    public Libro(String titulo, String autor, String editorial, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.numeroPaginas = numeroPaginas;
    }

    /**
     * MÉTODO MOSTRAR INFO - Muestra información básica del libro
     * 
     * FUNCIONALIDAD:
     * - Imprime el título, autor, editorial y número de páginas
     * - Método común para todos los libros
     */
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editorial: " + editorial);
        System.out.println("Páginas: " + numeroPaginas);
    }

    /**
     * MÉTODO GET TITULO - Devuelve el título del libro
     * 
     * @return String Título del libro
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * MÉTODO GET AUTOR - Devuelve el autor del libro
     * 
     * @return String Autor del libro
     */
    public String getAutor() {
        return autor;
    }

    /**
     * MÉTODO GET EDITORIAL - Devuelve la editorial del libro
     * 
     * @return String Editorial del libro
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * MÉTODO GET NUMERO PAGINAS - Devuelve el número de páginas
     * 
     * @return int Número de páginas del libro
     */
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
}


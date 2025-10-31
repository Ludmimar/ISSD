/*
 * PROBLEMA 02 - COMPOSICIÓN - CLASE EMPRESA
 * 
 * ENUNCIADO:
 * Se tienen que almacenar una serie de datos de libros que vende una librería.
 * La empresa vende libros tanto físicos como en formato virtual.
 * 
 * Plantear las clases: Libro, LibroFisico, LibroVirtual y Empresa
 * 
 * CONCEPTO CLAVE: COMPOSICIÓN
 * - La clase Empresa tiene una relación de composición con las clases Libro
 * - La Empresa "tiene" objetos de las clases LibroFisico y LibroVirtual
 * - Esta es la clase principal que contiene el método main
 * - Gestiona el inventario de libros físicos y virtuales
 * 
 * ATRIBUTOS:
 * - librosFisicos: array de objetos LibroFisico
 * - librosVirtuales: array de objetos LibroVirtual
 * - cantidadFisicos: contador de libros físicos
 * - cantidadVirtuales: contador de libros virtuales
 * 
 * MÉTODOS:
 * - constructor: inicializa los arrays
 * - agregarLibroFisico: añade un libro físico al inventario
 * - agregarLibroVirtual: añade un libro virtual al inventario
 * - mostrarInventario: muestra todo el inventario
 * - calcularTotalVentas: calcula el total de ventas
 * - main: método principal que ejecuta el programa
 */

public class Empresa {
    // Atributos de tipo Libro - RELACIÓN DE COMPOSICIÓN
    private LibroFisico[] librosFisicos;
    private LibroVirtual[] librosVirtuales;
    private int cantidadFisicos;
    private int cantidadVirtuales;
    private static final int MAX_LIBROS = 10; // Máximo de libros por tipo

    /**
     * CONSTRUCTOR - Inicializa los arrays de libros
     * 
     * FUNCIONALIDAD:
     * - Crea arrays para almacenar libros físicos y virtuales
     * - Inicializa los contadores en 0
     */
    public Empresa() {
        librosFisicos = new LibroFisico[MAX_LIBROS];
        librosVirtuales = new LibroVirtual[MAX_LIBROS];
        cantidadFisicos = 0;
        cantidadVirtuales = 0;
    }

    /**
     * MÉTODO AGREGAR LIBRO FISICO - Añade un libro físico al inventario
     * 
     * @param libro Libro físico a agregar
     * @return boolean true si se pudo agregar, false si el inventario está lleno
     */
    public boolean agregarLibroFisico(LibroFisico libro) {
        if (cantidadFisicos < MAX_LIBROS) {
            librosFisicos[cantidadFisicos] = libro;
            cantidadFisicos++;
            System.out.println("Libro físico agregado al inventario: " + libro.getTitulo());
            return true;
        } else {
            System.out.println("No se puede agregar más libros físicos. Inventario lleno.");
            return false;
        }
    }

    /**
     * MÉTODO AGREGAR LIBRO VIRTUAL - Añade un libro virtual al inventario
     * 
     * @param libro Libro virtual a agregar
     * @return boolean true si se pudo agregar, false si el inventario está lleno
     */
    public boolean agregarLibroVirtual(LibroVirtual libro) {
        if (cantidadVirtuales < MAX_LIBROS) {
            librosVirtuales[cantidadVirtuales] = libro;
            cantidadVirtuales++;
            System.out.println("Libro virtual agregado al inventario: " + libro.getTitulo());
            return true;
        } else {
            System.out.println("No se puede agregar más libros virtuales. Inventario lleno.");
            return false;
        }
    }

    /**
     * MÉTODO MOSTRAR INVENTARIO - Muestra todo el inventario de la empresa
     * 
     * FUNCIONALIDAD:
     * - Muestra todos los libros físicos
     * - Muestra todos los libros virtuales
     * - Proporciona estadísticas del inventario
     */
    public void mostrarInventario() {
        System.out.println("=== INVENTARIO DE LA EMPRESA ===");
        
        System.out.println("\n--- LIBROS FÍSICOS ---");
        if (cantidadFisicos == 0) {
            System.out.println("No hay libros físicos en el inventario.");
        } else {
            for (int i = 0; i < cantidadFisicos; i++) {
                librosFisicos[i].mostrarInfo();
                System.out.println();
            }
        }
        
        System.out.println("--- LIBROS VIRTUALES ---");
        if (cantidadVirtuales == 0) {
            System.out.println("No hay libros virtuales en el inventario.");
        } else {
            for (int i = 0; i < cantidadVirtuales; i++) {
                librosVirtuales[i].mostrarInfo();
                System.out.println();
            }
        }
        
        // Mostrar estadísticas
        System.out.println("=== ESTADÍSTICAS ===");
        System.out.println("Total de libros físicos: " + cantidadFisicos);
        System.out.println("Total de libros virtuales: " + cantidadVirtuales);
        System.out.println("Total de libros: " + (cantidadFisicos + cantidadVirtuales));
    }

    /**
     * MÉTODO CALCULAR TOTAL VENTAS - Calcula el total de ventas de la empresa
     * 
     * FUNCIONALIDAD:
     * - Suma las ventas de todos los libros físicos
     * - Suma las ventas de todos los libros virtuales
     * - Muestra el total de ventas
     */
    public void calcularTotalVentas() {
        int totalVentasFisicos = 0;
        int totalVentasVirtuales = 0;
        
        // Sumar ventas de libros físicos
        for (int i = 0; i < cantidadFisicos; i++) {
            totalVentasFisicos += librosFisicos[i].getCantidadVendidos();
        }
        
        // Sumar ventas de libros virtuales
        for (int i = 0; i < cantidadVirtuales; i++) {
            totalVentasVirtuales += librosVirtuales[i].getCantidadVentas();
        }
        
        System.out.println("=== TOTAL DE VENTAS ===");
        System.out.println("Ventas de libros físicos: " + totalVentasFisicos);
        System.out.println("Ventas de libros virtuales: " + totalVentasVirtuales);
        System.out.println("Total de ventas: " + (totalVentasFisicos + totalVentasVirtuales));
    }

    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Demuestra el uso de composición con diferentes tipos de libros
     * - Crea una empresa y agrega libros al inventario
     * - Muestra el inventario y estadísticas
     * - Simula algunas ventas
     */
    public static void main(String[] args) {
        // Crear la empresa
        Empresa empresa = new Empresa();
        
        // Crear libros físicos
        LibroFisico libro1 = new LibroFisico("El Quijote", "Miguel de Cervantes", "Editorial Planeta", 500, 10);
        LibroFisico libro2 = new LibroFisico("Cien años de soledad", "Gabriel García Márquez", "Editorial Sudamericana", 400, 5);
        
        // Crear libros virtuales
        LibroVirtual libro3 = new LibroVirtual("1984", "George Orwell", "Editorial Seix Barral", 300, "PDF");
        LibroVirtual libro4 = new LibroVirtual("El Principito", "Antoine de Saint-Exupéry", "Editorial Salamandra", 100, "EPUB");
        
        // Agregar libros al inventario
        empresa.agregarLibroFisico(libro1);
        empresa.agregarLibroFisico(libro2);
        empresa.agregarLibroVirtual(libro3);
        empresa.agregarLibroVirtual(libro4);
        
        System.out.println(); // Línea en blanco para separar
        
        // Mostrar inventario
        empresa.mostrarInventario();
        
        System.out.println(); // Línea en blanco para separar
        
        // Simular algunas ventas
        System.out.println("=== SIMULANDO VENTAS ===");
        libro1.vender();
        libro1.vender();
        libro2.vender();
        libro3.descargar();
        libro4.descargar();
        libro4.descargar();
        
        System.out.println(); // Línea en blanco para separar
        
        // Mostrar total de ventas
        empresa.calcularTotalVentas();
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. COMPOSICIÓN:
         *    - La empresa tiene objetos de las clases LibroFisico y LibroVirtual
         *    - La empresa "tiene" libros, no "es un" libro
         *    - Esto es una relación de composición, no de herencia
         * 
         * 2. HERENCIA:
         *    - LibroFisico y LibroVirtual heredan de Libro
         *    - Comparten atributos y métodos comunes
         *    - Cada uno tiene sus propias características específicas
         * 
         * 3. POLIMORFISMO:
         *    - Los objetos pueden ser tratados como Libros
         *    - El mismo método puede tener diferentes comportamientos
         *    - Esto hace el código más flexible y extensible
         * 
         * 4. GESTIÓN DE INVENTARIO:
         *    - La empresa gestiona tanto libros físicos como virtuales
         *    - Proporciona métodos para agregar, mostrar y calcular ventas
         *    - Mantiene estadísticas del inventario
         * 
         * 5. REUTILIZACIÓN DE CÓDIGO:
         *    - Los métodos comunes se definen en la clase Libro
         *    - Las clases hijas solo implementan lo específico
         *    - Esto reduce la duplicación de código
         */
    }
}


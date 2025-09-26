/*
 * PROBLEMA 03 - HERENCIA - CLASE PRUEBA PUNTOS
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
 * - Esta clase demuestra el uso de la herencia
 * - Crea objetos de las clases Punto2D y Punto3D
 * - Demuestra polimorfismo: mismo comportamiento, diferente implementación
 * - Muestra cómo las clases hijas extienden la funcionalidad de las clases padre
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crea objetos Punto2D y Punto3D
 * 2. Demuestra métodos heredados y propios
 * 3. Muestra sobrescritura de métodos
 * 4. Demuestra cálculos de distancia
 */

public class PruebaPuntos {

    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Demuestra el uso de herencia con las clases Punto2D y Punto3D
     * - Cada objeto utiliza métodos heredados y propios
     * - Muestra el polimorfismo: mismo comportamiento, diferente implementación
     * - Demuestra cálculos de distancia y volumen
     */
    public static void main(String[] args) {
        // === OBJETOS DE LA CLASE PUNTO2D ===
        System.out.println("=== PUNTOS 2D ===");
        Punto2D punto1 = new Punto2D(3, 4);
        Punto2D punto2 = new Punto2D(6, 8);
        
        punto1.mostrar();
        System.out.println("Distancia desde el origen: " + String.format("%.2f", punto1.distancia()));
        System.out.println("Distancia a punto2: " + String.format("%.2f", punto1.distanciaA(punto2)));
        
        System.out.println(); // Línea en blanco para separar
        
        // === OBJETOS DE LA CLASE PUNTO3D ===
        System.out.println("=== PUNTOS 3D ===");
        Punto3D punto3 = new Punto3D(3, 4, 5);
        Punto3D punto4 = new Punto3D(6, 8, 10);
        
        punto3.mostrar();
        System.out.println("Distancia desde el origen: " + String.format("%.2f", punto3.distancia()));
        System.out.println("Distancia a punto4: " + String.format("%.2f", punto3.distanciaA(punto4)));
        System.out.println("Volumen del cubo: " + String.format("%.2f", punto3.volumen()));
        
        System.out.println(); // Línea en blanco para separar
        
        // === DEMOSTRACIÓN DE POLIMORFISMO ===
        System.out.println("=== DEMOSTRACIÓN DE POLIMORFISMO ===");
        
        // Crear array de Punto2D (polimorfismo)
        Punto2D[] puntos = {
            new Punto2D(1, 2),
            new Punto3D(1, 2, 3),
            new Punto2D(4, 5),
            new Punto3D(4, 5, 6)
        };
        
        // Iterar sobre el array y mostrar información
        for (int i = 0; i < puntos.length; i++) {
            System.out.print("Punto " + (i + 1) + ": ");
            puntos[i].mostrar(); // Polimorfismo: cada uno muestra su información específica
            System.out.println("Distancia desde el origen: " + String.format("%.2f", puntos[i].distancia()));
            System.out.println();
        }
        
        // === DEMOSTRACIÓN DE HERENCIA ===
        System.out.println("=== DEMOSTRACIÓN DE HERENCIA ===");
        
        Punto3D punto5 = new Punto3D(2, 3, 4);
        
        // Usar métodos heredados
        System.out.println("Coordenada X (heredada): " + punto5.getX());
        System.out.println("Coordenada Y (heredada): " + punto5.getY());
        System.out.println("Coordenada Z (propia): " + punto5.getZ());
        
        // Modificar coordenadas usando métodos heredados y propios
        punto5.setX(10); // Método heredado
        punto5.setY(20); // Método heredado
        punto5.setZ(30); // Método propio
        
        System.out.println("Después de modificar:");
        punto5.mostrar();
        
        // === DEMOSTRACIÓN DE DISTANCIAS MIXTAS ===
        System.out.println("\n=== DISTANCIAS MIXTAS ===");
        
        Punto2D punto2D = new Punto2D(1, 2);
        Punto3D punto3D = new Punto3D(1, 2, 3);
        
        System.out.println("Distancia de Punto3D a Punto2D: " + String.format("%.2f", punto3D.distanciaA(punto2D)));
        System.out.println("Distancia de Punto2D a Punto3D: " + String.format("%.2f", punto2D.distanciaA(punto3D)));
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. HERENCIA:
         *    - Punto3D hereda automáticamente todos los atributos y métodos de Punto2D
         *    - Un Punto3D "es un" Punto2D con una coordenada adicional
         *    - No necesita redefinir funcionalidad básica de Punto2D
         * 
         * 2. SOBRESCRITURA DE MÉTODOS:
         *    - Punto3D sobrescribe mostrar() y distancia() para incluir la coordenada z
         *    - Cada método proporciona su propia implementación específica
         *    - Mantiene la misma interfaz pero con comportamiento diferente
         * 
         * 3. POLIMORFISMO:
         *    - Los objetos Punto3D pueden ser tratados como Punto2D
         *    - El mismo método puede tener diferentes comportamientos
         *    - Esto hace el código más flexible y extensible
         * 
         * 4. REUTILIZACIÓN DE CÓDIGO:
         *    - Los métodos comunes se definen una sola vez en Punto2D
         *    - Punto3D solo implementa lo específico de puntos 3D
         *    - Esto reduce la duplicación de código y facilita el mantenimiento
         * 
         * 5. EXTENSIBILIDAD:
         *    - Fácil agregar nuevas clases que hereden de Punto2D
         *    - Cada nueva clase puede tener sus propios atributos y métodos
         *    - Mantiene la consistencia en el comportamiento básico
         * 
         * 6. ENCAPSULACIÓN:
         *    - Los atributos específicos (z) son privados
         *    - Solo las clases que los definen pueden acceder a ellos
         *    - Esto mantiene la integridad de los datos
         */
    }
}

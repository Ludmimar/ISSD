/**
 * Ejercicio 14 - Clase de prueba para Persona con atributos estáticos
 * Clase de prueba que demuestra el uso de atributos estáticos
 */
public class PruebaPersona {

    public static void main(String[] args) {
        System.out.println("Valor del atributo estático cantidad:" + Persona.cantidad);
        Persona per1 = new Persona("Juan", 30);
        per1.imprimir();
        System.out.println("Valor del atributo estático cantidad:" + Persona.cantidad);
        Persona per2 = new Persona("Ana", 20);
        per2.imprimir();
        System.out.println("Valor del atributo estático cantidad:" + Persona.cantidad);
        Persona per3 = new Persona("Luis", 10);
        per3.imprimir();
        System.out.println("Valor del atributo estático cantidad:" + Persona.cantidad);
    }
}

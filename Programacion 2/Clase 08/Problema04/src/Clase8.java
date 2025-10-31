/*
 * PROBLEMA 04 - QUEUES - LISTA DE ESPERA DE BANCO
 * 
 * ENUNCIADO:
 * Tenemos una lista de espera para un banco. Se solicitará al usuario que ingrese, 
 * uno a uno, nombres de personas a ser atendidas. Una vez que se llega a 4 personas 
 * en la lista de espera, el banco atiende a dos personas, según el orden de llegada, 
 * anunciando esto con un mensaje acorde: "Es el turno de: [nombre] y [nombre]". 
 * Acto seguido, se solicita al usuario que ingrese otros dos nombres, y se atiende 
 * a las dos personas que siguen. Este comportamiento se repetirá hasta que el banco 
 * haya atendido a 10 personas. Utilizar una estructura queue para resolver este problema.
 * 
 * CONCEPTO CLAVE: QUEUES - LISTA DE ESPERA (FIFO)
 * - Queue perfecto para modelar filas de espera
 * - Atender en orden de llegada (primero en llegar, primero en ser atendido)
 * - offer() para agregar, poll() para atender
 * 
 * FLUJO DE EJECUCIÓN:
 * 1. Crear Queue para lista de espera
 * 2. Pedir nombres hasta tener 4 personas
 * 3. Atender 2 personas (poll 2 veces)
 * 4. Pedir 2 nombres más
 * 5. Repetir hasta atender 10 personas
 */

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Clase8 {
    /**
     * MÉTODO MAIN - Punto de entrada del programa
     * 
     * FUNCIONALIDAD:
     * - Simula lista de espera de banco
     * - Atiende en orden FIFO
     * - Continúa hasta atender 10 personas
     */
    public static void main(String[] args) {
        // Crear Scanner para entrada de datos
        Scanner teclado = new Scanner(System.in);
        
        // Crear Queue para la lista de espera
        // FIFO: primero en llegar, primero en ser atendido
        Queue<String> listaEspera = new LinkedList<>();
        
        int personasAtendidas = 0;
        final int TOTAL_A_ATENDER = 10;
        
        System.out.println("=== BANCO - LISTA DE ESPERA ===\n");
        
        // Ciclo principal: continuar hasta atender 10 personas
        while (personasAtendidas < TOTAL_A_ATENDER) {
            // Pedir nombres hasta tener 4 personas en la lista
            System.out.println("--- Agregando personas a la lista de espera ---");
            while (listaEspera.size() < 4 && personasAtendidas < TOTAL_A_ATENDER) {
                System.out.print("Ingrese nombre de persona a la lista: ");
                String nombre = teclado.nextLine();
                listaEspera.offer(nombre);
                System.out.println("Personas en espera: " + listaEspera.size());
            }
            
            // Si hay al menos 2 personas, atender 2
            if (listaEspera.size() >= 2) {
                // Atender 2 personas según orden de llegada (FIFO)
                String persona1 = listaEspera.poll();
                String persona2 = listaEspera.poll();
                personasAtendidas += 2;
                
                System.out.println("\nEs el turno de: " + persona1 + " y " + persona2);
                System.out.println("Personas atendidas hasta ahora: " + personasAtendidas);
                System.out.println("Personas restantes en espera: " + listaEspera.size());
                System.out.println();
                
                // Si aún no se han atendido 10 personas, pedir 2 nombres más
                if (personasAtendidas < TOTAL_A_ATENDER) {
                    System.out.println("--- Ingrese 2 nombres más ---");
                    for (int i = 0; i < 2; i++) {
                        System.out.print("Nombre " + (i + 1) + ": ");
                        String nombre = teclado.nextLine();
                        listaEspera.offer(nombre);
                    }
                    System.out.println();
                }
            }
        }
        
        System.out.println("=== FINALIZADO ===");
        System.out.println("Total de personas atendidas: " + personasAtendidas);
        System.out.println("Personas restantes en espera: " + listaEspera.size());
        
        /*
         * OBSERVACIONES IMPORTANTES:
         * 
         * 1. PRINCIPIO FIFO:
         *    - Las personas se atienden en orden de llegada
         *    - poll() siempre elimina el primer elemento (el que llegó primero)
         *    - Perfecto para filas y listas de espera
         * 
         * 2. LÓGICA:
         *    - Acumular hasta 4 personas
         *    - Atender 2 (las primeras en llegar)
         *    - Agregar 2 nuevas
         *    - Repetir
         * 
         * 3. CONDICIONES:
         *    - Verificar tamaño >= 2 antes de atender
         *    - Verificar personasAtendidas < 10 antes de continuar
         *    - Controlar el ciclo para no exceder el límite
         */
    }
}


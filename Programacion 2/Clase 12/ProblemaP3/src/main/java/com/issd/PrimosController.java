package com.issd;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador REST para filtrar números primos.
 * 
 * Este controlador recibe una lista de números separados por coma
 * y devuelve solo los números primos de esa lista.
 * 
 * <p>BONUS: Utiliza programación concurrente para verificar
 * la primalidad de múltiples números en paralelo.</p>
 * 
 * @author Ludmila Martos
 * @version 1.0.0
 */
@RestController
public class PrimosController {
    
    /**
     * Endpoint que filtra los números primos de una lista.
     * 
     * <p>Ejemplo de uso:</p>
     * <pre>
     * GET /filtrar?numeros=1,2,3,5,8,13,21,34,55,89
     * Resultado: 2,3,5,13,89
     * </pre>
     * 
     * @param numeros String con números separados por coma
     * @return String con los números primos encontrados, separados por coma
     */
    @GetMapping("/filtrar")
    public String filtrarPrimos(@RequestParam("numeros") String numeros) {
        
        // Parsear los números de entrada
        String[] partes = numeros.split(",");
        List<Integer> numerosEntrada = new ArrayList<>();
        
        for (String parte : partes) {
            try {
                int num = Integer.parseInt(parte.trim());
                numerosEntrada.add(num);
            } catch (NumberFormatException e) {
                // Ignorar valores no numéricos
            }
        }
        
        if (numerosEntrada.isEmpty()) {
            return "Error: No se encontraron números válidos";
        }
        
        // Lista thread-safe para almacenar los primos encontrados
        List<Integer> primosEncontrados = new CopyOnWriteArrayList<>();
        
        // BONUS: Usar multi-threading para verificar primos en paralelo
        List<Thread> hilos = new ArrayList<>();
        
        for (Integer numero : numerosEntrada) {
            Thread hilo = new Thread(new VerificadorPrimo(numero, primosEncontrados));
            hilos.add(hilo);
            hilo.start();
        }
        
        // Esperar a que todos los hilos terminen
        for (Thread hilo : hilos) {
            try {
                hilo.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        // Ordenar los primos encontrados
        primosEncontrados.sort(Integer::compareTo);
        
        // Convertir a String separado por comas
        if (primosEncontrados.isEmpty()) {
            return "No se encontraron números primos en la lista";
        }
        
        return primosEncontrados.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(","));
    }
    
    /**
     * Endpoint raíz con información del servicio.
     * 
     * @return Información del servicio
     */
    @GetMapping("/")
    public String inicio() {
        return """
            🔢 Filtrador de Números Primos - API REST
            
            Endpoint disponible:
            GET /filtrar?numeros=1,2,3,5,8,13,21
            
            Respuesta: 2,3,5,13 (solo los primos de la lista)
            
            Abre el archivo index.html para usar la interfaz gráfica.
            """;
    }
    
    /**
     * Clase Runnable que verifica si un número es primo.
     * Si es primo, lo agrega a la lista compartida.
     */
    private static class VerificadorPrimo implements Runnable {
        
        private int numero;
        private List<Integer> listaPrimos;
        
        /**
         * Constructor del verificador.
         * 
         * @param numero El número a verificar
         * @param listaPrimos Lista donde agregar si es primo
         */
        public VerificadorPrimo(int numero, List<Integer> listaPrimos) {
            this.numero = numero;
            this.listaPrimos = listaPrimos;
        }
        
        @Override
        public void run() {
            if (esPrimo(numero)) {
                listaPrimos.add(numero);
            }
        }
        
        /**
         * Determina si un número es primo.
         * 
         * @param n El número a verificar
         * @return true si es primo, false en caso contrario
         */
        private boolean esPrimo(int n) {
            if (n < 2) return false;
            if (n == 2) return true;
            if (n % 2 == 0) return false;
            
            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                if (n % i == 0) return false;
            }
            
            return true;
        }
    }
}


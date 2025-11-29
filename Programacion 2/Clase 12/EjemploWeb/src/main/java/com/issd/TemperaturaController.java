package com.issd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador REST para conversión de temperaturas.
 * 
 * Este controlador expone un endpoint para convertir temperaturas
 * de grados Celsius a grados Fahrenheit.
 * 
 * @author Ludmila Martos
 * @version 1.0.0
 */
@RestController
public class TemperaturaController {
    
    /**
     * Endpoint que convierte una temperatura de Celsius a Fahrenheit.
     * 
     * <p>Fórmula: F = (C × 9/5) + 32</p>
     * 
     * URL: http://localhost:8080/transformar?temp=30
     * 
     * @param temp La temperatura en grados Celsius
     * @return String con la temperatura en Fahrenheit
     */
    @GetMapping("/transformar")
    public String transformarTemperatura(@RequestParam("temp") double temp) {
        double fahrenheit = (temp * 9.0 / 5.0) + 32;
        return String.format("%.2f °F", fahrenheit);
    }
    
    /**
     * Endpoint que convierte una temperatura de Fahrenheit a Celsius.
     * 
     * <p>Fórmula: C = (F - 32) × 5/9</p>
     * 
     * URL: http://localhost:8080/transformar-celsius?temp=86
     * 
     * @param temp La temperatura en grados Fahrenheit
     * @return String con la temperatura en Celsius
     */
    @GetMapping("/transformar-celsius")
    public String transformarACelsius(@RequestParam("temp") double temp) {
        double celsius = (temp - 32) * 5.0 / 9.0;
        return String.format("%.2f °C", celsius);
    }
    
    /**
     * Endpoint raíz que muestra información del servicio.
     * 
     * URL: http://localhost:8080/
     * 
     * @return Mensaje de bienvenida con instrucciones
     */
    @GetMapping("/")
    public String inicio() {
        return """
            🌡️ Conversor de Temperatura - API REST
            
            Endpoints disponibles:
            - GET /transformar?temp=30 → Convierte Celsius a Fahrenheit
            - GET /transformar-celsius?temp=86 → Convierte Fahrenheit a Celsius
            
            Abre el archivo index.html para usar la interfaz gráfica.
            """;
    }
}


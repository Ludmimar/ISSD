package com.issd;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador REST para el Problema Propuesto 2
 * 
 * Este controlador recibe un número por parámetro URL y devuelve
 * todos los números primos entre 2 y dicho número, separados por comas.
 * 
 * Uso: http://localhost:8080/primos?numero=20
 * Resultado: 2,3,5,7,11,13,17,19
 * 
 * @author Ludmila Martos
 * @version 1.0.0
 */
@RestController
public class PrimosController {

    /**
     * Endpoint raíz que muestra un formulario para calcular primos
     * URL: http://localhost:8080/
     * 
     * @return String con formulario HTML interactivo
     */
    @GetMapping("/")
    public String hello() {
        return """
            <!DOCTYPE html>
            <html>
            <head>
                <title>Problema P2 - Números Primos</title>
                <style>
                    body {
                        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                        display: flex;
                        justify-content: center;
                        align-items: center;
                        height: 100vh;
                        margin: 0;
                        background: linear-gradient(135deg, #4facfe 0%, #00f2fe 100%);
                    }
                    .container {
                        background: white;
                        padding: 40px;
                        border-radius: 20px;
                        box-shadow: 0 20px 60px rgba(0,0,0,0.3);
                        text-align: center;
                        max-width: 500px;
                    }
                    h1 { color: #333; margin-bottom: 20px; }
                    input[type="number"] {
                        width: 100%;
                        padding: 15px;
                        margin: 15px 0;
                        border: 2px solid #ddd;
                        border-radius: 10px;
                        font-size: 18px;
                        box-sizing: border-box;
                        text-align: center;
                    }
                    input[type="number"]:focus {
                        outline: none;
                        border-color: #4facfe;
                    }
                    button {
                        padding: 15px 30px;
                        background: linear-gradient(135deg, #4facfe 0%, #00f2fe 100%);
                        color: white;
                        border: none;
                        border-radius: 10px;
                        cursor: pointer;
                        font-size: 16px;
                        font-weight: bold;
                        width: 100%;
                    }
                    button:hover { opacity: 0.9; }
                    .info {
                        margin-top: 30px;
                        padding: 20px;
                        background: #f8f9fa;
                        border-radius: 10px;
                        text-align: left;
                        font-size: 14px;
                    }
                    .info code {
                        background: #e9ecef;
                        padding: 2px 6px;
                        border-radius: 4px;
                    }
                </style>
            </head>
            <body>
                <div class="container">
                    <h1>🔢 Calculadora de Números Primos</h1>
                    <p>Problema Propuesto 2 - Clase 11</p>
                    <form action="/primos" method="GET">
                        <input type="number" name="numero" min="2" max="10000" 
                               placeholder="Ingresa un número" required>
                        <button type="submit">CALCULAR PRIMOS</button>
                    </form>
                    <div class="info">
                        <strong>¿Qué hace?</strong><br>
                        Devuelve todos los números primos entre 2 y el número ingresado.<br><br>
                        <strong>Ejemplo:</strong><br>
                        <code>/primos?numero=20</code> → 2,3,5,7,11,13,17,19
                    </div>
                </div>
            </body>
            </html>
            """;
    }

    /**
     * Endpoint que calcula y devuelve los números primos hasta N
     * URL: http://localhost:8080/primos?numero=N
     * 
     * @param numero El límite superior para calcular primos
     * @return String con los números primos separados por comas
     */
    @GetMapping("/primos")
    public String calcularPrimos(@RequestParam("numero") int numero) {
        
        // Validar que el número sea mayor o igual a 2
        if (numero < 2) {
            return """
                <!DOCTYPE html>
                <html>
                <head>
                    <title>Error - Números Primos</title>
                    <style>
                        body {
                            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                            display: flex;
                            justify-content: center;
                            align-items: center;
                            height: 100vh;
                            margin: 0;
                            background: linear-gradient(135deg, #ff6b6b 0%, #feca57 100%);
                        }
                        .card {
                            background: white;
                            padding: 50px;
                            border-radius: 20px;
                            box-shadow: 0 20px 60px rgba(0,0,0,0.3);
                            text-align: center;
                        }
                        h2 { color: #ff6b6b; }
                        a {
                            display: inline-block;
                            margin-top: 20px;
                            padding: 15px 30px;
                            background: linear-gradient(135deg, #4facfe 0%, #00f2fe 100%);
                            color: white;
                            text-decoration: none;
                            border-radius: 10px;
                            font-weight: bold;
                        }
                    </style>
                </head>
                <body>
                    <div class="card">
                        <h2>⚠️ Error</h2>
                        <p>El número debe ser mayor o igual a 2</p>
                        <a href="/">← Volver</a>
                    </div>
                </body>
                </html>
                """;
        }
        
        // Calcular los números primos
        List<Integer> primos = calcularNumerosPrimos(numero);
        
        // Convertir la lista a String separado por comas
        String primosString = primos.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(","));
        
        return """
            <!DOCTYPE html>
            <html>
            <head>
                <title>Resultado - Números Primos</title>
                <style>
                    body {
                        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                        display: flex;
                        justify-content: center;
                        align-items: center;
                        min-height: 100vh;
                        margin: 0;
                        padding: 20px;
                        background: linear-gradient(135deg, #4facfe 0%, #00f2fe 100%);
                        box-sizing: border-box;
                    }
                    .card {
                        background: white;
                        padding: 50px;
                        border-radius: 20px;
                        box-shadow: 0 20px 60px rgba(0,0,0,0.3);
                        text-align: center;
                        max-width: 800px;
                        width: 100%;
                    }
                    h2 { color: #333; margin-bottom: 10px; }
                    .stats {
                        display: flex;
                        justify-content: center;
                        gap: 30px;
                        margin: 20px 0;
                    }
                    .stat {
                        padding: 20px;
                        background: #f8f9fa;
                        border-radius: 10px;
                    }
                    .stat-number {
                        font-size: 36px;
                        font-weight: bold;
                        color: #4facfe;
                    }
                    .stat-label {
                        font-size: 14px;
                        color: #666;
                    }
                    .resultado {
                        font-size: 18px;
                        color: #333;
                        margin: 30px 0;
                        padding: 20px;
                        background: #f8f9fa;
                        border-radius: 10px;
                        word-wrap: break-word;
                        line-height: 1.8;
                    }
                    .resultado-simple {
                        font-family: 'Courier New', monospace;
                        font-size: 16px;
                        background: #2d3436;
                        color: #00f2fe;
                        padding: 20px;
                        border-radius: 10px;
                        word-wrap: break-word;
                    }
                    a {
                        display: inline-block;
                        margin-top: 20px;
                        padding: 15px 30px;
                        background: linear-gradient(135deg, #4facfe 0%, #00f2fe 100%);
                        color: white;
                        text-decoration: none;
                        border-radius: 10px;
                        font-weight: bold;
                    }
                    a:hover { opacity: 0.9; }
                </style>
            </head>
            <body>
                <div class="card">
                    <h2>✨ Números Primos Calculados</h2>
                    <div class="stats">
                        <div class="stat">
                            <div class="stat-number">%d</div>
                            <div class="stat-label">Número límite</div>
                        </div>
                        <div class="stat">
                            <div class="stat-number">%d</div>
                            <div class="stat-label">Primos encontrados</div>
                        </div>
                    </div>
                    <p><strong>Resultado (formato solicitado):</strong></p>
                    <div class="resultado-simple">%s</div>
                    <a href="/">← Calcular otro número</a>
                </div>
            </body>
            </html>
            """.formatted(numero, primos.size(), primosString);
    }
    
    /**
     * Calcula todos los números primos hasta n usando el algoritmo básico
     * 
     * @param n El límite superior
     * @return Lista de números primos
     */
    private List<Integer> calcularNumerosPrimos(int n) {
        List<Integer> primos = new ArrayList<>();
        
        for (int i = 2; i <= n; i++) {
            if (esPrimo(i)) {
                primos.add(i);
            }
        }
        
        return primos;
    }
    
    /**
     * Determina si un número es primo
     * 
     * Un número es primo si solo es divisible por 1 y por sí mismo.
     * 
     * @param numero El número a verificar
     * @return true si es primo, false en caso contrario
     */
    private boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        
        // Solo necesitamos verificar hasta la raíz cuadrada
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}



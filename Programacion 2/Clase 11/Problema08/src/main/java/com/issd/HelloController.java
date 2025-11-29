package com.issd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador REST para el Problema 8
 * 
 * Este controlador implementa un contador de visitas que se incrementa
 * cada vez que se accede a la URL /contar
 * 
 * @author Ludmila Martos
 * @version 1.0.0
 */
@RestController
public class HelloController {

    // Variable para almacenar el contador de visitas
    private int cuenta = 0;

    /**
     * Endpoint raíz que muestra un mensaje de bienvenida
     * URL: http://localhost:8080/
     * 
     * @return String con mensaje de bienvenida
     */
    @GetMapping("/")
    public String hello() {
        return """
            <!DOCTYPE html>
            <html>
            <head>
                <title>Problema 8 - Contador de Visitas</title>
                <style>
                    body {
                        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                        display: flex;
                        justify-content: center;
                        align-items: center;
                        height: 100vh;
                        margin: 0;
                        background: linear-gradient(135deg, #11998e 0%, #38ef7d 100%);
                    }
                    .container {
                        background: white;
                        padding: 40px;
                        border-radius: 20px;
                        box-shadow: 0 20px 60px rgba(0,0,0,0.3);
                        text-align: center;
                    }
                    h1 { color: #333; }
                    a {
                        display: inline-block;
                        margin-top: 20px;
                        padding: 15px 30px;
                        background: linear-gradient(135deg, #11998e 0%, #38ef7d 100%);
                        color: white;
                        text-decoration: none;
                        border-radius: 10px;
                        font-weight: bold;
                    }
                    a:hover { opacity: 0.9; }
                </style>
            </head>
            <body>
                <div class="container">
                    <h1>📊 Contador de Visitas</h1>
                    <p>Problema 8 - Clase 11</p>
                    <a href="/contar">Ir al contador</a>
                </div>
            </body>
            </html>
            """;
    }

    /**
     * Endpoint que cuenta las visitas
     * URL: http://localhost:8080/contar
     * 
     * Cada vez que se accede a esta URL, el contador se incrementa en 1.
     * Esto simula un contador de visitas de una página web.
     * 
     * @return String con el número de visitas actual
     */
    @GetMapping("/contar")
    public String contar() {
        cuenta++;
        
        return """
            <!DOCTYPE html>
            <html>
            <head>
                <title>Contador de Visitas</title>
                <style>
                    body {
                        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                        display: flex;
                        justify-content: center;
                        align-items: center;
                        height: 100vh;
                        margin: 0;
                        background: linear-gradient(135deg, #11998e 0%, #38ef7d 100%);
                    }
                    .card {
                        background: white;
                        padding: 50px;
                        border-radius: 20px;
                        box-shadow: 0 20px 60px rgba(0,0,0,0.3);
                        text-align: center;
                    }
                    .contador {
                        font-size: 80px;
                        font-weight: bold;
                        color: #11998e;
                        margin: 20px 0;
                    }
                    h2 { color: #333; margin-bottom: 10px; }
                    p { color: #666; font-size: 16px; }
                    .refresh {
                        margin-top: 30px;
                        padding: 15px 30px;
                        background: linear-gradient(135deg, #11998e 0%, #38ef7d 100%);
                        color: white;
                        border: none;
                        border-radius: 10px;
                        cursor: pointer;
                        font-size: 16px;
                        font-weight: bold;
                    }
                    .refresh:hover { opacity: 0.9; }
                </style>
            </head>
            <body>
                <div class="card">
                    <h2>🔢 Contador de Visitas</h2>
                    <div class="contador">%d</div>
                    <p>Número de veces que se ha visitado esta página</p>
                    <button class="refresh" onclick="location.reload()">
                        🔄 Refrescar (incrementar contador)
                    </button>
                </div>
            </body>
            </html>
            """.formatted(cuenta);
    }
}



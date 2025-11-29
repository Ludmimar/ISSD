package com.issd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador REST para el Problema 7
 * 
 * Este controlador responde a la URL /autor mostrando información del autor
 * y además imprime un mensaje en la consola de Java cada vez que se consulta.
 * 
 * @author Ludmila Martos
 * @version 1.0.0
 */
@RestController
public class HelloController {

    /**
     * Endpoint que muestra información del autor
     * URL: http://localhost:8080/autor
     * 
     * @return String con el nombre del autor
     */
    @GetMapping("/autor")
    public String imprimirAutor() {
        // Imprimir mensaje en la consola de Java
        System.out.println("📢 Alguien consultó la autoría de este programa");
        
        // Devolver respuesta al navegador con formato HTML
        return """
            <!DOCTYPE html>
            <html>
            <head>
                <title>Autor del Programa</title>
                <style>
                    body {
                        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                        display: flex;
                        justify-content: center;
                        align-items: center;
                        height: 100vh;
                        margin: 0;
                        background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
                    }
                    .card {
                        background: white;
                        padding: 40px;
                        border-radius: 20px;
                        box-shadow: 0 20px 60px rgba(0,0,0,0.3);
                        text-align: center;
                    }
                    h1 { color: #333; margin-bottom: 10px; }
                    p { color: #666; font-size: 18px; }
                    .emoji { font-size: 60px; margin-bottom: 20px; }
                </style>
            </head>
            <body>
                <div class="card">
                    <div class="emoji">👩‍💻</div>
                    <h1>Ludmila Martos</h1>
                    <p>Programación 2 - ISSD 2025</p>
                    <p>Clase 11 - Maven y Spring Boot</p>
                </div>
            </body>
            </html>
            """;
    }
    
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
                <title>Problema 7 - Spring Boot</title>
                <style>
                    body {
                        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                        display: flex;
                        justify-content: center;
                        align-items: center;
                        height: 100vh;
                        margin: 0;
                        background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
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
                        background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
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
                    <h1>🚀 Hola desde Spring Boot!</h1>
                    <p>Problema 7 - Clase 11</p>
                    <a href="/autor">Ver información del autor</a>
                </div>
            </body>
            </html>
            """;
    }
}



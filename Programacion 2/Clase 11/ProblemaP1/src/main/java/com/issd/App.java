package com.issd;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Problema Propuesto 1 - Clase 11: Buscador de Google con jsoup
 * 
 * Este programa utiliza la librería jsoup para realizar búsquedas en Google
 * y devolver los resultados en forma de links por consola.
 * 
 * El usuario ingresa una frase de búsqueda y el programa devuelve los enlaces
 * de los resultados encontrados.
 * 
 * NOTA: Google puede bloquear solicitudes automatizadas. Este programa es
 * solo para fines educativos.
 * 
 * @author Ludmila Martos
 * @version 1.0.0
 */
public class App {
    
    // User-Agent para simular un navegador real
    private static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("═══════════════════════════════════════════════════════════════");
        System.out.println("              🔍 BUSCADOR DE GOOGLE CON JSOUP");
        System.out.println("═══════════════════════════════════════════════════════════════");
        System.out.println();
        
        System.out.print("Ingresa la frase a buscar en Google: ");
        String busqueda = scanner.nextLine();
        
        System.out.println();
        System.out.println("Buscando: \"" + busqueda + "\"...");
        System.out.println();
        
        buscarEnGoogle(busqueda);
        
        scanner.close();
    }
    
    /**
     * Realiza una búsqueda en Google y muestra los resultados por consola
     * 
     * @param query La frase a buscar
     */
    public static void buscarEnGoogle(String query) {
        try {
            // Codificar la búsqueda para la URL
            String queryEncoded = URLEncoder.encode(query, StandardCharsets.UTF_8);
            String url = "https://www.google.com/search?q=" + queryEncoded;
            
            System.out.println("URL de búsqueda: " + url);
            System.out.println();
            
            // Conectarse a Google con un User-Agent de navegador
            Document doc = Jsoup.connect(url)
                    .userAgent(USER_AGENT)
                    .referrer("https://www.google.com/")
                    .timeout(10000)
                    .get();
            
            // Buscar los enlaces de resultados de búsqueda
            // Google usa diferentes selectores, intentamos varios
            Elements resultados = doc.select("div.yuRUbf > a");
            
            // Si no encuentra con ese selector, intentamos otro
            if (resultados.isEmpty()) {
                resultados = doc.select("a[href^=http]:has(h3)");
            }
            
            // Si aún no hay resultados, buscamos enlaces generales
            if (resultados.isEmpty()) {
                resultados = doc.select("a[href^=/url?q=]");
            }
            
            if (resultados.isEmpty()) {
                System.out.println("═══════════════════════════════════════════════════════════════");
                System.out.println("⚠️  No se encontraron resultados o Google bloqueó la solicitud.");
                System.out.println();
                System.out.println("NOTA: Google puede bloquear solicitudes automatizadas.");
                System.out.println("Este programa es solo para fines educativos.");
                System.out.println("═══════════════════════════════════════════════════════════════");
                
                // Mostrar alternativa: buscar todos los links de la página
                System.out.println();
                System.out.println("📋 Links encontrados en la página de Google:");
                System.out.println("───────────────────────────────────────────────────────────────");
                
                Elements todosLinks = doc.select("a[href]");
                int contador = 0;
                for (Element link : todosLinks) {
                    String href = link.attr("abs:href");
                    if (href.startsWith("http") && !href.contains("google.com") && !href.contains("gstatic")) {
                        contador++;
                        System.out.println(contador + ". " + href);
                        if (contador >= 10) break; // Limitar a 10 resultados
                    }
                }
                
                if (contador == 0) {
                    System.out.println("No se encontraron links externos.");
                }
            } else {
                System.out.println("═══════════════════════════════════════════════════════════════");
                System.out.println("                    RESULTADOS ENCONTRADOS");
                System.out.println("═══════════════════════════════════════════════════════════════");
                System.out.println();
                
                int contador = 1;
                for (Element resultado : resultados) {
                    String link = resultado.attr("abs:href");
                    
                    // Limpiar el link si viene con formato de redirección de Google
                    if (link.contains("/url?q=")) {
                        link = link.substring(link.indexOf("/url?q=") + 7);
                        if (link.contains("&")) {
                            link = link.substring(0, link.indexOf("&"));
                        }
                    }
                    
                    // Solo mostrar links válidos (http/https)
                    if (link.startsWith("http")) {
                        System.out.println(contador + ". " + link);
                        contador++;
                        
                        if (contador > 10) break; // Limitar a 10 resultados
                    }
                }
            }
            
            System.out.println();
            System.out.println("═══════════════════════════════════════════════════════════════");
            System.out.println("✅ Búsqueda completada");
            System.out.println("═══════════════════════════════════════════════════════════════");
            
        } catch (IOException e) {
            System.err.println("═══════════════════════════════════════════════════════════════");
            System.err.println("❌ Error al conectar con Google:");
            System.err.println(e.getMessage());
            System.err.println();
            System.err.println("Posibles causas:");
            System.err.println("  - Sin conexión a internet");
            System.err.println("  - Google bloqueó la solicitud");
            System.err.println("  - Timeout en la conexión");
            System.err.println("═══════════════════════════════════════════════════════════════");
        }
    }
}



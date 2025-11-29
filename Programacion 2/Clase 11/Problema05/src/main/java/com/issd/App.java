package com.issd;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Problema 5 - Clase 11: Maven y Jsoup
 * 
 * Este programa utiliza la librería jsoup para conectarse a la página web del ISSD,
 * extraer el título de la página y todos los enlaces (links) que contiene.
 * 
 * @author Ludmila Martos
 * @version 1.0.0
 */
public class App {
    
    public static void main(String[] args) {
        try {
            // Conectarse a la página web del ISSD
            Document doc = Jsoup.connect("https://issd.edu.ar").get();

            // Extraer el título de la página web
            String title = doc.title();
            System.out.println("═══════════════════════════════════════════════════════════════");
            System.out.println("                    WEB SCRAPER CON JSOUP");
            System.out.println("═══════════════════════════════════════════════════════════════");
            System.out.println();
            System.out.println("📄 Título: " + title);
            System.out.println();

            // Extraer todos los links de la página web
            Elements links = doc.select("a[href]");
            System.out.println("🔗 Links encontrados (" + links.size() + "):");
            System.out.println("───────────────────────────────────────────────────────────────");
            
            for (Element link : links) {
                String href = link.attr("href");
                String text = link.text();
                
                // Mostrar el link con su texto descriptivo si existe
                if (!text.isEmpty()) {
                    System.out.println("  → " + href);
                    System.out.println("    (" + text + ")");
                } else {
                    System.out.println("  → " + href);
                }
            }
            
            System.out.println();
            System.out.println("═══════════════════════════════════════════════════════════════");
            System.out.println("✅ Extracción completada exitosamente");
            System.out.println("═══════════════════════════════════════════════════════════════");
            
        } catch (IOException e) {
            System.err.println("❌ Error al conectar con la página web:");
            e.printStackTrace();
        }
    }
}



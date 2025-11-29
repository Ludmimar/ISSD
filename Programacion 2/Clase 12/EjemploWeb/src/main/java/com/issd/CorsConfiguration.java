package com.issd;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Configuración de CORS (Cross-Origin Resource Sharing).
 * 
 * <p>CORS es un mecanismo de seguridad que permite o restringe las solicitudes
 * de recursos desde un origen diferente al del servidor.</p>
 * 
 * <p>Esta configuración permite que el archivo HTML (que se abre desde el sistema
 * de archivos local) pueda comunicarse con el servidor Spring Boot.</p>
 * 
 * <p><b>NOTA:</b> Esta configuración es permisiva y solo debe usarse en desarrollo.
 * En producción, se deben especificar los orígenes permitidos explícitamente.</p>
 * 
 * @author Ludmila Martos
 * @version 1.0.0
 */
@Configuration
@EnableWebMvc
public class CorsConfiguration implements WebMvcConfigurer {
    
    /**
     * Configura los mapeos CORS para permitir solicitudes desde cualquier origen.
     * 
     * @param registry El registro de CORS donde se agregan las configuraciones
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowedHeaders("*");
    }
}


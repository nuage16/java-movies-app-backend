package dev.dametester.movies;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/api/v1/movies")
        .allowedMethods("GET","POST","DELETE","HEAD","OPTIONS");

        registry.addMapping("/api/v1/reviews")
        .allowedMethods("GET","POST","DELETE","HEAD","OPTIONS");



    }

    
}

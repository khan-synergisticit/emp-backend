// package com.example.backend.config;

// import org.springframework.context.annotation.Configuration;
// import org.springframework.web.servlet.config.annotation.CorsRegistry;
// import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// @Configuration
// public class CorsConfiguration implements WebMvcConfigurer {

//     @Override
//     public void addCorsMappings(CorsRegistry registry) {
//         registry.addMapping("/**") // Apply to all endpoints
//                 .allowedOrigins(Constants.FRONTEND_URL) // Allowed origins
//                 .allowedMethods("GET", "POST", "PUT", "DELETE") // Allowed methods
//                 .allowedHeaders("*") // Allowed headers
//                 .allowCredentials(true) // Allow credentials
//                 .maxAge(3600); // Max age for preflight requests
//     }
// }

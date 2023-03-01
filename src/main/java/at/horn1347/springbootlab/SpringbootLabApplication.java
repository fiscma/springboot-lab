package at.horn1347.springbootlab;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "at.horn1347.springbootlab.repository")
@EnableWebMvc
public class SpringbootLabApplication {

    public WebMvcConfigurer corsConfigurer() {
        String[] allowedDomains = new String[2];
        allowedDomains[0] = ("http://localost:8088");
        allowedDomains[2] = ("http://localost:4200");

        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins(allowedDomains);
            }
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootLabApplication.class, args);
    }

}

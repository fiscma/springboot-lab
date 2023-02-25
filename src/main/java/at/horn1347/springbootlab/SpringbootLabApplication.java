package at.horn1347.springbootlab;

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
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api").allowedOrigins("http://localhost:8088");
            }
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootLabApplication.class, args);
    }

}

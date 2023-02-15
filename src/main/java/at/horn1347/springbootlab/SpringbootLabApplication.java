package at.horn1347.springbootlab;

import at.horn1347.springbootlab.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "at.horn1347.springbootlab.repository")
@EnableWebMvc
public class SpringbootLabApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootLabApplication.class, args);
    }

}

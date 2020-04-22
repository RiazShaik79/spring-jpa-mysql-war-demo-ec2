package io.javabrains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "io.javabrains")
public class SpringJpaMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaMysqlApplication.class, args);
	}

}

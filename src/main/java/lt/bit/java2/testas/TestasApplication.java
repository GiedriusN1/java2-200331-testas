package lt.bit.java2.testas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class TestasApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestasApplication.class, args);

		System.out.println("main");
	}

	// ...
}

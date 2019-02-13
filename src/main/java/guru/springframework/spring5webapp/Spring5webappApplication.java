package guru.springframework.spring5webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring5webappApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring5webappApplication.class, args);
	}

}

/*
*This Program uses JPA Mapping using hibernate to create a data schema on localhost 8080/h2-console
* JDBC Connect on localhost:8080/h2-console/ = jdbc:h2:mem:testdb
*Adding Git JPA example and adding example version 3/test for Git(ignore)
*/
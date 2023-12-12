package ups.edu.ec.microservice.curso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceCursoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceCursoApplication.class, args);
	}

}
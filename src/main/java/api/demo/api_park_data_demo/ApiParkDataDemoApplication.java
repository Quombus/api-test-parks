package api.demo.api_park_data_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ApiParkDataDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiParkDataDemoApplication.class, args);
	}

}

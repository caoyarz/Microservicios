package proyecto.microservicios.geo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@SpringBootApplication
@EnableSwagger2WebMvc
public class GeoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeoApplication.class, args);
	}

}

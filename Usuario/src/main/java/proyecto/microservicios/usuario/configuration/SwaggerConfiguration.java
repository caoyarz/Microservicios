package proyecto.microservicios.usuario.configuration;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfiguration {

	@Bean
    public Docket usersApi() {
        return new Docket(DocumentationType.SWAGGER_2)
        		.directModelSubstitute(LocalDateTime.class, Date.class)
                .apiInfo(usersApiInfo())
                .select()
                .paths(PathSelectors.ant("/api/**"))
                .apis(RequestHandlerSelectors.basePackage("proyecto.microservicios"))
                .build()
                .useDefaultResponseMessages(false);
    }

	private ApiInfo usersApiInfo() {
        return new ApiInfoBuilder()
                .title("Microservicio Usuario")
                .version("1.0")
                .license("Camila Oyarzún")
                .build();
    }
	

}

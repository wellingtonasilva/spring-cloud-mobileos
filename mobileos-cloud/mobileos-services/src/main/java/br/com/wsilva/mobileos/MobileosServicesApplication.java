package br.com.wsilva.mobileos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.any;

@SpringBootApplication
@EnableSwagger2
public class MobileosServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileosServicesApplication.class, args);
	}

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("Serviço Tipo").select()
				.apis(RequestHandlerSelectors.basePackage("br.com.wsilva.mobileos"))
				.paths(any()).build().apiInfo(new ApiInfo("Serviço Tipo Services",
						"Conjunto de api para acesso aos dados de Serviço Tipo", "1.0.0", null,
						new Contact("Wellington A. Silva", "https://github.com/wellingtonasilva", "wellingtonasilva@gmail.com"),
						null, null));
	}
}
package br.com.wsilva.mobileos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MobileosConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileosConfigServerApplication.class, args);
	}
}

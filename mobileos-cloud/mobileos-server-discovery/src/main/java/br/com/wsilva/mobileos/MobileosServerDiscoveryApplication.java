package br.com.wsilva.mobileos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MobileosServerDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileosServerDiscoveryApplication.class, args);
	}
}

package com.din.ecom.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/* In a configuration-first approach, the client application connects 
 * to the Config server via the property spring.cloud.config.
 * uri either set in a bootstrap file (bootstrap.yml or bootstrap.properties) 
 * or as a environment variable. The Eureka server URL 
 * would be configured in a property served by the Config server 
 * and the client application can now discover dependent services.*/
 
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);

	}

}

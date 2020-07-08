package com.prebeesh1427.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FindMoviesEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FindMoviesEurekaServerApplication.class, args);
	}

}

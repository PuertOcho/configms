package com.configms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigmsApplication.class, args);
	}

}

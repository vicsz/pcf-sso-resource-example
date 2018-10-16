package com.example.pcfssoresourceexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class PcfSsoResourceExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(PcfSsoResourceExampleApplication.class, args);
	}
}

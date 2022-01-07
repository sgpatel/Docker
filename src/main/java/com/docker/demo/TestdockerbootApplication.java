package com.docker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestdockerbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestdockerbootApplication.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return "Hello Springboot World";
	}

	@RequestMapping("/docker")
	public String docker() {
		return "Hello Docker World";
	}
}

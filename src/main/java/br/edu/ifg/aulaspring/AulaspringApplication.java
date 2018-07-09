package br.edu.ifg.aulaspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableAutoConfiguration
@EntityScan(basePackages = {"br.edu.ifg.aulaspring.model"})
public class AulaspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AulaspringApplication.class, args);
	}
}

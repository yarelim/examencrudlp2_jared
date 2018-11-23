package com.jared.examencrudproducto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories("com.jared.repository")
@ComponentScan({"com.jared.controller","com.jared.service"})
@EntityScan("com.jared.modell")
public class ExamencrudproductoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamencrudproductoApplication.class, args);
	}
}

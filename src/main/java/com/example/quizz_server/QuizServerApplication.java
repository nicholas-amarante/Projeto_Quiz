package com.example.quizz_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuizServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizServerApplication.class, args);
		System.out.println("Servidor Spring Boot iniciando. Acesse em http://localhost:8080");
		System.out.println("Outros dispositivos, use: http://SEU_IP_LOCAL:8080");
	}

}

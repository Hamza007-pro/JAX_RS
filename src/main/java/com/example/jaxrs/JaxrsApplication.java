package com.example.jaxrs;

import com.example.jaxrs.entities.Compte;
import com.example.jaxrs.entities.TypeCompte;
import com.example.jaxrs.repository.ComptRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class JaxrsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JaxrsApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ComptRepository comptRepository){
		return args -> {
			comptRepository.save(new Compte(null, Math.random() * 9000, new
					Date(), TypeCompte.EPARGNE));
			comptRepository.save(new Compte(null, Math.random() * 9000, new
					Date(), TypeCompte.COURANT));
			comptRepository.save(new Compte(null, Math.random() * 9000, new
					Date(), TypeCompte.EPARGNE));

			comptRepository.findAll().forEach(c ->{
				System.out.println(c.toString());
			});

		};
	}

}

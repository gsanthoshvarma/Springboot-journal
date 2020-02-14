package com.sr.springboot;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sr.springboot.domain.Journal;
import com.sr.springboot.repository.JournalRepository;

@SpringBootApplication
public class SpringBootJournalApplication {
	
	
	@Bean
	public InitializingBean saveDate12(JournalRepository repo) {
		return () ->{
			         repo.save(new Journal("Get to know Spring Boot","Started learning spring boot","02/15/2020"));
			         repo.save(new Journal("Simple Spring Boot Project","first Spring Boot Project","02/02/2020"));
			         repo.save(new Journal("Spring Boot Reading","Need to read more about Spring Boot","02/15/2020"));
			         repo.save(new Journal("Spring Boot in the Cloud","Spring Boot using Cloud Foundry","02/15/2020"));
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJournalApplication.class, args);
	}

}

package com;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com")
public class DemoConfiguration {

	@Bean
	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("harsh").createEntityManager();
	}
	
}

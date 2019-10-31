package com.first.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstPrjWithDiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstPrjWithDiApplication.class, args);
		
		Alien a = (Alien)context.getBean("alien");
		// ORR
		// Alien a = context.getBean(Alien.class);
		
		a.show();		
	}

}

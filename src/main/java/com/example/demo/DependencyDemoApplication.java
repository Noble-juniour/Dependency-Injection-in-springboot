package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyDemoApplication {

	public static void main(String[] args) {
		//ConfigurableApplicationContext context =
			ConfigurableApplicationContext context =  SpringApplication.run(DependencyDemoApplication.class, args);
	        Customers c = context.getBean(Customers.class);
	        c.display();
			//Customers c = context.getBean(Customers.class);
	   // c.display();
	}

}

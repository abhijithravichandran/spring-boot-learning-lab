package com.CodingShuttleBean.Explanation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExplanationApplication implements CommandLineRunner {

	@Autowired
	PaymentService paymentService;




	public static void main(String[] args) {

		SpringApplication.run(ExplanationApplication.class, args);

//		paymentService.pay(); -> Instead of static - we are using commandLine runner here
	}

	@Override
	public void run(String... args) throws Exception {
//		The run method is from CommandLineRunner and it is allowed to use the object
		paymentService.pay();
	}
}

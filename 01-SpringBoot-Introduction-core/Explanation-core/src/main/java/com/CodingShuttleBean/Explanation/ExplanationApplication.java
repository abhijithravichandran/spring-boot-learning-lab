package com.CodingShuttleBean.Explanation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExplanationApplication {

	public static void main(String[] args) {

		SpringApplication.run(ExplanationApplication.class, args);

		PaymentService paymentService = new PaymentService();

		paymentService.pay();
	}

}

package com.example.consumo.consumoApis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ConsumoApisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumoApisApplication.class, args);
	}

}

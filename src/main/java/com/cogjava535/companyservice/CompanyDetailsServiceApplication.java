package com.cogjava535.companyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableEurekaClient
public class CompanyDetailsServiceApplication {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		SpringApplication.run(CompanyDetailsServiceApplication.class, args);
	}

}

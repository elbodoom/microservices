package br.com.followthetruck.core.foodtruck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FoodTruckApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodTruckApplication.class, args);
	}
}

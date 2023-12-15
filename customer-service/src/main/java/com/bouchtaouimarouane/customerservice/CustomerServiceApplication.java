package com.bouchtaouimarouane.customerservice;

import com.bouchtaouimarouane.customerservice.config.GlobalConfig;
import com.bouchtaouimarouane.customerservice.entities.Customer;
import com.bouchtaouimarouane.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
@EnableConfigurationProperties({GlobalConfig.class})
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
		return args -> {

			List<Customer> customerList=List.of(
					Customer.builder()
							.firstName("Marouane")
							.lastName("Bouchtaoui")
							.email("maro@gmail.com")
							.build(),
					Customer.builder()
							.firstName("Maro")
							.lastName("Bcht")
							.email("bcht@gmail.com")
							.build()

			);
			customerRepository.saveAll(customerList);
		};
	}

}

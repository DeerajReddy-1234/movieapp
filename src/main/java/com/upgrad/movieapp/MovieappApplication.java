package com.upgrad.movieapp;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.upgrad.movieapp.doa.CustomerDAO;
import com.upgrad.movieapp.entities.Customer;

@SpringBootApplication
public class MovieappApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MovieappApplication.class, args);
		CustomerDAO customerDAO = context.getBean(CustomerDAO.class);
		Customer customer = new Customer();
		customer.setFirstName("Emma");
		customer.setLastName("not");
		customer.setUserName("email123");
		customer.setPassword("************");
		customer.setDateOfBirth(LocalDateTime.of(1998, 11, 14, 0, 0));

		System.out.println("Before saving ......" + customer );
		
		Customer savedCustomer = customerDAO.save(customer);
		System.out.println("After saving ......" + savedCustomer );
		
		Customer retrivedCustomer = customerDAO.findById(savedCustomer.getCustomerId());
		System.out.println("After Retriving ......" + retrivedCustomer );
		
		customer.setUserName("emmanew");
		
		Customer updatedCustomer = customerDAO.update(customer);
		System.out.println("After update ......" + updatedCustomer );

		customerDAO.delete(updatedCustomer);
		System.out.println("After deleting ...." + customerDAO.findById(updatedCustomer.getCustomerId()));

	}

}

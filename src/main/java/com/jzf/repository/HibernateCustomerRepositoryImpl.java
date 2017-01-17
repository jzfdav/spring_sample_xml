package com.jzf.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.jzf.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Value("${dbUsername}")
	private String dbUsername;

	@Override
	public List<Customer> findAll() {
		
		System.out.println(dbUsername);
		
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstName("Joseph");
		customer.setLastName("David");
		
		customers.add(customer);
		
		return customers;
	}
	
	// public void setDbUsername(String dbUsername) {
	// this.dbUsername = dbUsername;
	// }

}

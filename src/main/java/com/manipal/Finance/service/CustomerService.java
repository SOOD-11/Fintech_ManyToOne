package com.manipal.Finance.service;
import com.manipal.Finance.entity.*;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface  CustomerService{
		CustomerDetails saveCustomer(CustomerDetails customer);
		List <CustomerDetails> getAllCustomers();
	CustomerDetails getCustomerById(Long id);
	void deleteCustomer(Long id);
		
	
}
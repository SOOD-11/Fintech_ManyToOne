package com.manipal.Finance.controller;
import com.manipal.Finance.entity.*;
import com.manipal.Finance.service.CustomerService;
import com.manipal.Finance.service.CustomerServiceImpl;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/customers")
public class CustomerController{
	
	@Autowired
	private CustomerService service;
	
	
	@PostMapping
	public CustomerDetails createCustomer(@RequestBody CustomerDetails customer) {
		return  service.saveCustomer(customer);
	}
	
	@GetMapping
	public List<CustomerDetails> getAllCustomers(){
	
	
	return service.getAllCustomers();
	}
	@GetMapping("/{id}")
	public CustomerDetails getCustomer(@PathVariable Long id) {
		return service.getCustomerById(id);
	}
	@DeleteMapping("/{id}")
	public String deleteCustomer(@PathVariable Long id) {
		service.deleteCustomer(id);
		return "Deleted customer with ID: " +id;
	}
}
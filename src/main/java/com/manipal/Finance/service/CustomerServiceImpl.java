package com.manipal.Finance.service;

import com.manipal.Finance.entity.CustomerDetails;
import com.manipal.Finance.repository.CustomerRepository;
import com.manipal.Finance.service.CustomerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerRepository repo;
	@Override
	public CustomerDetails saveCustomer(CustomerDetails customer) {
		return repo.save(customer);
	}
	@Override
	public  List<CustomerDetails> getAllCustomers(){
		return repo.findAll();
	}
	@Override
	public CustomerDetails getCustomerById(Long id) {
		return repo.findById(id).orElse(null);
				
	}
	@Override
	public void deleteCustomer(Long id) {
			repo.deleteById(id);
			
		
	}
}
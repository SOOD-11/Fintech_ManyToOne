package com.manipal.Finance.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.manipal.Finance.entity.CustomerIdentification;



public interface CustomerIdentificationRepository extends JpaRepository<CustomerIdentification,Long>{
	CustomerIdentification findByCustomer_CustomerId(Long customerId );
}
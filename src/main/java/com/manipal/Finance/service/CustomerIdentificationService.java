package com.manipal.Finance.service;

import com.manipal.Finance.dto.CustomerIdentifierDto;
import com.manipal.Finance.entity.CustomerIdentification;
import org.springframework.http.ResponseEntity;

public interface CustomerIdentificationService {
    ResponseEntity<CustomerIdentification> createIdentification(CustomerIdentifierDto dto);
    ResponseEntity<CustomerIdentification> updateIdentification(Long id, CustomerIdentifierDto dto);
    ResponseEntity<CustomerIdentification> getIdentificationById(Long id);
    ResponseEntity<String> deleteIdentification(Long id);
}












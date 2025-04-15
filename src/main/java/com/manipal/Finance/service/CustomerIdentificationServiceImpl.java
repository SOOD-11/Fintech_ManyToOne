package com.manipal.Finance.service;

import com.manipal.Finance.dto.CustomerIdentifierDto;
import com.manipal.Finance.entity.CustomerDetails;
import com.manipal.Finance.entity.CustomerIdentification;
import com.manipal.Finance.repository.CustomerRepository;
import com.manipal.Finance.repository.CustomerIdentificationRepository;
import com.manipal.Finance.service.CustomerIdentificationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@Service
public class CustomerIdentificationServiceImpl implements CustomerIdentificationService {

    @Autowired
    private CustomerIdentificationRepository identificationRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public ResponseEntity<CustomerIdentification> createIdentification(CustomerIdentifierDto dto) {
        Optional<CustomerDetails> customerOpt = customerRepository.findById(dto.getCustomerId());

        if (customerOpt.isEmpty()) {
            return ResponseEntity.badRequest().body(null); // or throw custom exception
        }

        CustomerDetails customer = customerOpt.get();

        CustomerIdentification identification = new CustomerIdentification();
        identification.setCustomer(customer);
        identification.setPancardNumber(dto.getPanCardNumber());
        identification.setAadharNumber(dto.getAadharNumber());
        identification.setWsId(dto.getWsId());
        identification.setLocalTs(LocalDateTime.now());
        identification.setHostTs(LocalDateTime.now());
        identification.setUuid(UUID.randomUUID().toString());

        CustomerIdentification saved = identificationRepository.save(identification);
        return ResponseEntity.ok(saved);}
        @Override
        public ResponseEntity<CustomerIdentification> updateIdentification(Long id, CustomerIdentifierDto dto) {
            Optional<CustomerIdentification> identificationOpt = identificationRepository.findById(id);

            if (identificationOpt.isEmpty()) {
                return ResponseEntity.notFound().build();
            }

            CustomerIdentification identification = identificationOpt.get();

            if (dto.getCustomerId() != null) {
                Optional<CustomerDetails> customerOpt = customerRepository.findById(dto.getCustomerId());
                customerOpt.ifPresent(identification::setCustomer);
            }

            identification.setPancardNumber(dto.getPanCardNumber());
            identification.setAadharNumber(dto.getAadharNumber());
            identification.setWsId(dto.getWsId());
            identification.setHostTs(LocalDateTime.now());

            CustomerIdentification updated = identificationRepository.save(identification);
            return ResponseEntity.ok(updated);
        }
        
        @Override
        public ResponseEntity<CustomerIdentification> getIdentificationById(Long id) {
            Optional<CustomerIdentification> identificationOpt = identificationRepository.findById(id);

            return identificationOpt.map(ResponseEntity::ok)
                    .orElseGet(() -> ResponseEntity.notFound().build());
        }

        @Override
        public ResponseEntity<String> deleteIdentification(Long id) {
            if (!identificationRepository.existsById(id)) {
                return ResponseEntity.notFound().build();
            }

            identificationRepository.deleteById(id);
            return ResponseEntity.ok("Identification record with ID " + id + " deleted successfully.");
        }
    }

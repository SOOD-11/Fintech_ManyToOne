package com.manipal.Finance.controller;
import com.manipal.Finance.dto.CustomerIdentifierDto;
import com.manipal.Finance.entity.CustomerIdentification;
import com.manipal.Finance.service.CustomerIdentificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/identification")
public class CustomerIdentificationController {
    @Autowired
    private CustomerIdentificationService customerIdentificationService;
    @PostMapping
    public ResponseEntity<CustomerIdentification> createIdentification(@RequestBody CustomerIdentifierDto dto) {
        return customerIdentificationService.createIdentification(dto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerIdentification> getIdentificationById(@PathVariable Long id) {
        return customerIdentificationService.getIdentificationById(id);
    }

  
    @PutMapping("/{id}")
    public ResponseEntity<CustomerIdentification> updateIdentification(
            @PathVariable Long id,
            @RequestBody CustomerIdentifierDto dto) {
        return customerIdentificationService.updateIdentification(id, dto);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteIdentification(@PathVariable Long id) {
        return customerIdentificationService.deleteIdentification(id);
    }
}
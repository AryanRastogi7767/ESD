package org.aryan.yummy.controller;

import org.aryan.yummy.dto.CustomerRequest;
import org.aryan.yummy.dto.CustomerResponse;
import org.aryan.yummy.service.CustomerService;
import org.aryan.yummy.dto.UpdateRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/customer")

public class customerController {
    private final CustomerService customerService;

    @PostMapping
    public ResponseEntity<String> createCustoemr(@RequestBody @Valid CustomerRequest request) {
        return ResponseEntity.ok(customerService.createCustomer(request));
    }
    
    @GetMapping("{email}")
    public ResponseEntity<CustomerResponse> getCustomer(@PathVariable("email") String email) {
        return ResponseEntity.ok(customerService.retrieveCustomer(email));
    }

    @DeleteMapping("{email}")
    public ResponseEntity<String> deleteCustomer(@PathVariable("email") String email) {
        customerService.deleteCustomer(email);
        return ResponseEntity.ok("Customer deleted successfully");
    }

    @PatchMapping("{email}")
    public ResponseEntity<String> updateCustomer(@PathVariable("email") String email,@RequestBody @Valid UpdateRequest request) {
        return ResponseEntity.ok(customerService.updateCustomer(request, email));
    }
}

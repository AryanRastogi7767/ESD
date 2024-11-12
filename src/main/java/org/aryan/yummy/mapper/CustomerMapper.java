package org.aryan.yummy.mapper;

import org.aryan.yummy.dto.CustomerRequest;
import org.aryan.yummy.dto.CustomerResponse;
import org.aryan.yummy.entity.Customer;
import org.springframework.stereotype.Service;
@Service

public class CustomerMapper {
    public Customer toEntity(CustomerRequest request) {
        return Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .password(request.password())
                .addressLine1(request.addressLine1())
                .addressLine2(request.addressLine2())
                .city(request.city())
                .pincode(request.pincode())
                .build();
    }

    public CustomerResponse toCustomerResponse(Customer customer) {
        return new CustomerResponse(
                customer.getFirstName(),
                customer.getLastName(),
                customer.getEmail(),
                customer.getAddressLine1(),
                customer.getAddressLine2(),
                customer.getCity(),
                customer.getPincode()
        );
    }
}

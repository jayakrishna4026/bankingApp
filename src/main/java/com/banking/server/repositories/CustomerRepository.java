package com.banking.server.repositories;

import com.banking.server.dao.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {
    public Customer findByAccountNumber(String accountNumber);
}

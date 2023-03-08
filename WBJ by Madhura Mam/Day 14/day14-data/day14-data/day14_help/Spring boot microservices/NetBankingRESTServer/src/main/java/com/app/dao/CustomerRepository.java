package com.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {
	Optional<Customer> findByCustomerIdAndPassword(String custId, String pwd);
}

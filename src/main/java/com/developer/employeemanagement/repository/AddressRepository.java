package com.developer.employeemanagement.repository;

import com.developer.employeemanagement.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}

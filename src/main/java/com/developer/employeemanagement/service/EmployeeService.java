package com.developer.employeemanagement.service;

import com.developer.employeemanagement.entity.Address;
import com.developer.employeemanagement.entity.Employee;
import com.developer.employeemanagement.repository.AddressRepository;
import com.developer.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;

public class EmployeeService {

        @Autowired
        private EmployeeRepository employeeRepository;

        @Autowired
        private AddressRepository projectRepository;

        public void saveEmployee(Employee empObj) {
            employeeRepository.save(empObj);
        }

        public List<Employee> getEmployeeDetails(Long empId) {
            if (null != empId) {
                return employeeRepository.findAllByEmpId(empId);
            } else {
                return employeeRepository.findAll();
            }
        }

        public void deleteEmployee(Long empId) {
            employeeRepository.deleteById(empId);
        }

}

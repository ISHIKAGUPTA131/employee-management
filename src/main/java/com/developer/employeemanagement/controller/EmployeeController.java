package com.developer.employeemanagement.controller;

import com.developer.employeemanagement.entity.Employee;
import com.developer.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository empRepository;

    @PostMapping("/saveEmployees")
    public ResponseEntity<String> saveEmployees(@RequestBody List<Employee> empData) {
        empRepository.saveAll(empData);
        return ResponseEntity.ok("Data saved");
    }

    @GetMapping("/getEmployees")
    public List<Employee> getEmployees(){
        return empRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Employee> findEmployeeById(@PathVariable("id") Long id){
        return empRepository.findById(id);
    }

    @DeleteMapping("delete/{empId}")
    public ResponseEntity removeEmployee(@PathVariable Long empId){
        empRepository.deleteById(empId);
        return new ResponseEntity(HttpStatus.OK);
    }

}

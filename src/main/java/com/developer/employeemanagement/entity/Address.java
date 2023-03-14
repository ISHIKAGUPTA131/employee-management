package com.developer.employeemanagement.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "add_id")
    private Long addressId;
    @Column(name = "city")
    private String city;
    @Column(name = "addressType")
    private String addressType;

    //for bidirectional one to one mapping
    //@OneToOne(mappedBy = "address")
    //private Employee employee;

    @ManyToOne
    @JoinColumn(name = "fk_emp_id")
    private Employee employee;

    //@ManyToMany(mappedBy = "addresses")
    //private Set<Employee> employeeset = new HashSet<>();
}

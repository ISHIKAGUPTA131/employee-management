package com.developer.employeemanagement.entity;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name = "employee_details")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_id")
    private Long empId;
    @Column(name = "name")
    private String empName;
    @Column(name = "age")
    private Integer empAge;
    //address_add_id - default fk column name
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_add_id")
    private Address address;

    //ManyToMany
    //@ManyToMany
    //@JoinTable(name = "emp_add",
    //joinColumns = @JoinColumn(name = "emp_id"),
    //        inverseJoinColumns = @JoinColumn(name = "add_id")
    //)
    //private Set<Address> addresses = new HashSet<>();

    //one-to-many
    //@OneToMany(cascade = CascadeType.ALL)
    //@JoinColumn(name = "fk_emp_id",referencedColumnName = "emp_id")
    //private List<Address> address;



}

package com.example.md.service;

import com.example.md.entity.Customer;
import com.example.md.entity.CustomerModel;
import com.example.md.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository repository;

    @Autowired
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }


    public List<Customer> getStudents(){
        return repository.findAll();
    }


    public void addNewStudent( CustomerModel model) {
        Optional<Customer> studentByEmail=repository.findStudentModelByEmail(model.getEmail());

        if (studentByEmail.isPresent()){
            throw new IllegalArgumentException("Already signed in");
        }
        Customer customer=new Customer();
        customer.setName(model.getName());
        customer.setEmail(model.getEmail());
        customer.setPassword(model.getPassword());
        repository.save(customer);
    }
}

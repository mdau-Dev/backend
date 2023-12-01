package com.example.md.controller;

import com.example.md.entity.Customer;
import com.example.md.entity.CustomerModel;
import com.example.md.service.CustomerService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "student/v1/itsmdaucode/details")
public class CustomerController {

    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @CrossOrigin
    @GetMapping("/allmembers.php")
    public List<Customer> getStudents(){
       return service.getStudents();
    }

    @CrossOrigin
    @PostMapping("/registration.php")
    public String addNewStudent(@RequestBody CustomerModel model){
        service.addNewStudent(model);
        return "Success";
    }
}

package com.example.md.config;


import com.example.md.entity.Customer;
import com.example.md.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CustomerConfig {

    @Bean
    CommandLineRunner runner(CustomerRepository repository){
        return  args -> {
            Customer mdau=new Customer("mdau","mdau@gmail.com","bfjhvjhjhdf"
            );

//            Customer tony=new Customer(
//                            "Tony","anto@gmail.com","j jhfvjhbhh"
//            );
//
//            Customer mearcy=new Customer("mercy","maercy@gmail.com",
//                   "bvjhbjhbjhvbjh"
//            );
////
//            Customer virgo=new Customer("virgo","romain@gmail.com",
//                    "bjvjb jhvfgdfvk"
//            );

            repository.saveAll(
                    List.of(mdau)
            );

        };
    }
}

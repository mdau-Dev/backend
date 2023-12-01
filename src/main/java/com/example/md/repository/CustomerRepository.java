package com.example.md.repository;

import com.example.md.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

  //  @Query("SELECT s FROM StudentModel s WHERE s.email=?1")


    Optional<Customer> findStudentModelByEmail(String email);

    @Query("select c from Customer  c")
    Customer findTheCustomersAll();

}

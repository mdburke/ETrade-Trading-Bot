package com.imminentapps.hello;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by mburke on 12/31/17.
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByLastNameStartsWithIgnoreCase(String lastName);
}

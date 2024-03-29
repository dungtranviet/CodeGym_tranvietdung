package com.codegym.repository;

import com.codegym.entity.Customer;
import com.codegym.entity.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends PagingAndSortingRepository<Customer,Long> {
    Iterable<Customer>findAllByProvince(Province province);
    Page<Customer>findAllByFirstName(String firstName, Pageable pageable);
}

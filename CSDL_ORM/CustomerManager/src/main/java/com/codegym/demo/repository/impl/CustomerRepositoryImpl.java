package com.codegym.demo.repository.impl;

import com.codegym.demo.model.Customer;
import com.codegym.demo.repository.CustomerRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
@Transactional
@Repository
public class CustomerRepositoryImpl implements CustomerRepository {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Customer> getAll() {
        TypedQuery<Customer> query=entityManager.createQuery("select c from Customer c",Customer.class);
        return query.getResultList();
    }

    @Override
    public void save(Customer customer) {
        if (customer.getId()!=null) {
            entityManager.merge(customer);
        }
        else {
            entityManager.persist(customer);
        }
    }
}

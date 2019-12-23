package com.example.validate_form.repository;

import com.example.validate_form.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;
public interface UserRepository extends PagingAndSortingRepository<User,Long> {
}

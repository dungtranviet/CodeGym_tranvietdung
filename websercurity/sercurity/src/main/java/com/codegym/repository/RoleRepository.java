package com.codegym.repository;

import com.codegym.Entity.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role,Long> {
    Role findByName(String name);
}

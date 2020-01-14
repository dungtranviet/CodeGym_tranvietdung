package com.codegym.repository;

import com.codegym.entity.Province;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviceRepository extends PagingAndSortingRepository<Province,Long> {
}

package com.codegym.repository;

import com.codegym.entity.ThanhPho;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThanhPhoReppsitory extends PagingAndSortingRepository<ThanhPho,Long> {
}

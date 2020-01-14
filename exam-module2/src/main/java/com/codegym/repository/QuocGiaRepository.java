package com.codegym.repository;

import com.codegym.entity.QuocGia;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuocGiaRepository extends PagingAndSortingRepository<QuocGia,Long> {
}

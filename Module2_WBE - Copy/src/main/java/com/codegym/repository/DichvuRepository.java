package com.codegym.repository;

import com.codegym.entity.FuramaDichVu;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DichvuRepository  extends PagingAndSortingRepository<FuramaDichVu,Long> {
    Iterable<FuramaDichVu>findAllByChiPhiThueBetween(Integer fromPrice,Integer toPrice);
}

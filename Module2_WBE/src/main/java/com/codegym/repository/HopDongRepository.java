package com.codegym.repository;

import com.codegym.entity.FuramaHopDong;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HopDongRepository extends PagingAndSortingRepository<FuramaHopDong,Long> {
    Iterable<FuramaHopDong> findAllByIdKhachHang(Long idKhachHang);
}

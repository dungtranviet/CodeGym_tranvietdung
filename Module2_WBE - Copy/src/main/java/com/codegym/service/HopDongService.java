package com.codegym.service;

import com.codegym.entity.FuramaHopDong;
import com.codegym.repository.HopDongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface HopDongService {
    Iterable<FuramaHopDong> findAll();

    FuramaHopDong findById(Long id);

    void save(FuramaHopDong furamaHopDong);

    void remove(Long id);
    Iterable<FuramaHopDong> findAllByIdKhachHang(Long idKhachHang);
}

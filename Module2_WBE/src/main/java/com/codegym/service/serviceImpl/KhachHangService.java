package com.codegym.service.serviceImpl;

import com.codegym.entity.FuramaKhachHang;
import com.codegym.repository.KhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KhachHangService implements com.codegym.service.KhachHangService {
    @Autowired
    KhachHangRepository khachHangRepository;
    @Override
    public Iterable<FuramaKhachHang> findAll() {
        return khachHangRepository.findAll();
    }

    @Override
    public FuramaKhachHang findById(Long id) {
        return khachHangRepository.findById(id).orElse(null);
    }

    @Override
    public void remove(Long id) {
      khachHangRepository.deleteById(id);
    }

    @Override
    public void save(FuramaKhachHang furamaKhachHang) {
      khachHangRepository.save(furamaKhachHang);
    }
}

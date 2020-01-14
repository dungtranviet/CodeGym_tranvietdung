package com.codegym.service;

import com.codegym.entity.FuramaKhachHang;

public interface KhachHangService {
    Iterable<FuramaKhachHang> findAll();
    FuramaKhachHang findById(Long id);
    void remove(Long id);
    void save(FuramaKhachHang furamaKhachHang);
}

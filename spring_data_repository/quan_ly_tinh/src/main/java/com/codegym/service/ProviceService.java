package com.codegym.service;

import com.codegym.entity.Province;

public interface ProviceService {
    Iterable<Province> findAll();
    Province findById(Long id);
    void save(Province province);
    void remove(Long id);
}

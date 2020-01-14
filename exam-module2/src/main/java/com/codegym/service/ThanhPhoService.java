package com.codegym.service;

import com.codegym.entity.ThanhPho;

public interface ThanhPhoService {
    Iterable<ThanhPho> findAll();
    ThanhPho findById(Long id);
    void save(ThanhPho thanhPho);
    void remove(Long id);
}

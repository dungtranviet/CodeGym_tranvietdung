package com.codegym.service;

import com.codegym.entity.QuocGia;
import com.codegym.entity.ThanhPho;

public interface QuocGiaService {
    Iterable<QuocGia> findAll();

    QuocGia findById(Long id);

    void save(QuocGia quocGia);

    void remove(Long id);
}

package com.codegym.service.impl;

import com.codegym.entity.QuocGia;
import com.codegym.repository.QuocGiaRepository;
import com.codegym.service.QuocGiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuocGiaServiceImpl implements QuocGiaService {
    @Autowired
    QuocGiaRepository quocGiaRepository;
    @Override
    public Iterable<QuocGia> findAll() {
        return quocGiaRepository.findAll();
    }

    @Override
    public QuocGia findById(Long id) {
        return quocGiaRepository.findById(id).orElse(null);
    }

    @Override
    public void save(QuocGia quocGia) {
        quocGiaRepository.save(quocGia);
    }

    @Override
    public void remove(Long id) {
      quocGiaRepository.deleteById(id);
    }
}

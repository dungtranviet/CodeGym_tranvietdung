package com.codegym.service.impl;

import com.codegym.entity.Province;
import com.codegym.repository.ProviceRepository;
import com.codegym.service.ProviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProviceServiceImpl implements ProviceService {
    @Autowired
    ProviceRepository proviceRepository;
    @Override
    public Iterable<Province> findAll() {
        return proviceRepository.findAll();
    }

    @Override
    public Province findById(Long id) {
        return proviceRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Province province) {
        proviceRepository.save(province);
    }

    @Override
    public void remove(Long id) {
        proviceRepository.deleteById(id);
    }
}

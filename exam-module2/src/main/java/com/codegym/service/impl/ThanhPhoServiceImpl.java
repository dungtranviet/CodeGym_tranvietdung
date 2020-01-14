package com.codegym.service.impl;

import com.codegym.entity.ThanhPho;
import com.codegym.repository.ThanhPhoReppsitory;
import com.codegym.service.ThanhPhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThanhPhoServiceImpl implements ThanhPhoService {
    @Autowired
    ThanhPhoReppsitory thanhPhoReppsitory;

    @Override
    public Iterable<ThanhPho> findAll() {
        return thanhPhoReppsitory.findAll();
    }

    @Override
    public ThanhPho findById(Long id) {
        return thanhPhoReppsitory.findById(id).orElse(null);
    }

    @Override
    public void save(ThanhPho thanhPho) {
        thanhPhoReppsitory.save(thanhPho);
    }

    @Override
    public void remove(Long id) {
        thanhPhoReppsitory.deleteById(id);
    }
}

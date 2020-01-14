package com.codegym.service.serviceImpl;

import com.codegym.entity.FuramaDichVu;
import com.codegym.repository.DichvuRepository;
import com.codegym.service.DichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DichVuServiceimpl implements DichVuService {
    @Autowired
    DichvuRepository dichvuRepository;

    @Override
    public Iterable<FuramaDichVu> findAll() {
        return dichvuRepository.findAll();
    }

    @Override
    public FuramaDichVu getDichVu(Long id) {
        return dichvuRepository.findById(id).orElse(null);
    }

    @Override
    public void saveDichVu(FuramaDichVu furamaDichVu) {
        dichvuRepository.save(furamaDichVu);
    }

    @Override
    public void deleteDichVu(Long id) {
        dichvuRepository.deleteById(id);
    }

    @Override
    public Iterable<FuramaDichVu> findAllByChiPhiThueBetween(Integer fromPrice, Integer toPrice) {
        return dichvuRepository.findAllByChiPhiThueBetween(fromPrice,toPrice);
    }
}

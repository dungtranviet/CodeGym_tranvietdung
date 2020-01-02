package com.codegym.service;

import com.codegym.entity.FuramaDichVu;

import java.util.Optional;

public interface DichVuService {
    public Iterable<FuramaDichVu>findAll();
    public FuramaDichVu getDichVu(Long id);
    public void saveDichVu(FuramaDichVu furamaDichVu);
    public void deleteDichVu(Long id);
    public Iterable<FuramaDichVu> findAllByChiPhiThueBetween(Integer fromPrice,Integer toPrice);
}

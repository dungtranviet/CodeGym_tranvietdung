package com.codegym.service.serviceImpl;

import com.codegym.entity.FuramaHopDong;
import com.codegym.repository.HopDongRepository;
import com.codegym.service.HopDongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HopDongServiceImpl implements HopDongService {
    @Autowired
    HopDongRepository hopDongRepository;
    @Override
    public Iterable<FuramaHopDong> findAll() {
        return hopDongRepository.findAll();
    }

    @Override
    public FuramaHopDong findById(Long id) {
        return hopDongRepository.findById(id).orElse(null);
    }

    @Override
    public void save(FuramaHopDong furamaHopDong) {
     hopDongRepository.save(furamaHopDong);
    }

    @Override
    public void remove(Long id) {
     hopDongRepository.deleteById(id);
    }

    @Override
    public Iterable<FuramaHopDong> findAllByIdKhachHang(Long idKhachHang) {
        return hopDongRepository.findAllByIdKhachHang(idKhachHang);
    }
}

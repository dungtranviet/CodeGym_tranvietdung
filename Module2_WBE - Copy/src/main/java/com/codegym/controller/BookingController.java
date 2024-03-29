package com.codegym.controller;

import com.codegym.entity.FuramaHopDong;
import com.codegym.service.DichVuService;
import com.codegym.service.HopDongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;


import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class BookingController {
    @Autowired
    DichVuService dichVuService;
    @Autowired
    HopDongService hopDongService;

    @GetMapping("/booking/{id}")
    public ModelAndView getBookingPage(@PathVariable(value = "id") Long id) {
        ModelAndView modelAndView = new ModelAndView("dichvu/booking");
        modelAndView.addObject("dichvu", dichVuService.getDichVu(id));
        modelAndView.addObject("hopdong", new FuramaHopDong());
        return modelAndView;
    }

    @PostMapping("/booking")
    public ModelAndView saveBooking(@RequestParam(value = "iddichvu") Long iddichvu, @RequestParam(value = "ngaybatdau") String ngayBatDau,
                                    @RequestParam(value = "ngayketthuc") String ngayKetThuc, HttpServletResponse response) throws ParseException {
        if (ngayBatDau.isEmpty()||ngayKetThuc.isEmpty()) {
            ModelAndView modelAndView=new ModelAndView("dichvu/booking");
            modelAndView.addObject("dichvu", dichVuService.getDichVu(iddichvu));
            modelAndView.addObject("hopdong", new FuramaHopDong());
            modelAndView.addObject("ngaybatdau",ngayBatDau);
            modelAndView.addObject("ngayketthuc",ngayKetThuc);
            if (ngayBatDau.isEmpty()) {
                modelAndView.addObject("errorMessage1","hãy chọn ngày làm hợp đồng");
            }
            if (ngayKetThuc.isEmpty()) {
                modelAndView.addObject("errorMessage2","hãy chọn ngày kết thúc hợp đồng");
            }
            return modelAndView;
        }
        ModelAndView modelAndView = new ModelAndView("dichvu/bookingSuccess");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date=formatter.parse(ngayBatDau);
        ngayBatDau=new SimpleDateFormat("dd/MM/yyyy").format(date);
        date=formatter.parse(ngayKetThuc);
        ngayKetThuc=new SimpleDateFormat("dd/MM/yyyy").format(date);


        FuramaHopDong furamaHopDong = new FuramaHopDong();
        furamaHopDong.setFuramaDichVu(dichVuService.getDichVu(iddichvu));
        furamaHopDong.setNgayLamHopDong(ngayBatDau);
        furamaHopDong.setNgayKetThuc(ngayKetThuc);
        furamaHopDong.setIdNhanVien((long) 1);
        furamaHopDong.setIdKhachHang((long) 1);
        hopDongService.save(furamaHopDong);
        Iterable<FuramaHopDong> listHopDong = hopDongService.findAllByIdKhachHang((long) 1);
        for (FuramaHopDong hopdong : listHopDong) {
            String cookieValue=hopdong.getId()+"_"+hopdong.getFuramaDichVu().getId()+
                    "_"+hopdong.getNgayLamHopDong()+ "_"+hopdong.getNgayKetThuc();
            Cookie cookie=new Cookie("hopdong"+hopdong.getId(),cookieValue);
            cookie.setMaxAge(60*60);
            cookie.setPath("/history");
            response.addCookie(cookie);
        }
        return modelAndView;
    }
}

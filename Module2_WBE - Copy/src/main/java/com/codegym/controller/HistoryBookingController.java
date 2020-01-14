package com.codegym.controller;

import com.codegym.entity.FuramaHopDong;
import com.codegym.service.DichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.sql.Date;
import java.util.ArrayList;

@Controller
public class HistoryBookingController {
    @Autowired
    DichVuService dichVuService;
    @GetMapping("/history")
    public ModelAndView getHistoryPage(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        ArrayList<FuramaHopDong> listHopDong = new ArrayList<>();
        for (Cookie cookie:cookies) {
            if (cookie.getName().contains("hopdong")) {
                FuramaHopDong hopdong = new FuramaHopDong();
                String[] cookieValue = cookie.getValue().split("_");
                hopdong.setId(Long.parseLong(cookieValue[0]));
                long idDichVu=Long.parseLong(cookieValue[1]);
                hopdong.setFuramaDichVu(dichVuService.getDichVu(idDichVu));
                hopdong.setNgayLamHopDong(cookieValue[2]);
                hopdong.setNgayKetThuc(cookieValue[3]);
                listHopDong.add(hopdong);
            }
        }
        ModelAndView modelAndView = new ModelAndView("dichvu/history");
        modelAndView.addObject("listHopDong",listHopDong);
        return modelAndView;
    }
}

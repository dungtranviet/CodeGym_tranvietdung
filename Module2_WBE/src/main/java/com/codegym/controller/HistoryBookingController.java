package com.codegym.controller;

import com.codegym.entity.FuramaHopDong;
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
    @GetMapping("/history")
    public ModelAndView getHistoryPage(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        ArrayList<FuramaHopDong> listHopDong = new ArrayList<>();
        System.out.println("do dai cookie "+cookies.length);
        for (Cookie cookie:cookies) {
            if (cookie.getName().contains("hopdong")) {
                FuramaHopDong hopdong = new FuramaHopDong();
                String[] cookieValue = cookie.getValue().split("_");
                hopdong.setId(Long.parseLong(cookieValue[0]));
                hopdong.setIdDichVu(Long.parseLong(cookieValue[1]));
                hopdong.setNgayLamHopDong(cookieValue[2]);
                hopdong.setNgayKetThuc(cookieValue[3]);
                listHopDong.add(hopdong);
            }
        }
        for (FuramaHopDong hopDong:listHopDong) {
            System.out.println(hopDong.getId());
            System.out.println(hopDong.getIdDichVu());
            System.out.println(hopDong.getNgayLamHopDong());
            System.out.println(hopDong.getNgayKetThuc());
            System.out.println("--------------------------------------");
        }
        ModelAndView modelAndView = new ModelAndView("dichvu/history");
        modelAndView.addObject("listHopDong",listHopDong);
        return modelAndView;
    }
}

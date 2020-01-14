package com.codegym.entity;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class ThanhPho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "tenthanhpho")
    @NotBlank(message = "trường không được để trống")
    private String tenThanhPho;
    @Column(name = "dienthich")
    @Min(value = 0,message = "diện tích phải lớn hơn 0")
    private Long dienTich;
    @Column(name = "danso")
    @Min(value = 0,message = "dân sô phải lớn hơn 0")
    private Long danSo;
    @Column(name = "gdp")
    @Min(value = 0,message = "GDP phải lớn hơn 0")
    private Long GDP;
    @Column(name = "mota")
    private String moTa;
    @ManyToOne
    @JoinColumn(name = "id_quocgia")
    QuocGia quocGia;
    public ThanhPho() {
    }

    public QuocGia getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(QuocGia quocGia) {
        this.quocGia = quocGia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTenThanhPho() {
        return tenThanhPho;
    }

    public void setTenThanhPho(String tenThanhPho) {
        this.tenThanhPho = tenThanhPho;
    }

    public Long getDienTich() {
        return dienTich;
    }

    public void setDienTich(Long dienTich) {
        this.dienTich = dienTich;
    }

    public Long getDanSo() {
        return danSo;
    }

    public void setDanSo(Long danSo) {
        this.danSo = danSo;
    }

    public Long getGDP() {
        return GDP;
    }

    public void setGDP(Long GDP) {
        this.GDP = GDP;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}

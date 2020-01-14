package com.codegym.entity;

import javax.persistence.*;

@Entity
public class QuocGia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_quocgia;
    @Column(name = "tenquocgia")
    private String tenQuocGia;

    public QuocGia() {
    }

    public Long getId_quocgia() {
        return id_quocgia;
    }

    public void setId_quocgia(Long id_quocgia) {
        this.id_quocgia = id_quocgia;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }
}

package com.codegym.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "loaidichvu")
public class FuramaLoaiDichVu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "tenloaidichvu")
    private String tenDichVu;
    @OneToMany(targetEntity = FuramaDichVu.class)
    private List<FuramaDichVu> furamaDichVu;
    public FuramaLoaiDichVu() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public List<FuramaDichVu> getFuramaDichVu() {
        return furamaDichVu;
    }

    public void setFuramaDichVu(List<FuramaDichVu> furamaDichVu) {
        this.furamaDichVu = furamaDichVu;
    }
}

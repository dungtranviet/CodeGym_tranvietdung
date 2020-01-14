package com.codegym.entity;

import javax.persistence.*;

@Entity
@Table(name = "hopdong")
public class FuramaHopDong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idhopdong")
    private Long id;
    @Column(name = "idnhanvien")
    private Long idNhanVien;
    @Column(name = "idkhachhang")
    private Long idKhachHang;
    @Column(name = "ngaylamhopdong")
    private String ngayLamHopDong;
    @Column(name = "ngayketthuc")
    private String ngayKetThuc;
    @Column(name = "tiendatcoc")
    private double tienDatCoc;
    @Column(name = "tongtien")
    private double tongTien;
    @ManyToOne
    @JoinColumn(name = "iddichvu")
    FuramaDichVu furamaDichVu;

    public FuramaHopDong() {
    }

    public Long getId() {
        System.out.println("sao lai vao day");
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(Long idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public Long getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(Long idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public String getNgayLamHopDong() {
        return ngayLamHopDong;
    }

    public void setNgayLamHopDong(String ngayLamHopDong) {
        this.ngayLamHopDong = ngayLamHopDong;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public double getTienDatCoc() {
        return tienDatCoc;
    }

    public void setTienDatCoc(double tienDatCoc) {
        this.tienDatCoc = tienDatCoc;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public FuramaDichVu getFuramaDichVu() {
        return furamaDichVu;
    }

    public void setFuramaDichVu(FuramaDichVu furamaDichVu) {
        this.furamaDichVu = furamaDichVu;
    }
}

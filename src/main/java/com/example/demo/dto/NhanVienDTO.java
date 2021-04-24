package com.example.demo.dto;

import java.util.Date;

public class NhanVienDTO {
    private String    manhanvien;
    private String    ho;
    private String    ten;
    private Date    ngaysinh;
    private Date ngaylamviec;
    private String   diachi;
    private String   dienthoai;
    private Double   luongcoban;
    private Double  phucap;

    public NhanVienDTO() {
    }

    public NhanVienDTO(String manhanvien, String ho, String ten) {
        this.manhanvien = manhanvien;
        this.ho = ho;
        this.ten = ten;
    }

    public NhanVienDTO(String manhanvien, String ho, String ten, Date ngaysinh, Date ngaylamviec, String diachi, String dienthoai, Double luongcoban, Double phucap) {
        this.manhanvien = manhanvien;
        this.ho = ho;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.ngaylamviec = ngaylamviec;
        this.diachi = diachi;
        this.dienthoai = dienthoai;
        this.luongcoban = luongcoban;
        this.phucap = phucap;
    }

    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public Date getNgaylamviec() {
        return ngaylamviec;
    }

    public void setNgaylamviec(Date ngaylamviec) {
        this.ngaylamviec = ngaylamviec;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public Double getLuongcoban() {
        return luongcoban;
    }

    public void setLuongcoban(Double luongcoban) {
        this.luongcoban = luongcoban;
    }

    public Double getPhucap() {
        return phucap;
    }

    public void setPhucap(Double phucap) {
        this.phucap = phucap;
    }
}

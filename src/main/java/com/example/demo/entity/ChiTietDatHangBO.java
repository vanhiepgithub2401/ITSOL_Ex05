package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="chitietdathang")
public class ChiTietDatHangBO {
    @Id
    @Column(name = "sohoadon")
    private int    sohoadon;
    @Column(name = "mahang")
    private String    mahang;
    @Column(name = "giaban")
    private double    giaban;
    @Column(name = "soluong")
    private int    soluong;
    @Column(name = "mucgiamgia")
    private double    mucgiamgia;

    public ChiTietDatHangBO() {
    }

    public ChiTietDatHangBO(int sohoadon, String mahang, double giaban, int soluong, double mucgiamgia) {
        this.sohoadon = sohoadon;
        this.mahang = mahang;
        this.giaban = giaban;
        this.soluong = soluong;
        this.mucgiamgia = mucgiamgia;
    }

    public int getSohoadon() {
        return sohoadon;
    }

    public void setSohoadon(int sohoadon) {
        this.sohoadon = sohoadon;
    }

    public String getMahang() {
        return mahang;
    }

    public void setMahang(String mahang) {
        this.mahang = mahang;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getMucgiamgia() {
        return mucgiamgia;
    }

    public void setMucgiamgia(double mucgiamgia) {
        this.mucgiamgia = mucgiamgia;
    }
}

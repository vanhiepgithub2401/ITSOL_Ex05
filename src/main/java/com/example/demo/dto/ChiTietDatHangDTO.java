package com.example.demo.dto;

public class ChiTietDatHangDTO {
private int    sohoadon;
    private String    mahang;
    private double    giaban;
    private int    soluong;
    private double    mucgiamgia;

    public ChiTietDatHangDTO() {
    }

    public ChiTietDatHangDTO(int sohoadon, String mahang, double giaban, int soluong, double mucgiamgia) {
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

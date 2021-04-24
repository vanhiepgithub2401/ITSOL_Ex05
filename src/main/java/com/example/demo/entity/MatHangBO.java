package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mathang")
public class MatHangBO {
    @Id
    @Column(name = "mahang")
    private String    mahang;
    @Column(name = "tenhang")
    private String    tenhang;
    @Column(name = "macongty")
    private String    macongty;
    @Column(name = "maloaihang")
    private int   maloaihang;
    @Column(name = "soluong")
    private int   soluong;
    @Column(name = "donvitinh")
    private String  donvitinh;
    @Column(name = "giahang")
    private Double    giahang;

    public MatHangBO() {
    }

    public MatHangBO(String mahang, String tenhang, String macongty, int maloaihang, int soluong, String donvitinh, Double giahang) {
        this.mahang = mahang;
        this.tenhang = tenhang;
        this.macongty = macongty;
        this.maloaihang = maloaihang;
        this.soluong = soluong;
        this.donvitinh = donvitinh;
        this.giahang = giahang;
    }

    public String getMahang() {
        return mahang;
    }

    public void setMahang(String mahang) {
        this.mahang = mahang;
    }

    public String getTenhang() {
        return tenhang;
    }

    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }

    public String getMacongty() {
        return macongty;
    }

    public void setMacongty(String macongty) {
        this.macongty = macongty;
    }

    public int getMaloaihang() {
        return maloaihang;
    }

    public void setMaloaihang(int maloaihang) {
        this.maloaihang = maloaihang;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getDonvitinh() {
        return donvitinh;
    }

    public void setDonvitinh(String donvitinh) {
        this.donvitinh = donvitinh;
    }

    public Double getGiahang() {
        return giahang;
    }

    public void setGiahang(Double giahang) {
        this.giahang = giahang;
    }
}

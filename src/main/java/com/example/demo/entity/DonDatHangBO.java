package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table(name = "dondathang")
public class DonDatHangBO {
    @Id
    @Column(name = "sohoadon")
    private int    sohoadon;
    @Column(name = "makhachhang")
    private String    makhachhang;
    @Column(name = "manhanvien")
    private String     manhanvien;
    @Column(name = "ngaydathang")
    private Date ngaydathang;
    @Column(name = "ngaygiaohang")
    private Date    ngaygiaohang;
    @Column(name = "ngaychuyenhang")
    private Date   ngaychuyenhang;
    @Column(name = "noigiaohang")
    private String    noigiaohang;

    public DonDatHangBO() {
    }

    public DonDatHangBO(int sohoadon, String makhachhang, String manhanvien, Date ngaydathang, Date ngaygiaohang, Date ngaychuyenhang, String noigiaohang) {
        this.sohoadon = sohoadon;
        this.makhachhang = makhachhang;
        this.manhanvien = manhanvien;
        this.ngaydathang = ngaydathang;
        this.ngaygiaohang = ngaygiaohang;
        this.ngaychuyenhang = ngaychuyenhang;
        this.noigiaohang = noigiaohang;
    }

    public int getSohoadon() {
        return sohoadon;
    }

    public void setSohoadon(int sohoadon) {
        this.sohoadon = sohoadon;
    }

    public String getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(String makhachhang) {
        this.makhachhang = makhachhang;
    }

    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }

    public Date getNgaydathang() {
        return ngaydathang;
    }

    public void setNgaydathang(Date ngaydathang) {
        this.ngaydathang = ngaydathang;
    }

    public Date getNgaygiaohang() {
        return ngaygiaohang;
    }

    public void setNgaygiaohang(Date ngaygiaohang) {
        this.ngaygiaohang = ngaygiaohang;
    }

    public Date getNgaychuyenhang() {
        return ngaychuyenhang;
    }

    public void setNgaychuyenhang(Date ngaychuyenhang) {
        this.ngaychuyenhang = ngaychuyenhang;
    }

    public String getNoigiaohang() {
        return noigiaohang;
    }

    public void setNoigiaohang(String noigiaohang) {
        this.noigiaohang = noigiaohang;
    }
}

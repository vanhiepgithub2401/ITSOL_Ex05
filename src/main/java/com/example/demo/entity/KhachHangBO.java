package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "khachhang")
public class KhachHangBO {
    @Id
    @Column(name = "makhachhang")
    private String   makhachhang;
    @Column(name = "tencongty")
    private String   tencongty;
    @Column(name = "tengiaodich")
    private String   tengiaodich;
    @Column(name = "diachi")
    private String   diachi;
    @Column(name = "email")
    private String  email;
    @Column(name = "dienthoai")
    private String  dienthoai;
    @Column(name = "fax")
    private String  fax;

    public KhachHangBO() {
    }

    public KhachHangBO(String makhachhang, String tencongty, String tengiaodich, String diachi, String email, String dienthoai, String fax) {
        this.makhachhang = makhachhang;
        this.tencongty = tencongty;
        this.tengiaodich = tengiaodich;
        this.diachi = diachi;
        this.email = email;
        this.dienthoai = dienthoai;
        this.fax = fax;
    }

    public String getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(String makhachhang) {
        this.makhachhang = makhachhang;
    }

    public String getTencongty() {
        return tencongty;
    }

    public void setTencongty(String tencongty) {
        this.tencongty = tencongty;
    }

    public String getTengiaodich() {
        return tengiaodich;
    }

    public void setTengiaodich(String tengiaodich) {
        this.tengiaodich = tengiaodich;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
}

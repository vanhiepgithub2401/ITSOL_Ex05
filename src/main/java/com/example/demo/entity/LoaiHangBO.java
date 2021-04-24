package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loaihang")
public class LoaiHangBO {
    @Id
    @Column(name = "maloaihang")
 private int   maloaihang;
    @Column(name = "tenloaihang")
 private String   tenloaihang;

    public LoaiHangBO() {
    }

    public LoaiHangBO(int maloaihang, String tenloaihang) {
        this.maloaihang = maloaihang;
        this.tenloaihang = tenloaihang;
    }

    public int getMaloaihang() {
        return maloaihang;
    }

    public void setMaloaihang(int maloaihang) {
        this.maloaihang = maloaihang;
    }

    public String getTenloaihang() {
        return tenloaihang;
    }

    public void setTenloaihang(String tenloaihang) {
        this.tenloaihang = tenloaihang;
    }
}

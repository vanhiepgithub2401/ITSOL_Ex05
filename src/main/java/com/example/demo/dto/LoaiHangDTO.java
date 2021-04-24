package com.example.demo.dto;

public class LoaiHangDTO {
 private int   maloaihang;
 private String   tenloaihang;

    public LoaiHangDTO() {
    }

    public LoaiHangDTO(int maloaihang, String tenloaihang) {
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

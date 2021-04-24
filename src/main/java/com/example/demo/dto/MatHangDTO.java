package com.example.demo.dto;

public class MatHangDTO {

    private String    mahang;
    private String    tenhang;
    private String    macongty;
    private int   maloaihang;
    private int   soluong;
    private String  donvitinh;
    private Double    giahang;

    public MatHangDTO() {
    }

    public MatHangDTO(String mahang, String tenhang, String macongty, int maloaihang, int soluong, String donvitinh, Double giahang) {
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

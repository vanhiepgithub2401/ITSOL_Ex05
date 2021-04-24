package com.example.demo.dto;

public class KhachHangDTO {
 private String   makhachhang;
    private String   tencongty;
    private String   tengiaodich;
    private String   diachi;
    private String  email;
    private String  dienthoai;
    private String  fax;

    public KhachHangDTO() {
    }

    public KhachHangDTO(String makhachhang, String tencongty, String tengiaodich, String diachi, String email, String dienthoai, String fax) {
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

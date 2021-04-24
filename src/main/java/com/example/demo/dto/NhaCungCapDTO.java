package com.example.demo.dto;

public class NhaCungCapDTO {
    private String    macongty ;
    private String   tencongty ;
    private String   tengiaodich ;
    private String   diachi ;
    private String   dienthoai ;
    private String   fax;
    private String  email;

    public NhaCungCapDTO() {
    }

    public NhaCungCapDTO(String macongty, String tencongty, String tengiaodich, String diachi, String dienthoai, String fax, String email) {
        this.macongty = macongty;
        this.tencongty = tencongty;
        this.tengiaodich = tengiaodich;
        this.diachi = diachi;
        this.dienthoai = dienthoai;
        this.fax = fax;
        this.email = email;
    }

    public String getMacongty() {
        return macongty;
    }

    public void setMacongty(String macongty) {
        this.macongty = macongty;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

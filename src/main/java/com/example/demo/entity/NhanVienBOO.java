package com.example.demo.entity;

import com.example.demo.dto.NhanVienDTO;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "nhanvien")
@SqlResultSetMapping(
        name = "emp_not_sales_mapping", // NhanVienDAO
        classes = {
                @ConstructorResult(
                        targetClass = NhanVienDTO.class,
                        columns = {
                                @ColumnResult(name = "manhanvien", type = String.class),
                                @ColumnResult(name = "ho", type = String.class),
                                @ColumnResult(name = "ten", type = String.class),
                        }
                )
        }
)
public class NhanVienBOO {
    @Id
    @Column(name = "manhanvien")
    private String    manhanvien;@Column(name = "ho")
    private String    ho;@Column(name = "ten")
    private String    ten;@Column(name = "ngaysinh")
    private Date ngaysinh;@Column(name = "ngaylamviec")
    private Date ngaylamviec;@Column(name = "diachi")
    private String   diachi;@Column(name = "dienthoai")
    private String   dienthoai;@Column(name = "luongcoban")
    private Double   luongcoban;@Column(name = "phucap")
    private Double  phucap;

    public NhanVienBOO() {
    }

    public NhanVienBOO(String manhanvien, String ho, String ten, Date ngaysinh, Date ngaylamviec, String diachi, String dienthoai, Double luongcoban, Double phucap) {
        this.manhanvien = manhanvien;
        this.ho = ho;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.ngaylamviec = ngaylamviec;
        this.diachi = diachi;
        this.dienthoai = dienthoai;
        this.luongcoban = luongcoban;
        this.phucap = phucap;
    }

    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public Date getNgaylamviec() {
        return ngaylamviec;
    }

    public void setNgaylamviec(Date ngaylamviec) {
        this.ngaylamviec = ngaylamviec;
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

    public Double getLuongcoban() {
        return luongcoban;
    }

    public void setLuongcoban(Double luongcoban) {
        this.luongcoban = luongcoban;
    }

    public Double getPhucap() {
        return phucap;
    }

    public void setPhucap(Double phucap) {
        this.phucap = phucap;
    }
}

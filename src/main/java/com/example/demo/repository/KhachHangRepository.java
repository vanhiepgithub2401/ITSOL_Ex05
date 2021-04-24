package com.example.demo.repository;

import com.example.demo.entity.KhachHangBO;
import com.example.demo.entity.NhanVienBOO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhachHangRepository extends JpaRepository<KhachHangBO,String> {
}

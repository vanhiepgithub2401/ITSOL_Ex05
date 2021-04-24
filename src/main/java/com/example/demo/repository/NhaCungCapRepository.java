package com.example.demo.repository;

import com.example.demo.entity.NhaCungCapBO;
import com.example.demo.entity.NhanVienBOO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhaCungCapRepository extends JpaRepository<NhaCungCapBO,String> {
}

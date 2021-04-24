package com.example.demo.dao;

import com.example.demo.dto.NhanVienDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class NhanVienDAO {
    @PersistenceContext
    private EntityManager entityManager;

    public List<NhanVienDTO> getEmpNotSales(){
        StringBuilder sql = new StringBuilder();
        sql.append(" SELECT ");
        sql.append("    NV.manhanvien, ");
        sql.append("    NV.ho, ");
        sql.append("    NV.ten ");
        sql.append(" FROM nhanvien NV ");
        sql.append(" WHERE NOT EXISTS ( SELECT DDH.manhanvien FROM dondathang DDH WHERE NV.manhanhvien = DDH.manhanhvien ) ");
        Query query =entityManager.createNativeQuery(sql.toString(),"emp_not_sales_mapping");
        return  query.getResultList();
    }
}

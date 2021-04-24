package com.example.demo.service;

import com.example.demo.dao.NhanVienDAO;
import com.example.demo.dto.NhanVienDTO;
import com.example.demo.entity.NhanVienBOO;
import com.example.demo.mapper.NhanVienMapper;
import com.example.demo.repository.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NhanVienService {
    @Autowired
    public NhanVienRepository nhanVienRepository;

    @Autowired
    public NhanVienMapper nhanVienMapper;
    @Autowired
    public NhanVienDAO nhanVienDAO;

    public List<NhanVienDTO> getEmpNotSales(){
        return nhanVienDAO.getEmpNotSales();
    }

    public List<NhanVienDTO> getEmp(){
        List<NhanVienBOO> all = nhanVienRepository.findAll();
        return nhanVienMapper.toDto(all);
    }

    public NhanVienDTO getEmpByString(String manhanvien){
        Optional<NhanVienBOO> byId = nhanVienRepository.findById(manhanvien);
        return nhanVienMapper.toDto(byId.get());
    }

    public NhanVienDTO insertEmp(NhanVienBOO n){
        return nhanVienMapper.toDto(nhanVienRepository.save(n));
    }

    public NhanVienDTO updateEmp(NhanVienBOO n,String manhanvien){
        NhanVienBOO nhanVienBOO = nhanVienRepository.findById(manhanvien).get();

        return nhanVienMapper.toDto(nhanVienRepository.save(nhanVienBOO));
    }

    public void deleteEmp(String manhanvien){
        nhanVienRepository.deleteById(manhanvien);
    }
}

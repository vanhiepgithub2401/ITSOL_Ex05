package com.example.demo.service;

import com.example.demo.dto.KhachHangDTO;
import com.example.demo.entity.KhachHangBO;
import com.example.demo.mapper.KhachHangMapper;
import com.example.demo.repository.KhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KhachHangService {
    @Autowired
    public KhachHangRepository KhachHangRepository;

    @Autowired
    public KhachHangMapper KhachHangMapper;
//    @Autowired
//    public KhachHangDAO KhachHangDAO;
//
//    public List<KhachHangDTO> getEmpNotSales(){
//        return KhachHangDAO.getEmpNotSales();
//    }

    public List<KhachHangDTO> getEmp(){
        List<KhachHangBO> all = KhachHangRepository.findAll();
        return KhachHangMapper.toDto(all);
    }

    public KhachHangDTO getEmpByString(String maKhachHang){
        Optional<KhachHangBO> byId = KhachHangRepository.findById(maKhachHang);
        return KhachHangMapper.toDto(byId.get());
    }

    public KhachHangDTO insertEmp(KhachHangBO n){
        return KhachHangMapper.toDto(KhachHangRepository.save(n));
    }

    public KhachHangDTO updateEmp(KhachHangBO n,String maKhachHang){
        KhachHangBO KhachHangBO = KhachHangRepository.findById(maKhachHang).get();

        return KhachHangMapper.toDto(KhachHangRepository.save(KhachHangBO));
    }

    public void deleteEmp(String maKhachHang){
        KhachHangRepository.deleteById(maKhachHang);
    }
}

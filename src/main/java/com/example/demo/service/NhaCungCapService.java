package com.example.demo.service;

import com.example.demo.dto.NhaCungCapDTO;
import com.example.demo.entity.NhaCungCapBO;
import com.example.demo.mapper.NhaCungCapMapper;
import com.example.demo.repository.NhaCungCapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NhaCungCapService {
    @Autowired
    public NhaCungCapRepository nhaCungCapRepository;

    @Autowired
    public NhaCungCapMapper nhaCungCapMapper;
//    @Autowired
//    public NhaCungCapDAO NhaCungCapDAO;
//
//    public List<NhaCungCapDTO> getEmpNotSales(){
//        return NhaCungCapDAO.getEmpNotSales();
//    }

    public List<NhaCungCapDTO> getEmp(){
        List<NhaCungCapBO> all = nhaCungCapRepository.findAll();
        return nhaCungCapMapper.toDto(all);
    }

    public NhaCungCapDTO getEmpByString(String maNhaCungCap){
        Optional<NhaCungCapBO> byId = nhaCungCapRepository.findById(maNhaCungCap);
        return nhaCungCapMapper.toDto(byId.get());
    }

    public NhaCungCapDTO insertEmp(NhaCungCapBO n){
        return nhaCungCapMapper.toDto(nhaCungCapRepository.save(n));
    }

    public NhaCungCapDTO updateEmp(NhaCungCapBO n,String maNhaCungCap){
        NhaCungCapBO NhaCungCapBO = nhaCungCapRepository.findById(maNhaCungCap).get();

        return nhaCungCapMapper.toDto(nhaCungCapRepository.save(NhaCungCapBO));
    }

    public void deleteEmp(String maNhaCungCap){
        nhaCungCapRepository.deleteById(maNhaCungCap);
    }
}

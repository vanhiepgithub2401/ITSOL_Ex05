package com.example.demo.mapper;

import com.example.demo.dto.DonDatHangDTO;
import com.example.demo.dto.LoaiHangDTO;
import com.example.demo.dto.NhanVienDTO;
import com.example.demo.entity.DonDatHangBO;
import com.example.demo.entity.LoaiHangBO;
import com.example.demo.entity.NhanVienBOO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LoaiHangMapper extends EntityMapper<DonDatHangDTO, DonDatHangBO>{

}

package com.example.demo.mapper;

import com.example.demo.dto.ChiTietDatHangDTO;
import com.example.demo.dto.NhanVienDTO;
import com.example.demo.entity.ChiTietDatHangBO;
import com.example.demo.entity.NhanVienBOO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ChiTietDatHangMapper extends EntityMapper<ChiTietDatHangDTO, ChiTietDatHangBO>{

}

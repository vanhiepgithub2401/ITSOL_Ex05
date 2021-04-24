package com.example.demo.mapper;

import com.example.demo.dto.NhanVienDTO;
import com.example.demo.entity.NhanVienBOO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NhanVienMapper extends EntityMapper<NhanVienDTO, NhanVienBOO>{

}

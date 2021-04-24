package com.example.demo.mapper;

import com.example.demo.dto.NhaCungCapDTO;
import com.example.demo.dto.NhanVienDTO;
import com.example.demo.entity.NhaCungCapBO;
import com.example.demo.entity.NhanVienBOO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NhaCungCapMapper extends EntityMapper<NhaCungCapDTO, NhaCungCapBO>{

}

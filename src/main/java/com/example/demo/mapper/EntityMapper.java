package com.example.demo.mapper;

import java.util.List;

public interface EntityMapper<D,E> {
    //D-DTO..........E-BO:
    public E toEntity(D dto);//DTO sang BO

    public D toDto(E entity);//BO sang DTO

    public List<E> toEntity(List<D> dtoList);

    public List<D> toDto(List<E> entityList);
}

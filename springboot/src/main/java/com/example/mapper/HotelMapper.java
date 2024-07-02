package com.example.mapper;

import com.example.entity.Hotel;

import java.util.List;


public interface HotelMapper {

    void insert(Hotel hotel);
    Hotel selectById(Integer id);
    List<Hotel> selectAll(Hotel hotel);
    void updateById(Hotel hotel);
    void deleteById(Integer id);
}
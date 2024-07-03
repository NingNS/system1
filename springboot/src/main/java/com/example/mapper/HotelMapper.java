package com.example.mapper;

import com.example.entity.Hotel;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface HotelMapper {

    void insert(Hotel hotel);
    @Select("select * from hotel where id =#{id}")
    Hotel selectById(Integer id);

    List<Hotel> selectAll(Hotel hotel);
    void updateById(Hotel hotel);
    void deleteById(Integer id);

    @Select("select * from hotel where username = #{username}")
    Hotel selectByUsername(String username);
}
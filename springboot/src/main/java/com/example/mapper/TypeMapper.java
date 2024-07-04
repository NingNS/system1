package com.example.mapper;

import com.example.entity.Type;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TypeMapper {

    /**
     * 新增
     */
    int insert(Type type);

    /**
     * 删除
     */
    int deleteById(Integer id);

    /**
     * 修改
     */
    int updateById(Type type);

    /**
     * 根据ID查询
     */
    Type selectById(Integer id);

    /**
     * 查询所有
     */
    List<Type> selectAll(Type type);

    /**
     * 根据酒店id查酒店房间类型
     * @param hotelId
     * @return
     */
    @Select("select * from type where hotel_id = #{hotelId}")
    List<Type> selectByHotelId(Integer hotelId);

}

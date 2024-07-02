package com.example.service;

import com.example.entity.Admin;
import com.example.entity.Hotel;
import com.example.mapper.HotelMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 管理员业务处理
 **/
@Service
public class HotelService {

    @Resource
    private HotelMapper hotelMapper;


    public void add(Hotel hotel) {
        hotelMapper.insert(hotel);
    }

    public List<Hotel> selectAll(Hotel hotel) {
        return hotelMapper.selectAll(hotel);
    }

    public PageInfo<Hotel> selectPage(Hotel hotel, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Hotel> list = hotelMapper.selectAll(hotel);
        return PageInfo.of(list);
    }

    public void updateById(Hotel hotel) {
        hotelMapper.updateById(hotel);
    }

    public void deleteById(Integer id) {
        hotelMapper.deleteById(id);
    }

    /**
     * 批量删除
     */
    public void deleteBatch(List<Integer> ids) {
        for (Integer id : ids) {
            hotelMapper.deleteById(id);
        }
    }
}
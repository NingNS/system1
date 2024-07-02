package com.example.service;

import com.example.mapper.HotelMapper;
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



}
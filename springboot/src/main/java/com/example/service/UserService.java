package com.example.service;

import cn.hutool.core.util.ObjectUtil;
import com.example.common.enums.ResultCodeEnum;
import com.example.common.enums.RoleEnum;
import com.example.common.enums.StatusEnum;
import com.example.entity.Account;
import com.example.entity.Hotel;
import com.example.entity.User;
import com.example.exception.CustomException;
import com.example.mapper.HotelMapper;
import com.example.mapper.UserMapper;
import com.example.utils.TokenUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户业务处理
 **/
@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public void add(User user) {
        // 1. 做一下重复性校验
        User dbUser = userMapper.selectByUsername(user.getUsername());
        if (ObjectUtil.isNotEmpty(dbUser)) {
            throw new CustomException(ResultCodeEnum.USER_EXIST_ERROR);
        }
        if (ObjectUtil.isEmpty(user.getPassword())) {
            user.setPassword("123456");
        }
        if (ObjectUtil.isEmpty(user.getRole())) {
            user.setRole(RoleEnum.USER.name());
        }
        if (ObjectUtil.isEmpty(user.getAvatar())) {
            user.setAvatar("http://localhost:9090/files/1719976418223-20230214235441_1.jpg");
        }
        userMapper.insert(user);
    }

    public PageInfo<User> selectPage(User user, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> hotels = userMapper.selectAll(user);
        return PageInfo.of(hotels);
    }
    public List<User> selectAll(User user) {
        return userMapper.selectAll(user);
    }



    public void deleteById(Integer id) {
        userMapper.deleteById(id);
    }

    /**
     * 批量删除
     */
    public void deleteBatch(List<Integer> ids) {
        for (Integer id : ids) {
            userMapper.deleteById(id);
        }
    }
}
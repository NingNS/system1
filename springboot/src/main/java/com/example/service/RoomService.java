package com.example.service;

import cn.hutool.core.util.ObjectUtil;
import com.example.common.enums.ResultCodeEnum;
import com.example.common.enums.RoleEnum;
import com.example.common.enums.RoomEnum;
import com.example.entity.Account;
import com.example.entity.Hotel;
import com.example.entity.Room;
import com.example.entity.Type;
import com.example.exception.CustomException;
import com.example.mapper.RoomMapper;
import com.example.mapper.TypeMapper;
import com.example.utils.TokenUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoomService {

    @Resource
    private RoomMapper roomMapper;
    @Resource
    private TypeMapper typeMapper;

    /**
     * 新增
     */
    public void add(Room room) {
        Room roomUser = roomMapper.selectByName(room.getName());
        if (ObjectUtil.isNotEmpty(roomUser)) {
            throw new CustomException(ResultCodeEnum.USER_EXIST_ERROR);
        }
        room.setStatus(RoomEnum.STATUS_OK.status);
        roomMapper.insert(room);

        // 向对应的酒店里面该分类下面的房间数量+1
        Type type = typeMapper.selectById(room.getTypeId());
        if (ObjectUtil.isNotEmpty(type)) {
            type.setNum(type.getNum() + 1);
            typeMapper.updateById(type);
        }
    }

    /**
     * 删除
     */
    public void deleteById(Integer id) {
        Room room = roomMapper.selectById(id);
        Type type = typeMapper.selectById(room.getTypeId());
        if (ObjectUtil.isNotEmpty(type)) {
            type.setNum(type.getNum() - 1);
            typeMapper.updateById(type);
        }
        roomMapper.deleteById(id);
    }

    /**
     * 批量删除
     */
    public void deleteBatch(List<Integer> ids) {
        for (Integer id : ids) {
            Room room = roomMapper.selectById(id);
            Type type = typeMapper.selectById(room.getTypeId());
            if (ObjectUtil.isNotEmpty(type)) {
                type.setNum(type.getNum() - 1);
                typeMapper.updateById(type);
            }
            roomMapper.deleteById(id);
        }
    }

    /**
     * 修改
     */
//    public void updateById(Room room) {
//        Type type = typeMapper.selectById(room.getTypeId());
//        if (ObjectUtil.isNotEmpty(type)) {
//            type.setNum(type.getNum() + 1);
//            typeMapper.updateById(type);
//        }
//        roomMapper.updateById(room);
//    }
    /**
     * 修改
     */
    public void updateById(Room room) {
        // 获取原来的房间信息
        Room oldRoom = roomMapper.selectById(room.getId());
        if (oldRoom == null) {
            throw new RuntimeException("房间不存在");
        }

        // 获取新类型和旧类型的信息
        Type oldType = typeMapper.selectById(oldRoom.getTypeId());
        Type newType = typeMapper.selectById(room.getTypeId());

        // 如果新类型和旧类型不一样，则进行更新
        if (oldType != null && newType != null) {
            if (!oldType.getId().equals(newType.getId())) {
                // 旧类型num减1
                oldType.setNum(oldType.getNum() - 1);
                typeMapper.updateById(oldType);

                // 新类型num加1
                newType.setNum(newType.getNum() + 1);
                typeMapper.updateById(newType);
            }
        }

        // 更新房间信息
        roomMapper.updateById(room);
    }


    /**
     * 根据ID查询
     */
    public Room selectById(Integer id) {
        return roomMapper.selectById(id);
    }

    /**
     * 查询所有
     */
    public List<Room> selectAll(Room room) {
        return roomMapper.selectAll(room);
    }

    /**
     * 分页查询
     */
    public PageInfo<Room> selectPage(Room room, Integer pageNum, Integer pageSize) {
        Account currentUser = TokenUtils.getCurrentUser();
        if (RoleEnum.HOTEL.name().equals(currentUser.getRole())) {
            room.setHotelId(currentUser.getId());
        }
        PageHelper.startPage(pageNum, pageSize);
        List<Room> list = roomMapper.selectAll(room);
        return PageInfo.of(list);
    }

}

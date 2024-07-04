package com.example.entity;

import java.io.Serializable;

/**
 * 客房信息表
 */
public class Room implements Serializable {
    private static final long serialVersionUID = 1L;

    /** ID */
    private Integer id;
    /** 房间编号 */
    private String name;
    /** 房间状态 */
    private String status;
    /** 分类ID */
    private Integer typeId;
    /** 酒店ID */
    private Integer HotelId;
    private String TypeName;
    private String HotelName;

    public String getTypeName() {
        return TypeName;
    }

    public void setTypeName(String typeName) {
        TypeName = typeName;
    }

    public String getHotelName() {
        return HotelName;
    }

    public void setHotelName(String hotelName) {
        HotelName = hotelName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHotelId() {
        return HotelId;
    }

    public void setHotelId(Integer hotelId) {
        HotelId = hotelId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.example.entity;

import java.io.Serializable;

public class Orders implements Serializable {
    private static final long serialVersionUID = 1L;

    /** ID */
    private Integer id;
    /** 订单 */
    private String orderId;
    /** 订单状态 */
    private String status;
    /** 分类ID */
    private Integer typeId;
    /** 酒店ID */
    private Integer HotelId;
    private Integer userId;
    private String time;
    private String inTime;
    private String outTime;
    private Long days;
    private Double price;

    private String typeName;
    private String hotelName;
    private String userName;
    private String typeImg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeImg() {
        return typeImg;
    }

    public void setTypeImg(String typeImg) {
        this.typeImg = typeImg;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getDays() {
        return days;
    }

    public void setDays(Long days) {
        this.days = days;
    }

    public String getOutTime() {
        return outTime;
    }

    public void setOutTime(String outTime) {
        this.outTime = outTime;
    }

    public String getInTime() {
        return inTime;
    }

    public void setInTime(String inTime) {
        this.inTime = inTime;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", orderId='" + orderId + '\'' +
                ", status='" + status + '\'' +
                ", typeId=" + typeId +
                ", HotelId=" + HotelId +
                ", userId=" + userId +
                ", time='" + time + '\'' +
                ", inTime='" + inTime + '\'' +
                ", outTime='" + outTime + '\'' +
                ", days=" + days +
                ", price=" + price +
                ", typeName='" + typeName + '\'' +
                ", hotelName='" + hotelName + '\'' +
                ", userName='" + userName + '\'' +
                ", typeImg='" + typeImg + '\'' +
                '}';
    }
}

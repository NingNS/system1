package com.example.common.enums;

public enum RoomEnum {
    STATUS_OK("空闲"),
    STATUS_NO("使用中")
;
    public String status;

    RoomEnum(String status) {
        this.status = status;
    }




}

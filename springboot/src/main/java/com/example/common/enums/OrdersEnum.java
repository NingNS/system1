package com.example.common.enums;

public enum OrdersEnum {
    STATUS_CHECKING("代入住"),
    STATUS_IN("已入住"),
    STATUS_OUT("已退房"),


    ;
    public String status;

    OrdersEnum(String status) {
        this.status = status;
    }




}
package com.example.common.enums;

public enum StatusEnum {
    CHECKING("待审核"),
    CHECK_OK("通过"),
    CHECK_NO("不通过")
;
    public String status;

    StatusEnum(String status) {
        this.status = status;
    }




}

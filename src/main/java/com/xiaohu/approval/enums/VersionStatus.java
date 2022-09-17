package com.xiaohu.approval.enums;

public enum VersionStatus {
    APPLY(0,"待发布"),APPROVAL(1,"待审核"),APPLICATION(2,"待应用"),
    APPROVAL_FAIL(3,"审核驳回"),APPLICATION_SUCCESS(4,"应用成功");

    private int code;

    private  String message;

    VersionStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }


}

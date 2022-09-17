package com.xiaohu.approval.bean;

import com.xiaohu.approval.enums.OperationType;
import com.xiaohu.approval.enums.VersionStatus;

public class ApprovalPojo {

    /**
     * 操作类型
     */
    private OperationType operationType;

    /**
     * 审核状态
     */
    private VersionStatus versionStatus;

    /**
     * 操作类型唯一code
     */
    private Long code;
    /**
     * 是否审核成功
     */
    private boolean isSuccess;

    /**
     * 是否是重新发布
     */
    private boolean isAgainApply;

    /**
     * 版本
     */
    private int version;

    public boolean isAgainApply() {
        return isAgainApply;
    }

    public void setAgainApply(boolean againApply) {
        isAgainApply = againApply;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "ApprovalPojo{" +
                "operationType=" + operationType +
                ", versionStatus=" + versionStatus +
                ", code=" + code +
                ", isSuccess=" + isSuccess +
                ", isAgainApply=" + isAgainApply +
                ", version=" + version +
                '}';
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    public VersionStatus getVersionStatus() {
        return versionStatus;
    }

    public void setVersionStatus(VersionStatus versionStatus) {
        this.versionStatus = versionStatus;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }
}

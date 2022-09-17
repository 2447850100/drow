package com.xiaohu.approval.filter;

import com.xiaohu.approval.bean.ApprovalPojo;
import com.xiaohu.approval.enums.VersionStatus;

public class ApprovalFilter extends FilterChain {
    @Override
    public ApprovalPojo handler(ApprovalPojo approvalPojo) throws Exception {
        if (approvalPojo.getVersionStatus() == VersionStatus.APPROVAL_FAIL) {
            throw new Exception("审核驳回的话，状态流程结束，不能往下流转");
        }
        if (approvalPojo.getVersionStatus() == VersionStatus.APPROVAL) {
            if (approvalPojo.isAgainApply()) {
                System.out.println("重新发布 版本+1");
                approvalPojo.setVersion(approvalPojo.getVersion() + 1);
                approvalPojo.setVersionStatus(VersionStatus.APPROVAL);
                approvalPojo.setAgainApply(false);
                approvalPojo.setSuccess(true);
                return approvalPojo;
            }
            if (approvalPojo.isSuccess()) {
                System.out.println("待审核更新为待应用");
                approvalPojo.setVersionStatus(VersionStatus.APPLICATION);
                approvalPojo.setSuccess(true);
            } else {
                System.out.println("待审核更新为审核驳回");
                approvalPojo.setVersionStatus(VersionStatus.APPROVAL_FAIL);
                approvalPojo.setSuccess(false);
            }
            return approvalPojo;
        } else {
            return next.handler(approvalPojo);
        }
    }
}

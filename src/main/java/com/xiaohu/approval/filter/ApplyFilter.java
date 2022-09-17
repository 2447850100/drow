package com.xiaohu.approval.filter;

import com.xiaohu.approval.bean.ApprovalPojo;
import com.xiaohu.approval.enums.VersionStatus;

public class ApplyFilter extends FilterChain{
    @Override
    public ApprovalPojo handler(ApprovalPojo approvalPojo) throws Exception {
        if (approvalPojo.getVersionStatus() == VersionStatus.APPROVAL_FAIL) {
            throw new Exception("审核驳回的话，状态流程结束，不能往下流转");
        }
        if (approvalPojo.getVersionStatus() == VersionStatus.APPLY) {
            if (approvalPojo.isAgainApply()) {
                System.out.println("重新发布 版本+1");
                approvalPojo.setVersion(approvalPojo.getVersion() + 1);
                approvalPojo.setAgainApply(false);
                approvalPojo.setSuccess(true);
            }
            System.out.println("待发布更新为待审核");
            approvalPojo.setVersionStatus(VersionStatus.APPROVAL);
            approvalPojo.setSuccess(true);
            return approvalPojo;
        }else {
            //实现让客户端自己控制，状态流向，否则不需要else直接更新完next.handle
            return next.handler(approvalPojo);
        }
    }
}

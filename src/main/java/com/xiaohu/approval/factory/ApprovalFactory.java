package com.xiaohu.approval.factory;

import com.xiaohu.approval.bean.ApprovalPojo;

public interface ApprovalFactory {

    ApprovalPojo apply(ApprovalPojo approvalPojo) throws Exception;

    ApprovalPojo approval(ApprovalPojo approvalPojo) throws Exception;

    ApprovalPojo application(ApprovalPojo approvalPojo) throws Exception;
}

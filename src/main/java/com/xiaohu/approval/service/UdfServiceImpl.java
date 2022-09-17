package com.xiaohu.approval.service;

import com.xiaohu.approval.bean.ApprovalPojo;
import com.xiaohu.approval.enums.VersionStatus;
import com.xiaohu.approval.filter.FilterChain;

public class UdfServiceImpl implements UdfService{
     FilterChain filterChain;

    public UdfServiceImpl(FilterChain filterChain) {
        this.filterChain = filterChain;
    }

    @Override
    public ApprovalPojo apply(ApprovalPojo approvalPojo) throws Exception {
        return filterChain.handler(approvalPojo);
    }

    @Override
    public ApprovalPojo approval(ApprovalPojo approvalPojo) throws Exception {
        return filterChain.handler(approvalPojo);
    }

    @Override
    public ApprovalPojo application(ApprovalPojo approvalPojo) throws Exception {
        return filterChain.handler(approvalPojo);
    }
}

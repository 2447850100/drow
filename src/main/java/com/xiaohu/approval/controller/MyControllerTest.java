package com.xiaohu.approval.controller;

import com.xiaohu.approval.bean.ApprovalPojo;
import com.xiaohu.approval.enums.OperationType;
import com.xiaohu.approval.enums.VersionStatus;
import com.xiaohu.approval.factory.ApprovalFactory;
import com.xiaohu.approval.factory.ApprovalManager;
import com.xiaohu.approval.filter.ApplicationFilter;
import com.xiaohu.approval.filter.ApplyFilter;
import com.xiaohu.approval.filter.ApprovalFilter;
import com.xiaohu.approval.filter.FilterChain;


public class MyControllerTest {

    public static void main(String[] args) throws Exception {

        FilterChain filterChain = new FilterChain
                .FilterBuilder()
                .addHandler(new ApplyFilter())
                .addHandler(new ApprovalFilter())
                .addHandler(new ApplicationFilter())
                .build();
        ApprovalFactory factory = new ApprovalManager().getInstance(OperationType.UDFS, filterChain);
        ApprovalPojo approvalPojo = getApprovalPojo();

        //模拟客户端 访问接口
        //访问发布接口 待发布 -> 待审核 version = 1
        approvalPojo  = factory.apply(approvalPojo);

        //访问审核接口 -- 待审核 -> 待应用 version = 1
        approvalPojo = factory.approval(approvalPojo);

        //访问审核接口 失败 待审核 -> 审核驳回 version = 1
        try {
            approvalPojo.setVersionStatus(VersionStatus.APPROVAL);
            approvalPojo.setSuccess(false);
            factory.approval(approvalPojo);
        } catch (Exception e) {
            System.out.println("e = " + e);
        }
        //模拟 重新发布，重新流转到带审核状态
        // 版本+1 待应用重新--> 待审核 version = 2
        approvalPojo.setVersionStatus(VersionStatus.APPLICATION);
        approvalPojo.setAgainApply(true);
        approvalPojo = factory.apply(approvalPojo);

        //访问应用接口
        //虽然这里是访问应用接口，但是重新发布了，扔处于待审核状态 -> 待应用
        approvalPojo =factory.application(approvalPojo);
        System.out.println("approvalPojo = " + approvalPojo);

        //再访问一次 待应用 -> 应用成功
        approvalPojo =factory.application(approvalPojo);
        System.out.println("approvalPojo = " + approvalPojo);
    }

    private static ApprovalPojo getApprovalPojo() {
        ApprovalPojo approvalPojo = new ApprovalPojo();
        approvalPojo.setVersionStatus(VersionStatus.APPLY);
        approvalPojo.setOperationType(OperationType.UDFS);
        approvalPojo.setSuccess(false);
        approvalPojo.setCode(1L);
        approvalPojo.setVersion(1);
        approvalPojo.setAgainApply(false);
        return approvalPojo;
    }
}

package com.xiaohu.approval.factory;

import com.xiaohu.approval.enums.OperationType;
import com.xiaohu.approval.filter.FilterChain;
import com.xiaohu.approval.service.UdfServiceImpl;

public class ApprovalManager {

    public ApprovalFactory getInstance(OperationType type, FilterChain filterChain) throws Exception {
        switch (type) {
            case UDFS -> {
                return new UdfServiceImpl(filterChain);
            }
            default -> {
                throw new Exception("不可名状的类型");
            }
        }
    }
}

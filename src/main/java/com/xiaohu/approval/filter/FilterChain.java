package com.xiaohu.approval.filter;

import com.xiaohu.approval.bean.ApprovalPojo;

public abstract class FilterChain {

    protected FilterChain next;


    public void setNext(FilterChain next) {
        this.next = next;
    }

    public abstract ApprovalPojo handler(ApprovalPojo approvalPojo) throws Exception;

    public static class FilterBuilder {
        private FilterChain head;
        private FilterChain tail;


        public FilterBuilder addHandler(FilterChain handler) {
            if (this.head == null) {
                this.head = this.tail = handler;
                return this;
            }
            this.tail.setNext(handler);
            this.tail = handler;
            return this;
        }

        public FilterChain build() {
            return this.head;
        }
    }
}

package com.xiaohu.design.zerenlian;

public class EncodFilter implements Filter{
    @Override
    public void doFilter(Request request, FilterChain filterChain) {
        System.out.println("encode执行。。。doFilter之前");
        filterChain.doFilter(request,filterChain);
        System.out.println("encode执行。。。doFilter之后");
    }
}

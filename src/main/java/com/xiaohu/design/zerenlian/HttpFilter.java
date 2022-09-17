package com.xiaohu.design.zerenlian;

public class HttpFilter implements Filter{
    @Override
    public void doFilter(Request request, FilterChain filterChain) {
        System.out.println("http执行。。。doFilter之前");
        filterChain.doFilter(request,filterChain);
        System.out.println("http执行。。。doFilter之后");
    }
}

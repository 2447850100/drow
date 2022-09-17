package com.xiaohu.design.zerenlian;

import java.util.LinkedList;
import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        List<Filter> filters = new LinkedList<>();

        HttpFilter httpFilter = new HttpFilter();
        webFilter webFilter = new webFilter();
        EncodFilter encodFilter = new EncodFilter();
        filters.add(httpFilter);
        filters.add(webFilter);
        filters.add(encodFilter);
        FilterChain filterChain = new FilterChain(new MyClass(),filters);
        filterChain.doFilter(new Request(),filterChain);

    }

}

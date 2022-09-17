package com.xiaohu.design.zerenlian;

import java.util.LinkedList;
import java.util.List;

/**
 * 责任链
 */
public class FilterChain {
    int index = 0;

    private MyClass myClass;
    private List<Filter> filters;

    public FilterChain(MyClass myClass, List<Filter> filters) {
        this.myClass = myClass;
        this.filters = filters;
    }

    void doFilter(Request request, FilterChain filterChain) {
        if (index < filters.size()) {
            Filter filter = filters.get(index);
            index++;
            filter.doFilter(request,filterChain);

        }else {
            myClass.test();
        }
    };
}

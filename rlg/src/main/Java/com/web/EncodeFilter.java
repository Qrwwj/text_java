package com.web;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class EncodeFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
//        初始化
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//销毁
//        设置过滤器
        servletRequest.setCharacterEncoding("utf-8");
//        向后放行，继续执行server（）方法后边的内容
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
 //
    }
}

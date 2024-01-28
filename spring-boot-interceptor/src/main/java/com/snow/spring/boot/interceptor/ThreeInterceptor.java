package com.snow.spring.boot.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 第三个拦截器
 *
 * @author jiaXue
 * @since 2024/1/25 15:47
 */
@Slf4j
@Order(2)
public class ThreeInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("第三个拦截器 前置操作: url:"+ request.getRequestURL());
        // 返回true表示放行，false表示拦截
        return true;
    }


    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        log.info("第三个拦截器 中间操作: url:"+ request.getRequestURL());
    }


    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("第三个拦截器 后置操作: url:"+ request.getRequestURL());
    }

}

package com.snow.spring.boot.interceptor.config;

import com.snow.spring.boot.interceptor.OneInterceptor;
import com.snow.spring.boot.interceptor.ThreeInterceptor;
import com.snow.spring.boot.interceptor.TwoInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * web配置类
 *
 * @author jiaXue
 * @since 2024/1/25 15:52
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    /**
     * 拦截器执行顺序
     * 举例：拦截器 A、B、C
     *  A：preHandle()
     *  B：preHandle()
     *  C：preHandle()
     *  C：postHandle()
     *  B：postHandle()
     *  A：postHandle()
     *  C：afterCompletion()
     *  B：afterCompletion()
     *  A：afterCompletion()
     */

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new OneInterceptor()).addPathPatterns("/**");
        registry.addInterceptor(new TwoInterceptor()).addPathPatterns("/**");
        registry.addInterceptor(new ThreeInterceptor()).addPathPatterns("/**");
    }
}

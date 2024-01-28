package com.snow.spring.boot.interceptor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试接口
 *
 * @author jiaXue
 * @since 2024/1/25 15:53
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public void test() {

    }
}

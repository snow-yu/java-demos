package com.snow.lombok.model;


import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * 自动生成构造函数
 *
 * @NoArgsConstructor 无参构造函数
 * @AllArgsConstructor 全参构造函数
 * @RequiredArgsConstructor 包含特定参构造函数（特定参数带上final修饰符）
 *
 * @author jiaXue
 * date 2023/12/20
 */
@AllArgsConstructor
@RequiredArgsConstructor
public class User3 {

    private String name;

    private Integer age;

    private final String address;

}

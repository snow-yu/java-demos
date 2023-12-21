package com.snow.lombok.model;


import lombok.EqualsAndHashCode;

/**
 * 自动生成 equals 和 hashcode, 包含所有非静态变量
 *
 * @EqualsAndHashCode(exclude = "name") 排除指定字段
 *
 * @EqualsAndHashCode(of = "name") 包含指定字段
 * @author jiaXue
 * date 2023/12/20
 */
@EqualsAndHashCode
public class User2 {

    private String name;

    private Integer age;

}

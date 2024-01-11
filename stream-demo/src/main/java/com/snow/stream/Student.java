package com.snow.stream;

import lombok.Data;

/**
 * 学生实体类
 *
 * @author jiaXue
 * date 2024/1/11
 */
@Data
public class Student {

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private String sex;

    /**
     * 总分
     */
    private Integer score;
}

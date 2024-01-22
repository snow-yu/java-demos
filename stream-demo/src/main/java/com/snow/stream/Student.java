package com.snow.stream;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 学生实体类
 *
 * @author jiaXue
 * date 2024/1/11
 */
@Data
@AllArgsConstructor
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

    public static List<Student> buildData() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("张三", 12, "男", 99));
        studentList.add(new Student("李四", 14, "男", 59));
        studentList.add(new Student("王五", 12, "男", 60));
        studentList.add(new Student("赵六", 14, "男", 61));
        studentList.add(new Student("钱七", 9, "男", 88));
        return studentList;
    }
}

package com.snow.stream.test;

import com.snow.stream.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 拼接测试
 * @author jiaXue
 * @since 2024/1/22 08:43
 */
public class JoiningTest {

    public static void main(String[] args) {
        List<Student> studentList = Student.buildData();
        String names = studentList.stream().map(Student::getName).collect(Collectors.joining(","));
        System.out.println("所有学生的姓名：" + names);
        List<String> list = Arrays.asList("A", "B", "C");
        String string = list.stream().collect(Collectors.joining("-"));
        System.out.println("拼接后的字符串：" + string);
    }


}

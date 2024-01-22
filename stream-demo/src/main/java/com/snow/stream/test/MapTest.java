package com.snow.stream.test;

import com.snow.stream.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author jiaXue
 * @since 2024/1/22 08:21
 */
public class MapTest {

    public static void main(String[] args) {
        mapTest2();
    }

    /**
     * 英文字符串数组的元素全部改为大写。整数数组每个元素+3
     */
    public static void mapTest() {
        String[] strArr = {"abcd", "bcdd", "defde", "fTr"};
        List<String> strList = Arrays.stream(strArr).map(String::toUpperCase).collect(Collectors.toList());

        List<Integer> intList = Arrays.asList(1, 3, 5, 7, 9, 11);
        List<Integer> intListNew = intList.stream().map(x -> x + 1).collect(Collectors.toList());

        System.out.println("每个元素大写：" + strList);
        System.out.println("每个元素+1：" + intListNew);
    }

    /**
     * 将学生分数加10分
     */
    public static void mapTest2() {
        List<Student> studentList = Student.buildData();
        // 不改变原来员工集合的方式
        List<Student> studentListNew = studentList.stream().map(student -> {
            Student studentNew = new Student(student.getName(), student.getAge(), student.getSex(), student.getScore());
            studentNew.setScore(student.getScore() + 10);
            return studentNew;
        }).collect(Collectors.toList());
        System.out.println("studentList一次改动前：" + studentList.get(0).getName() + "-->" + studentList.get(0).getScore());
        System.out.println("studentListNew一次改动后：" + studentListNew.get(0).getName() + "-->" + studentListNew.get(0).getScore());
        System.out.println("studentList一次改动后后：" + studentList.get(0).getName() + "-->" + studentList.get(0).getScore());

        // 改变原来员工集合的方式
        List<Student> studentListNew2 = studentList.stream().map(student -> {
            student.setScore(student.getScore() + 10);
            return student;
        }).collect(Collectors.toList());
        System.out.println("studentList二次改动前：" + studentList.get(0).getName() + "-->" + studentListNew.get(0).getScore());
        System.out.println("studentListNew2二次改动后：" + studentListNew2.get(0).getName() + "-->" + studentListNew2.get(0).getScore());
        List<Student> studentListNew3 = studentList.stream().peek(student -> student.setScore(student.getScore() + 10)).collect(Collectors.toList());
        System.out.println("studentList三次改动后：" + studentList.get(0).getName() + "-->" + studentListNew.get(0).getScore());
        System.out.println("studentListNew3三次改动后：" + studentListNew3.get(0).getName() + "-->" + studentListNew3.get(0).getScore());
    }

    public static void mapTest3() {
        List<String> list = Arrays.asList("m,k,l,a", "1,3,5,7");
        List<String> listNew = list.stream().flatMap(s -> {
            // 将每个元素转换成一个stream
            String[] split = s.split(",");
            return Arrays.stream(split);
        }).collect(Collectors.toList());

        System.out.println("处理前的集合：" + list);
        System.out.println("处理后的集合：" + listNew);
    }

    public static void mapTest4() {
        List<String> stringList = Arrays.asList("mu", "CSDN", "hello",
                "world", "quickly");
        stringList.stream().mapToInt(String::length).forEach(System.out::println);
        List<Integer> integerList = Arrays.asList(4, 5, 2, 1, 6, 3);
        integerList.stream().mapToInt(x -> x + 1000).forEach(System.out::println);
    }

    public static void mapTest5() {
        List<Double> doubleList = Arrays.asList(1.0, 2.0, 3.0, 4.0, 2.0);
        double average = doubleList.stream().mapToDouble(Number::doubleValue).average().getAsDouble();
        double sum = doubleList.stream().mapToDouble(Number::doubleValue).sum();
        double max = doubleList.stream().mapToDouble(Number::doubleValue).max().getAsDouble();
        System.out.println("平均值：" + average + "，总和：" + sum + "，最大值：" + max);
    }
}

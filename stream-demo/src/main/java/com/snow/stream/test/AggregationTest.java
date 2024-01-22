package com.snow.stream.test;

import com.snow.stream.Student;

import java.util.*;

/**
 * 聚合测试
 *
 * @author jiaXue
 * @since 2024/1/22
 */
public class AggregationTest {

    public static void main(String[] args) {
        findLongestFromList();
        findMaxFromList();
        maxAgeFromStudentList();
        count();
    }

    /**
     * 寻找集合中最长的元素
     */
    public static void findLongestFromList() {
        List<String> list = Arrays.asList("abc", "hello", "world", "java");
        Optional<String> maxLength = list.stream().max(Comparator.comparing(String::length));
        System.out.println("maxLength = " + maxLength.get());
    }

    public static void findMaxFromList() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // 自然排序
        Optional<Integer> max = list.stream().max(Integer::compareTo);
        // 自定义排序（从大到小排序）
        Optional<Integer> max2 = list.stream().max((o1, o2) -> o2 - o1);
        System.out.println("自然排序的最大值：" + max.get());
        System.out.println("自定义排序的最小值：" + max2.get());
    }

    /**
     * 获取学生最大年龄
     */
    public static void maxAgeFromStudentList() {
        List<Student> studentList = Student.buildData();
        Optional<Student> max = studentList.stream().max(Comparator.comparingInt(Student::getAge));
        System.out.println("最大年龄学生：" + max.get());
    }

    public static void count() {
        List<Integer> list = Arrays.asList(2, 6, 5, 12, 31, 22, 3);
        long count = list.stream().filter(x -> x > 6).count();
        System.out.println("list中大于6的元素个数：" + count);
    }


}

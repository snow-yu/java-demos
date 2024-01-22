package com.snow.stream.test;

import com.snow.stream.Student;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 收集测试
 * @author jiaXue
 * @since 2024/1/22 08:37
 */
public class CollectTest {

    public static void main(String[] args) {
        collectTest();
        collectTest2();
        collectTest3();
    }

    public static void collectTest() {
        List<Integer> list = Arrays.asList(1, 6, 3, 4, 6, 7, 9, 6, 20);
        List<Integer> listNew = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        Set<Integer> set = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toSet());

        List<Student> personList = Student.buildData();

        Map<?, Student> map = personList.stream().filter(p -> p.getScore() > 5)
                .collect(Collectors.toMap(Student::getName, p -> p));
        System.out.println("toList:" + listNew);
        System.out.println("toSet:" + set);
        System.out.println("toMap:" + map);
    }

    public static void collectTest2() {
        List<Student> personList = Student.buildData();
        // 求总数
        Long count = personList.stream().collect(Collectors.counting());
        // 求平均分数
        Double average = personList.stream().collect(Collectors.averagingDouble(Student::getScore));
        // 求最高分数
        Optional<Integer> max = personList.stream().map(Student::getScore).collect(Collectors.maxBy(Integer::compare));
        // 求分数之和
        Integer sum = personList.stream().collect(Collectors.summingInt(Student::getScore));
        // 一次性统计所有信息
        DoubleSummaryStatistics collect = personList.stream().collect(Collectors.summarizingDouble(Student::getScore));

        System.out.println("学生总数：" + count);
        System.out.println("学生平均分数：" + average);
        System.out.println("学生最高分数：" + max.get());
        System.out.println("学生分数总和：" + sum);
        System.out.println("学生分数所有统计：" + collect);
    }

    public static void collectTest3() {
        List<Student> personList = Student.buildData();
        // 将学生分数是否高于60分组
        Map<Boolean, List<Student>> part = personList.stream().collect(Collectors.partitioningBy(x -> x.getScore() > 60));
        // 将学生按性别分组
        Map<String, List<Student>> group = personList.stream().collect(Collectors.groupingBy(Student::getSex));
        // 将学生先按性别分组，再按分数分组
        Map<String, Map<Integer, List<Student>>> group2 = personList.stream().collect(Collectors.groupingBy(Student::getSex, Collectors.groupingBy(Student::getScore)));
        System.out.println("学生按分数是否高于60分组情况：" + part);
        System.out.println("学生按性别分组情况：" + group);
        System.out.println("学生按性别、分数：" + group2);
    }
}

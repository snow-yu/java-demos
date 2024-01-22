package com.snow.stream.test;

import com.snow.stream.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 排序测试
 *
 * @author jiaXue
 * @since 2024/1/22 08:44
 */
public class SortTest {

    public static void main(String[] args) {
        List<Student> studentList = Student.buildData();

        // 按分数升序排序（自然排序）
        List<String> newList = studentList.stream().sorted(Comparator.comparing(Student::getScore)).map(Student::getName)
                .collect(Collectors.toList());
        // 按分数倒序排序
        List<String> newList2 = studentList.stream().sorted(Comparator.comparing(Student::getScore).reversed())
                .map(Student::getName).collect(Collectors.toList());
        // 先按分数再按年龄升序排序
        List<String> newList3 = studentList.stream()
                .sorted(Comparator.comparing(Student::getScore).thenComparing(Student::getAge)).map(Student::getName)
                .collect(Collectors.toList());
        // 先按分数再按年龄自定义排序（降序）
        List<String> newList4 = studentList.stream().sorted((p1, p2) -> {
            if (p1.getScore().equals(p2.getScore())) {
                return p2.getAge() - p1.getAge();
            } else {
                return p2.getScore() - p1.getScore();
            }
        }).map(Student::getName).collect(Collectors.toList());

        System.out.println("按分数升序排序：" + newList);
        System.out.println("按分数降序排序：" + newList2);
        System.out.println("先按分数再按年龄升序排序：" + newList3);
        System.out.println("先按分数再按年龄自定义降序排序：" + newList4);

    }
}

package com.snow.stream.test;

import com.snow.stream.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * 规约测试
 * @author jiaXue
 * @since 2024/1/22 08:33
 */
public class ReduceTest {

    public static void main(String[] args) {
        reduceTest1();
        reduceTest2();
    }

    public static void reduceTest1() {
        List<Integer> list = Arrays.asList(1, 3, 2, 8, 11, 4);
        // 求和方式1
        Optional<Integer> sum = list.stream().reduce((x, y) -> x + y);
        // 求和方式2
        Optional<Integer> sum2 = list.stream().reduce(Integer::sum);
        // 求和方式3
        Integer sum3 = list.stream().reduce(0, Integer::sum);

        // 求乘积
        Optional<Integer> product = list.stream().reduce((x, y) -> x * y);

        // 求最大值方式1
        Optional<Integer> max = list.stream().reduce((x, y) -> x > y ? x : y);
        // 求最大值写法2
        Integer max2 = list.stream().reduce(1, Integer::max);

        System.out.println("list求和：" + sum.get() + "," + sum2.get() + "," + sum3);
        System.out.println("list求积：" + product.get());
        System.out.println("list求和：" + max.get() + "," + max2);
    }

    public static void reduceTest2() {
        List<Student> personList = Student.buildData();
        // 求分数之和方式1：
        Optional<Integer> sumScore = personList.stream().map(Student::getScore).reduce(Integer::sum);
        // 求分数之和方式2：
        Integer sumScore2 = personList.stream().reduce(0, (sum, p) -> sum += p.getScore(), (sum1, sum2) -> sum1 + sum2);
        // 求分数之和方式3：
        Integer sumScore3 = personList.stream().reduce(0, (sum, p) -> sum += p.getScore(), Integer::sum);

        // 求最高分数方式1：
        Integer maxScore = personList.stream().reduce(0, (max, p) -> max > p.getScore() ? max : p.getScore(),
                Integer::max);
        // 求最高分数方式2：
        Integer maxScore2 = personList.stream().reduce(0, (max, p) -> max > p.getScore() ? max : p.getScore(),
                (max1, max2) -> max1 > max2 ? max1 : max2);
        // 求最高分数方式3：
        Integer maxScore3 = personList.stream().map(Student::getScore).reduce(Integer::max).get();

        System.out.println("分数之和：" + sumScore.get() + "," + sumScore2 + "," + sumScore3);
        System.out.println("最高分数：" + maxScore + "," + maxScore2 + "," + maxScore3);
    }
}

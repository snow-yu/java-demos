package com.snow.stream.test;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * stream 循环遍历匹配测试类
 *
 * @author jiaXue
 * date 2024/1/11
 */
public class ForeachTest {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5, 6, null, 4, 11, 7, 8, 10);
        // 遍历筛选出大于6的元素列表
        list.stream().filter(Objects::nonNull).filter(x -> x > 6).forEach(System.out::println);
        // 匹配第一个元素
        Optional<Integer> first = list.stream().filter(Objects::nonNull).filter(x -> x > 10).findFirst();
        first.ifPresent(integer -> System.out.println("匹配第一个元素:" + integer));
        // 匹配任意元素（适用于并行流） 结果随机
        Optional<Integer> any = list.parallelStream().filter(Objects::nonNull).filter(x -> x > 1).findAny();
        any.ifPresent(integer -> System.out.println("匹配任意元素:" + integer));
        // 是否包含符合条件的元素
        boolean anyMatch = list.stream().anyMatch(x -> x > 1);
        System.out.println("是否存在大于1的元素： " + anyMatch);

    }
}

package com.snow.stream.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author jiaXue
 * date 2024/1/11
 */
public class StreamCreateTest {


    public static void main(String[] args) {

        List<String> list = Arrays.asList("1", "2", "3");
        Stream<String> stream = list.stream();


        int inputMinutes = -123; // 测试用例，例如1500分钟
        System.out.println(formatMinutesToDayHourMin(inputMinutes));
    }

    public static String formatMinutesToDayHourMin(int minutes) {
        int days = minutes / (24 * 60);
        int hours = (minutes % (24 * 60)) / 60;
        int remainingMinutes = minutes % 60;

        StringBuilder result = new StringBuilder();
        if (days > 0) {
            result.append(days).append("天");
        }
        if (hours > 0 || days > 0) {
            result.append(hours).append("小时");
        }
        result.append(remainingMinutes).append("分钟");

        return result.toString();
    }
}

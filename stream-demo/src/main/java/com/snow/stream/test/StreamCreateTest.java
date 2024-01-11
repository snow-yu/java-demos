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



    }
}

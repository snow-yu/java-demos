package com.snow.lombok.model;


import lombok.Value;

/**
 * @author jiaXue
 * date 2023/12/20
 * @Value 注解添加后，等于同时添加以下注解; 主要用于某个类的值不希望被更改，只
 * 自动给类的属性添加final方法，并且提供构造方法，可以不用写构造方法
 * @Getter
 * @ToString
 * @EqualsAndHashCode
 * @RequiredArgsConstructor
 */
@Value
public class User5 {

    String name;

    Integer age;

    String address;

}

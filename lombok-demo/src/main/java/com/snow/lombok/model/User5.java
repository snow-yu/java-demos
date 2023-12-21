package com.snow.lombok.model;


import lombok.Value;

/**
 * @author jiaXue
 * date 2023/12/20
 * @Value 注解添加后，等于同时添加以下注解; 主要用于某个类的值不希望被更改，只读
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

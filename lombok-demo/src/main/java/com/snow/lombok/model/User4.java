package com.snow.lombok.model;


import lombok.Data;

/**
 * @Data 注解添加后，等于同时添加以下注解
 *
 * @Getter/@Setter
 * @ToString
 * @EqualsAndHashCode
 * @RequiredArgsConstructor
 *
 * @author jiaXue
 * date 2023/12/20
 */
@Data
public class User4 {

    private String name;

    private Integer age;

    private final String address;

}

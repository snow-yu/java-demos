package com.snow.validation.model;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author jiaXue
 * date 2023/12/20
 */
public class StudentReq {

    @NotBlank(message = "学生姓名不能为空")
    @Length(max = 50, message = "学生姓名最大长度{max}")
    private String name;

    @NotNull(message = "学生年龄不能为空")
    @Range(min = 8, max = 12, message = "学生年龄必须在{min}-{max}之间")
    private Integer age;

    @NotBlank(message = "学号不能为空")
    @Length(max = 50, message = "学号最大长度{max}")
    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "StudentReq{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", code='" + code + '\'' +
                '}';
    }
}

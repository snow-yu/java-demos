package com.snow.validation.model;


import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * @author jiaXue
 * date 2023/12/19
 */

public class TeacherReq {

    @NotBlank(message = "姓名不能为空")
    @Length(max = 50, message = "姓名最大长度{max}")
    private String name;

    @NotNull(message = "年龄不能为空")
    @Range(min = 18, max = 100, message = "年龄必须在{min}-{max}之间")
    private Integer age;

    /**
     * @Validated 不允许使用在成员属性上，所以只能用@Valid
     * 如果不加  @Valid 就不会对 StudentReq类进行校验,只会判断 @NotNull，List<Son>是否为空，并不会校验StudentReq类里面的成员属性
     */
    @Valid
    @NotEmpty(message = "学生不能为空")
    @Size(min = 2, max = 10, message = "学生个数必须在{min}-{max}之间")
    private List<StudentReq> studentList;

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

    public List<StudentReq> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<StudentReq> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "TeacherReq{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", studentList=" + studentList +
                '}';
    }
}

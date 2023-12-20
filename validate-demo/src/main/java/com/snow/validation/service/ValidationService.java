package com.snow.validation.service;

import com.snow.validation.model.TeacherReq;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * 校验接口
 *
 * @author jiaXue
 * date 2023/12/19
 */
@Validated
public interface ValidationService {

    /**
     * 入参对象校验 在类上新增@Validated
     * 在入参对象加 @Valid
     *
     * @param teacherReq 教师
     */
    void addTeacher(@Valid TeacherReq teacherReq);

    /**
     * 入参基本类型校验 在类上新增@Validated
     * 在入参值上新增校验注解
     *
     * @param age  年龄
     * @param name 姓名
     */
    void addUser(@NotNull @Min(10) Integer age, @NotEmpty String name);
}

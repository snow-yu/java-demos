package com.snow.validation.controller;

import com.snow.validation.model.TeacherReq;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author jiaXue
 * date 2023/12/19
 */
@RestController
@RequestMapping("/user")
public class ValidationController {

    @PostMapping("/add")
    public String user(@Valid @RequestBody TeacherReq teacherReq, BindingResult bindingResult) {
        System.out.println(teacherReq.toString());
        if (bindingResult.hasErrors()) {
            return bindingResult.getFieldError().getDefaultMessage();
        }
        return "success";
    }

}

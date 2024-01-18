package com.snow.validation.service;

import com.snow.validation.model.TeacherReq;
import org.springframework.stereotype.Service;

/**
 * @author jiaXue
 * date 2023/12/19
 */

@Service
public class ValidationServiceImpl implements ValidationService {

    @Override
    public void addTeacher(TeacherReq userReq) {
        System.out.println("新增用户成功");
    }

    @Override
    public void addUser(Integer id, String name) {
        System.out.println("id = " + id + ";name = " + name);
    }
}

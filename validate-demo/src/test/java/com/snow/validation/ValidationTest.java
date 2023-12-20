package com.snow.validation;

import com.snow.validation.model.TeacherReq;
import com.snow.validation.service.ValidationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * @author jiaXue
 * date 2023/12/19
 */
@SpringBootTest
public class ValidationTest {

    @Autowired
    private ValidationService validationService;


    // service 校验验证
    @Test
    void testObjectService() {
        try {
            // 验证不通过
            validationService.addTeacher(new TeacherReq());
        }catch (Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }
    }

    @Test
    void testValidationService() {
        try {
            // 验证不通过
            validationService.addUser(1, "");
        }catch (Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }
        // 验证通过
        validationService.addUser(11, "张三");
    }

}

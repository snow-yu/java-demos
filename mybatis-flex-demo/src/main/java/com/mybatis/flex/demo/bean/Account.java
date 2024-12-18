package com.mybatis.flex.demo.bean;

import com.mybatisflex.annotation.Column;
import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import lombok.Data;

import java.util.Date;

/**
 * @author jiaXue
 * @since 2024/2/25 16:49
 */
@Data
@Table("tb_account")
public class Account {

    @Id(keyType = KeyType.None)
    private Long id;
    private String userName;

    @Column(onInsertValue = "asd")
    private Integer age;
    private Date birthday;

    private void test() {
        System.out.println("test");
    }

}

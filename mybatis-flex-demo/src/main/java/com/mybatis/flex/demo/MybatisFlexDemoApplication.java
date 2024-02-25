package com.mybatis.flex.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mybatis.flex.demo.mapper")
public class MybatisFlexDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisFlexDemoApplication.class, args);
	}

}

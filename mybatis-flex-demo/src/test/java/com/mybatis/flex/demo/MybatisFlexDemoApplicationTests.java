package com.mybatis.flex.demo;

import com.mybatis.flex.demo.bean.Account;
import com.mybatis.flex.demo.mapper.AccountMapper;
import com.mybatisflex.core.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.mybatis.flex.demo.bean.table.AccountTableDef.ACCOUNT;

@SpringBootTest
class MybatisFlexDemoApplicationTests {

	@Test
	void contextLoads() {
		QueryWrapper queryWrapper = QueryWrapper.create()
				.select()
				.where(ACCOUNT.AGE.eq(18));
		Account account = accountMapper.selectOneByQuery(queryWrapper);
		System.out.println(account);
	}

	@Autowired
	private AccountMapper accountMapper;

}

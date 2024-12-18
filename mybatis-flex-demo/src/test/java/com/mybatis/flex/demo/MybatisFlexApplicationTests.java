package com.mybatis.flex.demo;

import com.mybatis.flex.demo.bean.Account;
import com.mybatis.flex.demo.mapper.AccountMapper;
import com.mybatisflex.core.query.QueryChain;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.update.UpdateWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.mybatis.flex.demo.bean.table.AccountTableDef.ACCOUNT;
import static com.mybatisflex.core.query.QueryMethods.avg;
import static com.mybatisflex.core.query.QueryMethods.max;

@SpringBootTest
class MybatisFlexApplicationTests {


	@Autowired
	private AccountMapper accountMapper;

	@Test
	void contextLoads() {
		QueryWrapper queryWrapper = QueryWrapper.create()
				.select()
				.where(ACCOUNT.AGE.eq(18));
		Account account = accountMapper.selectOneByQuery(queryWrapper);
		System.out.println(account);
	}


	@Test
	void testInsert() {
		Account account = new Account();
		account.setUserName("admin");

		Account newAccount = UpdateWrapper.of(account)
//       .setRaw("birthday", "now()")
//       .setRaw(ACCOUNT.BIRTHDAY, "now()")
				.setRaw(Account::getBirthday, "now()")
				.toEntity();
		accountMapper.insert(newAccount);

	}


}

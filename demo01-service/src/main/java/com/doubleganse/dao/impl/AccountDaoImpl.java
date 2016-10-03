package com.doubleganse.dao.impl;

import com.doubleganse.dao.AccountDao;
import com.doubleganse.mapper.AccountMapper;
import com.doubleganse.model.Account;
import com.doubleganse.model.AccountCondition;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author mingjun chen
 */
@Repository
public class AccountDaoImpl implements AccountDao {

	@Autowired
	private AccountMapper accountMapper;

	public Account getByNameAndPassword(String name, String password) {
		return accountMapper.selectById(1);
//		AccountCondition accountCondition = new AccountCondition();
//		AccountCondition.Criteria criteria = accountCondition.createCriteria();
//		criteria.andNameEqualTo(name);
//		criteria.andPasswordEqualTo(password);
//		List<Account> accountList = accountMapper.selectByCondition(accountCondition);
//		if (CollectionUtils.isEmpty(accountList)) {
//			return null;
//		} else {
//			return accountList.get(0);
//		}
	}
}

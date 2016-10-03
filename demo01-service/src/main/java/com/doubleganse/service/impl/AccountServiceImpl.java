package com.doubleganse.service.impl;

import com.doubleganse.dao.AccountDao;
import com.doubleganse.model.Account;
import com.doubleganse.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author mingjun chen
 */
@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDao accountDao;

	public Account getByNameAndPassword(String name, String password) {
		if(StringUtils.isEmpty(name)||StringUtils.isEmpty(password)){
			return null;
		}
		return accountDao.getByNameAndPassword(name, password);
	}
}

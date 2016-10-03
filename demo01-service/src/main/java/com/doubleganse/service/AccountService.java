package com.doubleganse.service;

import com.doubleganse.model.Account;

/**
 *  @author mingjun chen
 */
public interface AccountService {

	Account getByNameAndPassword(String name, String password);
}

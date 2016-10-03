package com.doubleganse.dao;

import com.doubleganse.model.Account;
import org.springframework.stereotype.Repository;

/**
 *  @author mingjun chen
 */
@Repository
public interface AccountDao {

	Account getByNameAndPassword(String name, String password);
}

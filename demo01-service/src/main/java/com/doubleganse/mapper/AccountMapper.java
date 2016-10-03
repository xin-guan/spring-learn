package com.doubleganse.mapper;

import com.doubleganse.model.Account;
import com.doubleganse.model.AccountCondition;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountMapper {
    int countByCondition(AccountCondition example);

    int deleteByCondition(AccountCondition example);

    int deleteById(Integer id);

    int insert(Account record);

    int insertSelective(Account record);

    List<Account> selectByCondition(AccountCondition example);

    Account selectById(Integer id);

    int updateByConditionSelective(@Param("record") Account record, @Param("example") AccountCondition example);

    int updateByCondition(@Param("record") Account record, @Param("example") AccountCondition example);

    int updateByIdSelective(Account record);

    int updateById(Account record);
}
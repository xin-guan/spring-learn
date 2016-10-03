package com.doubleganse.mapper;

import com.doubleganse.model.Department;
import com.doubleganse.model.DepartmentCondition;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepartmentMapper {

	int countByCondition(DepartmentCondition example);

	int deleteByCondition(DepartmentCondition example);

	int deleteById(Integer id);

	int insert(Department record);

	int insertSelective(Department record);

	List<Department> selectByCondition(DepartmentCondition example);

	Department selectById(Integer id);

	int updateByConditionSelective(@Param("record") Department record, @Param("example") DepartmentCondition example);

	int updateByCondition(@Param("record") Department record, @Param("example") DepartmentCondition example);

	int updateByIdSelective(Department record);

	int updateById(Department record);
}
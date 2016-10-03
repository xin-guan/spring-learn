package com.doubleganse.mapper;

import com.doubleganse.model.TeacherNatureInfo;
import com.doubleganse.model.TeacherNatureInfoCondition;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherNatureInfoMapper {

	int countByCondition(TeacherNatureInfoCondition example);

	int deleteByCondition(TeacherNatureInfoCondition example);

	int deleteById(Integer id);

	int insert(TeacherNatureInfo record);

	int insertSelective(TeacherNatureInfo record);

	List<TeacherNatureInfo> selectByCondition(TeacherNatureInfoCondition example);

	TeacherNatureInfo selectById(Integer id);

	int updateByConditionSelective(@Param("record") TeacherNatureInfo record, @Param("example") TeacherNatureInfoCondition example);

	int updateByCondition(@Param("record") TeacherNatureInfo record, @Param("example") TeacherNatureInfoCondition example);

	int updateByIdSelective(TeacherNatureInfo record);

	int updateById(TeacherNatureInfo record);
}
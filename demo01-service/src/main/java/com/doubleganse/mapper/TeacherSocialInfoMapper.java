package com.doubleganse.mapper;

import com.doubleganse.model.TeacherSocialInfo;
import com.doubleganse.model.TeacherSocialInfoCondition;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherSocialInfoMapper {

	int countByCondition(TeacherSocialInfoCondition example);

	int deleteByCondition(TeacherSocialInfoCondition example);

	int deleteById(Integer id);

	int insert(TeacherSocialInfo record);

	int insertSelective(TeacherSocialInfo record);

	List<TeacherSocialInfo> selectByCondition(TeacherSocialInfoCondition example);

	TeacherSocialInfo selectById(Integer id);

	int updateByConditionSelective(@Param("record") TeacherSocialInfo record, @Param("example") TeacherSocialInfoCondition example);

	int updateByCondition(@Param("record") TeacherSocialInfo record, @Param("example") TeacherSocialInfoCondition example);

	int updateByIdSelective(TeacherSocialInfo record);

	int updateById(TeacherSocialInfo record);
}
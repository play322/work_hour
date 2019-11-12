package com.it.wh.dao;

import com.it.wh.pojo.ProjectUpdateLog;
import com.it.wh.pojo.ProjectUpdateLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProjectUpdateLogMapper {
    int countByExample(ProjectUpdateLogExample example);

    int deleteByExample(ProjectUpdateLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProjectUpdateLog record);

    int insertSelective(ProjectUpdateLog record);

    List<ProjectUpdateLog> selectByExampleWithBLOBs(ProjectUpdateLogExample example);

    List<ProjectUpdateLog> selectByExample(ProjectUpdateLogExample example);

    ProjectUpdateLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProjectUpdateLog record, @Param("example") ProjectUpdateLogExample example);

    int updateByExampleWithBLOBs(@Param("record") ProjectUpdateLog record, @Param("example") ProjectUpdateLogExample example);

    int updateByExample(@Param("record") ProjectUpdateLog record, @Param("example") ProjectUpdateLogExample example);

    int updateByPrimaryKeySelective(ProjectUpdateLog record);

    int updateByPrimaryKeyWithBLOBs(ProjectUpdateLog record);

    int updateByPrimaryKey(ProjectUpdateLog record);
}
package com.it.wh.dao;

import com.it.wh.pojo.ProjectInfo;
import com.it.wh.pojo.ProjectInfoExample;
import org.apache.ibatis.annotations.Param;


import java.util.List;
import java.util.Map;

public interface ProjectInfoMapper {

    //查询所有带分页
    List<ProjectInfo> queryAllProjectInfoPage(Map<String, Object> paramMap);
    //分页使用的查询所有数量
    int queryProjectInfoCount(Map<String, Object> paramMap);

/*    //批量删除
    int deleteProjectInfo(int[] delArray);*/

    int countByExample(ProjectInfoExample example);

    int deleteByExample(ProjectInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProjectInfo record);

    int insertSelective(ProjectInfo record);

    List<ProjectInfo> selectByExample(ProjectInfoExample example);

    ProjectInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProjectInfo record, @Param("example") ProjectInfoExample example);

    int updateByExample(@Param("record") ProjectInfo record, @Param("example") ProjectInfoExample example);

    int updateByPrimaryKeySelective(ProjectInfo record);

    int updateByPrimaryKey(ProjectInfo record);


}
package com.it.wh.dao;

import com.it.wh.pojo.ProjectInfo;
import com.it.wh.pojo.ProjectWorkHour;
import com.it.wh.pojo.ProjectWorkHourExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ProjectWorkHourMapper {
    int countByExample(ProjectWorkHourExample example);

    int deleteByExample(ProjectWorkHourExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProjectWorkHour record);

    int insertSelective(ProjectWorkHour record);

    List<ProjectWorkHour> selectByExample(ProjectWorkHourExample example);

    ProjectWorkHour selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProjectWorkHour record, @Param("example") ProjectWorkHourExample example);

    int updateByExample(@Param("record") ProjectWorkHour record, @Param("example") ProjectWorkHourExample example);

    int updateByPrimaryKeySelective(ProjectWorkHour record);

    int updateByPrimaryKey(ProjectWorkHour record);

    //统计工时列表记录数
  	int countWorkHour();
    //查询所有工时
    List<ProjectWorkHour> queryAllWorkHour(Map<String, Object> map);
    //按id查询工时
    ProjectWorkHour findByIdHour(long id);
    /*//按任意时间段查询
    ProjectWorkHour queryAnyTime(Map<String,Object> map);*/
    List<ProjectWorkHour> queryAnyTime(Map<String,Object> map);
    //查询任意时间段总工时
    long queryAnyHours(Map<String,Object> map);
    //按周查询
   ProjectWorkHour queryWeek(Long id);
    //按月查询
    ProjectWorkHour queryMonth(Long id);
}
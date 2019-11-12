package com.it.wh.service;

import com.it.wh.pojo.ProjectInfo;
import com.it.wh.pojo.ProjectWorkHour;

import java.util.List;
import java.util.Map;

public interface ProjectWorkHourService {
    //填报工时
    void addHour(ProjectWorkHour projectWorkHour);

    //统计工时列表记录数
	int queryWorkHour(Map<String, Object> map);
		//查询所有工时
	List<ProjectWorkHour> queryAllWorkHour(Map<String, Object> map);
	//按id查询工时
	ProjectWorkHour findByIdHour(long id);
	//修改
	void updateHour(ProjectWorkHour projectWorkHour);

	//删除
	int delHour(long id);

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

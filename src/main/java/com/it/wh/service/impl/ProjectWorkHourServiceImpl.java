package com.it.wh.service.impl;

import com.it.wh.dao.ProjectWorkHourMapper;
import com.it.wh.pojo.ProjectInfo;
import com.it.wh.pojo.ProjectWorkHour;
import com.it.wh.service.ProjectWorkHourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProjectWorkHourServiceImpl implements ProjectWorkHourService {

    @Autowired
    private ProjectWorkHourMapper projectWorkHourMapper;

    @Override
    public void addHour(ProjectWorkHour projectWorkHour) {

        projectWorkHourMapper.insert(projectWorkHour);

    }

	@Override
	public int queryWorkHour(Map<String, Object> map) {
		return projectWorkHourMapper.countWorkHour();
	}

	@Override
	public List<ProjectWorkHour> queryAllWorkHour(Map<String, Object> map) {
		return projectWorkHourMapper.queryAllWorkHour(map);
	}

	@Override
	public ProjectWorkHour findByIdHour(long id) {
		return projectWorkHourMapper.findByIdHour(id);
	}

	@Override
	public void updateHour(ProjectWorkHour projectWorkHour) {
		projectWorkHourMapper.updateByPrimaryKey(projectWorkHour);
	}

	@Override
	public int delHour(long id) {
		return projectWorkHourMapper.deleteByPrimaryKey(id);
	}

	/*@Override
	public ProjectWorkHour queryAnyTime(Map<String,Object> map) {
		return projectWorkHourMapper.queryAnyTime(map);
	}*/
	public List<ProjectWorkHour> queryAnyTime(Map<String,Object> map) {
		return projectWorkHourMapper.queryAnyTime(map);
	}
	@Override
	public long queryAnyHours(Map<String, Object> map) {
		return projectWorkHourMapper.queryAnyHours(map);
	}

	@Override
	public ProjectWorkHour queryWeek(Long id) {
		return projectWorkHourMapper.queryWeek(id);
	}

	@Override
	public ProjectWorkHour queryMonth(Long id) {
		return projectWorkHourMapper.queryMonth(id);
	}

}

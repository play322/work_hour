package com.it.wh.service.impl;

import com.it.wh.dao.ProjectInfoMapper;
import com.it.wh.pojo.ProjectInfo;
import com.it.wh.pojo.ProjectInfoExample;
import com.it.wh.service.ProjectInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@Service
public class ProjectInfoServiceImpl implements ProjectInfoService {
    @Resource
    private ProjectInfoMapper projectInfoMapper;

    //查询所有带分页
    @Override
    public List<ProjectInfo> queryAllProjectInfoPage(Map<String, Object> paramMap) {
        return projectInfoMapper.queryAllProjectInfoPage(paramMap);
    }

    //分页使用的查询所有数量
    @Override
    public int queryProjectInfoCount(Map<String, Object> paramMap) {
        return projectInfoMapper.queryProjectInfoCount(paramMap);
    }

    //添加
    @Override
    public int addProjectInfo(ProjectInfo projectInfo) {

        return projectInfoMapper.insert(projectInfo);
    }

    //删除
    @Override
    public int delProjectInfo(ProjectInfo projectInfo) {
        return  projectInfoMapper.deleteByPrimaryKey(projectInfo.getId());
    }

    //批量删除
    @Override
    public int deleteProjectInfo(Long id) {

        return projectInfoMapper.deleteByPrimaryKey(id);
    }

    //修改
    @Override
    public int updateProjectInfo(ProjectInfo projectInfo) {
        return projectInfoMapper.updateByPrimaryKeySelective(projectInfo);
    }

    //查询所有
    @Override
    public List<ProjectInfo> queryAllProjectInfo() {

        ProjectInfoExample example = new ProjectInfoExample();
        return projectInfoMapper.selectByExample(example);

    }

    //查询单个
    @Override
    public ProjectInfo findProjectInfoById(ProjectInfo projectInfo) {
        return projectInfoMapper.selectByPrimaryKey(projectInfo.getId());
    }

}

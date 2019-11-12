package com.it.wh.service;


import com.it.wh.pojo.ProjectInfo;

import java.util.List;
import java.util.Map;

public interface ProjectInfoService {
    //查询所有带分页
    List<ProjectInfo> queryAllProjectInfoPage(Map<String, Object> paramMap);
    //分页使用的查询所有数量
    int queryProjectInfoCount(Map<String, Object> paramMap);
    //添加
    public int addProjectInfo(ProjectInfo projectInfo);
    //删除
    public int delProjectInfo(ProjectInfo projectInfo);
    //批量删除
    public int deleteProjectInfo(Long id);
    //修改
    public int updateProjectInfo(ProjectInfo projectInfo);
    //查询所有
    public List<ProjectInfo> queryAllProjectInfo();
    //查询单个
    public ProjectInfo findProjectInfoById(ProjectInfo projectInfo);


}

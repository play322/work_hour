package com.it.wh.service;

import com.it.wh.pojo.SysUser;

import java.util.List;

public interface SysUserService {
    //添加
    public void addSysUser(SysUser sysUser);
    //删除
    public void delSysUser(SysUser sysUser);
    //修改
    public void updateSysUser(SysUser sysUser);
    //查询所有
    public List<SysUser> queryAllSysUser(SysUser sysUser);
    //查询单个
    public SysUser findSysUserById(SysUser sysUser);
    //登录
    public SysUser login(SysUser sysUser);

    //查询所有
    List<SysUser> queryAllSysUser();
}

package com.it.wh.service.impl;

import com.it.wh.dao.SysUserMapper;
import com.it.wh.pojo.SysUser;
import com.it.wh.pojo.SysUserExample;
import com.it.wh.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserMapper sysUserMapper;

    //添加
    @Override
    public void addSysUser(SysUser sysUser) {
        sysUserMapper.insert(sysUser);
    }

    //删除
    @Override
    public void delSysUser(SysUser sysUser) {

        sysUserMapper.deleteByPrimaryKey(sysUser.getId());
    }

    //修改
    @Override
    public void updateSysUser(SysUser sysUser)
    {
        sysUserMapper.updateByPrimaryKey(sysUser);
    }

    //查询所有
    @Override
    public List<SysUser> queryAllSysUser(SysUser sysUser) {
        SysUserExample example = new SysUserExample();
        return sysUserMapper.selectByExample(example);
    }

    //查询单个
    @Override
    public SysUser findSysUserById(SysUser sysUser) {
        return sysUserMapper.selectByPrimaryKey(sysUser.getId());
    }

    //登录
    @Override
    public SysUser login(SysUser sysUser) {
        return sysUserMapper.login(sysUser);
    }

    @Override
    public List<SysUser> queryAllSysUser() {
        return sysUserMapper.queryAllSysUser();
    }


}

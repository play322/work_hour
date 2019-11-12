package com.it.wh.controller;

import com.it.wh.pojo.SysUser;
import com.it.wh.service.SysUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    SysUserService sysUserService;

/*    @RequestMapping("/toLogin")
    public String toLogin(){
        return "user/login";
    }*/

    @RequestMapping("/login")
    public String login2(HttpSession session, SysUser sysUser) {

        System.out.println(sysUser);
        SysUser user = sysUserService.login(sysUser);
        System.out.println(user);

        if (user!=null){
            session.setAttribute("user", user);
            return "/item/houtai";
        }
        return "user/login";
    }

    //查询所有员工
    @RequestMapping("/queryAllUser")
    public List<SysUser> queryAllUser(){
        List<SysUser> list = sysUserService.queryAllSysUser();
        return list;
    }

}

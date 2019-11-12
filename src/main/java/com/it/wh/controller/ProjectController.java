package com.it.wh.controller;


import com.it.wh.pojo.ProjectInfo;
import com.it.wh.pojo.SysUser;
import com.it.wh.service.ProjectInfoService;
import com.it.wh.service.SysUserService;
import com.it.wh.utils.PageUtil;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/pro")
public class ProjectController {

    @Resource
    private ProjectInfoService projectInfoService;

    @Resource
    private SysUserService sysUserService;

    @RequestMapping("/toProQueryAll")
    public String toProQueryAll() {
        return "item/queryAllPro";
    }



    //带分页的模糊查询全部--日期显示正常
    @RequestMapping("/proQueryAll")
    @ResponseBody
    public Map<String, Object> queryUser(HttpServletResponse response, ProjectInfo projectInfo, String page, String limit) throws IOException {
        System.out.println(projectInfo.getPiName());
        System.out.println("起始页"+page);
        System.out.println("行数"+limit);
        //处理编码格式
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");

        int pageno = 1;     //默认第1页
        int pageRow = 10;       //默认页容量为10行
        try {
            pageno = Integer.parseInt(page);    //当前页
            pageRow = Integer.parseInt(limit);      //页容量
        } catch (Exception e) {
            e.printStackTrace();
        }

        Map<String, Object> paramMap = new HashMap<String, Object>();
        //查询所有的数据行数
        int total_rows = projectInfoService.queryProjectInfoCount(paramMap);

        if (total_rows==0){
            paramMap.put("code",0);
            paramMap.put("msg","没有数据");
            paramMap.put("count",0);
            paramMap.put("data","[]");
            return paramMap;

        }

        paramMap = PageUtil.setPageParam(pageno, pageRow, total_rows, paramMap);

        //模糊查询名称
        if(projectInfo!=null) {
            paramMap.put("piName", projectInfo.getPiName());
        }

        List<ProjectInfo> listU = projectInfoService.queryAllProjectInfoPage(paramMap);
        System.out.println(listU);

        paramMap.put("code",0);
        paramMap.put("msg","正在加载...");
        paramMap.put("count",total_rows);
        paramMap.put("data",listU);

        return paramMap;
    }


    //添加导航
    @RequestMapping("/toaddPro")
    public String toAddPro(Model model){
        List<SysUser> listU = sysUserService.queryAllSysUser();
        model.addAttribute("list",listU);
        return "item/addProjectInfo";
    }

    //添加操作
    @RequestMapping("/addPro")
    public Object addProjectInfo (HttpServletRequest request ,
        HttpServletResponse response, ProjectInfo projectInfo) throws Exception{

        System.out.println("piUsers---->"+projectInfo.getPiUsers());
        System.out.println("projectInfo---->"+projectInfo);

        //处理编码格式
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        PrintWriter out = response.getWriter();
        int i = projectInfoService.addProjectInfo(projectInfo);
        Map<String,Object> map=new HashMap<>();
        if (i>0){
            //out.print("添加成功！");
            map.put("success",true);
            map.put("message","添加成功");

        }else{
            map.put("success",false);
            map.put("message","添加失败");
        }
        //out.print("添加失败！");
        return map;
    }

    //删除操作
    @RequestMapping("/delPro")
    public void delProjectInfo (HttpServletRequest request ,
                                HttpServletResponse response, ProjectInfo projectInfo) throws Exception{

        //处理编码格式
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        System.out.println(projectInfo);

        JSONObject result = new JSONObject();
        PrintWriter out = response.getWriter();

        int i = projectInfoService.delProjectInfo(projectInfo);

        if (i > 0) {
            result.put("success", true);
        } else {
            result.put("errorMsg", true);
        }
        out.print(result);

        return;

    }

    //批量删除操作
    @RequestMapping(value = "/deletePro",method = RequestMethod.POST)
    public void deleteProjectInfo (HttpServletRequest request ,
       HttpServletResponse response,@RequestParam(value="delArray[]") Long[] delArray) throws Exception{
        System.out.println("==========================");
        System.out.println(delArray.length);
        //处理编码格式
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        JSONObject result = new JSONObject();
        PrintWriter out = response.getWriter();

        if (delArray!=null && delArray.length>0){
            for(Long id:delArray){
                System.out.println("删除"+id);
               projectInfoService.deleteProjectInfo(id);
            }
            return;
        }
    }

    //查询操作--导航到修改页面
    @RequestMapping("/findPro")
    public String findProjectInfo (HttpServletRequest request ,
         HttpServletResponse response, ProjectInfo projectInfo,Model model) throws Exception{

        //处理编码格式
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        ProjectInfo projectInfo1 = projectInfoService.findProjectInfoById(projectInfo);

        System.out.println(projectInfo1);

        model.addAttribute("projectInfo",projectInfo1);

        return "item/updProjectInfo";

    }

    //修改操作
    @RequestMapping("/updPro")
    public void toUpdPro(HttpServletRequest request ,
         HttpServletResponse response,ProjectInfo projectInfo) throws  Exception{

        //处理编码格式
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        PrintWriter out = response.getWriter();
        int i = projectInfoService.updateProjectInfo(projectInfo);

        if (i>0){
            out.print("修改成功！");
            return;
        }
        out.print("修改失败！");

    }




}

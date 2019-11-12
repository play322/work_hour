package com.it.wh.controller;

import com.it.wh.pojo.ProjectInfo;
import com.it.wh.pojo.ProjectWorkHour;
import com.it.wh.pojo.SysUser;
import com.it.wh.service.ProjectInfoService;
import com.it.wh.service.ProjectWorkHourService;
import com.it.wh.service.SysUserService;
import com.it.wh.utils.PageUtil;
import net.sf.json.JSONObject;
import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class WorkHourController {

    @Autowired
    private ProjectInfoService projectInfoService;

    @Autowired
    private ProjectWorkHourService projectWorkHourService;

	  @Autowired
    private SysUserService sysUserService;

    //去填报工时页面
    @RequestMapping("/toAddHour")
    public String toAAddHour(Model model){
        List<ProjectInfo> infoList = projectInfoService.queryAllProjectInfo();
        model.addAttribute("list",infoList);

			//所有用户，到页面回显
			List<SysUser> users = sysUserService.queryAllSysUser();
			model.addAttribute("users",users);
        return "workhours/addWorkHour";
    }

    //填报工时
    @RequestMapping(value = "/addHour")
		@ResponseBody
    public String addHour(ProjectWorkHour projectWorkHour,HttpServletResponse response){
       // System.out.println("工时="+projectWorkHour.getPuiWorkHour());
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=UTF-8");
        projectWorkHourService.addHour(projectWorkHour);
        return "添加成功";
    }

    //去工时列表页面
    @RequestMapping("/toqueryHourPage")
    public String toqueryHour(){
    	return "workhours/queryAllHour";
		}

		//工时列表
	@RequestMapping("/queryHourList")
	@ResponseBody
	public Map<String,Object> hourList(HttpServletResponse response, ProjectWorkHour projectWorkHour, String page, String limit){

		System.out.println("起始页"+page);
		System.out.println("行数"+limit);
		//处理编码格式
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");

		int pageno = 1;     //默认第1页
		int pageRow = 5;       //默认页容量为10行
			pageno = Integer.parseInt(page);    //当前页
			pageRow = Integer.parseInt(limit);      //页容量

		Map<String,Object> map = new HashMap<>();
		//查询所有的数据行数
		int total_rows = projectWorkHourService.queryWorkHour(map);
		System.out.println("总记录=="+total_rows);
		if (total_rows==0){
			map.put("code",0);
			map.put("msg","没有数据");
			map.put("count",0);
			map.put("data","[]");
			return map;

		}

		map = PageUtil.setPageParam(pageno, pageRow, total_rows, map);

		List<ProjectWorkHour> listU = projectWorkHourService.queryAllWorkHour(map);
		System.out.println(listU);

		map.put("code",0);
		map.put("msg","正在加载...");
		map.put("count",total_rows);
		map.put("data",listU);

    	return map;
	}

	//去工时修改页面
	@RequestMapping("/findHourById")
	public  String toEditHour(@RequestParam("id") Long id,Model model){
		ProjectWorkHour projectWorkHour = projectWorkHourService.findByIdHour(id);
		System.out.println("单个工时=="+projectWorkHour);
		model.addAttribute("workHour",projectWorkHour);
		//所有项目，到页面回显
		List<ProjectInfo> infoList = projectInfoService.queryAllProjectInfo();
		model.addAttribute("list",infoList);

		//所有用户，到页面回显
		List<SysUser> users = sysUserService.queryAllSysUser();
		model.addAttribute("users",users);

		return "workhours/editWorkHour";
	}


	//修改工时
	@RequestMapping("/updateHour")
	@ResponseBody
	public String updateHour(ProjectWorkHour projectWorkHour){
		projectWorkHourService.updateHour(projectWorkHour);
    	return "修改成功";
	}

	//删除
	@RequestMapping("/delHour")
	public void delHour(@RequestParam("id") long id,HttpServletResponse response) throws Exception{
		JSONObject result = new JSONObject();
		PrintWriter out = response.getWriter();
		int i = projectWorkHourService.delHour(id);
		if (i > 0) {
			result.put("success", true);
		} else {
			result.put("errorMsg", true);
		}
		out.print(result);
		return;
	}

	//批量删除操作
	@RequestMapping(value = "/delHours",method = RequestMethod.POST)
	public void deleteHours (HttpServletRequest request ,
													 HttpServletResponse response,@RequestParam(value="delArray[]") Long[] delArray) throws Exception{

		//处理编码格式
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		JSONObject result = new JSONObject();
		PrintWriter out = response.getWriter();

		if (delArray!=null && delArray.length>0){
			for(Long id:delArray){
				System.out.println("删除"+id);
				projectWorkHourService.delHour(id);
			}
			return;
		}
	}

	/*
	*   工时统计功能
	* */

	//去查询页面
	@RequestMapping("/toCountPage")
	public String toCountPage(){
		return "workhours/countWorkHour";
	}

	//按任意时间段查询
	/*@RequestMapping("/anyTime")
	@ResponseBody
	public ProjectWorkHour queryAnyTime(@RequestParam("endTime") String endTime,
													  					@RequestParam("startTime") String startTime,
																			HttpServletRequest request){
			SysUser user= (SysUser) request.getSession().getAttribute("user");
			Long id = user.getId();
			Map<String,Object> map = new HashMap<>();
			if (startTime!=null & !"".equals(startTime)){
				map.put("startTime",startTime);
			}
			if (endTime!=null & !"".equals(endTime)){
			map.put("endTime",endTime);
		}
		if (id!=null & !"".equals(id)){
			map.put("id",id);
		}

		ProjectWorkHour times = null;
		if (map!=null & map.size()>0 ){
			times = projectWorkHourService.queryAnyTime(map);
		}
		System.out.println("times===="+times);
		return times;
	}
*/

//按任意时间段查询
	@RequestMapping("/anyTime")
	@ResponseBody
	public List<ProjectWorkHour> queryAnyTime(@RequestParam("endTime") String endTime,
																			@RequestParam("startTime") String startTime,
																			HttpServletRequest request){
		SysUser user= (SysUser) request.getSession().getAttribute("user");
		Long id = user.getId();
		Map<String,Object> map = new HashMap<>();
		if (startTime!=null & !"".equals(startTime)){
			map.put("startTime",startTime);
		}
		if (endTime!=null & !"".equals(endTime)){
			map.put("endTime",endTime);
		}
		if (id!=null & !"".equals(id)){
			map.put("id",id);
		}

		List<ProjectWorkHour> times = null;
		if (map!=null & map.size()>0 ){
			times = projectWorkHourService.queryAnyTime(map);
			System.out.println("times===="+times);
		}
		long totalHours = projectWorkHourService.queryAnyHours(map);
		System.out.println("totalHours"+totalHours);
		request.getSession().setAttribute("totalHours",totalHours);
		return times;
	}
	//按周查询
	@RequestMapping("/queryWeek")
	@ResponseBody
	public ProjectWorkHour queryWeek(	HttpServletRequest request){
		SysUser user= (SysUser) request.getSession().getAttribute("user");
		Long id = user.getId();
		ProjectWorkHour week = projectWorkHourService.queryWeek(id);
		return week;
	}

	//按月查询
	@RequestMapping("/queryMonth")
	@ResponseBody
	public ProjectWorkHour queryMonth(	HttpServletRequest request){
		SysUser user= (SysUser) request.getSession().getAttribute("user");
		Long id = user.getId();
		ProjectWorkHour month = projectWorkHourService.queryMonth(id);
		return month;
	}

}

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改项目信息</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css" media="all">
	<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/layui/layui.js" charset="utf-8"></script>

    <script>

        layui.use('laydate', function(){
            var laydate = layui.laydate;
            //同时绑定多个
            lay('.test-item').each(function(){
                laydate.render({
                    elem: this
                    ,format:'yyyy-MM-dd HH:mm:ss'
                    ,type:'datetime'
                    ,trigger: 'click'
                });
            });
        });
    </script>
</head>
<body>
<form class="layui-form" action="${pageContext.request.contextPath }/pro/updPro" method="post">

    <input style="width: 190px;display: none" type="text" name="id" required  lay-verify="required" autocomplete="off" class="layui-input" value="${projectInfo.id }" >

     <div class="layui-form-item" style="margin-top: 10px">
        <label class="layui-form-label">项目名称</label>
        <div class="layui-input-block">
            <input style="width: 300px;" type="text" name="piName" value="${projectInfo.piName }" required  lay-verify="required" placeholder="请输入项目名称" autocomplete="off" class="layui-input" >
        </div>
     </div>

     <div class="layui-form-item" style="margin-top: 10px">
        <label class="layui-form-label">项目所属单位</label>
        <div class="layui-input-block">
            <input style="width: 300px;" type="text" name="piDepartment" value="${projectInfo.piDepartment }"  required  lay-verify="required" placeholder="请输入项目所属单位" autocomplete="off" class="layui-input" >
        </div>
    </div>

    <div class="layui-form-item" style="margin-top: 10px">
        <label class="layui-form-label">项目创建者ID</label>
        <div class="layui-input-block">
            <input style="width: 190px;" type="text" name="piCreateId" value="${projectInfo.piCreateId }" required  lay-verify="required" placeholder="请输入创建者ID" autocomplete="off" class="layui-input" >
        </div>
    </div>

    <div class="layui-form-item" style="margin-top: 10px">
        <label class="layui-form-label">项目创建时间</label>
        <div class="layui-input-block">
            <input style="width: 190px;" type="text" name="piCreateDt"  value="${projectInfo.piCreateDt }" required  lay-verify="required" placeholder="请输入创建时间" autocomplete="off" class="layui-input test-item" >
        </div>
    </div>

    <div class="layui-form-item" style="margin-top: 10px">
        <label class="layui-form-label">项目计划开始日期</label>
        <div class="layui-input-block">
            <input style="width: 190px;" type="text" name="piPlanStartDt" value="${projectInfo.piPlanStartDt }"  required  lay-verify="required" placeholder="请输入计划开始日期" autocomplete="off" class="layui-input test-item" >
        </div>
    </div>

    <div class="layui-form-item" style="margin-top: 10px">
        <label class="layui-form-label">项目计划结束日期</label>
        <div class="layui-input-block">
            <input style="width: 190px;" type="text" name="piPlanEndDt"  value="${projectInfo.piPlanEndDt }" required  lay-verify="required" placeholder="请输入计划结束日期" autocomplete="off" class="layui-input test-item" >
        </div>
    </div>

    <div class="layui-form-item" style="margin-top: 10px">
        <label class="layui-form-label">项目实际开始日期</label>
        <div class="layui-input-block">
            <input style="width: 190px;" type="text" name="piRealStartDt" value="${projectInfo.piRealStartDt }"  required  lay-verify="required" placeholder="请输入创建时间" autocomplete="off" class="layui-input test-item" >
        </div>
    </div>

    <div class="layui-form-item" style="margin-top: 10px">
        <label class="layui-form-label">项目实际结束日期</label>
        <div class="layui-input-block">
            <input style="width: 190px;" type="text" name="piRealEndDt"  value="${projectInfo.piRealEndDt }"  required  lay-verify="required" placeholder="请输入创建时间" autocomplete="off" class="layui-input test-item" >
        </div>
    </div>

    <div class="layui-form-item" style="margin-top: 10px">
        <label class="layui-form-label">项目状态</label>
        <div class="layui-input-block">
            <input style="width: 350px;" type="text" name="piState"  value="${projectInfo.piState }"  required  lay-verify="required" placeholder="0表示未开始，1表示进行中，2表示已完成" autocomplete="off" class="layui-input" >
        </div>
    </div>

    <div class="layui-form-item" style="margin-top: 10px">
        <label class="layui-form-label"></label>
        <div class="layui-input-block">
           <button class="layui-btn">查看项目成员</button>
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block" style="margin-top: 20px;">
            <button class="layui-btn layui-btn-warm" lay-submit lay-filter="formDemo">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>

</body>
</html>
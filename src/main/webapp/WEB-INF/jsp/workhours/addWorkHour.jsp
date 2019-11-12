<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>填报工时</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css" media="all">
	<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/layui/layui.js" charset="utf-8"></script>

    <script>
        layui.use(['form','laydate'], function(){
            var laydate = layui.laydate;
            var form = layui.form
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
<br><br><br>
<form class="layui-form" action="${pageContext.request.contextPath }/addHour" method="post">
     <div class="layui-form-item" style="margin-top: 10px">
        <label class="layui-form-label">项目名称</label>
        <div class="layui-input-block" style="width: 300px">
           <%-- <input style="width: 300px;" type="text" name="piName" required  lay-verify="required" placeholder="请输入项目名称" autocomplete="off" class="layui-input" >--%>
               <select name="puiPiId">
                   <option value="--请选择--" ></option>
                   <c:forEach var="pro" items="${list}">
                       <option value="${pro.id}">${pro.piName}</option>
                   </c:forEach>
               </select>
        </div>
     </div>

    <div class="layui-form-item" style="margin-top: 10px">
        <label class="layui-form-label">员工姓名</label>
        <div class="layui-input-block" style="width: 300px">
            <select name="puiSuId">
                <option value="--请选择--" ></option>
                <c:forEach var="user" items="${users}">
                    <option value="${user.id}">${user.suName}</option>
                </c:forEach>
            </select>
        </div>
    </div>


    <div class="layui-form-item" style="margin-top: 10px">
        <label class="layui-form-label">工时</label>
        <div class="layui-input-block">
            <input style="width: 300px;" type="text" name="puiWorkHour"  required  lay-verify="required" placeholder="请输入项目工时" autocomplete="off" class="layui-input" >
        </div>
    </div>

    <div class="layui-form-item" style="margin-top: 10px">
        <label class="layui-form-label">录入时间</label>
        <div class="layui-input-block">
            <input style="width: 190px;" type="text" name="puiInputDt"   required  lay-verify="required" placeholder="录入时间" autocomplete="off" class="layui-input test-item" >
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block" style="margin-top: 20px;">
            <button class="layui-btn layui-btn-warm" lay-submit lay-filter="formDemo">保存</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>

</body>
</html>
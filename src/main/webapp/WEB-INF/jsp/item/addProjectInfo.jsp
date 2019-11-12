<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加项目信息</title>
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
<form class="layui-form" <%--action="${pageContext.request.contextPath }/pro/addPro"--%> method="post">

     <div class="layui-form-item" style="margin-top: 10px">
        <label class="layui-form-label">项目名称</label>
        <div class="layui-input-block">
            <input style="width: 300px;" type="text" id="piName" name="piName" required  lay-verify="required" placeholder="请输入项目名称" autocomplete="off" class="layui-input" >
     </div>
     </div>

     <div class="layui-form-item" style="margin-top: 10px">
        <label class="layui-form-label">项目所属单位</label>
        <div class="layui-input-block">
            <input style="width: 300px;" type="text" id="piDepartment" name="piDepartment"  required  lay-verify="required" placeholder="请输入项目所属单位" autocomplete="off" class="layui-input" >
        </div>
    </div>

    <div class="layui-form-item" style="margin-top: 10px;">
        <label class="layui-form-label">项目创建者</label>
        <div class="layui-input-block" style="width:190px;">
       <%--  <input style="width: 190px;" type="text" name="piCreateId"  required  lay-verify="required" placeholder="请输入创建者ID" autocomplete="off" class="layui-input" >--%>
        <select name="piCreateId"  id="piCreateId">
            <option value="--请选择--" ></option>
            <c:forEach var="user" items="${list}">
            <option value="${user.id}">${user.suName}</option>
            </c:forEach>
        </select>
        </div>
    </div>

    <div class="layui-form-item" style="margin-top: 10px">
        <label class="layui-form-label">项目创建时间</label>
        <div class="layui-input-block">
            <input style="width: 190px;" type="text "id="piCreateDt" name="piCreateDt"   required  lay-verify="required" placeholder="请输入创建时间" autocomplete="off" class="layui-input test-item" >
        </div>
    </div>

    <div class="layui-form-item" style="margin-top: 10px">
        <label class="layui-form-label">项目计划开始日期</label>
        <div class="layui-input-block">
            <input style="width: 190px;" type="text" name="piPlanStartDt" id="piPlanStartDt"  required  lay-verify="required" placeholder="请输入计划开始日期" autocomplete="off" class="layui-input test-item" >
        </div>
    </div>

    <div class="layui-form-item" style="margin-top: 10px">
        <label class="layui-form-label">项目计划结束日期</label>
        <div class="layui-input-block">
            <input style="width: 190px;" type="text" name="piPlanEndDt"  id="piPlanEndDt" required  lay-verify="required" placeholder="请输入计划结束日期" autocomplete="off" class="layui-input test-item" >
        </div>
    </div>

    <div class="layui-form-item" style="margin-top: 10px">
        <label class="layui-form-label">项目实际开始日期</label>
        <div class="layui-input-block">
            <input style="width: 190px;" type="text" name="piRealStartDt"  id="piRealStartDt" required  lay-verify="required" placeholder="请输入实际开始日期" autocomplete="off" class="layui-input test-item" >
        </div>
    </div>

    <div class="layui-form-item" style="margin-top: 10px">
        <label class="layui-form-label">项目实际结束日期</label>
        <div class="layui-input-block">
            <input style="width: 190px;" type="text" name="piRealEndDt" id="piRealEndDt"  required  lay-verify="required" placeholder="请输入实际结束日期" autocomplete="off" class="layui-input test-item" >
        </div>
    </div>

    <div class="layui-form-item" style="margin-top: 10px">
        <label class="layui-form-label">项目状态</label>
        <div class="layui-input-block">
          <input style="width: 350px;" type="text" name="piState" id="piState"   required  lay-verify="required" placeholder="0表示未开始，1表示进行中，2表示已完成" autocomplete="off" class="layui-input" >
        </div>
    </div>

    <div class="layui-form-item" style="margin-top:10px;margin-left: 170px">
       <button  class="layui-btn" id="addUser">添加项目成员</button>
    </div>

    <div class="layui-form-item"  style="display: none" id="userList">
        <label class="layui-form-label">可选人员</label>
        <div class="layui-input-block">
            <c:forEach items="${list}" var="user">
                <c:if test="${user.suStatus==1}">
                <input type="checkbox" id="${user.id}" name=“"piUsers" value="${user.id}" title="${user.suName}">
                </c:if>
            </c:forEach>
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block" style="margin-top: 20px;">
            <button class="layui-btn layui-btn-warm" lay-submit lay-filter="formDemo" id="addBtn">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>
<script type="text/javascript">
  $("#addUser").click(function () {
    /*  $("#userList").removeAttr("style");*/
     /* $("#userList").style.display="block";*/
      $("#userList").toggle();
  })

   $("#addBtn").click(function () {
       var piName=$("#piName");
       var piDepartment=$("#piDepartment");
       var piCreateId=$("#piCreateId");
       var piCreateDt=$("#piCreateDt");
       var piPlanStartDt=$("#piPlanStartDt");
       var piPlanEndDt=$("#piPlanEndDt");
       var piRealStartDt=$("#piRealStartDt");
       var piRealEndDt=$("#piRealEndDt");
       var piState=$("#piState");
       var ids = "";
       var uids = $("input:checked");
       $.each(uids,function (i,n) {
            if(i!=0){
                ids += ',';
            }
            ids += n.id ;
        })
       alert(ids);
       $.ajax({
           url:'${pageContext.request.contextPath }/pro/addPro',
           type:'post',
           data:{
               piName:piName.val(),
               piDepartment:piDepartment.val(),
               piCreateId:piCreateId.val(),
               piCreateDt:piCreateDt.val(),
               piPlanStartDt:piPlanStartDt.val(),
               piPlanEndDt:piPlanEndDt.val(),
               piRealStartDt:piRealStartDt.val(),
               piRealEndDt:piRealEndDt.val(),
               piState:piState.val(),
               piUsers:ids
           },
           success:function (map) {
               window.location.href='${pageContext.request.contextPath }/toProQueryAll'
             if(map.success){

                 layer.alert(map.message);

             }else{
                 layer.alert(map.message);
             }
           }
       })
   })


</script>
</body>
</html>
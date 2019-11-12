<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/10
  Time: 11:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <script src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/layui/css/layui.css">
    <script src="${pageContext.request.contextPath }/layui/layui.js"></script>

  <script>
        layui.use(['table','layer','form', 'jquery','laydate'], function(){
            var laydate = layui.laydate;
            var form = layui.form
            //同时绑定多个
            lay('.test-item').each(function(){
                laydate.render({
                    elem: this
                    ,format:'yyyy-MM-dd'
                    ,type:'datetime'
                    ,trigger: 'click'
                });
            });



            form.on('submit(anytime)', function (data) {
                var startTime = $("#startTime").val();
                var endTime = $("#endTime").val();
                $("tr:gt(0)").empty();
                $.ajax({
                    type : "POST",
                    url : "${pageContext.request.contextPath }/anyTime",
                    data : {
                        startTime:startTime,
                        endTime:endTime
                    },
                    dataType : "json",
                    success : function(data) {
                        $.each(data,function (i,items) {
                            $("#test").append("<tr>" +
                                "<td>"+(i+1)+"</td>" +
                                "<td>"+items.id+"</td>" +
                                "<td>"+items.piName+"</td>" +
                                "<td>"+items.suName+"</td>"+
                                "<td>"+items.puiWorkHour+"</td>"+
                                "<td>"+items.puiInputDt+"</td>"+
                                "</tr>")
                        })

                    }
                });
                return false;
            });
            form.render(); // 更新全部

               /* $("#anytime").click(function () {
                    var startTime = $("#startTime").val();
                    var endTime = $("#endTime").val();
                    $("tr:gt(0)").empty();
                    $.getJSON("${pageContext.request.contextPath }/anyTime",{startTime:startTime,endTime:endTime},
                        function(data){
                        $("#test").append("<tr>" +
                            "<td>"+data.id+"</td>" +
                            "<td>"+data.piName+"</td>" +
                            "<td>"+data.suName+"</td>"+
                            "<td>"+data.puiPiId+"</td>"+
                            "</tr>")
                }) ;
            });*/

            $("#queryWeek").click(function () {
                $("tr:gt(0)").empty();
                $.getJSON("${pageContext.request.contextPath }/queryWeek",function(data){
                        $("#test").append("<tr>" +
                            "<td>"+data.id+"</td>" +
                            "<td>"+data.piName+"</td>" +
                            "<td>"+data.suName+"</td>"+
                            "<td>"+data.puiPiId+"</td>"+
                            "</tr>")
                    }) ;
            });

            $("#queryMonth").click(function () {
                $("tr:gt(0)").empty();
                $.getJSON("${pageContext.request.contextPath }/queryMonth",function(data){
                    $("#test").append("<tr>" +
                        "<td>"+data.id+"</td>" +
                        "<td>"+data.piName+"</td>" +
                        "<td>"+data.suName+"</td>"+
                        "<td>"+data.puiPiId+"</td>"+
                        "</tr>")
                }) ;
            });
        });
       </script>
</head>
<body>

<div style="margin-top: 20px" >
    <form action="" method="post">
    <div class="layui-input-block" style="width: 200px;float: left;margin-left:0px">
        <input id="startTime" style="width: 200px" type="text" name="startTime" required  lay-verify="required" placeholder="输入起始日期" autocomplete="off" class="layui-input test-item">
    </div>
    <div class="layui-input-block" style="width: 200px;float: left;margin-left:0px">
        <input id="endTime" style="width: 200px" type="text" name="endTime" required  lay-verify="required" placeholder="输入截止日期" autocomplete="off" class="layui-input test-item">
    </div>

        <button type="submit" class="layui-btn" lay-submit lay-filter="anytime">查询</button>
</form>
       <%-- <button class="layui-btn layui-btn-warm layui-btn-radius" id="anytime" lay-event="search">查询</button>--%>
<div class="layui-btn-container" style="margin-top: 20px">
        <button class="layui-btn" id="queryWeek" lay-event="add">按周查询</button>

        <button class="layui-btn" id="queryMonth" lay-event="add" >按月查询</button>
    </div>
</div>

<table id="test" class="layui-table" style="border:10px">
    <tr>
        <th>序号</th>
        <th>员工编号</th>
        <th>项目名</th>
        <th>员工姓名</th>
        <th>工时数</th>
        <th>时间</th>
    </tr>
</table>
<p>总工时：${totalHours}</p>

</body>
</html>

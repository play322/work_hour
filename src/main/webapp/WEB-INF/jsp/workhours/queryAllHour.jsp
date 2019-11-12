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

        layui.use(['table','layer', 'jquery'], function(){

            var table = layui.table,
                layer = layui.layer,
                $ = layui.jquery;

            table.render({
                elem: '#test',
                toolbar:'#toolbarDemo',
                url: '${pageContext.request.contextPath }/queryHourList', //数据接口
                method:"post",
                id:'testReload',
                limit:'5',
                limits:[5,10,20,30,40,50,60,70,80,90],
                // page: true, //开启分页
                cols: [[ //表头
                    {type: 'checkbox', fixed: 'left',align:'center'},
                    {field: 'id', title: '编号',  sort: true, fixed: 'left',align:'center'},
                    {field: 'puiPiId', title: '项目编号',align:'center',hide:true}, //hide：true隐藏该列
                    {field: 'piName', title: '项目名称',align:'center'},
                    {field: 'puiSuId', title: '员工编号',align:'center',hide:true},  //hide：true隐藏该列
                    {field: 'suName', title: '员工姓名',align:'center'},
                    {field: 'puiWorkHour', title: '工时数',align:'center'},
                    {field: 'puiInputDt', title: '工时录入时间',align:'center'},
                    {field:'a', title:'操作', toolbar: '#barDemo',align:'center'}
                ]],
                page: {layout:[ 'count','prev', 'page', 'next', 'limit', 'refresh', 'skip']}

            });

            //头工具栏事件
            table.on('toolbar(test)', function(obj){
                var checkStatus = table.checkStatus(obj.config.id);
                switch(obj.event){
                    case 'batchDeletion':
                        active.batchDeletion();
                        break;
                    case 'search':
                        active.reload();
                        break;
                    case 'add':
                        active.add();
                        break;
                };
            });
            //添加事件
            //触发事件
            active = {
                //页面重新加载
                reload:function(){
                    var piName=$("#piName").val();
                    //alert(search_name);
                    table.reload('testReload',{
                        where:{piName:piName}
                    });
                },
                //批量删除
                batchDeletion:function() {
                    //获取选中数据
                    var checkStatus = table.checkStatus('testReload'),
                        data = checkStatus.data;
                    if (data == "") {
                        layer.msg('至少也得选一个吧', {icon: 2});
                        return;
                    }

                    var delArray=[];
                    //获取单元格选中的行
                    if (data.length > 0) {
                        for(var i=0;i<data.length;i++){
                            delArray.push(data[i].id);
                        }
                    }

                    layer.confirm('确认要删除  '+delArray+' 吗？', function (index) {
                        $.ajax({
                            type: 'POST',
                            url: '${pageContext.request.contextPath }/delHours',
                            data: {'delArray': delArray},
                        });
                        layer.alert('删除成功!', {icon: 1},function(){
                            location.reload();
                        });
                    });

/*                    //把数组中的所有元素放入一个字符串ids,使用,作为分隔符。
                    var ids =delArray.join(",");

                    layer.confirm('确认要删除  '+delArray+' 吗？', function (index) {
                        $.ajax({
                            type: 'POST',
                            url: '../../hos.do?opt=delHos',
                            data: {'delIds': ids},

                        });
                        layer.alert('删除成功!', {icon: 1},function(){
                            location.reload();
                        });
                    });*/

                },

                add: function(){
                    //示范一个公告层
                    layer.open({
                        type: 2
                        ,title: '添加项目信息' //显示标题栏
                        ,closeBtn: true
                        ,area: ['500px', '400px'] //控制弹窗大小
                        ,offset: ['20px'] //具体位置 顶部，左侧
                        ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
                        ,btn: ['退出']
                        ,btnAlign: 'c'
                        ,moveType: 1 //拖拽模式，0或者1
                        ,content: '${pageContext.request.contextPath }/toAddHour'
                        ,end:function () {
                            location.reload();
                        }

                    });
                }

            };

            //监听行工具事件
            table.on('tool(test)', function(obj){
                var data = obj.data;
                //console.log(obj)
                switch(obj.event){
                    case 'del':
                        layer.confirm("确认要删除吗，删除后不能恢复", function (index) {
                            delHospital(data.id);
                            layer.close(index);

                        });
                        break;
                    case 'edit':
                        updateStu(data.id);
                        break;
                };
            });

        });

        //单个删除
        function delHospital(id){
            //alert(id);
            $.post("${pageContext.request.contextPath }/delHour",{id:id},function(result){
                //alert(result.success)
                //layer.msg(result.success);

                if(result.success){
                    layer.alert('删除成功!', {icon: 1},function(){
                        location.reload();

                    });
                }else if(result = null){
                    layer.alert('删除失败!', {icon: 1},function(){
                        location.reload();
                        //layer.close(index);
                    });
                }
            },"json");
        }


        //修改
        function  updateStu(id) {
            layer.open({
                type: 2
                ,title: '修改项目信息' //显示标题栏
                ,closeBtn: false
                ,area: ['500px', '400px'] //控制弹窗大小
                ,offset: ['20px', '300px'] //具体位置 顶部，左侧
                ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
                ,btn: ['退出']
                ,btnAlign: 'c'
                ,moveType: 1 //拖拽模式，0或者1
                ,content: '${pageContext.request.contextPath }/findHourById?id='+id
                ,end:function () {
                    location.reload();
                }
            })

        }


    </script>
</head>
<body>
<table class="layui-hide" id="test" lay-filter="test"></table>


<script type="text/html" id="toolbarDemo">
    <div class="layui-input-block" style="width: 200px;float: left;margin-left:0px">
        <input id="piName" style="width: 200px" type="text" name="piName" required lay-verify="required" placeholder="" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-btn-container">
        <button class="layui-btn layui-btn-warm layui-btn-radius" lay-event="search">搜索</button>

        <button class="layui-btn layui-btn layui-btn-radius" lay-event="add">添加工时</button>

        <button class="layui-btn layui-btn-danger layui-btn-radius"lay-event="batchDeletion" data-type="batchDeletion">批量删除</button>
    </div>
</script>

<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="edit" >编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>

</script>

<%-- <script type="text/javascript">
	layui.use(['element', 'layer', 'jquery'], function() {
		var element = layui.element,
			layer = layui.layer,
			jquery = layui.jquery,
			$ = layui.$;
	});
</script>--%>
</body>
</html>

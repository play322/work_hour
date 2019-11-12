<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>工时系统后台管理</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css">
		<script src="${pageContext.request.contextPath}/layui/layui.js"></script>
	</head>
	<body class="layui-layout-body">
						
		<div class="layui-layout layui-layout-admin">
			<div class="layui-header">
				<div class="layui-logo">工时系统后台管理</div>
				<!-- 头部区域（可配合layui已有的水平导航） -->
				

    <ul class="layui-nav layui-layout-right">
      <li class="layui-nav-item">
        <a href="javascript:;">
          <img src="${pageContext.request.contextPath}/img/f001.jpg" class="layui-nav-img">
			${user.suLoginName}
        </a>
        <dl class="layui-nav-child">       
          <dd><a href="javascript:;" data-id="2" data-title="安全设置" data-url="${pageContext.request.contextPath }/bst.do?opt=find_sm" class="site-demo-active" data-type="tabAdd">安全设置</a></dd>
        </dl>
      </li>
      <li class="layui-nav-item"><a href="../login.html">
      	<i class="layui-icon layui-icon-face-smile"></i>
      	退出</a>
      </li>
    </ul>
			</div>

			<div class="layui-side layui-bg-black">
				<div class="layui-side-scroll">
					<!-- 左侧导航区域（可配合layui已有的垂直导航） -->
					<ul class="layui-nav layui-nav-tree" lay-filter="test">
						
						<li class="layui-nav-item layui-this">
							<a href="javascript:;" data-url="index2.html">
							    <i class="iconfont icon-home1" data-icon='icon-home1'></i>
								<span>后台首页</span>
							</a>
						</li>
												
						<li class="layui-nav-item ">
							<a href="javascript:;">项目管理</a>
							<dl class="layui-nav-child">
								<dd><a href="javascript:;" data-id="1" data-title="项目列表" data-url="${pageContext.request.contextPath }/pro/toProQueryAll" class="site-demo-active" data-type="tabAdd">项目列表</a></dd>
								<dd><a href="javascript:;" data-id="2" data-title="项目创建" data-url="../hosManager/profManager.html" class="site-demo-active" data-type="tabAdd">项目创建</a></dd>
								<dd><a href="javascript:;" data-id="3" data-title="项目更改" data-url="../hosManager/blackList.html" class="site-demo-active" data-type="tabAdd">项目更改</a></dd>
							</dl>
						</li>
						<li class="layui-nav-item layui-nav-itemed">
							<a href="javascript:;">工时管理</a>
							<dl class="layui-nav-child">
								<dd><a href="javascript:;" data-id="4" data-title="工时填报" data-url="${pageContext.request.contextPath }/toAddHour" class="site-demo-active" data-type="tabAdd">工时填报</a></dd>
								<dd><a href="javascript:;" data-id="5" data-title="工时列表" data-url="${pageContext.request.contextPath }/toqueryHourPage" class="site-demo-active" data-type="tabAdd">工时列表</a></dd>
							</dl>
						</li>

						<li class="layui-nav-item layui-nav-itemed">
							<a href="javascript:;">工时统计</a>
							<dl class="layui-nav-child">
								<dd><a href="javascript:;" data-id="6" data-title="工时查询" data-url="${pageContext.request.contextPath }/toCountPage" class="site-demo-active" data-type="tabAdd">工时查询</a></dd>
							</dl>
						</li>

 						<li class="layui-nav-item">
							<a href="javascript:;">权限管理</a>
							<dl class="layui-nav-child">
								<dd><a href="javascript:;" data-id="9" data-title="用户管理" data-url="goodsInStore.html" class="site-demo-active" data-type="tabAdd">用户管理</a></dd>
								<dd><a href="javascript:;" data-id="10" data-title="角色管理" data-url="goodsOutStore.html" class="site-demo-active" data-type="tabAdd">系统角色管理</a></dd>
								<dd><a href="javascript:;" data-id="11" data-title="权限管理" data-url="goodsInDetail.html" class="site-demo-active" data-type="tabAdd">系统权限管理</a></dd>
								
							</dl>
						</li>
						
					</ul>
				</div>
			</div>

				
			<!--tab标签-->
			<div class="layui-body" style="height:90%;">
				<div class="layui-tab layui-tab-brief" lay-filter="demo" lay-allowclose="true" style="margin: 0px;height:100%;">
					<ul class="layui-tab-title"></ul>
					<div class="layui-tab-content" style="margin-top: -20px;height: 100%;"></div>
				</div>
			</div>S

<%--			<div class="layui-body"style="height:100%;">
				<!-- 内容主体区域 -->
				<div class="layui-tab" lay-filter="demo" lay-allowclose="true" style="margin: 0px;height:100%;">
					<ul class="layui-tab-title">
					</ul>
					<ul class="rightmenu" style="display: none;position: absolute;">
						<li data-type="closethis">关闭当前</li>
						<li data-type="closeall">关闭所有</li>
					</ul>
					<div class="layui-tab-content" style="margin: 0px;height: 90%;">
					</div>
				</div>
			</div>--%>
		  
<%--		  <div class="layui-footer">
		    <!-- 底部固定区域 -->
		    © xyzp.com - 工时系统后台管理
		  </div>--%>
			

			
		</div>

		<script>
			//JavaScript代码区域
			layui.use(['element', 'layer', 'jquery'], function() {
				var element = layui.element,
					layer = layui.layer,
					jquery = layui.jquery,
					$ = layui.$;
				// 配置tab实践在下面无法获取到菜单元素
				$('.site-demo-active').on('click', function() {
					var dataid = $(this);
					//这时会判断右侧.layui-tab-title属性下的有lay-id属性的li的数目，即已经打开的tab项数目
					if ($(".layui-tab-title li[lay-id]").length <= 0) {
						//如果比零小，则直接打开新的tab项
						active.tabAdd(dataid.attr("data-url"), dataid.attr("data-id"), dataid.attr("data-title"));
					} else {
						//否则判断该tab项是否以及存在
						var isData = false; //初始化一个标志，为false说明未打开该tab项 为true则说明已有
						$.each($(".layui-tab-title li[lay-id]"), function() {
							//如果点击左侧菜单栏所传入的id 在右侧tab项中的lay-id属性可以找到，则说明该tab项已经打开
							if ($(this).attr("lay-id") == dataid.attr("data-id")) {
								isData = true;
							}
						})
						if (isData == false) {
							//标志为false 新增一个tab项
							active.tabAdd(dataid.attr("data-url"), dataid.attr("data-id"), dataid.attr("data-title"));
						}
					}
					//最后不管是否新增tab，最后都转到要打开的选项页面上
					active.tabChange(dataid.attr("data-id"));
				});

				var active = {
					//在这里给active绑定几项事件，后面可通过active调用这些事件
					tabAdd: function(url, id, name) {
						//新增一个Tab项 传入三个参数，分别对应其标题，tab页面的地址，还有一个规定的id，是标签中data-id的属性值
						//关于tabAdd的方法所传入的参数可看layui的开发文档中基础方法部分
						element.tabAdd('demo', {
							title: name,
							content: '<iframe data-frameid="' + id + '" scrolling="auto" frameborder="0" src="' + url +
								'" style="width:100%;height:100%;"></iframe>',
							id: id //规定好的id
						})
						FrameWH(); //计算ifram层的大小
					},
					tabChange: function(id) {
						//切换到指定Tab项
						element.tabChange('demo', id); //根据传入的id传入到指定的tab项
					},
					tabDelete: function(id) {
						element.tabDelete("demo", id); //删除
					}
				};

				function FrameWH() {
					var h = $(window).height();
					$("iframe").css("height", h + "px");
				}
			});
		</script>
	</body>
</html>
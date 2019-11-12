<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
  <title>工时系统</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

<%--  <style>
    body{margin: 10px;}
    .demo-carousel{height: 200px; line-height: 200px; text-align: center;}
    .code {
        width: 400px;
        margin: 0 auto;
    }
    .input-val {
        width: 295px;
        background: #ffffff;
        height: 2.8rem;
        padding: 0 2%;
        border-radius: 5px;
        border: none;
        border: 1px solid rgba(0,0,0,.2);
        font-size: 1.0625rem;
    }
    #canvas {
        float: right;
        display: inline-block;
        border: 1px solid #ccc;
        border-radius: 5px;
        cursor: pointer;
    }
    .btn {
        width: 100px;
        height: 40px;
        background: #f1f1f1;
        border: 1px solid #ccc;
        border-radius: 5px;
        margin: 20px auto 0;
        display: block;
        font-size: 1.2rem;
        color: #e22e1c;
        cursor: pointer;
    }
    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
    }
  </style>--%>

  <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
  <script src="${pageContext.request.contextPath}/layui/layui.js"></script>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css" media="all">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/admin.css" media="all">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/login.css" media="all">

</head>




	<body cz-shortcut-listen="true" class="layui-layout-body">

        <div class="layui-layer-move">
	        <div class="code">

	  <div class="layadmin-user-login layadmin-user-display-show" id="LAY-user-login" style="display: none;">

    <div class="layadmin-user-login-main">
      <div class="layadmin-user-login-box layadmin-user-login-header">
        <h2>登录工时系统</h2>
      </div>
  <form class="layui-form" name="login" action="${pageContext.request.contextPath}/user/login" method="post">
      <div class="layadmin-user-login-box layadmin-user-login-body layui-form">
        <div class="layui-form-item">
          <label class="layadmin-user-login-icon layui-icon layui-icon-username" for="LAY-user-login-username"></label>
          <input type="text" name="suLoginName" id="LAY-user-login-username" lay-verify="required" placeholder="用户名" class="layui-input">
        </div>
        <div class="layui-form-item">
          <label class="layadmin-user-login-icon layui-icon layui-icon-password" for="LAY-user-login-password"></label>
          <input type="password" name="suLoginPasswd" id="LAY-user-login-password" lay-verify="required" placeholder="密码" class="layui-input">
        </div>
        <div class="layui-form-item">
          <div class="layui-row">
            <div class="layui-col-xs8">
              <label class="layadmin-user-login-icon layui-icon layui-icon-vercode" for="LAY-user-login-vercode"></label>
              <input type="text" name="vercode" id="LAY-user-login-vercode" lay-verify="required" placeholder="请输入验证码（不区分大小写）" class="layui-input input66">
            </div>
            <div class="layui-col-xs4">
              <div style="margin-left: 10px;">
                <canvas id="canvas" width="100" height="35"></canvas>
              </div>
            </div>
          </div>
        </div>
        <div class="layui-form-item">

          <input class="btn layui-btn layui-btn-fluid" name="button"  value="登 入" />

        </div>
      </div>
    </div>
   </form>


        </div>

        <div class="layui-trans layadmin-user-login-footer">
	      <p>© 2018 <a href="http://www.layui.com/" target="_blank">layui.com</a></p>
	  	</div>
    </body>


<script>

    $(function(){
        var show_num = [];
        draw(show_num);

        $("#canvas").on('click',function(){
            draw(show_num);
        })
        $(".btn").on('click',function(){
            var val = $(".input66").val().toLowerCase();
            var num = show_num.join("");
            if(val==''){
                alert('请输入验证码！');
            }else if(val == num){
                //alert('提交成功！');
                $("form[name='login']").submit();
                $(".input-val").val('');
                draw(show_num);

            }else{
                alert('验证码错误！请重新输入！');
                $(".input-val").val('');
                draw(show_num);
            }
        })
    })

    function draw(show_num) {
        var canvas_width=$('#canvas').width();
        var canvas_height=$('#canvas').height();
        var canvas = document.getElementById("canvas");//获取到canvas的对象，演员
        var context = canvas.getContext("2d");//获取到canvas画图的环境，演员表演的舞台
        canvas.width = canvas_width;
        canvas.height = canvas_height;
        var sCode = "A,B,C,E,F,G,H,J,K,L,M,N,P,Q,R,S,T,W,X,Y,Z,1,2,3,4,5,6,7,8,9,0";
        var aCode = sCode.split(",");
        var aLength = aCode.length;//获取到数组的长度

        for (var i = 0; i <= 3; i++) {
            var j = Math.floor(Math.random() * aLength);//获取到随机的索引值
            var deg = Math.random() * 30 * Math.PI / 180;//产生0~30之间的随机弧度
            var txt = aCode[j];//得到随机的一个内容
            show_num[i] = txt.toLowerCase();
            var x = 10 + i * 20;//文字在canvas上的x坐标
            var y = 20 + Math.random() * 8;//文字在canvas上的y坐标
            context.font = "bold 23px 微软雅黑";

            context.translate(x, y);
            context.rotate(deg);

            context.fillStyle = randomColor();
            context.fillText(txt, 0, 0);

            context.rotate(-deg);
            context.translate(-x, -y);
        }
        for (var i = 0; i <= 5; i++) { //验证码上显示线条
            context.strokeStyle = randomColor();
            context.beginPath();
            context.moveTo(Math.random() * canvas_width, Math.random() * canvas_height);
            context.lineTo(Math.random() * canvas_width, Math.random() * canvas_height);
            context.stroke();
        }
        for (var i = 0; i <= 30; i++) { //验证码上显示小点
            context.strokeStyle = randomColor();
            context.beginPath();
            var x = Math.random() * canvas_width;
            var y = Math.random() * canvas_height;
            context.moveTo(x, y);
            context.lineTo(x + 1, y + 1);
            context.stroke();
        }
    }

    function randomColor() {//得到随机的颜色值
        var r = Math.floor(Math.random() * 256);
        var g = Math.floor(Math.random() * 256);
        var b = Math.floor(Math.random() * 256);
        return "rgb(" + r + "," + g + "," + b + ")";
    }
</script>
</html>
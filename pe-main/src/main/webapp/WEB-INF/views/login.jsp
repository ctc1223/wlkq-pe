<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.wlkq.pe.util.Const" %>
<!DOCTYPE html>
<html lang="ch-en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${PATH }/static/css/style.css">
    <link rel="stylesheet" href="${PATH }/static/layui/css/layui.css">

    <!-- <link rel="stylesheet" href="layui/css/layui.mobile.css"> -->
    <title>登录谊动</title>
</head>

<body style="background-image: url(${PATH}/static/img/bg.jpg);background-size: cover;background-repeat: no-repeat;" cz-shortcut-listen="true" class="layui-layout-body">
    <div class="space"></div>
    
    <div id="login-box">
        <div class="login-box">
            <h1 style="font-weight: bold;">欢迎使用谊动</h1>
            <img src="${PATH}/static/img/logo.png" alt="" style="width: 70px;height: 70px;">
            
            <form action="${PATH }/dologin" method="post" class=" form-signin">
                <div class="loginbar">
                    <i class="layui-icon layui-icon-username" style="font-size: 30px; color: #FFF;"></i>
                    <input type="text" value="${param.loginacct }"name="loginacct" id="username" class="loginacct"placeholder="请输入账号">
                </div>
                
                <div class="loginbar">
                    <i class="layui-icon layui-icon-password" style="font-size: 30px; color: #FFF;"></i>
                    <input type="password" name="userpswd" id="password" placeholder="请输入密码">
                </div>
		        <div class="code">
			        <input type="text" value="" placeholder="请输入验证码" class="input-val">
			        <canvas id="canvas" width="120" height="43"></canvas>
		        </div>
                <div class="login-btn">
                    <a class="bt" href="#">登  录</a>
                </div>
                <div class="resigter">
                    <a href="regist" style="float: left;">立即注册</a>
                    <a href="#" style="float: right;">忘记密码?</a>
                </div>
            </form>
        </div>
        
        
    </div>
<%--     <script src="${PATH }/static/js/code.js"></s<!--  -->cript> --%>
    <script src="${PATH }/static/jquery/jquery-2.1.1.min.js"></script>
   <script src="${PATH }/static/jquery/layer/layer.js"></script>
    <script type="text/javascript">
    	var show_num = [];
        draw(show_num);
        
        
 		
 		$(".loginacct").blur(function(){
     	var loginacct = $(".loginacct").val();
 	   		if(loginacct==""){
	    		layer.tips("<span style='color:black'>"+'账号不能为空哦'+"</span>",".loginacct",{ tips: [2, '#FFFFFF'],
	    	        time: 3000
    	        });
	    			return false;
    		}
 			
 		})
 		
 		$("#password").blur(function(){
 			var userpswd = $("#password").val();
	 	   if(userpswd==""){
	 		   
	    		layer.tips("<span style='color:black'>"+'密码不能为空哦'+"</span>","#password",{ tips: [2,  '#FFFFFF'],
	    	        time: 3000
	    	        });
	    			return false;
	    		}
 			
 		})
 		//添加键盘事件
 		
 		$(window).keydown(function(e){
		    var curKey = e.which; 
		    if(curKey == 13){
		       login(); 
		    }
		})
 
        $("#canvas").on('click',function(){
            draw(show_num);
        })
        
        $(".bt").on('click',function(){
        	login();
        })
        
        function login(){
 			
 			 var val = $(".input-val").val().toLowerCase();
             var num = show_num.join("");
             if(val==''){
             	layer.alert('请输入验证码！',{icon:99});
             	return false;
             	
             }else if(val == num){
             	
             	var loginacct = $(".loginacct").val();
          		var userpswd = $("#password").val();
          		
          		
          		if(userpswd==''){
 	            	layer.alert('密码不能为空！',{icon:99});
 	            	return false;
 	            	
 	            }
          		
          		
          		
          	   if($.trim(loginacct)==""){
             		layer.alert('账号不能为空',{icon:100});
             			return false;
             		}else{
             			 $.post("${PATH }/dologin",{loginacct:loginacct,userpswd:userpswd},function(result){
             				 
                          	   if($.trim(result)!='true'){
                          		   layer.alert(result,{icon:5});
                          		   		return false;
                          		 
                          	   }else{
                          		 layer.msg("恭喜你，登录成功",{time:1500,icon:6},function(){
                          		   		location.href="${PATH}/toMain";
                            		   });
                          	   }
                             });
             		}
          			
          		
          	   
          	  
             
             }else{
                layer.alert('验证码错误！请重新输入！',{icon:5});
           
                 $(".input-val").val('');
                 draw(show_num);
                 return false;  
                
             }
 		}
        
        
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
</body>

</html>
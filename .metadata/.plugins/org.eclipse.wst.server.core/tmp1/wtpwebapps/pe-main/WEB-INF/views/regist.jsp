 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
     <link rel="stylesheet" href="${PATH }/static/css/style.css">
    <link rel="stylesheet" href="${PATH }/static/layui/css/layui.css"> 
    <link rel="stylesheet" href="${PATH }/static/layui/css/layui.mobile.css"> 
    <link rel="stylesheet" href="${PATH }/static/css/style.css">
    <link rel="stylesheet" href="${PATH }/static/layui/css/layui.css">
    <title>注册谊动</title>
</head>

<body style="background-image: url(${PATH}/static/img/bg.jpg);background-size: cover;background-repeat: no-repeat;">
    <div class="space"></div>
    <div id="login-box">
        <div class="login-box">
            <h1 style="font-weight: bold;">欢迎使用谊动</h1>
            <img src="${PATH}/static/img/logo.png" alt="" style="width: 70px;height: 70px;">
            <form action="${PATH }/saveUser" method="post" class="regist_form">
                <div class="loginbar">
                    <i class="layui-icon layui-icon-username" style="font-size: 30px; color: #FFF;"></i>
                    <input type="text" name="loginacct" id="username" placeholder="请输入账号" class="loginacct" value="${param.loginacct }">
                </div>
                <div class="loginbar">
                    <i class="layui-icon layui-icon-password" style="font-size: 30px; color: #FFF;"></i>
                    <input type="password" name="userpswd" id="password" placeholder="请输入密码" class="userpswd">
                </div>
                <div class="loginbar">
                    <i class="layui-icon layui-icon-password" style="font-size: 30px; color: #FFF;"></i>
                    <input type="password" name="reuserpswd" id="password" placeholder="请确认密码" class="reuserpswd">
                </div>
                <div class="loginbar">
                    <i class="layui-icon layui-icon-username" style="font-size: 30px; color: #FFF;"></i>
                    <input type="text" name="telephone" id="telephone" placeholder="请输入手机号码">
                </div>
                <div class="loginbar">
                    <i class="layui-icon layui-icon-username" style="font-size: 30px; color: #FFF;opacity: 0;"></i>
                    <input id="checkCode" type="text" name="code" placeholder="请输入验证码" class="input_code">
                    <button id="code-btn" type="button">发送验证码</button>
                </div>
                <div class="login-btn">
                    <!-- <input type="button" value="登录" id="bt" class=""> -->
                    <a href="#" class="bt" onclick="regist()">注 册</a>
                </div>
                <div class="resigter">
                    <a href="login" style="float: left;">已有账号?</a>
                    <!-- <a href="" style="float: right;">忘记密码?</a> -->
                </div>
            </form>
        </div>
    </div>
    
        <%-- <script src="${PATH }/static/js/code.js"></script> --%>
        <script type="text/javascript" src="${PATH }/static/jquery/jquery-2.1.1.min.js"></script>
        <script src="${PATH }/static/jquery/layer/layer.js"></script>
      	<script type="text/javascript">
      	
      	$(".loginacct").blur(function(){
			//取username值
			var loginacct = $(this).val();
			var reLoginacct = /^\w{6,12}$/;
			if(reLoginacct.test(loginacct)==false){
	    		  layer.tips("<span style='color:black'>"+'请输入6-12位的字母、数字、_的账号哦'+"</span>",".loginacct",{ tips: [2, ' #FFFFFF'],
		    	        time: 3000
	    	        })
	    		  return false;
	    	  }
			//ajax异步请求
			$.get("${PATH}/checkUser",{loginacct:loginacct},function(msg){ 
// 				alert(typeof(msg));
				if($.trim(msg) == "true"){
					layer.tips("<span style='color:black'>"+'账号已经存在，请换一个再注册哦'+"</span>",".loginacct",{ tips: [2, ' #FFFFFF'],
		    	        time: 3000
	    	        });
					return false;
				}else{
					layer.tips("<span style='color:black'>"+'恭喜您，账号可用'+"</span>",".loginacct",{ tips: [2, ' #FFFFFF'],
		    	        time: 3000
	    	        });
				} 
			});
		});
      	
      		
      	$(".userpswd").blur(function(){
      		var userpswd = $(".userpswd").val();//密码
      		var rePswd = $(".reuserpswd").val();//再次的密码
      		
      		//密码强度正则，最少6位，包括至少1个大写字母，1个数字，1个特殊字符
      		var reuserpswd =  /(?!^[0-9]+$)(?!^[A-z]+$)(?!^[^A-z0-9]+$)^.{8,16}$/;
			 if(reuserpswd.test(userpswd)==false){
				 layer.tips("<span style='color:black'>"+'请输入8-16位，包括数字，大小写字母和特殊符号至少两种的密码哦'+"</span>",".userpswd",{ tips: [2, ' #FFFFFF'],
		    	        time: 3000
	    	        });
	    		  return false;
			 }
				 
			 
      		
      	});
      	
      	
      	$(".reuserpswd").blur(function(){
      		var userpswd = $(".userpswd").val();//密码
      		var rePswd = $(".reuserpswd").val();//再次的密码
			if(userpswd != rePswd){
					 layer.tips("<span style='color:black'>"+'输入密码不一致哦'+"</span>",".reuserpswd",{ tips: [2, ' #FFFFFF'],
			    	        time: 3000
		    	        });
		    		  return false;
			 }
      		
      	});
      	
     
     
      
      
		 //获取手机验证码
  	  
        $('#code-btn').click(function(){
            var count = 120;
            var phone=$("#telephone").val();//手机号码  
            var code = $(".input_code").val();//获取验证码
            var reg_phone = /1\d{10}/;
            if(!reg_phone.test(phone)){   //验证手机是否符合格式
               layer.tips("<span style='color:black'>"+'手机号码格式不正确'+"</span>","#telephone",{ tips: [2, ' #FFFFFF'],
	    	        time: 3000
   	        });
                return false;
            } 
            //开始计时  
            $("#code-btn").attr('disabled','disabled');  
            $("#code-btn").html("倒计时" + count + "秒");  
            var timer = setInterval(function(){  
              count--;
              $("#code-btn").html("倒计时剩下" + count + "秒"); 
              if (count==0) {
                clearInterval(timer);
                $("#code-btn").attr("disabled",false);//启用按钮  
                $("#code-btn").html("重新发送验证码").style("color","black");
                code = "";//清除验证码。如果不清除，过时间后，输入收到的验证码依然有效 
              }
            },1000);

            //向后台发送处理数据  
            $.ajax({  
                type: "POST", //用POST方式传输  
                dataType: "json", //数据格式:JSON  
                url: '${PATH}/sendCode', //目标地址  
                data: {"phone":phone},
                error: function (XMLHttpRequest, textStatus, errorThrown) { 
                	layer.tips("<span style='color:black'>"+'手机号码认证失败，请重新发送验证码哦'+"</span>",".input_code",{ tips: [2, ' #FFFFFF'],
    	    	        time: 3000
        	        })
                	return false;
                },  
                success: function (msg){
              	  if($.trim(msg)=='true'){
                		layer.msg("手机发送验证码成功！",{time:2000,icon:6});
                		
              	  }else{
              		  layer.alert("手机号码认证失败，请重新发送验证码",{icon:99});
              		  return false;
              	  }
                }//调用saveUser 
            });
        }); 
      
        $(window).keydown(function(e){
            var curKey = e.which; 
            if(curKey == 13){
               regist(); 
            }
        })
		 
		 
      
      
		//当用户点击注册时
			  function regist() {
				
			  	  var code = $(".input_code").val();//获取验证码
			  	  var phone=$("#telephone").val();//手机号码  
			  	  var loginacct =$(".loginacct").val();//账号
			  	  var userpswd = $(".userpswd").val();//密码
	      		  var rePswd = $(".reuserpswd").val();//再次的密码
	      		  
	      		  
	      		
	      		  
	      		var reLoginacct = /^\w{6,12}$/;
    			if(reLoginacct.test(loginacct)==false){
    	    		  layer.alert("请输入6-12位的字母、数字、_的账号",{icon:99})
    	    		  return false;
    			
    	    	  }
    			
	          		 var reuserpswd = /(?!^[0-9]+$)(?!^[A-z]+$)(?!^[^A-z0-9]+$)^.{8,16}$/;
	    			 if(reuserpswd.test(userpswd)==false){
	    				 layer.alert("请输入8-16位，包括数字，大小写字母和特殊符号至少两种的密码",{icon:99});
	    	    		  return false;
	    			 }else{
	    				 if(userpswd != rePswd){
	    					 layer.alert("输入密码不一致",{icon:99});
	    		    		  return false;
	    			 }
	    				 
	    			 }
	      		  
			 
				
	    			//ajax异步请求
	     			$.get("${PATH}/checkUser",{loginacct:loginacct},function(msg){ 
//	      				alert(typeof(msg));
	     				if($.trim(msg) == "true"){
	     					layer.alert("账号已经存在，请换一个再注册",{icon:99});
	     					return false;
	     				}else{
	     					

	    					$.get("${PATH}/checkCode",{phone:phone},function(result){
	    						
	    						 var reg_phone = /1\d{10}/;
	    			              if(!reg_phone.test(phone)){   //验证手机是否符合格式
	    			            	  layer.tips("<span style='color:black'>"+'手机号码格式不正确哦'+"</span>","#telephone",{ tips: [2, ' #FFFFFF']
	    			            	 ,time: 3000});
	    			                  return false;
	    			              }
	    			              
	    						
	    						if(code == ""){
	    							layer.alert("验证码不能为空",{icon:99});
	    							return false;
	    						}
	    						
	    						//进行验证码的校验
	    			 			if(code!=result){
	    			 				layer.alert("验证码不正确或者或已过期，请重新获取",{icon:99});
	    			 				return false;
	    			 			}
	    						
	    			 			layer.msg("恭喜你!注册成功请登录....",{time:1500,icon:6},function(){
	    	    					$(".regist_form").submit();
	    						});
	    						
	    			 			
	    						
	    			 			
	    						
	    					
	    			 			
	    					});
	    					
	     					
	     				}
	     				
	     				
	     			});
		
					
					
					
					
					
			 			
					
					
					
				
			
				
	    	  
	    	 
			
			
			
			
				
			
			
			
			
			
			
			
			
			
			
			
			
	      };
			
			  
			
        
        </script>
</body>

</html>
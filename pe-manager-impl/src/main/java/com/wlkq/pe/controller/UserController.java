package com.wlkq.pe.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.wlkq.pe.bean.PecUser;
import com.wlkq.pe.service.PecUserService;
import com.wlkq.pe.util.Const;
import com.wlkq.pe.util.Result;
import com.wlkq.pe.util.SmsTemplate;




@Controller
@CrossOrigin
public class UserController {
	
	@Autowired
	private SmsTemplate smsTemplate;
	Map<String,Object> codeMap = new HashMap<String,Object>();
	
	Logger log =LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private PecUserService userService;
	
	public String main() {
		return "main";
	}
	
	//用户登录
	@RequestMapping("/dologin")
	@ResponseBody
	public String doLogin(String loginacct,String userpswd,Model model,HttpSession session) {
		try {
			Map<String,Object> userMap = new HashMap<String,Object>();
			userMap.put("loginacct", loginacct);
			userMap.put("userpswd", userpswd);
			log.debug("账号========{}",loginacct);
			log.debug("密码========{}",userpswd);
			
			//调用service方法
			PecUser user =userService.checkUserByLogin(userMap);
			//把对象存到session域中
			session.setAttribute(Const.LOGIN_USER, user);
			return "true";
		} catch (Exception e) {
			model.addAttribute(Const.FAIL_LOGIN,e.getMessage());
			log.debug("信息========{}",e.getMessage());
			log.error("登录失败");
			return e.getMessage();
		}
	}
	
	//检验用户是否存在
	@RequestMapping("/checkUser")
	@ResponseBody
	public boolean checkUser(String loginacct) {
		log.debug("我想注册的账号======================{}",loginacct);
		try {
			log.debug("账号========{}",loginacct);
			//调用service方法
			boolean result =userService.checkUser(loginacct);
			return result;
		} catch (Exception e) {
			
			return false;
		}
	}
	
	
	//发送验证码
	@RequestMapping("/sendCode")
	@ResponseBody
	public boolean sendsms(String phone){
				log.debug("来自用户表单的手机号码================================{}",phone);
				
			try {
				StringBuilder p_code = new StringBuilder();
				for (int i = 1; i <= 4; i++) {
					p_code.append(new Random().nextInt(10));
				}
				
				Map<String, String> querys = new HashMap<String, String>();
				querys.put("mobile", phone);
				querys.put("param", "code:"+p_code.toString());
				querys.put("tpl_id", "TP1711063");
				//调用发送短信的接口
				smsTemplate.sendSms(querys);
				log.debug("发送短信成功-验证码：{}",p_code.toString());
				codeMap.put(phone, p_code.toString());
				
				
				return true;
			} catch (Exception e) {
				
				return false;
			}
		} 
	//用户注册

	@PostMapping("/saveUser")
	public String doRegist(PecUser user) {
		String loginacct = user.getLoginacct();
		String userpswd = user.getUserpswd();
		log.debug("我想注册的账号======================{}",loginacct);
		log.debug("我的密码给你看======================{}",userpswd);
		try {
			int count =userService.saveUser(user);
			if(count==1) {
				
				return "login";
			}else {
				
				return "regist";
			}
			
		} catch (Exception e) {
			log.error("保存失败");
			return "regist";
		}
		
	}
	//验证验证码
	
	@RequestMapping("/checkCode")
	@ResponseBody
	public String checkCode(String phone) {
		try {
			String code = (String)codeMap.get(phone);
			log.debug("验证码======================={}",code);
			if(StringUtil.isEmpty(code)) {
				return "";
			}
			return code;
		} catch (Exception e) {
			e.printStackTrace();
			return "0";
		}
		
		
	}
	
	
	
	@RequestMapping("/user/login")
	@ResponseBody
    public Result admin_login(){
        return Result.ok().data("token","admin");
    }

    @RequestMapping("/user/info")
    @ResponseBody
    public Result info(){
        //"data":
        // {"roles":["admin"],
        // "name":"admin",
        // "avatar":"https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif"}
        return Result.ok()
                .data("roles","[\"admin\"]")
                .data("name","admin")
                .data("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
    }
    
    /**
     * 查询所有用户
     * @return 
     */
    @RequestMapping("/userList")
    @ResponseBody
    public Result getUserList() {
    	try {
			List<PecUser> userList =userService.getUserList();
			return Result.ok().data("userList",userList);
		} catch (Exception e) {
			e.printStackTrace();
			return Result.error();
		}
    }
    
    /**
     * 根据id查询用户
     */
    
    @RequestMapping("/getUser")
    @ResponseBody
    public Result getUserByLoginacct(String loginacct) {
    	try {
			PecUser user =userService.getUserByloginacct(loginacct);
			return Result.ok().data("user",user);
		} catch (Exception e) {
			e.printStackTrace();
			return Result.error();
		}
    }
    
    /**
     * 根据id删除用户
     */
    @PostMapping("/deleteUser")
    @ResponseBody
    public Result deleteUserByLoginacct(long id) {
    	try {
			userService.deleteUserByloginacct(id);
			return Result.ok();
			
		} catch (Exception e) {
			e.printStackTrace();
			return Result.error();
		}
    }
    
    /**
     * 修改用户
     */
    @RequestMapping("/updateUser")
    @ResponseBody
    public Result updateUser(@RequestBody(required=true)PecUser user,
    						@RequestParam(value="id",defaultValue="",required=true)Integer id) {
    	try {
			userService.updateUser(user);
			return Result.ok();
			
		} catch (Exception e) {
			e.printStackTrace();
			return Result.error();
		}
    }
    
    /**
     * 带条件的分页查询
     */
    
    @RequestMapping("/useListPage")
    @ResponseBody
    public Result getUserByPage(
    		@RequestParam(value="pageNum",defaultValue="1",required=false)Integer pageNum,
			@RequestParam(value="pageSize",defaultValue="5",required=false)Integer pageSize,
			@RequestParam(value="condition",defaultValue="",required=false)String condition) {
    	try {
			PageHelper.startPage(pageNum, pageSize);
			Map<String, Object> paramMap = new HashMap<String,Object>();
			paramMap.put("condition", condition);
			PageInfo<PecUser> pageList =  userService.userListPage(paramMap);
			List<PecUser> list = pageList.getList();
			long total = pageList.getTotal();
			return Result.ok().data("page",list).data("total",total);
			
		} catch (Exception e) {
			e.printStackTrace();
			return Result.error();
		}
    }
    
    /**
     * 保存用户
     */
    @PostMapping("/save/user")
    @ResponseBody
    public Result saveUser(@RequestBody(required=true)PecUser user) {
    	try {
			userService.saveUser(user);
			return Result.ok();
			
		} catch (Exception e) {
			e.printStackTrace();
			return Result.error();
		}
    }
    
    

}

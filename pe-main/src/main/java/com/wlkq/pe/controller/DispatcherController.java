package com.wlkq.pe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wlkq.pe.util.Result;

@Controller
@CrossOrigin
public class DispatcherController {
	@RequestMapping("/main")
	public String main() {
		return "redirect:/main";
	}
	@RequestMapping("/toMain")
	public String toMain() {
		return "index";
	}
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	@RequestMapping("/regist")
	public String regist () {
		return "regist";
	}
	@RequestMapping("/index")
	public String index () {
		return "index";
	}
	
	
	
	

}

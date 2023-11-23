package com.hch.boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("index")
	public String index() {
		return "index";
	}
	@RequestMapping("header")
	public String top() {
		return "default/header";
	}
	@RequestMapping("footer")
	public String bottom() {
		return "default/footer";
	}
	@RequestMapping("main")
	public String main() {
		return "default/main";
	}
	
}

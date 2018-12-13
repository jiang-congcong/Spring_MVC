package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Home")
public class HomeController {
	
	@RequestMapping("/")
	public String index() {
		return "home/index";
	}
	
	@RequestMapping("/Welcome")
	public String welcome() {
		return "home/welcome";
	}

}

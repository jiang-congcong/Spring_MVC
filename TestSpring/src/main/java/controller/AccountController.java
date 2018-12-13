package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import entity.User;

@Controller
@RequestMapping("/Account")
public class AccountController {
	
	@RequestMapping("/")
	public String index() {
		return "account/index";
	}
	
	@Autowired //不添加会报NullPointerException
	HttpServletRequest request;

	/*@RequestMapping("/Login")
	public String login( String username, String password ){ 
	if(username.equals("zz")&&password.equals("888")) {
	request.setAttribute("username", username); 
	request.setAttribute("password", password);
	return "account/welcome"; 
	}
	else {
	request.setAttribute("errorMsg", "用户名或密码不正确"); 
	return "account/index"; 
	}
	}
	*/
	
	/*@RequestMapping("/Login/{username}/{password}")
	public String test(@PathVariable String username, @PathVariable String password ){ 
	if (username.equals("zz") && password.equals("888")) {
	request.setAttribute("username", username);
	request.setAttribute("password", password);
	return "account/welcome";
	} else {
	request.setAttribute("errorMsg", "用户名或密码不正确");
	return "account/index";
	}
	}*/
	
/*	@RequestMapping("/Login")
	public String login( User user ) {
	if(user.getUsername().equals("zz")&&user.getPassword().equals("888")) {
	request.setAttribute("user", user);
	return "account/welcome";
	}else {
	request.setAttribute("errorMsg", "用户名或密码错");
	return "account/index";
	}
	}*/
	
/*	@RequestMapping("/Login")
	public ModelAndView login( User user ){
	ModelAndView mv = new ModelAndView();
	mv.addObject("user",user);//设置模型
	mv.setViewName("account/welcome"); //设置视图
	return mv;
	}*/
	
	@RequestMapping("/Welcome") 
	public String welcome(){ 
	return "account/welcome"; 
	}
	
	@RequestMapping("/Test") 
	public String test(){ 
	return "account/test1.html"; 
	}
	
	
	@Autowired
	HttpSession session;
	@RequestMapping("/Login")
	public String login( User user,RedirectAttributes redirectAttributes ){ 
	if(user.getUsername().equals("zz")&&user.getPassword().equals("888")) {
	session.setAttribute("user", user);
	return "redirect:/Account/Welcome"; //使用请求路径，不是视图
	}else {
		redirectAttributes.addFlashAttribute("errorMsg","用户名或密码错！");
	return "redirect:/Account/";
	} 
	}
	
	
	@RequestMapping("/CheckUsername")
	@ResponseBody //此注解不能省略 否则ajax无法接受返回值
	public String checkUsername(String username){
	System.out.println(username);
	if(username.equals("zz")) {
	return "OK";
	}
	return "NO";
	}

	

}

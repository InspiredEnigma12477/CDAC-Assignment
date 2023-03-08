package com.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.Role;
import com.app.pojos.User;
import com.app.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	// dep : service layer i/f
	@Autowired
	private UserService userService;

	public UserController() {
		System.out.println("in def ctor " + getClass());
	}

	// add req handling method to forward the clnt to login form
	@GetMapping("/login")
	public String showLoginForm() {
		System.out.println("in show login form ");
		return "/user/login";// LVN --> D.S --> V.R --> /WEB-INF/views/users/login.jsp
	}

	// add req handling method for --authentication n authorization
	@PostMapping("/login")
	public String processLoginForm(@RequestParam String email, 
			@RequestParam String pass, Model map,HttpSession session) {
		System.out.println("in process login form " + email + " " + pass + " " + map);
		try {
			User user = userService.validateUser(email, pass);
			// => valid login --proceed to role based auth.
			session.setAttribute("user_details", user);
			if (user.getUserRole().equals(Role.ADMIN))
				return "redirect:/admin/main";// Handler rets redirect view name
			//--> D.S -->skips V.R --> sends temp  redirect resp to clnt
			//SC 302 | location=/admin/main , | body : EMPTY
			//web browser sends next req --> http://host:port/ctx path/admin/main , method : GET
			//PRG : post-redirect-get
			// customer login
			return "redirect:/customer/choose_category";// AVN : /WEB-INF/views/customer/choose_category.jsp

		} catch (RuntimeException e) {
			System.out.println("err in " + getClass() + " " + e);
			// in case of err --> forward the clnt to the login page with some err mesg
			map.addAttribute("mesg", "Invalid Login , Please Retry!!!!");
			return "/users/login";// AVN : /WEB-INF/views/users/login.jsp
		}
	}
	//URL : http://localhost:8080/day9_boot/user/logout
	@GetMapping("/logout")
	public String userLogout(HttpSession session,Model map,HttpServletRequest rq,HttpServletResponse resp)
	{
		System.out.println("in user logout");
		map.addAttribute("user_details", session.getAttribute("user_details"));
		//invalidate session
		session.invalidate();
		//set refresh header : for auto redirection after delay
		resp.setHeader("refresh", "5;url="+rq.getContextPath());
		return "/user/logout";
	}

}

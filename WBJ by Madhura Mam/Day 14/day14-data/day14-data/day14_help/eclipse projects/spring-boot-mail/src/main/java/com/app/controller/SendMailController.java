package com.app.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.pojos.Email;

@Controller
@RequestMapping("/email")
public class SendMailController {
	@Autowired
	private JavaMailSender sender;
	@PostConstruct
	public void init()
	{
		System.out.println("in init "+sender);
	}
	
	@GetMapping("/send_mail")
	public String showForm(Email e)
	{
	System.out.println("show form");
		return "/email/send_mail";
	}
	@PostMapping("/send_mail")
	public String processForm(Email em,BindingResult res)
	{
		System.out.println(em.getDestEmail()+"  "+em.getMessage());
		SimpleMailMessage mesg=new SimpleMailMessage();
		mesg.setTo(em.getDestEmail());
		mesg.setSubject(em.getSubject());
		mesg.setText(em.getMessage());
		sender.send(mesg);
		return "/email/sent-mail";
	}

}

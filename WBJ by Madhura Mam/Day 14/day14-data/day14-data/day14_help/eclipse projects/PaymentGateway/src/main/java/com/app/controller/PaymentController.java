package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.dto.CardDto;
import com.app.service.CardService;

@Controller
//@RequestMapping("/mypayment_gateway")
public class PaymentController {
	@Value("${eshop_url}")
	private String eShopURL;
	
	@Autowired
	private CardService cardService;

	public PaymentController() {
		System.out.println("in ctor of " + getClass());
	}

	@GetMapping("/")
	public String doPayment(@RequestParam double total_amount, CardDto cardDto) {

		System.out.println(total_amount);
		cardDto.setAmount(total_amount);
		return "/show_form";
	}

	@PostMapping("/process_form")
	public String processPaymentForm(CardDto cardDto) {
		System.out.println("in process form " + cardDto);
		boolean status = cardService.verifyCardDetails(cardDto);
		return "redirect:" + eShopURL+"/"+status;
	}
}
//i/ps for card payment
//card no , card owner's name exp date(input type=month) , cvv , amount (read only) should be displayed

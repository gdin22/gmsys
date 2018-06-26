package com.neuedu.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.model.Balance;
import com.neuedu.service.BalanceService;

@Controller
public class BalanceController {
	
	@Autowired
	private BalanceService balanceService;
	
	@RequestMapping("/balance/findAll")
	public String findAll(Model model){
		List<Balance> list = balanceService.selectAll();
		if(list == null) {
			return "index";
		}else {
			model.addAttribute("listBalance", list);
			return "totalzc";
		}
	}
}

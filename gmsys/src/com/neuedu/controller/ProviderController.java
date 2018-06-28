package com.neuedu.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.service.ProviderService;
import com.neuedu.model.Provider;

@Controller
public class ProviderController {

	@Autowired
	ProviderService providerService;
	
	@RequestMapping("/provider/findAll")
	public String findAll(Model model){
		List<Provider> list = providerService.selectAll();
		if(list == null){
			return "index";
		}else{
			model.addAttribute("listProvider", list);
			return "gysxinxi";
		}
	}
}

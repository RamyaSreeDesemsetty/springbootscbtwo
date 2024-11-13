package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyNewController {
	@RequestMapping("/view")
	public String getView() {
		return "home";
	}
}

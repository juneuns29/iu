package com.human.iu.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
	
	@RequestMapping("/main.iu")
	public String getMain() {
		return "main";
	}
}

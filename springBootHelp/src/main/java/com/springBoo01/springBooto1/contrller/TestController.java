package com.springBoo01.springBooto1.contrller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("/login")
	public String login() {
		return "hell：login";
	}
}

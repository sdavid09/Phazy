package com.app.spring;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class PhazyController {

	@RequestMapping("/")
	public String index() {
		return "Home";
	}
}
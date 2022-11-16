package com.ssafy.home.apt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/map")
public class MapController {
	
	@GetMapping("/gomap")
	public String goMap() {
		return "map";
	}

}

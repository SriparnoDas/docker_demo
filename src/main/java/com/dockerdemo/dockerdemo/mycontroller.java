package com.dockerdemo.dockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class mycontroller {
	
	@GetMapping("/")
public String get() {
	return"Hii There...";
	
}
}
